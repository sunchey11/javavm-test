package anders.javavm.memory;

import lombok.Data;

/**
 * 用户
 */
@Data
public class User {
    String name;
    Integer age;
    /**
     * 记录ID
     */
    private java.lang.String transitid;

    /**
     * 经营主体ID
     */
    private java.lang.Long entryid;
    /**
     * 记录编号
     */
    private java.lang.String transitno;
    /**
     * 仓库ID
     */
    private java.lang.Long warid;
    /**
     * 仓库名称
     */
    private java.lang.String warname;
    /**
     * 货主ID
     */
    private java.lang.Long consignor;
    /**
     * 货主名称
     */
    private java.lang.String consignorname;
    /**
     * 承运商ID
     */
    private java.lang.Long carrierid;
    /**
     * 承运商名称
     */
    private java.lang.String carriername;
    /**
     * 单位ID
     */
    private java.lang.Long companyid;
    /**
     * 单位名称
     */
    private java.lang.String companyname;
    /**
     * 地址ID
     */
    private java.lang.Long addressid;
    /**
     * 地址
     */
    private java.lang.String address;
    /**
     * 描述
     */
    private java.lang.String transitdesc;
    /**
     * 记录类型
     */
    private java.lang.Long transittype;
    /**
     * 发货时间
     */
    private java.sql.Timestamp sendtime;
    /**
     * 启运时间
     */
    private java.sql.Timestamp trbegintime;
    /**
     * 到达时间
     */
    private java.sql.Timestamp trendtime;
    /**
     * 运输设备
     */
    private java.lang.String trequipment;
    /**
     * 运输方式
     */
    private java.lang.String trmethod;
    /**
     * 运输时间
     */
    private java.math.BigDecimal lagtime;
    /**
     * 车牌号码
     */
    private java.lang.String trucknum;
    /**
     * 驾驶员
     */
    private java.lang.String driver;
    /**
     * 冷藏措施
     */
    private java.lang.String coolingmeasures;
    /**
     * 货运单号
     */
    private java.lang.String trackingno;
    /**
     * 装车单号
     */
    private java.lang.String dispatchno;
    /**
     * 启运湿度
     */
    private java.math.BigDecimal starthumanity;
    /**
     * 到达湿度
     */
    private java.math.BigDecimal endhumanity;
    /**
     * 启运温度
     */
    private java.math.BigDecimal starttemperature;
    /**
     * 达到温度
     */
    private java.math.BigDecimal endtemperature;
    /**
     * 签收人
     */
    private java.lang.String signedman;
    /**
     * 签收时间
     */
    private java.sql.Timestamp signeddate;
    /**
     * 创建人ID
     */
    private java.lang.String cremanid;
    /**
     * 创建人
     */
    private java.lang.String cremanname;
    /**
     * 创建日期
     */
    private java.sql.Timestamp credate;
    /**
     * 修改人
     */
    private java.lang.String editmanname;
    /**
     * 修改日期
     */
    private java.sql.Timestamp editdate;
    /**
     * 打印人ID
     */
    private java.lang.Long printmanid;
    /**
     * 打印人
     */
    private java.lang.String printmanname;
    /**
     * 打印时间
     */
    private java.sql.Timestamp printtime;
    /**
     * 备注
     */
    private java.lang.String memo;
    /**
     * UDF1
     */
    private java.lang.String udf1;
    /**
     * UDF2
     */
    private java.lang.String udf2;
    /**
     * UDF3
     */
    private java.lang.String udf3;
    /**
     * 记录名称
     */
    private java.lang.String recordname;

    private byte[] bytesArr;

    public java.lang.String getTransitid() {
        return transitid;
    }

    public void setTransitid(java.lang.String transitid) {
        this.transitid = transitid;
    }

    public java.lang.Long getEntryid() {
        return entryid;
    }

    public void setEntryid(java.lang.Long entryid) {
        this.entryid = entryid;
    }

    public java.lang.String getTransitno() {
        return transitno;
    }

    public void setTransitno(java.lang.String transitno) {
        this.transitno = transitno;
    }

    public java.lang.Long getWarid() {
        return warid;
    }

    public void setWarid(java.lang.Long warid) {
        this.warid = warid;
    }

    public java.lang.String getWarname() {
        return warname;
    }

    public void setWarname(java.lang.String warname) {
        this.warname = warname;
    }

    public java.lang.Long getConsignor() {
        return consignor;
    }

    public void setConsignor(java.lang.Long consignor) {
        this.consignor = consignor;
    }

    public java.lang.String getConsignorname() {
        return consignorname;
    }

    public void setConsignorname(java.lang.String consignorname) {
        this.consignorname = consignorname;
    }

    public java.lang.Long getCarrierid() {
        return carrierid;
    }

    public void setCarrierid(java.lang.Long carrierid) {
        this.carrierid = carrierid;
    }

    public java.lang.String getCarriername() {
        return carriername;
    }

    public void setCarriername(java.lang.String carriername) {
        this.carriername = carriername;
    }

    public java.lang.Long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(java.lang.Long companyid) {
        this.companyid = companyid;
    }

    public java.lang.String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(java.lang.String companyname) {
        this.companyname = companyname;
    }

    public java.lang.Long getAddressid() {
        return addressid;
    }

    public void setAddressid(java.lang.Long addressid) {
        this.addressid = addressid;
    }

    public java.lang.String getAddress() {
        return address;
    }

    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    public java.lang.String getTransitdesc() {
        return transitdesc;
    }

    public void setTransitdesc(java.lang.String transitdesc) {
        this.transitdesc = transitdesc;
    }

    public java.lang.Long getTransittype() {
        return transittype;
    }

    public void setTransittype(java.lang.Long transittype) {
        this.transittype = transittype;
    }

