//import the ArrayList package here
import java.util.ArrayList;

public class ToDoList {

    //Main method
    public static void main(String[] args){

        //Create toDoList below:
        ArrayList<String> toDoList = new ArrayList<String>(); //new ArrayList called toDoList
        //Create toDos
        String toDo1 = "Water the plants";
        String toDo2 = "Take out the trash";
        String toDo3 = "Feed the dogs";
        //use .add() to add toDo1 - 3 to toDoList
        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);
        System.out.println(toDoList);
    }
}
