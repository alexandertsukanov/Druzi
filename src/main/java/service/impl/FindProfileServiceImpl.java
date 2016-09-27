package service.impl;

import entity.Course;
import entity.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import repository.storage.*;
import service.FindProfileService;

import java.util.List;



    @Service
    public class FindProfileServiceImpl implements FindProfileService {

        @Autowired
        private ProfileRepository profileRepository;



    @Override
    public List<Profile> findAll(Sort sort) {
        return profileRepository.findAll(new Sort("id"));
    }

    @Override
        public Profile findByUid(String uid) {
            return profileRepository.findByUid(uid);

        }

    }


