package Models;

public class NewOrderModel {

    private int orderID;
    private int tableNo;
    private String message;
    private int timeStamp;
    private String type;

    //STARTERS
    private String starter;
    private int mushQuantity;
    private String mushMessage;
    private String soup;
    private int soupQuantity;
    private String soupMessage;
    private String wings;
    private int wingsQuantity;
    private String wingsMessage;
    private Double starterPrice;


    //MAINS
    private String main;
    private String beef, chicken, burger, pizza, sizzler;
    private String chickenMessage, burgerMessage, pizzaMessage, sizzlerMessage, beefMessage;
    private int chickenQuantity, burgerQuantity, pizzaQuantity, sizzlerQuantity, beefQuantity;
    private Double mainPrice;

    //DESSERT
    private String desert;
    private String cake, cheesecake, applePie, pancakes;
    private String cakeMessage, cheesecakeMessage, applePieMessage, pancakesMessage;
    private int cakeQuantity, cheesecakeQuantity, applePieQuantity, pancakesQuantity;
    private Double dessertPrice;

    //DRINKS
    private String drink, mineral, beer, wine, water;
    private String mineralType, beerType, wineType;
    private String coke, orange, lemon, dietCoke, lucozade, heineken, budwiser, bulmers, guinness, metalman, coorsLight, red, white;
    private int mineralQuantity, beerQuantity, wineQuantity, waterQuantity;
    private String mineralMessage, beerMessage, wineMessage;
    private Double drinkPrice;

