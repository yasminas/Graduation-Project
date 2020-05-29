package app.app.Entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class FocalMotor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer FocalMotorid;
    @Column
    private String fmname;





    @ManyToMany(mappedBy = "focalMotors")
    private List<Seizure> Seizure = new ArrayList<>();


    public FocalMotor() {
        super();
    }
    public FocalMotor(String fmname, List<Seizure> Seizure) {
        this.fmname=fmname;
        this.Seizure=Seizure;

    }

    public List<Seizure> getSeizure() {
        return Seizure;
    }

    public void setSeizure(List<Seizure> seizure) {
        Seizure = seizure;
    }

    public Integer getFocalMotorid() {
        return FocalMotorid;
    }

    public void setFocalMotorid(Integer focalMotorid) {
        FocalMotorid = focalMotorid;
    }






    public String getfmname() {
        return fmname;
    }

    public void setfmname(String fmname) {
        this.fmname = fmname;
    }
}
