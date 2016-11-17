package service;

import entity.Course;
import entity.Profile;
import entity.Skill;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Created by alex on 9/3/16.
 */
public interface FindProfileService {


    Profile findByUid(String uid);

    List<Profile> findAll(Sort sort);

}
