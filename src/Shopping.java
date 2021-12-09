public class Shopping {
    public static void main(String[] args){

        String[] groceryItems = {"steak", "milk", "jelly beans"};
        double[] prices = {25.00, 2.95, 2.50};

        // Adding ham to the groceries array
        groceryItems[3] = "ham";
        prices[3] = 4.99;

        //^^does not work because an array in java has a fixed size, you cannot add or remove elements.
        
    }
}
