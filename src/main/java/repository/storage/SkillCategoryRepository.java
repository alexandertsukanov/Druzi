package repository.storage;

import entity.SkillCategory;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

/**
 * 
 * @author alexander
 * @see http://alexander.net
 */


public interface SkillCategoryRepository extends CrudRepository<SkillCategory, Long>{

	List<SkillCategory> findAll(Sort sort);
}
