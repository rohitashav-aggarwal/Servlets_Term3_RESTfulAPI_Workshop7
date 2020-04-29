package Entities;

import javax.persistence.*;

@Entity
@Table(name = "users", schema = "travelexperts", catalog = "")
public class UsersEntity {
    @Id
    @Column(name = "UserId", nullable = false)
    private int userId;

    @Basic
    @Column(name = "CustomerId", nullable = false)
    private int customerId;

    @Basic
    @Column(name = "Username", nullable = false, length = 20)
    private String username;

    @Basic
    @Column(name = "Password", nullable = false, length = 50)
    private String password;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        UsersEntity that = (UsersEntity) o;
//
//        if (userId != that.userId) return false;
//        if (customerId != that.customerId) return false;
//        if (username != null ? !username.equals(that.username) : that.username != null) return false;
//        if (password != null ? !password.equals(that.password) : that.password != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = userId;
//        result = 31 * result + customerId;
//        result = 31 * result + (username != null ? username.hashCode() : 0);
//        result = 31 * result + (password != null ? password.hashCode() : 0);
//        return result;
//    }
}
