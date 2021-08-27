public class Store {

    //Instance Fields
    String productType;
    int inventoryCount;
    double inventoryPrice;

    //Constructor Method
    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }
    
    //Main Method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("lemonade", 42, .99);
        Store cookieShop = new Store("cookies", 12, 3.75);
        Store vapeShop = new Store("vape juice", 50, 19.99);

        System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");

        System.out.println("Our second shop sells " + cookieShop.productType + " at " + cookieShop.inventoryPrice + " per unit.");

        System.out.println("Our third shop sells " + vapeShop.productType + " at " + vapeShop.inventoryPrice + " per unit.");
    }
}
