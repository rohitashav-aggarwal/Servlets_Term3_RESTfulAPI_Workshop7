package Entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "bookingdetails", schema = "travelexperts", catalog = "")
public class BookingdetailsEntity {

    @Id
    @Column(name = "BookingDetailId", nullable = false)
    private int bookingDetailId;

    @Basic
    @Column(name = "ItineraryNo", nullable = true)
    private Integer itineraryNo;

    @Basic
    @Column(name = "TripStart", nullable = true)
    private Timestamp tripStart;

    @Basic
    @Column(name = "TripEnd", nullable = true)
    private Timestamp tripEnd;

    @Basic
    @Column(name = "Description", nullable = true, length = -1)
    private String description;

    @Basic
    @Column(name = "Destination", nullable = true, length = -1)
    private String destination;

    @Basic
    @Column(name = "BasePrice", nullable = true, precision = 4)
    private BigDecimal basePrice;

    @Basic
    @Column(name = "AgencyCommission", nullable = true, precision = 4)
    private BigDecimal agencyCommission;

    @Basic
    @Column(name = "ProductSupplierId", nullable = true)
    private Integer productSupplierId;


    public int getBookingDetailId() {
        return bookingDetailId;
    }

    public void setBookingDetailId(int bookingDetailId) {
        this.bookingDetailId = bookingDetailId;
    }


    public Integer getItineraryNo() {
        return itineraryNo;
    }

    public void setItineraryNo(Integer itineraryNo) {
        this.itineraryNo = itineraryNo;
    }


    public Timestamp getTripStart() {
        return tripStart;
    }

    public void setTripStart(Timestamp tripStart) {
        this.tripStart = tripStart;
    }


    public Timestamp getTripEnd() {
        return tripEnd;
    }

    public void setTripEnd(Timestamp tripEnd) {
        this.tripEnd = tripEnd;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }


    public BigDecimal getAgencyCommission() {
        return agencyCommission;
    }

    public void setAgencyCommission(BigDecimal agencyCommission) {
        this.agencyCommission = agencyCommission;
    }


    public Integer getProductSupplierId() {
        return productSupplierId;
    }

    public void setProductSupplierId(Integer productSupplierId) {
        this.productSupplierId = productSupplierId;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        BookingdetailsEntity that = (BookingdetailsEntity) o;
//
//        if (bookingDetailId != that.bookingDetailId) return false;
//        if (itineraryNo != null ? !itineraryNo.equals(that.itineraryNo) : that.itineraryNo != null) return false;
//        if (tripStart != null ? !tripStart.equals(that.tripStart) : that.tripStart != null) return false;
//        if (tripEnd != null ? !tripEnd.equals(that.tripEnd) : that.tripEnd != null) return false;
//        if (description != null ? !description.equals(that.description) : that.description != null) return false;
//        if (destination != null ? !destination.equals(that.destination) : that.destination != null) return false;
//        if (basePrice != null ? !basePrice.equals(that.basePrice) : that.basePrice != null) return false;
//        if (agencyCommission != null ? !agencyCommission.equals(that.agencyCommission) : that.agencyCommission != null)
//            return false;
//        if (productSupplierId != null ? !productSupplierId.equals(that.productSupplierId) : that.productSupplierId != null)
//            return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = bookingDetailId;
//        result = 31 * result + (itineraryNo != null ? itineraryNo.hashCode() : 0);
//        result = 31 * result + (tripStart != null ? tripStart.hashCode() : 0);
//        result = 31 * result + (tripEnd != null ? tripEnd.hashCode() : 0);
//        result = 31 * result + (description != null ? description.hashCode() : 0);
//        result = 31 * result + (destination != null ? destination.hashCode() : 0);
//        result = 31 * result + (basePrice != null ? basePrice.hashCode() : 0);
//        result = 31 * result + (agencyCommission != null ? agencyCommission.hashCode() : 0);
//        result = 31 * result + (productSupplierId != null ? productSupplierId.hashCode() : 0);
//        return result;
//    }
}
