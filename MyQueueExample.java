// Unit 3, Module 0

import java.util.*;

public class MyQueueExample {

    public static void main (String[] argv)
    {
        LinkedList<String> queue = new LinkedList<String> ();

        queue.add ("Alice");
        queue.add ("Bob");
        queue.add ("Chen");
        queue.add ("Dagmar");
        queue.add ("Eva");
        queue.add ("Eva");
        queue.add ("Dmitri");

        System.out.println ("Queue contents: " + queue);

        LinkedList<String> secondQueue = new LinkedList<String> ();

        while (! queue.isEmpty() ) {
            String name = queue.remove ();
            System.out.println ("Next comes " + name);
            System.out.println ("Queue contents: " + queue);
            
            secondQueue.add (name);
            System.out.println ("Second queue contents: " + secondQueue);
        }
    }

}
