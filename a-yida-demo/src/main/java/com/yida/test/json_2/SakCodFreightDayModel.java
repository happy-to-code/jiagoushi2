package com.yida.test.json_2;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SakCodFreightDayModel {
    private String siteName;
    private String productName;
    private String signRate;
    private String examineRate;
    private BigDecimal totalRevenue = BigDecimal.ZERO;
    private BigDecimal shippingMoney = BigDecimal.ZERO;
    private BigDecimal merchandiseRevenue = BigDecimal.ZERO;
    private BigDecimal adCost = BigDecimal.ZERO;
    private BigDecimal cpa = BigDecimal.ZERO;
    private BigDecimal goodValue = BigDecimal.ZERO;
    private BigDecimal freight = BigDecimal.ZERO;
    private BigDecimal collectionFreight = BigDecimal.ZERO;
    private BigDecimal refundFreight = BigDecimal.ZERO;
    private BigDecimal refundMoney = BigDecimal.ZERO;
    private BigDecimal warehouseFee = BigDecimal.ZERO;
    private BigDecimal unsignedDamageFee = BigDecimal.ZERO;
    private BigDecimal vat = BigDecimal.ZERO;
    private BigDecimal revenue = BigDecimal.ZERO;
    private Integer orderNum = 0;

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSignRate() {
        return signRate;
    }

    public void setSignRate(String signRate) {
        this.signRate = signRate;
    }

    public String getExamineRate() {
        return examineRate;
    }

    public void setExamineRate(String examineRate) {
        this.examineRate = examineRate;
    }

    public BigDecimal getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(BigDecimal totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public BigDecimal getShippingMoney() {
        return shippingMoney;
    }

    public void setShippingMoney(BigDecimal shippingMoney) {
        this.shippingMoney = shippingMoney;
    }

    public BigDecimal getMerchandiseRevenue() {
        return merchandiseRevenue;
    }

    public void setMerchandiseRevenue(BigDecimal merchandiseRevenue) {
        this.merchandiseRevenue = merchandiseRevenue;
    }

    public BigDecimal getAdCost() {
        return adCost;
    }

    public void setAdCost(BigDecimal adCost) {
        this.adCost = adCost;
    }

    public BigDecimal getCpa() {
        return cpa;
    }

    public void setCpa(BigDecimal cpa) {
        this.cpa = cpa;
    }

    public BigDecimal getGoodValue() {
        return goodValue;
    }

    public void setGoodValue(BigDecimal goodValue) {
        this.goodValue = goodValue;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getCollectionFreight() {
        return collectionFreight;
    }

    public void setCollectionFreight(BigDecimal collectionFreight) {
        this.collectionFreight = collectionFreight;
    }

    public BigDecimal getRefundFreight() {
        return refundFreight;
    }

    public void setRefundFreight(BigDecimal refundFreight) {
        this.refundFreight = refundFreight;
    }

    public BigDecimal getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(BigDecimal refundMoney) {
        this.refundMoney = refundMoney;
    }

    public BigDecimal getWarehouseFee() {
        return warehouseFee;
    }

    public void setWarehouseFee(BigDecimal warehouseFee) {
        this.warehouseFee = warehouseFee;
    }

    public BigDecimal getUnsignedDamageFee() {
        return unsignedDamageFee;
    }

    public void setUnsignedDamageFee(BigDecimal unsignedDamageFee) {
        this.unsignedDamageFee = unsignedDamageFee;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public BigDecimal getRevenue() {
        return revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
}
