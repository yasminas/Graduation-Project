package app.app.Repositories;

import app.app.Entities.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends CrudRepository<Role, String> {
    Role findByName(String name);

}
