package app.app.Entities;
import javax.persistence.*;
import java.util.Set;

@Entity

public class Doc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String fname;
    @Column
    private String lname;
    @Column
    public  String email;
    @Column
    public String password;
    @Column
    private Boolean isdeleted;
    @Column
    private Integer code;


    public Doc(int id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)

    private Set<FollowUp> followup ;

    public Set<FollowUp> getFollowup() {
        return followup;
    }
    public void setFollowup(Set<FollowUp> followup) {
        this.followup = followup;
    }


    public Doc() {
        super();
    }

    public Doc(int id, String fname, String lname, String email, String password, Boolean isdeleted, Integer code) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
        this.isdeleted = isdeleted;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Doc[id=" + id + ",code=" + code + ", isdeleted=" + isdeleted + ", password=" + password + ", email=" + email
                + " , lname=" + lname + ", fname=" + fname + "]";


    }

}
