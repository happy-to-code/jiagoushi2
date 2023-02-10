package com.yida.test.json_2;

import java.math.BigDecimal;
import java.util.StringJoiner;

public class SakCodFreightDayExcelModel {
    @ExcelColumn(value = "站点名称", col = 110)
    private String siteName;
    @ExcelColumn(value = "产品名称", col = 110)
    private String productName;
    @ExcelColumn(value = "签收率", col = 110)
    private String signRate;
    @ExcelColumn(value = "审单率", col = 110)
    private String examineRate;
    @ExcelColumn(value = "总营收", col = 110)
    private BigDecimal totalRevenue = BigDecimal.ZERO;
    @ExcelColumn(value = "运费收入", col = 110)
    private BigDecimal shippingMoney = BigDecimal.ZERO;
    @ExcelColumn(value = "商品营收", col = 110)
    private BigDecimal merchandiseRevenue = BigDecimal.ZERO;
    @ExcelColumn(value = "广告费", col = 110)
    private BigDecimal adCost = BigDecimal.ZERO;
    @ExcelColumn(value = "CPA", col = 110)
    private BigDecimal cpa = BigDecimal.ZERO;
    @ExcelColumn(value = "货值", col = 110)
    private BigDecimal goodValue = BigDecimal.ZERO;
    @ExcelColumn(value = "运费", col = 110)
    private BigDecimal freight = BigDecimal.ZERO;
    @ExcelColumn(value = "收款手续费", col = 110)
    private BigDecimal collectionFreight = BigDecimal.ZERO;
    @ExcelColumn(value = "退件手续费", col = 110)
    private BigDecimal refundFreight = BigDecimal.ZERO;
    @ExcelColumn(value = "退款金额", col = 110)
    private BigDecimal refundMoney = BigDecimal.ZERO;
    @ExcelColumn(value = "仓库人工", col = 110)
    private BigDecimal warehouseFee = BigDecimal.ZERO;
    @ExcelColumn(value = "未签收率折损", col = 110)
    private BigDecimal unsignedDamageFee = BigDecimal.ZERO;
    @ExcelColumn(value = "VAT", col = 110)
    private BigDecimal vat = BigDecimal.ZERO;
    @ExcelColumn(value = "实际盈利", col = 110)
    private BigDecimal revenue = BigDecimal.ZERO;
    @ExcelColumn(value = "订单数量", col = 110)
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

    @Override
    public String toString() {
        return new StringJoiner(", ", SakCodFreightDayExcelModel.class.getSimpleName() + "[", "]").add("siteName='" + siteName + "'").add("productName='" + productName + "'").add("signRate='" + signRate + "'").add("examineRate='" + examineRate + "'").add("totalRevenue=" + totalRevenue).add("shippingMoney=" + shippingMoney).add("merchandiseRevenue=" + merchandiseRevenue).add("adCost=" + adCost).add("cpa=" + cpa).add("goodValue=" + goodValue).add("freight=" + freight).add("collectionFreight=" + collectionFreight).add("refundFreight=" + refundFreight).add("refundMoney=" + refundMoney).add("warehouseFee=" + warehouseFee).add("unsignedDamageFee=" + unsignedDamageFee).add("vat=" + vat).add("revenue=" + revenue).add("orderNum=" + orderNum).toString();
    }
}
