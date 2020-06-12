/*
package app.app.Controllers;

import app.app.Entities.SurgicalProcedures;
import app.app.Services.ProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProcedureController {
    @Autowired
    ProcedureService ProcedureService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addprocedure",method = RequestMethod.POST)
    public ResponseEntity<Boolean> Addpatient(@RequestBody SurgicalProcedures procedure) {
        return  ProcedureService.addprocedure(procedure);
    }
}
*/