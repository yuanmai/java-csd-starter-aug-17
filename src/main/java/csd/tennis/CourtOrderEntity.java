package csd.tennis;

public class CourtOrderEntity {
    private String userName;
    private String courtName;
    private String courtPlace;
    private String beginTime;
    private String endTime;
    private boolean orderStatus;

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public String getCourtPlace() {
        return courtPlace;
    }

    public void setCourtPlace(String courtPlace) {
        this.courtPlace = courtPlace;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


}
