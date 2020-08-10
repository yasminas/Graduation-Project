package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class NeuroScore {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        @Column
        private String Date;
        @Column
        private String Test;
        @Column
        private String Score;



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



    public NeuroScore() {
        super();
    }


    public NeuroScore(String date, String score,String test,int p_id) {
        super();
        Date = date;
        Test =test;
        Score = score;
        this.patient=new Patient(p_id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTest() {
        return Test;
    }

    public void setTest(String test) {
        Test = test;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }

}
