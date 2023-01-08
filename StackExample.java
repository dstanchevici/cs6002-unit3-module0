// Unit 3, Module 0

import java.util.*;

public class StackExample {

    public static void main (String[] argv)
    {
        Stack<String> toDoList = new Stack<String> ();
        
        toDoList.push ("Pay bills");
        toDoList.push ("Clean room");
        toDoList.push ("Do homework");
        toDoList.push ("See movie");
        toDoList.push ("Hang out");
        toDoList.push ("Feed cat");
        
        System.out.println ("Priorities: ");
        System.out.println ("Remaining chores: " + toDoList);
        while (! toDoList.isEmpty() ) {
            String nextPriority = toDoList.pop ();
            System.out.println ("Priority: " + nextPriority);
            System.out.println ("----------");
            System.out.println ("Remaining chores: " + toDoList);
            
        }
        
        
    }

}
