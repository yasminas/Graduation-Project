
package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.sql.Date;

@Entity
 public class FollowUp{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column
    private Date last_visit;
    @Column
    private Integer frequency_per_month;
    @Column
    private Boolean last_visit_seizure;
    @Column
    private String compliant_on_AED;
    @Column
    private String same_seizure_type;
    @Column
    private String triggering_factors;
    @Column
    private String AED_modifing;


    @ManyToOne(fetch = FetchType.LAZY)

    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }



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


    public FollowUp() {
        super();
    }

    public FollowUp(Date last_visit, Integer frequency_per_month, Boolean last_visit_seizure, String compliant_on_AED, String same_seizure_type, String triggering_factors, String AED_modifing,Integer d_id,int p_id) {
        super();
        this.last_visit = last_visit;
        this.frequency_per_month = frequency_per_month;
        this.last_visit_seizure = last_visit_seizure;
        this.compliant_on_AED = compliant_on_AED;
        this.same_seizure_type = same_seizure_type;
        this.triggering_factors = triggering_factors;
        this.AED_modifing = AED_modifing;
        this.patient=new Patient(p_id);
        this.doctor=new Doctor(d_id);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getLast_visit() {
        return last_visit;
    }

    public void setLast_visit(Date last_visit) {
        this.last_visit = last_visit;
    }

    public Integer getFrequency_per_month() {
        return frequency_per_month;
    }

    public void setFrequency_per_month(Integer frequency_per_month) {
        this.frequency_per_month = frequency_per_month;
    }

    public Boolean getLast_visit_seizure() {
        return last_visit_seizure;
    }

    public void setLast_visit_seizure(Boolean last_visit_seizure) {
        this.last_visit_seizure = last_visit_seizure;
    }

    public String getCompliant_on_AED() {
        return compliant_on_AED;
    }

    public void setCompliant_on_AED(String compliant_on_AED) {
        this.compliant_on_AED = compliant_on_AED;
    }

    public String getSame_seizure_type() {
        return same_seizure_type;
    }

    public void setSame_seizure_type(String same_seizure_type) {
        this.same_seizure_type = same_seizure_type;
    }

    public String getTriggering_factors() {
        return triggering_factors;
    }

    public void setTriggering_factors(String triggering_factors) {
        this.triggering_factors = triggering_factors;
    }

    public String getAED_modifing() {
        return AED_modifing;
    }

    public void setAED_modifing(String AED_modifing) {
        this.AED_modifing = AED_modifing;
    }
}
