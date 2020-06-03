package app.app.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Imaging {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Imaging_ID;
    @Column
    private String Final_impression;

    @Column
    private String Date;
    @Column
    private String Sequences;
    @Column
    private Boolean Contrast_enhancement;
    @Column
    private String Results;
    @Column
    private String Lateralization;
    @Column
    private String Distribution;
    @Column
    private String Location_cortical;
    @Column
    private String Location_subcortical;
    @Column
    private String Details;
    @Column
    private String Report;

    @ManyToOne
    @JoinColumn
    private Patient patient;



    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    private List<Features> features = new ArrayList<>();

    public List<Features> getFeatures() {
        return features;
    }

    public void setFeatures(List<Features> features) {
        this.features = features;
    }

    public Imaging() {
        super();
    }


    public Imaging(String result,String final_impression,List<Features> features, String date, String sequences, Boolean contrast_enhancement, String lateralization, String distribution, String location_cortical, String location_subcortical, String details, String report) {
        Final_impression = final_impression;
        Results=result;
        Date = date;
       this.features=features;
        Sequences = sequences;
        Contrast_enhancement = contrast_enhancement;
        Lateralization = lateralization;
        Distribution = distribution;
        Location_cortical = location_cortical;
        Location_subcortical = location_subcortical;
        Details = details;
        Report = report;
    }

    public Integer getImaging_ID() {
        return Imaging_ID;
    }

    public void setImaging_ID(Integer imaging_ID) {
        Imaging_ID = imaging_ID;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getFinal_impression() {
        return Final_impression;
    }

    public void setFinal_impression(String final_impression) {
        Final_impression = final_impression;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getSequences() {
        return Sequences;
    }

    public void setSequences(String sequences) {
        Sequences = sequences;
    }

    public Boolean getContrast_enhancement() {
        return Contrast_enhancement;
    }

    public void setContrast_enhancement(Boolean contrast_enhancement) {
        Contrast_enhancement = contrast_enhancement;
    }

    public String getResults() {
        return Results;
    }

    public void setResults(String results) {
        Results = results;
    }

    public String getLateralization() {
        return Lateralization;
    }

    public void setLateralization(String lateralization) {
        Lateralization = lateralization;
    }

    public String getDistribution() {
        return Distribution;
    }

    public void setDistribution(String distribution) {
        Distribution = distribution;
    }

    public String getLocation_cortical() {
        return Location_cortical;
    }

    public void setLocation_cortical(String location_cortical) {
        Location_cortical = location_cortical;
    }

    public String getLocation_subcortical() {
        return Location_subcortical;
    }

    public void setLocation_subcortical(String location_subcortical) {
        Location_subcortical = location_subcortical;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public String getReport() {
        return Report;
    }

    public void setReport(String report) {
        Report = report;
    }
}
