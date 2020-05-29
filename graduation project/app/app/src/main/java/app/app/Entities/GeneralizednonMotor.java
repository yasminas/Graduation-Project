package app.app.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class GeneralizednonMotor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer GnMid;
    @Column
    private String gnname;

    @ManyToMany(mappedBy = "generalizednonMotors")
    private List<Seizure> Seizure = new ArrayList<>();




    public GeneralizednonMotor() {
        super();
    }
    public GeneralizednonMotor(String Gnname) {
       gnname=Gnname;
    }

    public String getGnname() {
        return gnname;
    }

    public void setGnname(String Gnname) {
        gnname = Gnname;
    }

    public List<Seizure> getSeizure() {
        return Seizure;
    }

    public void setSeizure(List<Seizure> seizure) {
        Seizure = seizure;
    }
}
