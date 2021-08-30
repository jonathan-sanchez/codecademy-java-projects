public class Store {

    //Instance Fields
    String productType;
    int inventoryCount;
    double inventoryPrice;

    //Constructor Method
    public Store(String product, int count, double price) {
        System.out.println("I am inside the constructor method!");
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }
    
    //Main Method is where we create instances
    public static void main(String[] args) {

        //Create the instance below
        Store lemonadeStand = new Store("lemonade", 42, .99);
        Store cookieShop = new Store("cookies", 12, 3.75);
        Store vapeShop = new Store("vape juice", 50, 19.99);

        //Print the instance below
        System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");

        System.out.println("Our second shop sells " + cookieShop.productType + " at " + cookieShop.inventoryPrice + " per unit.");

        System.out.println("Our third shop sells " + vapeShop.productType + " at " + vapeShop.inventoryPrice + " per unit.");
    }
}
