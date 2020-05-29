package app.app.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SpecialHabits {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer habitid;
    @Column
    private String habitname;

    @ManyToMany(mappedBy = "specialhabits")
    private List<Patient> Patient = new ArrayList<>();


    public SpecialHabits() {
        super();
    }
    public SpecialHabits(String name) {
        habitname=name;
    }


    public String gethabitname() {
        return habitname;
    }

    public void sethabitname(String habitname) {
        this.habitname = habitname;
    }



    public List<Patient> getPatient() {
        return Patient;
    }

    public void setPatient(List<Patient> patient) {
        Patient = patient;
    }
}

