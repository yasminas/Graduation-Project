package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Seizure {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String Semiology;
    @Column
    private String Mode;
    @Column
    private String Duration;
    @Column
    private String Number;
    @Column
    private String Triggertype;
    @Column
    private String Longest_period;

    @Column
    private String symptom_appearance;
    @Column
    private String CircadianRhythm;
    @Column
    private String specify ;
    @Column
    private String postictal ;


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



    @ManyToMany(cascade = CascadeType.ALL)
    private List<Classification> classification ;

    public List<Classification> getClassification() {
        return classification;
    }
    public void setClassification(List<Classification> classification) {
        this.classification = classification;
    }


    @ManyToMany(cascade = CascadeType.ALL)

    private List<ASSFeatures> assfeatures ;

    public List<ASSFeatures> getAssfeatures() {
        return assfeatures;
    }
    public void setAssfeatures(List<ASSFeatures> assfeatures) {
        this.assfeatures = assfeatures;
    }


    @ManyToMany(cascade = CascadeType.ALL)

    private List<GeneralizednonMotor> generalizednonMotors ;

    public List<GeneralizednonMotor> getGeneralizednonMotors() {
        return generalizednonMotors;
    }
    public void setGeneralizednonMotors(List<GeneralizednonMotor> generalizednonMotors) {
        this.generalizednonMotors = generalizednonMotors;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    private List<FocalnonMotor> focalnonMotors ;


    public List<FocalnonMotor> getFocalnonMotors() {
        return focalnonMotors;
    }
    public void setFocalnonMotors(List<FocalnonMotor> focalnonMotors) {
        this.focalnonMotors = focalnonMotors;
    }


    @ManyToMany(cascade = CascadeType.ALL)

    private List<FocalMotor> focalMotors ;

    public List<FocalMotor> getFocalMotors() {
        return focalMotors;
    }
    public void setFocalMotors(List<FocalMotor> focalMotors) {
        this.focalMotors = focalMotors;
    }


    @ManyToMany(cascade = CascadeType.ALL)
    private List<Generalizedmotor> generalizedMotors ;



    public List<Generalizedmotor> getGeneralizedMotors() {
        return generalizedMotors;
    }

    public void setGeneralizedMotors(List<Generalizedmotor> generalizedMotors) {
        this.generalizedMotors = generalizedMotors;
    }



    public Seizure() {
        super();
    }


    public Seizure(List<FocalMotor> focalMotors,List<FocalnonMotor> focalnonMotors,List<ASSFeatures> assfeatures,List<Classification> classification,List<GeneralizednonMotor> GeneralizednonMotors,List<Generalizedmotor> generalizedMotors,String postictal,String mode,String semiology,  String duration, String number, String triggertype, String longest_period, String symptom_appearance, String circadianRhythm, String specify, String frequency_before_AED, String frequency_after_AED, String age_of_onset, String age_of_onset_fabrile, String fabrile_description,int p_id) {
        super();
        Semiology = semiology;
        Mode=mode;
        this.postictal=postictal;
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
        this.specify=specify;

        Frequency_before_AED = frequency_before_AED;
        Frequency_after_AED = frequency_after_AED;
        Age_of_onset = age_of_onset;
        Age_of_onset_fabrile = age_of_onset_fabrile;
        this.fabrile_description = fabrile_description;
        this.patient=new Patient(p_id);
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

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymptom_appearance() {
        return symptom_appearance;
    }

    public void setSymptom_appearance(String symptom_appearance) {
        this.symptom_appearance = symptom_appearance;
    }

    public String getCircadianRhythm() {
        return CircadianRhythm;
    }

    public void setCircadianRhythm(String circadianRhythm) {
        CircadianRhythm = circadianRhythm;
    }

    public String getSpecify() {
        return specify;
    }

    public void setSpecify(String specify) {
        this.specify = specify;
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


    public String getPostictal() {
        return postictal;
    }

    public void setPostictal(String postictal) {
        this.postictal = postictal;
    }
}

