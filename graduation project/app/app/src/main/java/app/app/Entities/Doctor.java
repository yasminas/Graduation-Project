
package app.app.Entities;

import javax.persistence.*;
import java.util.Set;

@Entity(name="Doctor")

public class Doctor {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;


private String fname;

private String lname;

private  String email;

private String password;

private Boolean isdeleted;

private Integer code;



      @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)

      private Set<FollowUp> followup ;

        public Set<FollowUp> getFollowup() {
                return followup;
        }

        public void setFollowup(Set<FollowUp> followup) {
                this.followup = followup;
        }



        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public Doctor(int id) {
                this.id = id;
        }


        public Doctor() {
                super();

        }

        public Doctor(String fname, String lname, String email, String password) {
                this.fname = fname;
                this.lname = lname;
                this.email = email;
                this.password = password;
        }



        public String getFname() {
                return fname;
        }

        public void setFname(String fname) {
                this.fname = fname;
        }

        public String getLname() {
                return lname;
        }

        public void setLname(String lname) {
                this.lname = lname;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public Boolean getIsdeleted() {
                return isdeleted;
        }

        public void setIsdeleted(Boolean isdeleted) {
                this.isdeleted = isdeleted;
        }

        public Integer getCode() {
                return code;
        }

        public void setCode(Integer code) {
                this.code = code;
        }

}

       /** public Collection<Role> getRoles() {
                return roles;
        }

        public void setRoles(Collection<Role> roles) {
                this.roles = roles;
        }

        @Override
        public String toString() {
                return "User{" +
                        "id=" + id +
                        ", fname='" + fname + '\'' +
                        ", lname='" + lname + '\'' +
                        ", email='" + email + '\'' +
                        ", password='" + "*********" + '\'' +

                        '}';
        }}**/
