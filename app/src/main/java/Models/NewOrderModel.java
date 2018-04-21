package Models;

public class NewOrderModel {



    private String heading;
    private String description;

    private String orderID, mushCB,soupCB,wingsCB,beefCB,chickenCB,burgerCB,pizzaCB,sizzlerCB,cakeCB,pieCB,pancakeCB,cokeCB,waterCB;
    private int mushNP,soupNP,wingsNP,beefNP,chickenNP,burgerNP,pizzaNP,sizzlerNP,cakeNP,pieNP,pancakeNP,cokeNP,waterNP;

    public NewOrderModel(String heading) {
        this.heading = heading;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }
}