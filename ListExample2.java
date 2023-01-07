// Unit 3, Module 0

import java.util.*;
import java.awt.*;
import java.awt.image.*;

public class ListExample2 {

    public static void main (String[] argv) 
    {
        LinkedList<Image> imageList = new LinkedList<Image> ();
        
        ImageTool imTool = new ImageTool ();
        Image image1 = imTool.readImageFile ("alum1.jpg");
        imageList.add (image1);
        Image image2 = imTool.readImageFile ("alum2.jpg");
        imageList.add (image2);
        Image image3 = imTool.readImageFile ("alum3.jpg");
        imageList.add (image3);
        
        viewImages (imageList);
                
    }

    static void viewImages (java.util.List<Image> imageList)
    {
        ImageTool imTool = new ImageTool ();
        for (Image image: imageList) {
            imTool.showImage (image);
        }
    }

}
