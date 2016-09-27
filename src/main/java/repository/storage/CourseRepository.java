package repository.storage;

import entity.Course;
import entity.Education;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by alex on 9/2/16.
 */
public interface CourseRepository extends CrudRepository<Course, Long> {

    List<Course> findAll(Sort sort);


}
