//Class Droid
public class Droid {
    //Instance field
    int batteryLevel;
    String name;

    //Main method
    public static void main(String[] args) {

        //New instance of Droid named "Codey"
        Droid myDroid = new Droid("Codey");
        //Print the variable for myDroid
        System.out.println(myDroid); //When printing it returns an object instead of the droid name. Must define a toString method for object
    }

    //Constructor method for Droid
    public Droid(String droidName) { //This method has one parameter "String droidName"
        name = droidName;
        //Every new instance of Droid will have a battery level of 100
        batteryLevel = 100;
    }
    //toString method within Droid
    public String toString() {
        return "Hello, I am the droid: " + name;
    }
    //Perform task method for Droid
    public String performTask(String task) {
        return name + " is performing task: " + task;
    }
}
