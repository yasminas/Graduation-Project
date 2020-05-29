package app.app.Controllers;

import app.app.Dto.Filters;
import app.app.Repositories.Tic;
import app.app.Services.TicketServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TicketController {
    @Autowired
    Tic ticketrepo;

    @Autowired
    TicketServices Ticketservices;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/BarChart",method = RequestMethod.POST)
    public ResponseEntity<String> barchart(@RequestBody Filters filter ) {
        return  Ticketservices.barchart(filter);
    }
}
