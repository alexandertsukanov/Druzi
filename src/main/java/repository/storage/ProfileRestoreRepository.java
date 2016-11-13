package repository.storage;

import entity.ProfileRestore;
import org.springframework.data.repository.CrudRepository;

/**
 * 
 * @author tsukanov
 *
 */
public interface ProfileRestoreRepository extends CrudRepository<ProfileRestore, Long> {
	
	ProfileRestore findByToken(String token);
}
