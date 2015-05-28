import javax.swing.*;
import java.awt.*;

/**
 Created by Brian on 5/27/2015.
 */
public class BreakoutFrame extends JFrame {

    public BreakoutFrame(String title) {
        super(title);
        setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.DARK_GRAY);
        setVisible(true);
        setResizable(false);

    }

}
