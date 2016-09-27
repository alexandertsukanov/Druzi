package service.impl;

import entity.Course;
import entity.Profile;
import entity.Skill;
import entity.SkillCategory;
import form.RegistrationForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.storage.*;
import org.apache.commons.collections.CollectionUtils;
import util.DataUtil;
import exception.CantCompleteClientRequestException;
import java.util.List;




    @Service
    public class EditProfileServiceImpl implements service.EditProfileService {

        private static final Logger LOGGER = LoggerFactory.getLogger(EditProfileServiceImpl.class);
        @Autowired
        private ProfileRepository profileRepository;

        @Autowired
        private LanguageRepository languageRepository;
        @Autowired
        private SkillRepository skillRepository;
        @Autowired
        private HobbyRepository hobbyRepository;
        @Autowired
        private PracticsRepository practicsRepository;
        @Autowired
        private EducationRepository educationRepository;
        @Autowired
        private CourseRepository courseRepository;

        @Autowired
        private SkillCategoryRepository skillCategoryRepository;

        @Value("${generate.uid.suffix.length}")
        private int generateUidSuffixLength;

        @Value("${generate.uid.alphabet}")
        private String generateUidAlphabet;

        @Value("${generate.uid.max.try.count}")
        private int maxTryCountToGenerateUid;

        @Override
        @Transactional
        public Profile createNewProfile(RegistrationForm registrationForm) {
            Profile profile = new Profile();
            profile.setUid(generateProfileUid(registrationForm));
            profile.setFirstName(DataUtil.capitalizeName(registrationForm.getFirstName()));
            profile.setLastName(DataUtil.capitalizeName(registrationForm.getLastName()));
            profile.setPassword(registrationForm.getPassword());
            profile.setPhone(registrationForm.getPhone());
            profile.setEmail(registrationForm.getEmail());
            profile.setCompleted(false);
            profileRepository.save(profile);
            return profile;
        }

        private String generateProfileUid(RegistrationForm registrationForm) throws CantCompleteClientRequestException {
            String baseUid = DataUtil.generateProfileUid(registrationForm);
            String uid = baseUid;
            for (int i = 0; profileRepository.countByUid(uid) > 0; i++) {
                uid = DataUtil.regenerateUidWithRandomSuffix(baseUid, generateUidAlphabet, generateUidSuffixLength);
                if (i >= maxTryCountToGenerateUid) {
                    throw new CantCompleteClientRequestException("Can't generate unique uid for profile: " + baseUid+": maxTryCountToGenerateUid detected");
                }
            }
            return uid;
        }

        @Override
        public List<Skill> listSkills(long idProfile) {
            return profileRepository.findOne(idProfile).getSkills();
        }



        public Profile getMain(long idProfile){
            return profileRepository.findOne(idProfile);
        }

        @Override
        public List<SkillCategory> listSkillCategories() {
            return skillCategoryRepository.findAll(new Sort("id"));
        }

        @Override
        public List<Course> listCourses(long idProfile) {
            return courseRepository.findAll((new Sort("id")));
        }

        @Override
        @Transactional
        public void updateSkills(long idProfile, List<Skill> updatedData) {
            Profile profile = profileRepository.findOne(idProfile);
            if (CollectionUtils.isEqualCollection(updatedData, profile.getSkills())) {
                LOGGER.debug("Profile skills: nothing to update");
                return;
            } else {
                profile.setSkills(updatedData);
                profileRepository.save(profile);
            }
        }
    }


