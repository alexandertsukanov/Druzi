package repository.storage;

import entity.ProfileRestore;
import org.springframework.data.repository.CrudRepository;

/**
 * 
 * @author alexander
 * @see http://alexander.net
 */
public interface ProfileRestoreRepository extends CrudRepository<ProfileRestore, Long> {
	
	ProfileRestore findByToken(String token);
}
