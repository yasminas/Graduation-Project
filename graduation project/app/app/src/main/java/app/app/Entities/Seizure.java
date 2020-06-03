package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Seizure {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Seizur_ID;
    @Column
    private String Semiology;
    @Column
    private String Mode;
    @Column
    private String Duration;
    @Column
    private Integer Number;
    @Column
    private String Triggertype;
    @Column
    private String Longest_period;

    @Column
    private Boolean symptom_appearance;
    @Column
    private String CircadianRhythm;
    @Column
    private Boolean Tendency_to_cluster ;

    @Column
    private String events_genuine;
    @Column
    private String Frequency_before_AED ;
    @Column
    private String Frequency_after_AED;
    @Column
    private String Age_of_onset ;
    @Column
    private String Age_of_onset_fabrile;
    @Column
    private String fabrile_description ;

    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private Patient patient;


    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    private List<Classification> classification = new ArrayList<>();
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    private List<ASSFeatures> assfeatures = new ArrayList<>();
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    private List<GeneralizednonMotor> generalizednonMotors = new ArrayList<>();

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    private List<FocalnonMotor> focalnonMotors = new ArrayList<>();

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    private List<FocalMotor> focalMotors = new ArrayList<>();

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    private List<Generalizedmotor> generalizedMotors = new ArrayList<>();


    public List<FocalMotor> getFocalMotors() {
        return focalMotors;
    }

    public void setFocalMotors(List<FocalMotor> focalMotors) {
        this.focalMotors = focalMotors;
    }

    public List<Classification> getClassification() {
        return classification;
    }

    public void setClassification(List<Classification> classification) {
        this.classification = classification;
    }

    public List<ASSFeatures> getAssfeatures() {
        return assfeatures;
    }

    public void setAssfeatures(List<ASSFeatures> assfeatures) {
        this.assfeatures = assfeatures;
    }

    public List<GeneralizednonMotor> getGeneralizednonMotors() {
        return generalizednonMotors;
    }

    public void setGeneralizednonMotors(List<GeneralizednonMotor> generalizednonMotors) {
        this.generalizednonMotors = generalizednonMotors;
    }

    public List<FocalnonMotor> getFocalnonMotors() {
        return focalnonMotors;
    }

    public void setFocalnonMotors(List<FocalnonMotor> focalnonMotors) {
        this.focalnonMotors = focalnonMotors;
    }

    public List<Generalizedmotor> getGeneralizedMotors() {
        return generalizedMotors;
    }

    public void setGeneralizedMotors(List<Generalizedmotor> generalizedMotors) {
        this.generalizedMotors = generalizedMotors;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Seizure() {
        super();
    }


    public Seizure(List<FocalMotor> focalMotors,List<FocalnonMotor> focalnonMotors,List<ASSFeatures> assfeatures,List<Classification> classification,List<GeneralizednonMotor> GeneralizednonMotors,List<Generalizedmotor> generalizedMotors,String mode,String semiology,  String duration, Integer number, String triggertype, String longest_period, Boolean symptom_appearance, String circadianRhythm, Boolean tendency_to_cluster, String events_genuine, String frequency_before_AED, String frequency_after_AED, String age_of_onset, String age_of_onset_fabrile, String fabrile_description) {
        Semiology = semiology;
        Mode=mode;
        this.focalMotors = focalMotors;
        this.focalnonMotors = focalnonMotors;
        this.generalizedMotors=generalizedMotors;
        this.generalizednonMotors=GeneralizednonMotors;
        this.classification=classification;
        this.assfeatures=assfeatures;
        Duration = duration;
        Number = number;
        Triggertype = triggertype;
        Longest_period = longest_period;

        this.symptom_appearance = symptom_appearance;
        CircadianRhythm = circadianRhythm;
        Tendency_to_cluster = tendency_to_cluster;
        this.events_genuine = events_genuine;
        Frequency_before_AED = frequency_before_AED;
        Frequency_after_AED = frequency_after_AED;
        Age_of_onset = age_of_onset;
        Age_of_onset_fabrile = age_of_onset_fabrile;
        this.fabrile_description = fabrile_description;
    }

    public String getSemiology() {
        return Semiology;
    }

    public void setSemiology(String semiology) {
        Semiology = semiology;
    }

    public String getMode() {
        return Mode;
    }

    public void setMode(String mode) {
        Mode = mode;
    }


    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }

    public String getTriggertype() {
        return Triggertype;
    }

    public void setTriggertype(String triggertype) {
        Triggertype = triggertype;
    }

    public String getLongest_period() {
        return Longest_period;
    }

    public void setLongest_period(String longest_period) {
        Longest_period = longest_period;
    }

    public Integer getSeizur_ID() {
        return Seizur_ID;
    }

    public void setSeizur_ID(Integer seizur_ID) {
        Seizur_ID = seizur_ID;
    }

    public Boolean getSymptom_appearance() {
        return symptom_appearance;
    }

    public void setSymptom_appearance(Boolean symptom_appearance) {
        this.symptom_appearance = symptom_appearance;
    }

    public String getCircadianRhythm() {
        return CircadianRhythm;
    }

    public void setCircadianRhythm(String circadianRhythm) {
        CircadianRhythm = circadianRhythm;
    }

    public Boolean getTendency_to_cluster() {
        return Tendency_to_cluster;
    }

    public void setTendency_to_cluster(Boolean tendency_to_cluster) {
        Tendency_to_cluster = tendency_to_cluster;
    }

    public String getEvents_genuine() {
        return events_genuine;
    }

    public void setEvents_genuine(String events_genuine) {
        this.events_genuine = events_genuine;
    }

    public String getFrequency_before_AED() {
        return Frequency_before_AED;
    }

    public void setFrequency_before_AED(String frequency_before_AED) {
        Frequency_before_AED = frequency_before_AED;
    }

    public String getFrequency_after_AED() {
        return Frequency_after_AED;
    }

    public void setFrequency_after_AED(String frequency_after_AED) {
        Frequency_after_AED = frequency_after_AED;
    }

    public String getAge_of_onset() {
        return Age_of_onset;
    }

    public void setAge_of_onset(String age_of_onset) {
        Age_of_onset = age_of_onset;
    }

    public String getAge_of_onset_fabrile() {
        return Age_of_onset_fabrile;
    }

    public void setAge_of_onset_fabrile(String age_of_onset_fabrile) {
        Age_of_onset_fabrile = age_of_onset_fabrile;
    }

    public String getFabrile_description() {
        return fabrile_description;
    }

    public void setFabrile_description(String fabrile_description) {
        this.fabrile_description = fabrile_description;
    }
}
