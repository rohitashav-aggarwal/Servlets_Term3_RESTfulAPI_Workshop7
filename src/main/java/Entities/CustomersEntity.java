package Entities;

import javax.persistence.*;

@Entity
@Table(name = "customers", schema = "travelexperts")
public class CustomersEntity {

    @Id
    @Column(name = "CustomerId", nullable = false)
    private int customerId;

    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    @JoinColumn(name = "userid")
    private UsersEntity usersEntity;

    public UsersEntity getUsersEntity() {
        return usersEntity;
    }

    public void setUsersEntity(UsersEntity usersEntity) {
        this.usersEntity = usersEntity;
    }

    @Basic
    @Column(name = "CustFirstName", nullable = false, length = 25)
    private String custFirstName;

    @Basic
    @Column(name = "CustLastName", nullable = false, length = 25)
    private String custLastName;

    @Basic
    @Column(name = "CustAddress", nullable = false, length = 75)
    private String custAddress;

    @Basic
    @Column(name = "CustCity", nullable = false, length = 50)
    private String custCity;

    @Basic
    @Column(name = "CustProv", nullable = false, length = 2)
    private String custProv;

    @Basic
    @Column(name = "CustPostal", nullable = false, length = 7)
    private String custPostal;

    @Basic
    @Column(name = "CustCountry", nullable = true, length = 25)
    private String custCountry;

    @Basic
    @Column(name = "CustHomePhone", nullable = true, length = 20)
    private String custHomePhone;

    @Basic
    @Column(name = "CustBusPhone", nullable = false, length = 20)
    private String custBusPhone;

    @Basic
    @Column(name = "CustEmail", nullable = false, length = 50)
    private String custEmail;


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }


    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }


    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }


    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }


    public String getCustProv() {
        return custProv;
    }

    public void setCustProv(String custProv) {
        this.custProv = custProv;
    }


    public String getCustPostal() {
        return custPostal;
    }

    public void setCustPostal(String custPostal) {
        this.custPostal = custPostal;
    }


    public String getCustCountry() {
        return custCountry;
    }

    public void setCustCountry(String custCountry) {
        this.custCountry = custCountry;
    }


    public String getCustHomePhone() {
        return custHomePhone;
    }

    public void setCustHomePhone(String custHomePhone) {
        this.custHomePhone = custHomePhone;
    }


    public String getCustBusPhone() {
        return custBusPhone;
    }

    public void setCustBusPhone(String custBusPhone) {
        this.custBusPhone = custBusPhone;
    }


    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        CustomersEntity that = (CustomersEntity) o;
//
//        if (customerId != that.customerId) return false;
//        if (custFirstName != null ? !custFirstName.equals(that.custFirstName) : that.custFirstName != null)
//            return false;
//        if (custLastName != null ? !custLastName.equals(that.custLastName) : that.custLastName != null) return false;
//        if (custAddress != null ? !custAddress.equals(that.custAddress) : that.custAddress != null) return false;
//        if (custCity != null ? !custCity.equals(that.custCity) : that.custCity != null) return false;
//        if (custProv != null ? !custProv.equals(that.custProv) : that.custProv != null) return false;
//        if (custPostal != null ? !custPostal.equals(that.custPostal) : that.custPostal != null) return false;
//        if (custCountry != null ? !custCountry.equals(that.custCountry) : that.custCountry != null) return false;
//        if (custHomePhone != null ? !custHomePhone.equals(that.custHomePhone) : that.custHomePhone != null)
//            return false;
//        if (custBusPhone != null ? !custBusPhone.equals(that.custBusPhone) : that.custBusPhone != null) return false;
//        if (custEmail != null ? !custEmail.equals(that.custEmail) : that.custEmail != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = customerId;
//        result = 31 * result + (custFirstName != null ? custFirstName.hashCode() : 0);
//        result = 31 * result + (custLastName != null ? custLastName.hashCode() : 0);
//        result = 31 * result + (custAddress != null ? custAddress.hashCode() : 0);
//        result = 31 * result + (custCity != null ? custCity.hashCode() : 0);
//        result = 31 * result + (custProv != null ? custProv.hashCode() : 0);
//        result = 31 * result + (custPostal != null ? custPostal.hashCode() : 0);
//        result = 31 * result + (custCountry != null ? custCountry.hashCode() : 0);
//        result = 31 * result + (custHomePhone != null ? custHomePhone.hashCode() : 0);
//        result = 31 * result + (custBusPhone != null ? custBusPhone.hashCode() : 0);
//        result = 31 * result + (custEmail != null ? custEmail.hashCode() : 0);
//        return result;
//    }
}
