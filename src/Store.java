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
        System.out.println("This is the Main Method!");
        //Create the instance below
        Store lemonadeStand = new Store("lemonade", 42, .99);
        Store cookieShop = new Store("cookies", 12, 3.75);
        Store vapeShop = new Store("vape juice", 50, 19.99);
        Store wichShop = new Store("sandwiches", 15, 7.99);
        Store iceCreamShop = new Store("ice cream", 25, 4.99);
        Store videoGameStore = new Store("video games", 100, 5.99);
        Store craftShop = new Store("jewelery", 50, 99.99);
        Store petShop = new Store("pet supplies", 100, 29.99);
        Store shoeStore = new Store("shoes", 50, 49.99);
        Store phoneStore = new Store("cell phones", 50, 99.99);
        Store skateShop = new Store("Skateboards", 100, 49.99);

        //Print the instance below
        System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");

        System.out.println("Our second shop sells " + cookieShop.productType + " at " + cookieShop.inventoryPrice + " per unit.");

        System.out.println("Our third shop sells " + vapeShop.productType + " at " + vapeShop.inventoryPrice + " per unit.");

        System.out.println("Our fourth shop sells " + wichShop.productType + " at " + wichShop.inventoryPrice + " per unit.");

        System.out.println("Our fifth shop sells " + iceCreamShop.productType + " at " + iceCreamShop.inventoryPrice + " per unit.");

        System.out.println("Our sixth shop sells " + videoGameStore.productType + " at " + videoGameStore.inventoryPrice + " per unit.");

        System.out.println("Our seventh shop sells " + craftShop.productType + " at " + craftShop.inventoryPrice + " per unit.");

        System.out.println("Our eighth shop sells " + petShop.productType + " at " + petShop.inventoryPrice + " per unit.");

        System.out.println("Our ninth shop sells " + shoeStore.productType + " at " + shoeStore.inventoryPrice + " per unit.");

        System.out.println("Our tenth shop sells " + phoneStore.productType + " at " + phoneStore.inventoryPrice + " per unit.");

        System.out.println("Another shop sells " + phoneStore.productType + " at " + phoneStore.inventoryPrice + " per unit.");
    }
}
