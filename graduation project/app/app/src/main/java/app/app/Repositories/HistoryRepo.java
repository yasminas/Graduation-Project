package app.app.Repositories;

import app.app.Entities.History;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepo extends CrudRepository<History, String> {
}
