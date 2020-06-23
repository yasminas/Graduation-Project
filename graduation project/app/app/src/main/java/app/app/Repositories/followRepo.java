package app.app.Repositories;

import app.app.Entities.FollowUp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface followRepo extends CrudRepository<FollowUp, Integer> {
}
