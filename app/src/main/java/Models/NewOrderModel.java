package Models;

public class NewOrderModel {



    private String heading;
    private String message;

    private String orderID;
    private int mushNP,soupNP,wingsNP,beefNP,chickenNP,burgerNP,pizzaNP,sizzlerNP,cakeNP,pieNP,pancakeNP,cokeNP,waterNP;

    public NewOrderModel() {
    }

    public NewOrderModel(String heading, String message, int mushNP, int soupNP, int wingsNP, int beefNP, int chickenNP, int burgerNP, int pizzaNP, int sizzlerNP, int cakeNP, int pieNP, int pancakeNP, int cokeNP, int waterNP) {
        this.heading = heading;
        this.message = message;
        this.orderID = orderID;
        this.mushNP = mushNP;
        this.soupNP = soupNP;
        this.wingsNP = wingsNP;
        this.beefNP = beefNP;
        this.chickenNP = chickenNP;
        this.burgerNP = burgerNP;
        this.pizzaNP = pizzaNP;
        this.sizzlerNP = sizzlerNP;
        this.cakeNP = cakeNP;
        this.pieNP = pieNP;
        this.pancakeNP = pancakeNP;
        this.cokeNP = cokeNP;
        this.waterNP = waterNP;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }


    public int getMushNP() {
        return mushNP;
    }

    public void setMushNP(int mushNP) {
        this.mushNP = mushNP;
    }

    public int getSoupNP() {
        return soupNP;
    }

    public void setSoupNP(int soupNP) {
        this.soupNP = soupNP;
    }

    public int getWingsNP() {
        return wingsNP;
    }

    public void setWingsNP(int wingsNP) {
        this.wingsNP = wingsNP;
    }

    public int getBeefNP() {
        return beefNP;
    }

    public void setBeefNP(int beefNP) {
        this.beefNP = beefNP;
    }

    public int getChickenNP() {
        return chickenNP;
    }

    public void setChickenNP(int chickenNP) {
        this.chickenNP = chickenNP;
    }

    public int getBurgerNP() {
        return burgerNP;
    }

    public void setBurgerNP(int burgerNP) {
        this.burgerNP = burgerNP;
    }

    public int getPizzaNP() {
        return pizzaNP;
    }

    public void setPizzaNP(int pizzaNP) {
        this.pizzaNP = pizzaNP;
    }

    public int getSizzlerNP() {
        return sizzlerNP;
    }

    public void setSizzlerNP(int sizzlerNP) {
        this.sizzlerNP = sizzlerNP;
    }

    public int getCakeNP() {
        return cakeNP;
    }

    public void setCakeNP(int cakeNP) {
        this.cakeNP = cakeNP;
    }

    public int getPieNP() {
        return pieNP;
    }

    public void setPieNP(int pieNP) {
        this.pieNP = pieNP;
    }

    public int getPancakeNP() {
        return pancakeNP;
    }

    public void setPancakeNP(int pancakeNP) {
        this.pancakeNP = pancakeNP;
    }

    public int getCokeNP() {
        return cokeNP;
    }

    public void setCokeNP(int cokeNP) {
        this.cokeNP = cokeNP;
    }

    public int getWaterNP() {
        return waterNP;
    }

    public void setWaterNP(int waterNP) {
        this.waterNP = waterNP;
    }

    @Override
    public String toString() {
        return "NewOrderModel{" +
                "heading='" + heading + '\'' +
                ", message='" + message + '\'' +
                ", orderID='" + orderID + '\'' +
                ", mushNP=" + mushNP +
                ", soupNP=" + soupNP +
                ", wingsNP=" + wingsNP +
                ", beefNP=" + beefNP +
                ", chickenNP=" + chickenNP +
                ", burgerNP=" + burgerNP +
                ", pizzaNP=" + pizzaNP +
                ", sizzlerNP=" + sizzlerNP +
                ", cakeNP=" + cakeNP +
                ", pieNP=" + pieNP +
                ", pancakeNP=" + pancakeNP +
                ", cokeNP=" + cokeNP +
                ", waterNP=" + waterNP +
                '}';
    }
}