    public NewOrderModel(int orderID, int tableNo, String message, int timeStamp, String type, String starter, int mushQuantity, String mushMessage, String soup, int soupQuantity, String soupMessage, String wings, int wingsQuantity, String wingsMessage, Double starterPrice, String main, String beef, String chicken, String burger, String pizza, String sizzler, String chickenMessage, String burgerMessage, String pizzaMessage, String sizzlerMessage, String beefMessage, int chickenQuantity, int burgerQuantity, int pizzaQuantity, int sizzlerQuantity, int beefQuantity, Double mainPrice, String desert, String cake, String cheesecake, String applePie, String pancakes, String cakeMessage, String cheesecakeMessage, String applePieMessage, String pancakesMessage, int cakeQuantity, int cheesecakeQuantity, int applePieQuantity, int pancakesQuantity, Double dessertPrice, String drink, String mineral, String beer, String wine, String water, String mineralType, String beerType, String wineType, String coke, String orange, String lemon, String dietCoke, String lucozade, String heineken, String budwiser, String bulmers, String guinness, String metalman, String coorsLight, String red, String white, int mineralQuantity, int beerQuantity, int wineQuantity, int waterQuantity, String mineralMessage, String beerMessage, String wineMessage, Double drinkPrice) {
        this.orderID = orderID;
        this.tableNo = tableNo;
        this.message = message;
        this.timeStamp = timeStamp;
        this.type = type;
        this.starter = starter;
        this.mushQuantity = mushQuantity;
        this.mushMessage = mushMessage;
        this.soup = soup;
        this.soupQuantity = soupQuantity;
        this.soupMessage = soupMessage;
        this.wings = wings;
        this.wingsQuantity = wingsQuantity;
        this.wingsMessage = wingsMessage;
        this.starterPrice = starterPrice;
        this.main = main;
        this.beef = beef;
        this.chicken = chicken;
        this.burger = burger;
        this.pizza = pizza;
        this.sizzler = sizzler;
        this.chickenMessage = chickenMessage;
        this.burgerMessage = burgerMessage;
        this.pizzaMessage = pizzaMessage;
        this.sizzlerMessage = sizzlerMessage;
        this.beefMessage = beefMessage;
        this.chickenQuantity = chickenQuantity;
        this.burgerQuantity = burgerQuantity;
        this.pizzaQuantity = pizzaQuantity;
        this.sizzlerQuantity = sizzlerQuantity;
        this.beefQuantity = beefQuantity;
        this.mainPrice = mainPrice;
        this.desert = desert;
        this.cake = cake;
        this.cheesecake = cheesecake;
        this.applePie = applePie;
        this.pancakes = pancakes;
        this.cakeMessage = cakeMessage;
        this.cheesecakeMessage = cheesecakeMessage;
        this.applePieMessage = applePieMessage;
        this.pancakesMessage = pancakesMessage;
        this.cakeQuantity = cakeQuantity;
        this.cheesecakeQuantity = cheesecakeQuantity;
        this.applePieQuantity = applePieQuantity;
        this.pancakesQuantity = pancakesQuantity;
        this.dessertPrice = dessertPrice;
        this.drink = drink;
        this.mineral = mineral;
        this.beer = beer;
        this.wine = wine;
        this.water = water;
        this.mineralType = mineralType;
        this.beerType = beerType;
        this.wineType = wineType;
        this.coke = coke;
        this.orange = orange;
        this.lemon = lemon;
        this.dietCoke = dietCoke;
        this.lucozade = lucozade;
        this.heineken = heineken;
        this.budwiser = budwiser;
        this.bulmers = bulmers;
        this.guinness = guinness;
        this.metalman = metalman;
        this.coorsLight = coorsLight;
        this.red = red;
        this.white = white;
        this.mineralQuantity = mineralQuantity;
        this.beerQuantity = beerQuantity;
        this.wineQuantity = wineQuantity;
        this.waterQuantity = waterQuantity;
        this.mineralMessage = mineralMessage;
        this.beerMessage = beerMessage;
        this.wineMessage = wineMessage;
        this.drinkPrice = drinkPrice;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStarter() {
        return starter;
    }

    public void setStarter(String starter) {
        this.starter = starter;
    }

    public int getMushQuantity() {
        return mushQuantity;
    }

    public void setMushQuantity(int mushQuantity) {
        this.mushQuantity = mushQuantity;
    }

    public String getMushMessage() {
        return mushMessage;
    }

    public void setMushMessage(String mushMessage) {
        this.mushMessage = mushMessage;
    }

    public String getSoup() {
        return soup;
    }

    public void setSoup(String soup) {
        this.soup = soup;
    }

    public int getSoupQuantity() {
        return soupQuantity;
    }

    public void setSoupQuantity(int soupQuantity) {
        this.soupQuantity = soupQuantity;
    }

    public String getSoupMessage() {
        return soupMessage;
    }

    public void setSoupMessage(String soupMessage) {
        this.soupMessage = soupMessage;
    }

    public String getWings() {
        return wings;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }

    public int getWingsQuantity() {
        return wingsQuantity;
    }

    public void setWingsQuantity(int wingsQuantity) {
        this.wingsQuantity = wingsQuantity;
    }

    public String getWingsMessage() {
        return wingsMessage;
    }

    public void setWingsMessage(String wingsMessage) {
        this.wingsMessage = wingsMessage;
    }

    public Double getStarterPrice() {
        return starterPrice;
    }

    public void setStarterPrice(Double starterPrice) {
        this.starterPrice = starterPrice;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getBeef() {
        return beef;
    }

    public void setBeef(String beef) {
        this.beef = beef;
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getBurger() {
        return burger;
    }

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getSizzler() {
        return sizzler;
    }

    public void setSizzler(String sizzler) {
        this.sizzler = sizzler;
    }

    public String getChickenMessage() {
        return chickenMessage;
    }

    public void setChickenMessage(String chickenMessage) {
        this.chickenMessage = chickenMessage;
    }

    public String getBurgerMessage() {
        return burgerMessage;
    }

    public void setBurgerMessage(String burgerMessage) {
        this.burgerMessage = burgerMessage;
    }

    public String getPizzaMessage() {
        return pizzaMessage;
    }

    public void setPizzaMessage(String pizzaMessage) {
        this.pizzaMessage = pizzaMessage;
    }

    public String getSizzlerMessage() {
        return sizzlerMessage;
    }

    public void setSizzlerMessage(String sizzlerMessage) {
        this.sizzlerMessage = sizzlerMessage;
    }

    public String getBeefMessage() {
        return beefMessage;
    }

    public void setBeefMessage(String beefMessage) {
        this.beefMessage = beefMessage;
    }

    public int getChickenQuantity() {
        return chickenQuantity;
    }

    public void setChickenQuantity(int chickenQuantity) {
        this.chickenQuantity = chickenQuantity;
    }

    public int getBurgerQuantity() {
        return burgerQuantity;
    }

    public void setBurgerQuantity(int burgerQuantity) {
        this.burgerQuantity = burgerQuantity;
    }

    public int getPizzaQuantity() {
        return pizzaQuantity;
    }

    public void setPizzaQuantity(int pizzaQuantity) {
        this.pizzaQuantity = pizzaQuantity;
    }

    public int getSizzlerQuantity() {
        return sizzlerQuantity;
    }

    public void setSizzlerQuantity(int sizzlerQuantity) {
        this.sizzlerQuantity = sizzlerQuantity;
    }

    public int getBeefQuantity() {
        return beefQuantity;
    }

    public void setBeefQuantity(int beefQuantity) {
        this.beefQuantity = beefQuantity;
    }

    public Double getMainPrice() {
        return mainPrice;
    }

    public void setMainPrice(Double mainPrice) {
        this.mainPrice = mainPrice;
    }

    public String getDesert() {
        return desert;
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public String getCake() {
        return cake;
    }

    public void setCake(String cake) {
        this.cake = cake;
    }

    public String getCheesecake() {
        return cheesecake;
    }

    public void setCheesecake(String cheesecake) {
        this.cheesecake = cheesecake;
    }

    public String getApplePie() {
        return applePie;
    }

    public void setApplePie(String applePie) {
        this.applePie = applePie;
    }

    public String getPancakes() {
        return pancakes;
    }

    public void setPancakes(String pancakes) {
        this.pancakes = pancakes;
    }

    public String getCakeMessage() {
        return cakeMessage;
    }

    public void setCakeMessage(String cakeMessage) {
        this.cakeMessage = cakeMessage;
    }

    public String getCheesecakeMessage() {
        return cheesecakeMessage;
    }

    public void setCheesecakeMessage(String cheesecakeMessage) {
        this.cheesecakeMessage = cheesecakeMessage;
    }

    public String getApplePieMessage() {
        return applePieMessage;
    }

    public void setApplePieMessage(String applePieMessage) {
        this.applePieMessage = applePieMessage;
    }

    public String getPancakesMessage() {
        return pancakesMessage;
    }

    public void setPancakesMessage(String pancakesMessage) {
        this.pancakesMessage = pancakesMessage;
    }

    public int getCakeQuantity() {
        return cakeQuantity;
    }

    public void setCakeQuantity(int cakeQuantity) {
        this.cakeQuantity = cakeQuantity;
    }

    public int getCheesecakeQuantity() {
        return cheesecakeQuantity;
    }

    public void setCheesecakeQuantity(int cheesecakeQuantity) {
        this.cheesecakeQuantity = cheesecakeQuantity;
    }

    public int getApplePieQuantity() {
        return applePieQuantity;
    }

    public void setApplePieQuantity(int applePieQuantity) {
        this.applePieQuantity = applePieQuantity;
    }

    public int getPancakesQuantity() {
        return pancakesQuantity;
    }

    public void setPancakesQuantity(int pancakesQuantity) {
        this.pancakesQuantity = pancakesQuantity;
    }

    public Double getDessertPrice() {
        return dessertPrice;
    }

    public void setDessertPrice(Double dessertPrice) {
        this.dessertPrice = dessertPrice;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getMineral() {
        return mineral;
    }

    public void setMineral(String mineral) {
        this.mineral = mineral;
    }

    public String getBeer() {
        return beer;
    }

    public void setBeer(String beer) {
        this.beer = beer;
    }

    public String getWine() {
        return wine;
    }

    public void setWine(String wine) {
        this.wine = wine;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getMineralType() {
        return mineralType;
    }

    public void setMineralType(String mineralType) {
        this.mineralType = mineralType;
    }

    public String getBeerType() {
        return beerType;
    }

    public void setBeerType(String beerType) {
        this.beerType = beerType;
    }

    public String getWineType() {
        return wineType;
    }

    public void setWineType(String wineType) {
        this.wineType = wineType;
    }

    public String getCoke() {
        return coke;
    }

    public void setCoke(String coke) {
        this.coke = coke;
    }

    public String getOrange() {
        return orange;
    }

    public void setOrange(String orange) {
        this.orange = orange;
    }

    public String getLemon() {
        return lemon;
    }

    public void setLemon(String lemon) {
        this.lemon = lemon;
    }

    public String getDietCoke() {
        return dietCoke;
    }

    public void setDietCoke(String dietCoke) {
        this.dietCoke = dietCoke;
    }

    public String getLucozade() {
        return lucozade;
    }

    public void setLucozade(String lucozade) {
        this.lucozade = lucozade;
    }

    public String getHeineken() {
        return heineken;
    }

    public void setHeineken(String heineken) {
        this.heineken = heineken;
    }

    public String getBudwiser() {
        return budwiser;
    }

    public void setBudwiser(String budwiser) {
        this.budwiser = budwiser;
    }

    public String getBulmers() {
        return bulmers;
    }

    public void setBulmers(String bulmers) {
        this.bulmers = bulmers;
    }

    public String getGuinness() {
        return guinness;
    }

    public void setGuinness(String guinness) {
        this.guinness = guinness;
    }

    public String getMetalman() {
        return metalman;
    }

    public void setMetalman(String metalman) {
        this.metalman = metalman;
    }

    public String getCoorsLight() {
        return coorsLight;
    }

    public void setCoorsLight(String coorsLight) {
        this.coorsLight = coorsLight;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public String getWhite() {
        return white;
    }

    public void setWhite(String white) {
        this.white = white;
    }

    public int getMineralQuantity() {
        return mineralQuantity;
    }

    public void setMineralQuantity(int mineralQuantity) {
        this.mineralQuantity = mineralQuantity;
    }

    public int getBeerQuantity() {
        return beerQuantity;
    }

    public void setBeerQuantity(int beerQuantity) {
        this.beerQuantity = beerQuantity;
    }

    public int getWineQuantity() {
        return wineQuantity;
    }

    public void setWineQuantity(int wineQuantity) {
        this.wineQuantity = wineQuantity;
    }

    public int getWaterQuantity() {
        return waterQuantity;
    }

    public void setWaterQuantity(int waterQuantity) {
        this.waterQuantity = waterQuantity;
    }

    public String getMineralMessage() {
        return mineralMessage;
    }

    public void setMineralMessage(String mineralMessage) {
        this.mineralMessage = mineralMessage;
    }

    public String getBeerMessage() {
        return beerMessage;
    }

    public void setBeerMessage(String beerMessage) {
        this.beerMessage = beerMessage;
    }

    public String getWineMessage() {
        return wineMessage;
    }

    public void setWineMessage(String wineMessage) {
        this.wineMessage = wineMessage;
    }

    public Double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(Double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }
}