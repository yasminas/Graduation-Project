package app.app.Entities;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Comorbidities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String cname;

    @ManyToMany(mappedBy = "como",fetch = FetchType.LAZY)
    @JsonIgnore

    private List<Patient> Patient ;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
