package app.app.Controllers;

import app.app.Entities.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import app.app.Services.HistoryService;

@RestController
public class HistoryController {
    @Autowired
    HistoryService HistoryService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addhistory",method = RequestMethod.POST)
    public ResponseEntity<Boolean> Addhistory(@RequestBody History history) {
        return  HistoryService.addhistory(history);
    }
}
