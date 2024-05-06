
import javax.swing.JButton;
        import javax.swing.JFrame;

public class DEmo {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Button Example");

        // Create a new JButton with text "Click Me"
        JButton button = new JButton("Click Me");

        // Add the button to the JFrame
        frame.add(button);

        // Set JFrame size
        frame.setSize(300, 200);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
