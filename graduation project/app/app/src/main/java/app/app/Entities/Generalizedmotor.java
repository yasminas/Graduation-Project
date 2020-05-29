package app.app.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Generalizedmotor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Gid;
    @Column
    private String gmname;

    @ManyToMany(mappedBy = "generalizedMotors")
    private List<Seizure> Seizure = new ArrayList<>();

    public List<Seizure> getSeizure() {
        return Seizure;
    }

    public void setSeizure(List<Seizure> seizure) {
        Seizure = seizure;
    }


    public Generalizedmotor() {
        super();
    }
    public Generalizedmotor(String Gname) {
        gmname=Gname;
    }

    public String getgmname() {
        return gmname;
    }

    public void setgmname(String Gname) {
        gmname = Gname;
    }
}
