package app.app.Repositories;

import app.app.Entities.Doc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepo extends CrudRepository<Doc, Integer> {
    Doc findByEmail(String email);
    Doc findById(int id);
}
