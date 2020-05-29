package app.app.Entities;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer TestId;
    @Column
    private String TestType;
    @Column
    private String labName;
    @Column
    private String labAddress;

    /*@ManyToOne
    @JoinColumn
    @JsonBackReference
    private lab lab;*/

    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private Patient patient1;

    public String getLabAddress() {
        return labAddress;
    }

    public void setLabAddress(String labAddress) {
        this.labAddress = labAddress;
    }

    public Patient getPatient() {
        return patient1;
    }

    public void setPatient(Patient patient) {
        this.patient1 = patient;
    }

   /* public Test() {
        super();
    }*/

    public Test() {
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

   /* public Test(String TestType, String labName, String labAddress) {
        this.labName = labName;
        this.labAddress = labAddress;
        this.TestType=TestType;
    }*/



    public String getTestType() {
        return TestType;
    }

    public void setTestType(String testType) {
        TestType = testType;
    }


}
