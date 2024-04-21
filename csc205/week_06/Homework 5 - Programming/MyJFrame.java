// Tyler J. Teichmann

// Import the JFrame
import javax.swing.JFrame;

/**
 * Public Class for MyJFrame that extends JFrame
 */
public class MyJFrame extends JFrame {
    // Non-Default Constructor for MyJFrame
    public MyJFrame(String title) {
        // Call the JFrame constructor. Pass in the title of the application.
        super(title);
        // Set the size to 900px by 900px
        setSize(900, 900);
        // Set Location on the screen.
        setLocation(200, 100);
        // Set the default operation on close to exit the program when window is closed.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
