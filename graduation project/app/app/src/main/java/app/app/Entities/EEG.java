package app.app.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class EEG {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String Result;
    @Column
    private String Date;
    @Column
    private String ScalpEEG;
    @Column
    private String Type ;
    @Column
    private String Reason ;
    @Column
    private Integer Frequency_of_PDR ;
    @Column
    private Boolean Posteriorrhythm ;
    @Column
    private String Source_of_EEG;
    @Column
    private String Behavioral_recorded ;
    private String ReasonProvocative_measures ;
    @Column
    private Integer number_of_seizures ;

    @Column
    private String Dischargelocation;
    @Column
    private String Localizedside ;

    @Column
    private String Interictal_Circumstances;
    @Column
    private String Interictal_frequency ;
    @Column
    private String Interictal_special_pattern;
    @Column
    private String Ictal_abnormalities ;
    @Column
    private String same_icatal_features;
    @Column
    private String ictal_location ;
    @Column
    private String Ictal_pattern;
    @Column
    private String Ictal_with ;
    @Column
    private Boolean Focal_slowing;
    @Column
    private String Attenuation ;
    @Column
    private String EEG_slowing;
    @Column
    private String Report ;


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

    public EEG() {
        super();
    }


    public EEG(String result,String type, String date, String scalpEEG, String reason, Integer frequency_of_PDR, Boolean posteriorrhythm, String source_of_EEG, String behavioral_recorded, String reasonProvocative_measures, Integer number_of_seizures, String dischargelocation, String localizedside, String interictal_Circumstances, String interictal_frequency, String interictal_special_pattern, String ictal_abnormalities, String same_icatal_features, String ictal_location, String ictal_pattern, String ictal_with, Boolean focal_slowing, String attenuation, String EEG_slowing, String report,int p_id) {
        super();
        Result = result;
        Type=type;
        Date = date;
        ScalpEEG = scalpEEG;
        Reason = reason;
        Frequency_of_PDR = frequency_of_PDR;
        Posteriorrhythm = posteriorrhythm;
        Source_of_EEG = source_of_EEG;
        Behavioral_recorded = behavioral_recorded;
        ReasonProvocative_measures = reasonProvocative_measures;
        this.number_of_seizures = number_of_seizures;
        Dischargelocation = dischargelocation;
        Localizedside = localizedside;
        Interictal_Circumstances = interictal_Circumstances;
        Interictal_frequency = interictal_frequency;
        Interictal_special_pattern = interictal_special_pattern;
        Ictal_abnormalities = ictal_abnormalities;
        this.same_icatal_features = same_icatal_features;
        this.ictal_location = ictal_location;
        Ictal_pattern = ictal_pattern;
        Ictal_with = ictal_with;
        Focal_slowing = focal_slowing;
        Attenuation = attenuation;
        this.EEG_slowing = EEG_slowing;
        Report = report;
        this.patient=new Patient(p_id);
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getScalpEEG() {
        return ScalpEEG;
    }

    public void setScalpEEG(String scalpEEG) {
        ScalpEEG = scalpEEG;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public Integer getFrequency_of_PDR() {
        return Frequency_of_PDR;
    }

    public void setFrequency_of_PDR(Integer frequency_of_PDR) {
        Frequency_of_PDR = frequency_of_PDR;
    }

    public Boolean getPosteriorrhythm() {
        return Posteriorrhythm;
    }

    public void setPosteriorrhythm(Boolean posteriorrhythm) {
        Posteriorrhythm = posteriorrhythm;
    }

    public String getSource_of_EEG() {
        return Source_of_EEG;
    }

    public void setSource_of_EEG(String source_of_EEG) {
        Source_of_EEG = source_of_EEG;
    }

    public String getBehavioral_recorded() {
        return Behavioral_recorded;
    }

    public void setBehavioral_recorded(String behavioral_recorded) {
        Behavioral_recorded = behavioral_recorded;
    }

    public String getReasonProvocative_measures() {
        return ReasonProvocative_measures;
    }

    public void setReasonProvocative_measures(String reasonProvocative_measures) {
        ReasonProvocative_measures = reasonProvocative_measures;
    }

    public Integer getNumber_of_seizures() {
        return number_of_seizures;
    }

    public void setNumber_of_seizures(Integer number_of_seizures) {
        this.number_of_seizures = number_of_seizures;
    }

    public String getDischargelocation() {
        return Dischargelocation;
    }

    public void setDischargelocation(String dischargelocation) {
        Dischargelocation = dischargelocation;
    }

    public String getLocalizedside() {
        return Localizedside;
    }

    public void setLocalizedside(String localizedside) {
        Localizedside = localizedside;
    }

    public String getInterictal_Circumstances() {
        return Interictal_Circumstances;
    }

    public void setInterictal_Circumstances(String interictal_Circumstances) {
        Interictal_Circumstances = interictal_Circumstances;
    }

    public String getInterictal_frequency() {
        return Interictal_frequency;
    }

    public void setInterictal_frequency(String interictal_frequency) {
        Interictal_frequency = interictal_frequency;
    }

    public String getInterictal_special_pattern() {
        return Interictal_special_pattern;
    }

    public void setInterictal_special_pattern(String interictal_special_pattern) {
        Interictal_special_pattern = interictal_special_pattern;
    }

    public String getIctal_abnormalities() {
        return Ictal_abnormalities;
    }

    public void setIctal_abnormalities(String ictal_abnormalities) {
        Ictal_abnormalities = ictal_abnormalities;
    }

    public String getSame_icatal_features() {
        return same_icatal_features;
    }

    public void setSame_icatal_features(String same_icatal_features) {
        this.same_icatal_features = same_icatal_features;
    }

    public String getIctal_location() {
        return ictal_location;
    }

    public void setIctal_location(String ictal_location) {
        this.ictal_location = ictal_location;
    }

    public String getIctal_pattern() {
        return Ictal_pattern;
    }

    public void setIctal_pattern(String ictal_pattern) {
        Ictal_pattern = ictal_pattern;
    }

    public String getIctal_with() {
        return Ictal_with;
    }

    public void setIctal_with(String ictal_with) {
        Ictal_with = ictal_with;
    }

    public Boolean getFocal_slowing() {
        return Focal_slowing;
    }

    public void setFocal_slowing(Boolean focal_slowing) {
        Focal_slowing = focal_slowing;
    }

    public String getAttenuation() {
        return Attenuation;
    }

    public void setAttenuation(String attenuation) {
        Attenuation = attenuation;
    }

    public String getEEG_slowing() {
        return EEG_slowing;
    }

    public void setEEG_slowing(String EEG_slowing) {
        this.EEG_slowing = EEG_slowing;
    }

    public String getReport() {
        return Report;
    }

    public void setReport(String report) {
        Report = report;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
