package app.app.Repositories;

import app.app.Entities.Dependent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DependentRepo extends CrudRepository<Dependent, String> {

}