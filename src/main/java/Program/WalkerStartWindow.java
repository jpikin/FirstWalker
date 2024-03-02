package Program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WalkerStartWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 900;
    private static final int WINDOW_WIDTH = 1440;
//    private static final int WINDOW_POSX = 800;
//    private static final int WINDOW_POSY = 300;
    JButton btnStart = new JButton("Start walking");
    JButton btnSettings = new JButton("Settings");
    JButton btnExit = new JButton("Exit");
    Container container;
    WalkingWindow walkingWindow;
    WalkerSettings settings;

    WalkerStartWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Walker");
        setVisible(true);

        JPanel btnPanel = new JPanel(new GridLayout(3, 1));
        btnPanel.add(btnStart);
        btnPanel.add(btnSettings);
        btnPanel.add(btnExit);
        container = new JPanel(new GridBagLayout()) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(200, 600);
            }
        };
        container.add(btnPanel);
        add(container);

        walkingWindow = new WalkingWindow();
        settings = new WalkerSettings();

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                walkingWindow.setVisible(true);
            }
        });
        btnSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
