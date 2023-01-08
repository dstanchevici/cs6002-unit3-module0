// Unit 3, Module 0

public class SimpleStructureExample {

    public static void main (String[] argv) 
    {
        SimpleStructure.add (1);
        SimpleStructure.add (4);
        SimpleStructure.add (9);
        SimpleStructure.add (16);
        SimpleStructure.add (25);

        int v = IOTool.readIntFromTerminal ("Enter an integer: ");
        if ( SimpleStructure.contains(v) ) {
            System.out.println ("Yes, it's in the list");
        }
        else {
            System.out.println ("Sorry, not in the list");
        }

        SimpleStructure.print ();
    }

}
