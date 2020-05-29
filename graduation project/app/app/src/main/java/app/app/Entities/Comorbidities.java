package app.app.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Comorbidities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Comorbiditiesid;
    @Column
    private String cname;

    @ManyToMany(mappedBy = "como")
    private List<Patient> Patient = new ArrayList<>();

    public List<Patient> getPatient() {
        return Patient;
    }

    public void setPatient(List<Patient> patient) {
        Patient = patient;
    }

    public Comorbidities() {
        super();
    }

    public Comorbidities(String cname) {
        this.cname = cname;
    }



    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
