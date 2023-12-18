package com.test.gtech.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class ResponseDTO implements Serializable {
    private int no;
    @JsonProperty("Product_Id")
    private int productId;

    @JsonProperty("Nama_Product")
    private String productName;

    @JsonProperty("Jenis_Product")
    private String productType;

    @JsonProperty("Harga_Product")
    private BigDecimal productPrice;

    @JsonProperty("Margin_Keuntungan")
    private BigDecimal marginRate;

    public ResponseDTO(int no, int productId, String productName, String productType,
                       BigDecimal productPrice, BigDecimal marginRate) {
        this.no = no;
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.productPrice = productPrice;
        this.marginRate = marginRate;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getMarginRate() {
        return marginRate;
    }

    public void setMarginRate(BigDecimal marginRate) {
        this.marginRate = marginRate;
    }
}
