package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class GeneralizednonMotor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String gnname;

    @JsonIgnore
    @ManyToMany(mappedBy = "generalizednonMotors",fetch = FetchType.LAZY)
    private List<Seizure> Seizure ;

    public List<Seizure> getSeizure() {
        return Seizure;
    }
    public void setSeizure(List<Seizure> seizure) {
        Seizure = seizure;
    }


    public GeneralizednonMotor() {
        super();
    }
    public GeneralizednonMotor(String Gnname,List<Seizure> Seizure) {
       gnname=Gnname;
        this.Seizure=Seizure;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGnname() {
        return gnname;
    }

    public void setGnname(String gnname) {
        this.gnname = gnname;
    }
}
