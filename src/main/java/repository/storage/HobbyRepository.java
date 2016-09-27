package repository.storage;

import entity.Hobby;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by alex on 8/24/16.
 */
public interface HobbyRepository extends CrudRepository<Hobby, Long>{

    List<Hobby> findAll(Sort sort);

}
