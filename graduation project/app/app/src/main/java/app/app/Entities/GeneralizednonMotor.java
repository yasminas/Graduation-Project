package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class GeneralizednonMotor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String gnname;

    @ManyToMany(mappedBy = "generalizednonMotors",fetch = FetchType.LAZY)
    @JsonIgnore

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
