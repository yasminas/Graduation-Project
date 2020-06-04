package app.app.Repositories;

import app.app.Entities.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepo extends CrudRepository<Doctor, Integer> {
    Doctor findByEmail(String email);
}
