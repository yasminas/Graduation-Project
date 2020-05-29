
package app.app.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name="Doctor")

public class Doctor {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer DoctorID;
@Column
private String fname;
@Column
private String lname;
@Column
private  String email;
@Column
private String password;
@Column
private Boolean isdeleted;
@Column
private Integer code;






        @OneToMany(mappedBy = "doctor")
        private Set<FollowUp> followup = new HashSet<>();

        public Integer getDoctorID() {
                return DoctorID;
        }

        public void setDoctorID(Integer doctorID) {
                DoctorID = doctorID;
        }

        public Set<FollowUp> getFollowup() {
                return followup;
        }

        public void setFollowup(Set<FollowUp> followup) {
                this.followup = followup;
        }



        public Doctor() {
                super();

        }

        public Doctor(String fname, String lname, String email, String password, Boolean isdeleted, Integer code) {
                this.fname = fname;
                this.lname = lname;
                this.email = email;
                this.password = password;
                this.isdeleted = isdeleted;
                this.code = code;
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
