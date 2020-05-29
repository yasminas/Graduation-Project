package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class NeuroScore {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer Score_ID;
        @Column
        private Date Date;
        @Column
        private String Test;
        @Column
        private Integer Score;
    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private Patient patient3;

    public Patient getPatient() {
        return patient3;
    }

    public void setPatient(Patient patient) {
        this.patient3 = patient;
    }


    public NeuroScore() {
        super();
    }


    public NeuroScore(Date date, Integer score,String test) {

        Date = date;
        Test =test;
        Score = score;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date date) {
        Date = date;
    }

    public String getTest() {
        return Test;
    }

    public void setTest(String test) {
        Test = test;
    }

    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer score) {
        Score = score;
    }
}
