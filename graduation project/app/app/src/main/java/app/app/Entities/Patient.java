package app.app.Entities;
//import com.fasterxml.jackson.annotation.JsonManagedReference;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String FName;
    @Column
    private String MName;
    @Column
    private String LName;
    @Column
    private String Sex;
    @Column
    private Integer Age;
    @Column
    private Integer PNumber;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column
    private Integer DoctorID;
    @Column
    private String Education;
    @Column
    private String Occupation;
    @Column
    private String Maritalstatus ;
    @Column
    private Boolean Activedriving;
    @Column
    private Boolean FamilyConsanguinity ;
    @Column
    private Integer MenarcheAge ;
    @Column
    private Integer prepreg ;
    @Column
    private Boolean seekpreg ;
    @Column
    private String Seizurefreedom ;
    @Column
    private String Regularity ;
    @Column
    private Integer PrepregAED  ;
    @Column
    private String Drugfertility ;
    @Column
    private String FolicAcid ;
    @Column
    private String ComplianceAED;
    @Column
    private String Contraception ;
    @Column
    private String CurrentPregnant ;
    @Column
    private String ChangeAED ;
    @Column
    private String CatamEpilepsy ;
    @Column
    private String Menopause ;
    @Column
    private String Lactating ;
    @Column
    private String ThreeD  ;




public Patient(int id) {
    this.id = id;
}


@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
@JsonManagedReference

    private Set<Seizure> seizure;

    public Set<Seizure> getSeizure() {

        return seizure;
    }

    public void setSeizure(Set<Seizure> seizure) {

        this.seizure = seizure;

    }




    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    @JsonManagedReference

    private Set<Dependent> dependent;

    public Set<Dependent> getDependent() {
        return dependent;
    }
    public void setDependent(Set<Dependent> dependent) {
        this.dependent = dependent;
    }



    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Test> tests;

    public Set<Test> getTests() {
        return tests;
    }
    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }



    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<EEG> EEG;

    public Set<EEG> getEEG() {
        return EEG;
    }
    public void setEEG(Set<EEG> EEG) {
        this.EEG = EEG;
    }



    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<NeuroScore> neuroScore;

    public Set<NeuroScore> getNeuroScore() {
        return neuroScore;
    }
    public void setNeuroScore(Set<NeuroScore> neuroScore) {
        this.neuroScore = neuroScore;
    }


    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    @JsonManagedReference

    private Set<Imaging> imaging;

    public Set<Imaging> getImaging() {
        return imaging;
    }
    public void setImaging(Set<Imaging> imaging) {
       this.imaging = imaging;
    }




    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference

    private History history;

    public History getHistory() {
        return history;
    }
    public void setHistory(History history) {
        this.history = history;
    }





    @ManyToMany(cascade = CascadeType.ALL)

    private Set<SpecialHabits> specialhabits;

    public Set<SpecialHabits> getSpecialhabits() {
        return specialhabits;
    }
    public void setSpecialhabits(Set<SpecialHabits> specialhabits) {
        this.specialhabits = specialhabits;
    }






    @ManyToMany(cascade = CascadeType.ALL)
    private List<Comorbidities> como;

    public List<Comorbidities> getComo() {
        return como;
    }
    public void setComo(List<Comorbidities> como) {
        this.como = como;
    }





    @ManyToMany( cascade = CascadeType.ALL)
    private List<AED>  aed;

    public List<AED> getAed() {
        return aed;
    }

    public void setAed(List<AED> aed) {
        this.aed = aed;
    }



    @ManyToMany( cascade = CascadeType.ALL)

    private List<SurgicalProcedures>  procedures;

    public List<SurgicalProcedures> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<SurgicalProcedures> procedures) {
        this.procedures = procedures;
    }


