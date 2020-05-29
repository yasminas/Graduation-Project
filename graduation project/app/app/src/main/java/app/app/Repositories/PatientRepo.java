package app.app.Repositories;

import app.app.Entities.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo  extends CrudRepository<Patient, String> {
}
