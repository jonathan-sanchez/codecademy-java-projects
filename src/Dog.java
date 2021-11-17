public class Dog {
    String breed;
    boolean hasOwner;
    int age;
    
    public Dog(String dogBreed, boolean dogOwned, int dogYears) {
      System.out.println("Constructor invoked!");
      breed = dogBreed;
      hasOwner = dogOwned;
      age = dogYears;
    }
    
    public static void main(String[] args) {
      System.out.println("Main method started");
      Dog Onyx = new Dog("lab", false, 5);
      Dog Ludo = new Dog("lab mix", true, 1);
      boolean isOnyxOlder = Onyx.age > Ludo.age;
      int totalDogYears = Onyx.age + Ludo.age;
      System.out.println("Two dogs created: a " + Onyx.breed + " and a " + Ludo.breed);
      System.out.println("The statement that Onyx is an older dog is: " + isOnyxOlder);
      System.out.println("The total age of the dogs is: " + totalDogYears);
      System.out.println("Main method finished");
    }
}