/**
     @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)

     private Set<FollowUp> followup ;

     public Set<FollowUp> getFollowup() {
     return followup;
     }
     public void setFollowup(Set<FollowUp> followup) {
     this.followup = followup;
     }


**/




    public Patient() {
         super();
    }



    public Patient(String FName, String MName, String LName, Set<SpecialHabits> specialhabits,
                   List<Comorbidities>  como,List<SurgicalProcedures> procedures,
                   List<AED>  aed,
                   String sex, Integer age, Integer Doctorid,
                   Integer PNumber, String education, String occupation,
                   String maritalstatus, Boolean activedriving, Boolean familyConsanguinity, Integer menarcheAge
            , Integer prepreg, Boolean seekpreg, String seizurefreedom, String regularity
            , Integer prepregAED, String drugfertility, String folicAcid, String complianceAED,
                   String contraception, String currentPregnant, String changeAED, String catamEpilepsy,
                   String menopause, String lactating, String threeD) {
        this.FName = FName;
        this.MName = MName;
        this.LName = LName;
        //DoctorID=Doctorid;
        this.como=como;
        this.specialhabits=specialhabits;
        this.procedures=procedures;
        this.aed=aed;
        Sex = sex;
        Age = age;
        this.PNumber = PNumber;
        Education = education;
        Occupation = occupation;
        Maritalstatus = maritalstatus;
        Activedriving = activedriving;
        FamilyConsanguinity = familyConsanguinity;
        MenarcheAge = menarcheAge;
        this.prepreg = prepreg;
        this.seekpreg = seekpreg;
        Seizurefreedom = seizurefreedom;
        Regularity = regularity;
        PrepregAED = prepregAED;
        Drugfertility = drugfertility;
        FolicAcid = folicAcid;
        ComplianceAED = complianceAED;
        Contraception = contraception;
        CurrentPregnant = currentPregnant;
        ChangeAED = changeAED;
        CatamEpilepsy = catamEpilepsy;
        Menopause = menopause;
        Lactating = lactating;
        ThreeD = threeD;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getPNumber() {
        return PNumber;
    }

    public void setPNumber(Integer PNumber) {
        this.PNumber = PNumber;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public String getMaritalstatus() {
        return Maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        Maritalstatus = maritalstatus;
    }

    public Boolean getActivedriving() {
        return Activedriving;
    }

    public void setActivedriving(Boolean activedriving) {
        Activedriving = activedriving;
    }

    public Boolean getFamilyConsanguinity() {
        return FamilyConsanguinity;
    }

    public void setFamilyConsanguinity(Boolean familyConsanguinity) {
        FamilyConsanguinity = familyConsanguinity;
    }

    public Integer getMenarcheAge() {
        return MenarcheAge;
    }

    public void setMenarcheAge(Integer menarcheAge) {
        MenarcheAge = menarcheAge;
    }

    public Integer getPrepreg() {
        return prepreg;
    }

    public void setPrepreg(Integer prepreg) {
        this.prepreg = prepreg;
    }

    public Boolean getSeekpreg() {
        return seekpreg;
    }

    public void setSeekpreg(Boolean seekpreg) {
        this.seekpreg = seekpreg;
    }

    public String getSeizurefreedom() {
        return Seizurefreedom;
    }

    public void setSeizurefreedom(String seizurefreedom) {
        Seizurefreedom = seizurefreedom;
    }

    public String getRegularity() {
        return Regularity;
    }

    public void setRegularity(String regularity) {
        Regularity = regularity;
    }

    public Integer getPrepregAED() {
        return PrepregAED;
    }

    public void setPrepregAED(Integer prepregAED) {
        PrepregAED = prepregAED;
    }

    public String getDrugfertility() {
        return Drugfertility;
    }

    public void setDrugfertility(String drugfertility) {
        Drugfertility = drugfertility;
    }

    public String getFolicAcid() {
        return FolicAcid;
    }

    public void setFolicAcid(String folicAcid) {
        FolicAcid = folicAcid;
    }

    public String getComplianceAED() {
        return ComplianceAED;
    }

    public void setComplianceAED(String complianceAED) {
        ComplianceAED = complianceAED;
    }

    public String getContraception() {
        return Contraception;
    }

    public void setContraception(String contraception) {
        Contraception = contraception;
    }

    public String getCurrentPregnant() {
        return CurrentPregnant;
    }

    public void setCurrentPregnant(String currentPregnant) {
        CurrentPregnant = currentPregnant;
    }

    public String getChangeAED() {
        return ChangeAED;
    }

    public void setChangeAED(String changeAED) {
        ChangeAED = changeAED;
    }

    public String getCatamEpilepsy() {
        return CatamEpilepsy;
    }

    public void setCatamEpilepsy(String catamEpilepsy) {
        CatamEpilepsy = catamEpilepsy;
    }

    public String getMenopause() {
        return Menopause;
    }

    public void setMenopause(String menopause) {
        Menopause = menopause;
    }

    public String getLactating() {
        return Lactating;
    }


    public void setLactating(String lactating) {
        Lactating = lactating;
    }

    public String getThreeD() {
        return ThreeD;
    }

    public void setThreeD(String threeD) {
        ThreeD = threeD;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(Integer doctorID) {
        DoctorID = doctorID;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Patient[id=" + id + ",DoctorID=" + DoctorID + ", FName=" + FName + ", MName=" + MName + ", LName=" + LName
                + " , Sex=" + Sex + ", Age=" + Age + ", PNumber=" + PNumber + ", createdAt=" + createdAt + "" +
                ", updatedAt=" + updatedAt + ", Education=" + Education + ", Occupation=" + Occupation + ", Maritalstatus=" + Maritalstatus + "" +
                ", Activedriving=" + Activedriving + ", FamilyConsanguinity=" + FamilyConsanguinity + ", MenarcheAge=" + MenarcheAge + "" +
                ", seekpreg=" + seekpreg + ", prepreg=" + prepreg + ", Seizurefreedom=" + Seizurefreedom + "" +
                ", Regularity=" + Regularity + ", PrepregAED=" + PrepregAED + ", Drugfertility=" + Drugfertility + "" +
                ", FolicAcid=" + FolicAcid + ", ComplianceAED=" + ComplianceAED + ", Contraception=" + Contraception + "" +
                ", CurrentPregnant=" + CurrentPregnant + ", ChangeAED=" + ChangeAED + ", CatamEpilepsy=" + CatamEpilepsy + "" +
                ", Menopause=" + Menopause + ", Lactating=" + Lactating + ", ThreeD=" + ThreeD + "]";
    }

    @PrePersist
    public void onPrePersist() {
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    @PreUpdate
    public void onPreUpdate() {
        this.updatedAt = new Date();
    }


}
