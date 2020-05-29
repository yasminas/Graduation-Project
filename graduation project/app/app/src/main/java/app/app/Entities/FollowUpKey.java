package app.app.Entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FollowUpKey implements Serializable {


    Integer PatientID;
    Integer DoctorID;
    public FollowUpKey() {

    }
    public FollowUpKey(Integer patientId, Integer doctorId) {
        super();
        PatientID = patientId;
        DoctorID = doctorId;
    }

    public Integer getPatientId() {
        return PatientID;
    }

    public void setPatientId(Integer patientId) {
        PatientID = patientId;
    }

    public Integer getDoctorId() {
        return DoctorID;
    }

    public void setDoctorId(Integer doctorId) {
        DoctorID = doctorId;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((PatientID == null) ? 0 : PatientID.hashCode());
        result = prime * result
                + ((DoctorID == null) ? 0 : DoctorID.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FollowUpKey other = (FollowUpKey) obj;
        return Objects.equals(getPatientId(), other.getPatientId()) && Objects.equals(getDoctorId(), other.getDoctorId());
    }
}