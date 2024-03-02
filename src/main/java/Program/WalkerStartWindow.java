package program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class WalkerStartWindow extends JFrame {

    JButton btnStart = new JButton("Start walking");
    JButton btnSettings = new JButton("Settings");
    JButton btnExit = new JButton("Exit");
    JPanel container;
    WalkingWindow walkingWindow;
    WalkerSettings settings;


    WalkerStartWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
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

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add(new PlayWindow());
                container.setVisible(false);
            }
        });
        btnSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings = new WalkerSettings();

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
