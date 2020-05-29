package app.app.Repositories;

import app.app.Entities.Comorbidities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComorbiditiesRepo extends CrudRepository<Comorbidities, String> {
}
