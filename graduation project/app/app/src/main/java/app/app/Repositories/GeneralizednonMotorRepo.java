package app.app.Repositories;

import app.app.Entities.GeneralizednonMotor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralizednonMotorRepo extends CrudRepository<GeneralizednonMotor, String> {
}
