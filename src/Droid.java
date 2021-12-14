//Class Droid
public class Droid {
    //Instance field
    int batteryLevel;
    String name;

    //Main method
    public static void main(String[] args) {

        //New instance of Droid named "Codey"
        Droid myDroid = new Droid("Codey");
    }

    //Constructor method for Droid
    public Droid(String droidName) { //This method has one parameter "String droidName"
        name = droidName;
        batteryLevel = 100;
    }
}
