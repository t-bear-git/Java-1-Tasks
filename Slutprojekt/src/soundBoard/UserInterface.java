package soundBoard;

import javax.swing.*;
import java.awt.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    public UserInterface() {
    }

    @Override
    public void run() {
        // Creating frame and defining its properties
        frame = new JFrame("Soundboard");

        frame.setPreferredSize(new Dimension(400, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        createComponents(frame.getContentPane());

    }
    // Method for interface component creation.
    private void createComponents(Container container) {
        // Creating array of JButtons and array of Strings to assign to JButtons.
        JButton[] buttons = new JButton[4];
        String[] btnArr = {"button1", "button2", "button3", "button4"};
        // Creating object for actionlistener in ButtonClickListener Class.
        ButtonClickListener listener = new ButtonClickListener();
        // Creating JPanel for layout purposes, setting its layout and border.
        JPanel btnPanel = new JPanel(new GridLayout(1, 0, 10, 6));
        btnPanel.setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));
        // Creating layout to use on container.
        FlowLayout layout = new FlowLayout();
        layout.setAlignment(FlowLayout.CENTER);
        // Loop to assign each JButton to item in btnArr, register listeners, and adding buttons to JPanel.
        for (int i = 0; i < btnArr.length; i++) {
            buttons[i] = new JButton(btnArr[i]);
            buttons[i].addActionListener(listener);
            btnPanel.add(buttons[i]);
        }
        // Setting layout for container and adding btnPanel to it.
        container.setLayout(layout);
        container.add(btnPanel);
    }

    public JFrame getFrame() {
        return frame;
    }
}
