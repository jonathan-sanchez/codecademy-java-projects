import java.util.Scanner;

public class TheMenace {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, My Name is Onyx!");
        System.out.println("Wanna play?");

    }

    public static boolean Onyx(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Onyx know's a few commands, try giving him one to see his reaction!");
        System.out.println("Here are a few commands: 1: sit 2: stay 3: treat 4: up 5: lay down");
        String userInput = sc.nextLine();
    
        if (userInput == "sit") {
            System.out.println("Onyx stares with curiosity, waiting for his next comand.");
        } else if (userInput == "treat") {
            System.out.println("Bark! Bark! Onyx Really wants that treat!");
        } else if (userInput == "") {
            System.out.println("Bark!!");
        } else if (userInput == "no"){
            System.out.println("Onyx eyes open wide as he lowers his ears.");
        } else {
            System.out.println()
        }
    }
}
