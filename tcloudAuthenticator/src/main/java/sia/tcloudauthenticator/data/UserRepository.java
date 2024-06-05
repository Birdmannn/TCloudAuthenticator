package sia.tcloudauthenticator.data;

import org.springframework.data.repository.CrudRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sia.tcloudauthenticator.Users;


public interface UserRepository extends CrudRepository<Users, Long> {

	Users findByUsername(String username);
}
