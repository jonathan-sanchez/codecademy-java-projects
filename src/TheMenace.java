import java.util.Scanner;

public class TheMenace {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, My Name is Onyx!");
        System.out.println("Wanna play?");

    }

    public static boolean Onyx(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Onyx know's a few commands, try giving him one to see his reaction!");
        String userInput = sc.nextLine();
    
        if (userInput.endsWith("?")) {
            System.out.println("Onyx stares with curiosity, waiting for his next comand.");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput == "") {
            System.out.println("Fine, be that way!");
        } else {
            System.out.println("Eh, whatever man.");
        }
    }
}
