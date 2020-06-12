package app.app.Repositories;

import app.app.Entities.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo  extends CrudRepository<Patient, Integer> {

/**
    List<Patient> findById(Integer id);

    void deleteById(Integer id);
 * @return**/
Patient findById(Integer id);


}
