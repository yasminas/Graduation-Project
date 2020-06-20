package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Set;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class SpecialHabits {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String habitname;







    @ManyToMany(mappedBy = "specialhabits",fetch = FetchType.LAZY)
    @JsonIgnore

    private Set<Patient> Patient;

    public Set<Patient> getPatient() {
        return Patient;
    }
    public void setPatient(Set<Patient> patient) {
        Patient = patient;
    }






    public SpecialHabits() {
        super();
    }

    public SpecialHabits(String name) {
        habitname=name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHabitname() {
        return habitname;
    }

    public void setHabitname(String habitname) {
        this.habitname = habitname;
    }
}

