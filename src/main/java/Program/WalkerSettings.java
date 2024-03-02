package program;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WalkerSettings extends JFrame {
    private static final int WINDOW_HEIGHT = 450;
    private static final int WINDOW_WIDTH = 720;
    JButton tempButton = new JButton("Settings в разработке, Нажмите для выхода");

    WalkerSettings(){
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Settings");
        setVisible(false);

        add(tempButton);
        tempButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
}
