package Entities;

import javax.persistence.*;

@Entity
@Table(name = "triptypes", schema = "travelexperts", catalog = "")
public class TriptypesEntity {

    @Id
    @Column(name = "TripTypeId", nullable = false, length = 1)
    private String tripTypeId;

    @Basic
    @Column(name = "TTName", nullable = true, length = 25)
    private String ttName;


    public String getTripTypeId() {
        return tripTypeId;
    }

    public void setTripTypeId(String tripTypeId) {
        this.tripTypeId = tripTypeId;
    }


    public String getTtName() {
        return ttName;
    }

    public void setTtName(String ttName) {
        this.ttName = ttName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TriptypesEntity that = (TriptypesEntity) o;

        if (tripTypeId != null ? !tripTypeId.equals(that.tripTypeId) : that.tripTypeId != null) return false;
        if (ttName != null ? !ttName.equals(that.ttName) : that.ttName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tripTypeId != null ? tripTypeId.hashCode() : 0;
        result = 31 * result + (ttName != null ? ttName.hashCode() : 0);
        return result;
    }
}
