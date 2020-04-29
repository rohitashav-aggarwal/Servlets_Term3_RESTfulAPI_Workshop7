package Entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "packages", schema = "travelexperts", catalog = "")
public class PackagesEntity {
    @Id
    @Column(name = "PackageId", nullable = false)
    private int packageId;

    @Basic
    @Column(name = "PkgName", nullable = false, length = 50)
    private String pkgName;

    @Basic
    @Column(name = "PkgStartDate", nullable = true)
    private Timestamp pkgStartDate;

    @Basic
    @Column(name = "PkgEndDate", nullable = true)
    private Timestamp pkgEndDate;

    @Basic
    @Column(name = "PkgDesc", nullable = true, length = 50)
    private String pkgDesc;

    @Basic
    @Column(name = "PkgBasePrice", nullable = false, precision = 4)
    private BigDecimal pkgBasePrice;

    @Basic
    @Column(name = "PkgAgencyCommission", nullable = true, precision = 4)
    private BigDecimal pkgAgencyCommission;


    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }


    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }


    public Timestamp getPkgStartDate() {
        return pkgStartDate;
    }

    public void setPkgStartDate(Timestamp pkgStartDate) {
        this.pkgStartDate = pkgStartDate;
    }


    public Timestamp getPkgEndDate() {
        return pkgEndDate;
    }

    public void setPkgEndDate(Timestamp pkgEndDate) {
        this.pkgEndDate = pkgEndDate;
    }


    public String getPkgDesc() {
        return pkgDesc;
    }

    public void setPkgDesc(String pkgDesc) {
        this.pkgDesc = pkgDesc;
    }


    public BigDecimal getPkgBasePrice() {
        return pkgBasePrice;
    }

    public void setPkgBasePrice(BigDecimal pkgBasePrice) {
        this.pkgBasePrice = pkgBasePrice;
    }


    public BigDecimal getPkgAgencyCommission() {
        return pkgAgencyCommission;
    }

    public void setPkgAgencyCommission(BigDecimal pkgAgencyCommission) {
        this.pkgAgencyCommission = pkgAgencyCommission;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        PackagesEntity that = (PackagesEntity) o;
//
//        if (packageId != that.packageId) return false;
//        if (pkgName != null ? !pkgName.equals(that.pkgName) : that.pkgName != null) return false;
//        if (pkgStartDate != null ? !pkgStartDate.equals(that.pkgStartDate) : that.pkgStartDate != null) return false;
//        if (pkgEndDate != null ? !pkgEndDate.equals(that.pkgEndDate) : that.pkgEndDate != null) return false;
//        if (pkgDesc != null ? !pkgDesc.equals(that.pkgDesc) : that.pkgDesc != null) return false;
//        if (pkgBasePrice != null ? !pkgBasePrice.equals(that.pkgBasePrice) : that.pkgBasePrice != null) return false;
//        if (pkgAgencyCommission != null ? !pkgAgencyCommission.equals(that.pkgAgencyCommission) : that.pkgAgencyCommission != null)
//            return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = packageId;
//        result = 31 * result + (pkgName != null ? pkgName.hashCode() : 0);
//        result = 31 * result + (pkgStartDate != null ? pkgStartDate.hashCode() : 0);
//        result = 31 * result + (pkgEndDate != null ? pkgEndDate.hashCode() : 0);
//        result = 31 * result + (pkgDesc != null ? pkgDesc.hashCode() : 0);
//        result = 31 * result + (pkgBasePrice != null ? pkgBasePrice.hashCode() : 0);
//        result = 31 * result + (pkgAgencyCommission != null ? pkgAgencyCommission.hashCode() : 0);
//        return result;
//    }
}
