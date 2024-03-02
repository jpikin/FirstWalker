package program;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class WalkingWindow extends JFrame {

    JButton testButton = new JButton("TEST");
    private static final int WINDOW_HEIGHT = 850;
    private static final int WINDOW_WIDTH = 1440;

    Container bottomContainer;
    //Image img = Toolkit.getDefaultToolkit().getImage("./src/main/java/sprites/grassBkg.png");

    WalkingWindow() throws IOException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Walking");
        setResizable(false);
        setLocationRelativeTo(null);

        setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./src/main/java/sprites/grassBkg.png")))));
        setVisible(true);

        bottomContainer = new JPanel(new GridBagLayout()) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(1440, 200);
            }
        };

        bottomContainer.add(testButton);
        add(bottomContainer, BorderLayout.SOUTH);


    }

}
