/*package app.app.Entities;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class lab {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Lab_ID;
    @Column
    private String Name;
    @Column
    private String Address;

    @OneToMany(mappedBy = "lab", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Test> tests;

    public Set<Test> getTests() {
        return tests;
    }

    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }

    public lab() {
         super();
    }
    public lab(String name,String address) {
        this.Name=name;
        this.Address=address;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}*/
