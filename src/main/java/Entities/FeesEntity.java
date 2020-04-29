package Entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "fees", schema = "travelexperts", catalog = "")
public class FeesEntity {
    @Id
    @Column(name = "FeeId", nullable = false, length = 10)
    private String feeId;

    @Basic
    @Column(name = "FeeName", nullable = false, length = 50)
    private String feeName;

    @Basic
    @Column(name = "FeeAmt", nullable = false, precision = 4)
    private BigDecimal feeAmt;

    @Basic
    @Column(name = "FeeDesc", nullable = true, length = 50)
    private String feeDesc;


    public String getFeeId() {
        return feeId;
    }

    public void setFeeId(String feeId) {
        this.feeId = feeId;
    }


    public String getFeeName() {
        return feeName;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }


    public BigDecimal getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(BigDecimal feeAmt) {
        this.feeAmt = feeAmt;
    }


    public String getFeeDesc() {
        return feeDesc;
    }

    public void setFeeDesc(String feeDesc) {
        this.feeDesc = feeDesc;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        FeesEntity that = (FeesEntity) o;
//
//        if (feeId != null ? !feeId.equals(that.feeId) : that.feeId != null) return false;
//        if (feeName != null ? !feeName.equals(that.feeName) : that.feeName != null) return false;
//        if (feeAmt != null ? !feeAmt.equals(that.feeAmt) : that.feeAmt != null) return false;
//        if (feeDesc != null ? !feeDesc.equals(that.feeDesc) : that.feeDesc != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = feeId != null ? feeId.hashCode() : 0;
//        result = 31 * result + (feeName != null ? feeName.hashCode() : 0);
//        result = 31 * result + (feeAmt != null ? feeAmt.hashCode() : 0);
//        result = 31 * result + (feeDesc != null ? feeDesc.hashCode() : 0);
//        return result;
//    }
}
