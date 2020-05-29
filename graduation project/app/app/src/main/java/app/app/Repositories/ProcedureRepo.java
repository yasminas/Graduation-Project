package app.app.Repositories;

import app.app.Entities.SurgicalProcedures;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcedureRepo extends CrudRepository<SurgicalProcedures, String> {
}
