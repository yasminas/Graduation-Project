package app.app.Controllers;

import app.app.Entities.Role;
import app.app.Repositories.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RoleController {
    @Autowired
   private RoleRepo rolerepo ;

    public Role findrole(String name)
    {
        Role role =rolerepo.findByName(name);
       return role;
    }

}

