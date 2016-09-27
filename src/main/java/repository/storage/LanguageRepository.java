package repository.storage;

import entity.Language;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by alex on 8/24/16.
 */
public interface LanguageRepository extends CrudRepository<Language, Long>{

    List<Language> findAll(Sort sort);


}
