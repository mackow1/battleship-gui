package org.battleship.gui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.*;

public class StartWindow extends JFrame {
    private static final Logger logger = LogManager.getLogger(StartWindow.class);

    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 400;
    private Settings settings;

    public StartWindow(Settings settings) {
        this.settings = settings;

        logger.info("Displaying Start Window");

        // Window settings
        setTitle("Welcome to Battleship GUI App (v" + settings.getProgramVersion() + ")");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        setMinimumSize(getPreferredSize());
        setMaximumSize(getPreferredSize());
        setResizable(false);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);

        // Add some content
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JButton button = new JButton("Close Application!");
        button.addActionListener(e -> {
            dispose();
        });
        panel.add(button, BorderLayout.CENTER);
        add(panel, BorderLayout.CENTER);

        // display it
        pack();
        setVisible(true);
    }
}

