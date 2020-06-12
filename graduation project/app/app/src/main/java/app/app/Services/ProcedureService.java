/*
package app.app.Services;

import app.app.Entities.SurgicalProcedures;
import app.app.Repositories.ProcedureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProcedureService {
    @Autowired
    ProcedureRepo ProcedureRepo;
    public ResponseEntity<Boolean> addprocedure(SurgicalProcedures procedure)
    {

        ResponseEntity<Boolean> response;
        ProcedureRepo.save(procedure);
        response = new ResponseEntity<>(true, HttpStatus.OK);
        return response;
    }
}
*/