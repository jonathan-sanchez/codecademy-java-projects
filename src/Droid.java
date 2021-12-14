//Class Droid
public class Droid {
    //Instance field
    int batteryLevel;
    String name;

    //Constructor method for Droid
    public Droid(String droidName) { //This method has one parameter "String droidName"
        name = droidName;
        //Every new instance of Droid will have a battery level of 100
        batteryLevel = 100 - 10; //Reassigned the instance field to be the current value minus ten
    }
    //toString method within Droid
    public String toString() {
        return "Hello, I am the droid: " + name;
    }
    //Perform task method for Droid
    public void performTask(String task) {
        batteryLevel = batteryLevel - 10;
        System.out.println(name + " is performing task: " + task);
    }
    //Method for printing battery life for droid instances
    public void energyReport() {
        System.out.println("Current battery level: " + batteryLevel + "%");
    }

    //Main method
    public static void main(String[] args) {

        //New instance of Droid named "Codey"
        Droid codey = new Droid("Codey");
        //Print the variable for myDroid
        System.out.println(codey); //When printing it returns an object instead of the droid name. Must define a toString method for object
        codey.performTask("dancing");
        codey.performTask("coding");
        codey.energyReport();
    }

}
