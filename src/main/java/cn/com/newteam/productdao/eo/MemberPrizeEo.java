package cn.com.newteam.productdao.eo;

import java.math.BigDecimal;
import java.util.Date;

public class MemberPrizeEo {
    private Long id;

    private String number;

    private String memberName;

    private Byte checkLevel;

    private Date registeredTime;

    private Integer qualifyPeriod;

    private Byte awardState;

    private Date createdTime;

    private Date expiredTime;

    private Date awardTime;

    private Integer awardPeriod;

    private Byte awardType;

    private String orderId;

    private BigDecimal point;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Byte getCheckLevel() {
        return checkLevel;
    }

    public void setCheckLevel(Byte checkLevel) {
        this.checkLevel = checkLevel;
    }

    public Date getRegisteredTime() {
        return registeredTime;
    }

    public void setRegisteredTime(Date registeredTime) {
        this.registeredTime = registeredTime;
    }

    public Integer getQualifyPeriod() {
        return qualifyPeriod;
    }

    public void setQualifyPeriod(Integer qualifyPeriod) {
        this.qualifyPeriod = qualifyPeriod;
    }

    public Byte getAwardState() {
        return awardState;
    }

    public void setAwardState(Byte awardState) {
        this.awardState = awardState;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }

    public Date getAwardTime() {
        return awardTime;
    }

    public void setAwardTime(Date awardTime) {
        this.awardTime = awardTime;
    }

    public Integer getAwardPeriod() {
        return awardPeriod;
    }

    public void setAwardPeriod(Integer awardPeriod) {
        this.awardPeriod = awardPeriod;
    }

    public Byte getAwardType() {
        return awardType;
    }

    public void setAwardType(Byte awardType) {
        this.awardType = awardType;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getPoint() {
        return point;
    }

    public void setPoint(BigDecimal point) {
        this.point = point;
    }
}