    public java.sql.Timestamp getSendtime() {
        return sendtime;
    }

    public void setSendtime(java.sql.Timestamp sendtime) {
        this.sendtime = sendtime;
    }

    public java.sql.Timestamp getTrbegintime() {
        return trbegintime;
    }

    public void setTrbegintime(java.sql.Timestamp trbegintime) {
        this.trbegintime = trbegintime;
    }

    public java.sql.Timestamp getTrendtime() {
        return trendtime;
    }

    public void setTrendtime(java.sql.Timestamp trendtime) {
        this.trendtime = trendtime;
    }

    public java.lang.String getTrequipment() {
        return trequipment;
    }

    public void setTrequipment(java.lang.String trequipment) {
        this.trequipment = trequipment;
    }

    public java.lang.String getTrmethod() {
        return trmethod;
    }

    public void setTrmethod(java.lang.String trmethod) {
        this.trmethod = trmethod;
    }

    public java.math.BigDecimal getLagtime() {
        return lagtime;
    }

    public void setLagtime(java.math.BigDecimal lagtime) {
        this.lagtime = lagtime;
    }

    public java.lang.String getTrucknum() {
        return trucknum;
    }

    public void setTrucknum(java.lang.String trucknum) {
        this.trucknum = trucknum;
    }

    public java.lang.String getDriver() {
        return driver;
    }

    public void setDriver(java.lang.String driver) {
        this.driver = driver;
    }

    public java.lang.String getCoolingmeasures() {
        return coolingmeasures;
    }

    public void setCoolingmeasures(java.lang.String coolingmeasures) {
        this.coolingmeasures = coolingmeasures;
    }

    public java.lang.String getTrackingno() {
        return trackingno;
    }

    public void setTrackingno(java.lang.String trackingno) {
        this.trackingno = trackingno;
    }

    public java.lang.String getDispatchno() {
        return dispatchno;
    }

    public void setDispatchno(java.lang.String dispatchno) {
        this.dispatchno = dispatchno;
    }

    public java.math.BigDecimal getStarthumanity() {
        return starthumanity;
    }

    public void setStarthumanity(java.math.BigDecimal starthumanity) {
        this.starthumanity = starthumanity;
    }

    public java.math.BigDecimal getEndhumanity() {
        return endhumanity;
    }

    public void setEndhumanity(java.math.BigDecimal endhumanity) {
        this.endhumanity = endhumanity;
    }

    public java.math.BigDecimal getStarttemperature() {
        return starttemperature;
    }

    public void setStarttemperature(java.math.BigDecimal starttemperature) {
        this.starttemperature = starttemperature;
    }

    public java.math.BigDecimal getEndtemperature() {
        return endtemperature;
    }

    public void setEndtemperature(java.math.BigDecimal endtemperature) {
        this.endtemperature = endtemperature;
    }

    public java.lang.String getSignedman() {
        return signedman;
    }

    public void setSignedman(java.lang.String signedman) {
        this.signedman = signedman;
    }

    public java.sql.Timestamp getSigneddate() {
        return signeddate;
    }

    public void setSigneddate(java.sql.Timestamp signeddate) {
        this.signeddate = signeddate;
    }

    public java.lang.String getCremanid() {
        return cremanid;
    }

    public void setCremanid(java.lang.String cremanid) {
        this.cremanid = cremanid;
    }

    public java.lang.String getCremanname() {
        return cremanname;
    }

    public void setCremanname(java.lang.String cremanname) {
        this.cremanname = cremanname;
    }

    public java.sql.Timestamp getCredate() {
        return credate;
    }

    public void setCredate(java.sql.Timestamp credate) {
        this.credate = credate;
    }

    public java.lang.String getEditmanname() {
        return editmanname;
    }

    public void setEditmanname(java.lang.String editmanname) {
        this.editmanname = editmanname;
    }

    public java.sql.Timestamp getEditdate() {
        return editdate;
    }

    public void setEditdate(java.sql.Timestamp editdate) {
        this.editdate = editdate;
    }

    public java.lang.Long getPrintmanid() {
        return printmanid;
    }

    public void setPrintmanid(java.lang.Long printmanid) {
        this.printmanid = printmanid;
    }

    public java.lang.String getPrintmanname() {
        return printmanname;
    }

    public void setPrintmanname(java.lang.String printmanname) {
        this.printmanname = printmanname;
    }

    public java.sql.Timestamp getPrinttime() {
        return printtime;
    }

    public void setPrinttime(java.sql.Timestamp printtime) {
        this.printtime = printtime;
    }

    public java.lang.String getMemo() {
        return memo;
    }

    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }

    public java.lang.String getUdf1() {
        return udf1;
    }

    public void setUdf1(java.lang.String udf1) {
        this.udf1 = udf1;
    }

    public java.lang.String getUdf2() {
        return udf2;
    }

    public void setUdf2(java.lang.String udf2) {
        this.udf2 = udf2;
    }

    public java.lang.String getUdf3() {
        return udf3;
    }

    public void setUdf3(java.lang.String udf3) {
        this.udf3 = udf3;
    }

    public java.lang.String getRecordname() {
        return recordname;
    }

    public void setRecordname(java.lang.String recordname) {
        this.recordname = recordname;
    }

    /**
     * 覆盖hashCode
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /**
     * 覆盖equals
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User other = (User) obj;
        Object otherNamename = other.getName();
        if (name == null) {
            if (otherNamename != null) {
                return false;
            }
        } else if (!name.equals(otherNamename)) {
            return false;
        }
        return true;

    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
//        for (int x = 0; x < 200; x++) {
            this.bytesArr = new byte[3 * 1024 * 1024];
//        }
    }

    public String info() {
        return String.format("姓名：%s，年龄：%s", name, age);
    }
}
