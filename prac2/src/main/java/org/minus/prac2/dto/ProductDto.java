package org.minus.prac2.dto;

/**
 * Created by zhengsihan, on 2019-10-28
 */
public class ProductDto {

    private Long id;
    private String prodName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    @Override
    public String toString() {
        return String.format("ProductsDto{id=%d, prodName=%s}", this.id, this.prodName);
    }
}
