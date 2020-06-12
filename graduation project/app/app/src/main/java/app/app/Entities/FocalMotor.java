package app.app.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class FocalMotor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String fmname;




    @ManyToMany(mappedBy = "focalMotors",fetch = FetchType.LAZY)
    @JsonIgnore

    private List<Seizure> Seizure ;

    public List<Seizure> getSeizure() {
        return Seizure;
    }
    public void setSeizure(List<Seizure> seizure) {
        Seizure = seizure;
    }

    public FocalMotor() {
        super();
    }
    public FocalMotor(String fmname, List<Seizure> Seizure) {
        this.fmname=fmname;
        this.Seizure=Seizure;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFmname() {
        return fmname;
    }

    public void setFmname(String fmname) {
        this.fmname = fmname;
    }
}
