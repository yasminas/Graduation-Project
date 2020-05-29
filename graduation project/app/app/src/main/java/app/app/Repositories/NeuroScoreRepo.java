package app.app.Repositories;

import app.app.Entities.NeuroScore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NeuroScoreRepo extends CrudRepository<NeuroScore, String> {
}

