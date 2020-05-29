package app.app.Repositories;

import app.app.Entities.Generalizedmotor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralizedmotorRepo extends CrudRepository<Generalizedmotor, String> {
}
