package program;

import javax.swing.*;

public class WalkingWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 900;
    private static final int WINDOW_WIDTH = 1440;

    WalkingWindow(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Walking");

    }
}
