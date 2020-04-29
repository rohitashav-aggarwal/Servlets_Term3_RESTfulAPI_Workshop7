package Entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "bookings", schema = "travelexperts", catalog = "")
public class BookingsEntity {

    @Id
    @Column(name = "BookingId", nullable = false)
    private int bookingId;

    @Basic
    @Column(name = "BookingDate", nullable = true)
    private Timestamp bookingDate;

    @Basic
    @Column(name = "BookingNo", nullable = true, length = 50)
    private String bookingNo;

    @Basic
    @Column(name = "TravelerCount", nullable = true)
    private Integer travelerCount;


    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }


    public Timestamp getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Timestamp bookingDate) {
        this.bookingDate = bookingDate;
    }


    public String getBookingNo() {
        return bookingNo;
    }

    public void setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
    }


    public Integer getTravelerCount() {
        return travelerCount;
    }

    public void setTravelerCount(Integer travelerCount) {
        this.travelerCount = travelerCount;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        BookingsEntity that = (BookingsEntity) o;
//
//        if (bookingId != that.bookingId) return false;
//        if (bookingDate != null ? !bookingDate.equals(that.bookingDate) : that.bookingDate != null) return false;
//        if (bookingNo != null ? !bookingNo.equals(that.bookingNo) : that.bookingNo != null) return false;
//        if (travelerCount != null ? !travelerCount.equals(that.travelerCount) : that.travelerCount != null)
//            return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = bookingId;
//        result = 31 * result + (bookingDate != null ? bookingDate.hashCode() : 0);
//        result = 31 * result + (bookingNo != null ? bookingNo.hashCode() : 0);
//        result = 31 * result + (travelerCount != null ? travelerCount.hashCode() : 0);
//        return result;
//    }
}
