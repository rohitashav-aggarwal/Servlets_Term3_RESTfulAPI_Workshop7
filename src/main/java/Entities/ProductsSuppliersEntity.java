package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products_suppliers", schema = "travelexperts", catalog = "")
public class ProductsSuppliersEntity {

    @Id
    @Column(name = "ProductSupplierId", nullable = false)
    private int productSupplierId;


    public int getProductSupplierId() {
        return productSupplierId;
    }

    public void setProductSupplierId(int productSupplierId) {
        this.productSupplierId = productSupplierId;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ProductsSuppliersEntity that = (ProductsSuppliersEntity) o;
//
//        if (productSupplierId != that.productSupplierId) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        return productSupplierId;
//    }
}
