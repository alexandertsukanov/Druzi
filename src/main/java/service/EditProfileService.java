package service;

import entity.Course;
import entity.Profile;
import entity.Skill;
import entity.SkillCategory;
import form.RegistrationForm;

import java.util.List;

/**
 * Created by alex on 9/3/16.
 */
public interface EditProfileService {



        Profile createNewProfile(RegistrationForm registrationForm);

        Profile getMain(long idProfile);

        List<Skill> listSkills(long idProfile);

        List<Course> listCourses(long idProfile);

        List<SkillCategory> listSkillCategories();

        void updateSkills(long idProfile, List<Skill> skills);



}
