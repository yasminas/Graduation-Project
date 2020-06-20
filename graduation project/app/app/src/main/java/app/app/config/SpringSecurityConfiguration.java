package app.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {




    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(" /resetpass","/addPatient","/adddependent","/addscore",
                        "/addeeg","/loaddata","/loadimg","/addhabit","/addcomo","/addAED",
                        "/addtest", "/addhistory","/addprocedure","/addfeature","/addimaging",
                        "/addseizure","/addfocal","/addGM","/addGNM","/Register","/login","/forgetpass","/vPatient",
                        "/verifycode","/logout","/uploadFile","/addmapping","/loaddata","/showservices",
                        "/adduser","/BarChart","/removeuser","/edit","/createPatient","/delete/{id}","/delete","/edit/{id}","/view/{id}","/view","/update","/followup").permitAll()
             //   .antMatchers("").hasAuthority("admin")
                .antMatchers("removeuser").hasAuthority("user")
                .anyRequest().authenticated();
                 http.csrf().disable();
    }





}