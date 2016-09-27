package repository.storage;

import entity.Education;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by alex on 9/2/16.
 */
public interface EducationRepository extends CrudRepository<Education, Long> {

    List<Education> findAll(Sort sort);



}
