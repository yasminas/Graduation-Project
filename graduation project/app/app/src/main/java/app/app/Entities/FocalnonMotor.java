package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class FocalnonMotor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String fnmname;



    @ManyToMany(mappedBy = "focalnonMotors",fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Seizure> Seizure ;

    public List<Seizure> getSeizure() {
        return Seizure;
    }

    public void setSeizure(List<Seizure> seizure) {
        Seizure = seizure;
    }

    public FocalnonMotor() {
        super();
    }
    public FocalnonMotor(String fName, List<Seizure> Seizure) {
        fnmname=fName;
        this.Seizure=Seizure;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFnmname() {
        return fnmname;
    }

    public void setFnmname(String fnmname) {
        this.fnmname = fnmname;
    }
}
