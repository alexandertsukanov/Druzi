package repository.storage;

import entity.Skill;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by alex on 9/2/16.
 */
public interface SkillRepository extends CrudRepository<Skill, Long> {

    List<Skill> findAll(Sort sort);
}