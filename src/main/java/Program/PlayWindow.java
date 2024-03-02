package program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayWindow extends JPanel {
    Container container = new JPanel();
    JPanel bottomPanel;
    JPanel upPanel;
    JPanel gameFieldPanel;
    JButton btnExit = new JButton("Exit");
    Image img = Toolkit.getDefaultToolkit().getImage("./src/main/java/sprites/grassBkg.png");

    PlayWindow(){
        upPanel = new JPanel(new GridBagLayout()) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(1440, 30);
            }
        };
        gameFieldPanel = new JPanel(new GridBagLayout()) {
            @Override
            public Dimension getPreferredSize() {
                    return new Dimension(1440, 730);
                }
        };
        bottomPanel = new JPanel(new GridBagLayout()) {
            @Override
            public Dimension getPreferredSize() {
                    return new Dimension(1440, 140);
                }
        };
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.play.container.setVisible(true);
                setVisible(false);
            }
        });
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        upPanel.add(btnExit);
        container.add(upPanel);

        gameFieldPanel.setBackground(Color.BLACK);
        container.add(gameFieldPanel, BorderLayout.CENTER);
        bottomPanel.setBackground(Color.BLUE);
        container.add(bottomPanel, BorderLayout.SOUTH);
        add(container);



        setVisible(true);
    }
}
