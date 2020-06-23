/*
package app.app.Entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FollowUpKey implements Serializable {


    Integer patientId;
    Integer doctorId;
    public FollowUpKey() {
super();
    }
    public FollowUpKey(Integer patientId, Integer doctorId) {
        super();
        this.patientId = patientId;
        this.doctorId = doctorId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((patientId == null) ? 0 : patientId.hashCode());
        result = prime * result
                + ((doctorId == null) ? 0 : doctorId.hashCode());
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
*/