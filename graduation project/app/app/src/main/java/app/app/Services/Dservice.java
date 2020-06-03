/**package app.app.Services;

import app.app.Dto.UserRegistrationDto;
import app.app.Entities.Doctor;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface Dservice extends UserDetailsService {

    Doctor findByEmail(String email);

    Doctor save(UserRegistrationDto registration);
}**/