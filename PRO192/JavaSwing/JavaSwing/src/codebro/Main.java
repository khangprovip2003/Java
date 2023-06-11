
package codebro;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        // JFrame = a Gui window to add componets to 
        
        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("JFrame title goes here"); // sets title of frame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
//      frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// exit our of aplication but can't exit
        frame.setResizable(false); //prevent frame from being resize
        frame. setSize(420,420);     // sets the x-dimension,and y-dimension of frame
        frame.setVisible(true);      // make frame visible 
        
        ImageIcon image = new ImageIcon ("khang.png.png"); // create an ImageIcon
        frame.setIconImage(image.getImage()); // change icon of frame
//      frame.getContentPane().setBackground(Color.red); // change color of background
        frame.getContentPane().setBackground(new Color(123,50,250)); //change color of background
                                            //  new Color(0x123456));//change color of background
    }
    
    //    MyFrame myFrame = new MyFrame();
        
}
