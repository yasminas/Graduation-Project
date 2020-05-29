package app.app.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class FocalnonMotor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer FocalnonMotorid;
    @Column
    private String fnmname;



    @ManyToMany(mappedBy = "focalnonMotors")
    private List<Seizure> Seizure = new ArrayList<>();

    public List<Seizure> getSeizure() {
        return Seizure;
    }

    public void setSeizure(List<Seizure> seizure) {
        Seizure = seizure;
    }

    public FocalnonMotor() {
        super();
    }
    public FocalnonMotor(String fName) {
        fnmname=fName;
    }

    public String getFnmname() {
        return fnmname;
    }

    public void setFnmname(String fnmname) {
        this.fnmname = fnmname;
    }
}
