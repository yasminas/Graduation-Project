package app.app.Repositories;

import app.app.Entities.Seizure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeizureRepo extends JpaRepository<Seizure, Integer> {


    Seizure findById(Integer id);    /**Seizure findAllBy(String Semiology);**/


}
