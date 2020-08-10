package app.app.Entities;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String TestType;
    @Column
    private String date;
    @Column
    private String labName;
    @Column
    private String labAddress;

    /*@ManyToOne
    @JoinColumn
    @JsonBackReference
    private lab lab;*/

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    @JsonBackReference

    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }





    public Test() {
        super();
    }




   public Test(String TestType, String labName,String date, String labAddress,int p_id) {
       super();
        this.labName = labName;
        this.date=date;
        this.labAddress = labAddress;
        this.TestType=TestType;
       this.patient=new Patient(p_id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabAddress() {
        return labAddress;
    }

    public void setLabAddress(String labAddress) {
        this.labAddress = labAddress;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }


    public String getTestType() {
        return TestType;
    }

    public void setTestType(String testType) {
        TestType = testType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
