package Models;

public class NewOrderModel {



    private String heading;
    private String description;

    private String orderID, mushCB,soupCB,wingsCB,beefCB,chickenCB,burgerCB,pizzaCB,sizzlerCB,cakeCB,pieCB,pancakeCB,cokeCB,waterCB;
    private int mushNP,soupNP,wingsNP,beefNP,chickenNP,burgerNP,pizzaNP,sizzlerNP,cakeNP,pieNP,pancakeNP,cokeNP,waterNP;

    public NewOrderModel() {
    }

    public NewOrderModel(String heading, String description, String mushCB, String soupCB, String wingsCB, String beefCB, String chickenCB, String burgerCB, String pizzaCB, String sizzlerCB, String cakeCB, String pieCB, String pancakeCB, String cokeCB, String waterCB, int mushNP, int soupNP, int wingsNP, int beefNP, int chickenNP, int burgerNP, int pizzaNP, int sizzlerNP, int cakeNP, int pieNP, int pancakeNP, int cokeNP, int waterNP) {
        this.heading = heading;
        this.description = description;
        this.orderID = orderID;
        this.mushCB = mushCB;
        this.soupCB = soupCB;
        this.wingsCB = wingsCB;
        this.beefCB = beefCB;
        this.chickenCB = chickenCB;
        this.burgerCB = burgerCB;
        this.pizzaCB = pizzaCB;
        this.sizzlerCB = sizzlerCB;
        this.cakeCB = cakeCB;
        this.pieCB = pieCB;
        this.pancakeCB = pancakeCB;
       this.cokeCB = cokeCB;
       this.waterCB = waterCB;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getMushCB() {
        return mushCB;
    }

    public void setMushCB(String mushCB) {
        this.mushCB = mushCB;
    }

    public String getSoupCB() {
        return soupCB;
    }

    public void setSoupCB(String soupCB) {
        this.soupCB = soupCB;
    }

    public String getWingsCB() {
        return wingsCB;
    }

    public void setWingsCB(String wingsCB) {
        this.wingsCB = wingsCB;
    }

    public String getBeefCB() {
        return beefCB;
    }

    public void setBeefCB(String beefCB) {
        this.beefCB = beefCB;
    }

    public String getChickenCB() {
        return chickenCB;
    }

    public void setChickenCB(String chickenCB) {
        this.chickenCB = chickenCB;
    }

    public String getBurgerCB() {
        return burgerCB;
    }

    public void setBurgerCB(String burgerCB) {
        this.burgerCB = burgerCB;
    }

    public String getPizzaCB() {
        return pizzaCB;
    }

    public void setPizzaCB(String pizzaCB) {
        this.pizzaCB = pizzaCB;
    }

    public String getSizzlerCB() {
        return sizzlerCB;
    }

    public void setSizzlerCB(String sizzlerCB) {
        this.sizzlerCB = sizzlerCB;
    }

    public String getCakeCB() {
        return cakeCB;
    }

    public void setCakeCB(String cakeCB) {
        this.cakeCB = cakeCB;
    }

    public String getPieCB() {
        return pieCB;
    }

    public void setPieCB(String pieCB) {
        this.pieCB = pieCB;
    }

    public String getPancakeCB() {
        return pancakeCB;
    }

    public void setPancakeCB(String pancakeCB) {
        this.pancakeCB = pancakeCB;
    }

    public String getCokeCB() {
        return cokeCB;
    }

    public void setCokeCB(String cokeCB) {
        this.cokeCB = cokeCB;
    }

    public String getWaterCB() {
        return waterCB;
    }

    public void setWaterCB(String waterCB) {
        this.waterCB = waterCB;
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
                ", description='" + description + '\'' +
                ", orderID='" + orderID + '\'' +
                ", mushCB='" + mushCB + '\'' +
                ", soupCB='" + soupCB + '\'' +
                ", wingsCB='" + wingsCB + '\'' +
                ", beefCB='" + beefCB + '\'' +
                ", chickenCB='" + chickenCB + '\'' +
                ", burgerCB='" + burgerCB + '\'' +
                ", pizzaCB='" + pizzaCB + '\'' +
                ", sizzlerCB='" + sizzlerCB + '\'' +
                ", cakeCB='" + cakeCB + '\'' +
                ", pieCB='" + pieCB + '\'' +
                ", pancakeCB='" + pancakeCB + '\'' +
                ", cokeCB='" + cokeCB + '\'' +
                ", waterCB='" + waterCB + '\'' +
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