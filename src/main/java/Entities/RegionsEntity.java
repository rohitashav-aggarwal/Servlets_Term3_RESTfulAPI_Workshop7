package Entities;

import javax.persistence.*;

@Entity
@Table(name = "regions", schema = "travelexperts", catalog = "")
public class RegionsEntity {

    @Id
    @Column(name = "RegionId", nullable = false, length = 5)
    private String regionId;

    @Basic
    @Column(name = "RegionName", nullable = true, length = 25)
    private String regionName;


    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        RegionsEntity that = (RegionsEntity) o;
//
//        if (regionId != null ? !regionId.equals(that.regionId) : that.regionId != null) return false;
//        if (regionName != null ? !regionName.equals(that.regionName) : that.regionName != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = regionId != null ? regionId.hashCode() : 0;
//        result = 31 * result + (regionName != null ? regionName.hashCode() : 0);
//        return result;
//    }
}
