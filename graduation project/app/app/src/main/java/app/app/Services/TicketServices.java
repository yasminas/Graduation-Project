/*
package app.app.Services;

import app.app.Dto.Filters;
import app.app.Repositories.Tic;
import app.app.Repositories.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServices {
    @Autowired
    TicketRepo ticketRepo;
    @Autowired
    Tic tic;
    public ResponseEntity<String> barchart(Filters filter)
    {
        String name= filter.getName();
        List<String> vlaues= filter.getValue();
        System.out.println(name);
/*
        for (int i =0;i<vlaues.length;i++) {
            System.out.println(vlaues[i]);
        }

 */

    /*    // Map<String, Object> result = new HashMap<>();

        List<Object[]>  defect = tic.Severity(vlaues);
        for (Object[] a : defect) {
            System.out.println("defect "
                    + a[0]
                    + " "
                    + a[1]);
            //result.put((String) a[0], a[1]);

        }

        return null;
    }
}
*/