package repository.storage;

import entity.Practic;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by alex on 9/2/16.
 */
public interface PracticsRepository extends CrudRepository<Practic, Long> {


    List<Practic> findAll (Sort sort);

}
