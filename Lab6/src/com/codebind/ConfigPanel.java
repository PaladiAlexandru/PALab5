package com.codebind;

import javax.swing.*;
import java.awt.*;

public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel label; // we’re drawing regular polygons
    int sidesField; // number of sides


    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }
    private void init() {
        JLabel sidesLabel = new JLabel();
        JTextField textsides = new JTextField(20);


        JPanel sidesPanel = new JPanel();
        sidesPanel.add(sidesLabel);
        sidesPanel.add(textsides);
        sidesLabel.setText("Number of sides:");
        textsides.addActionListener(e ->
                sidesField = Integer.parseInt(textsides.getText())
                );

        frame.add(sidesPanel, BorderLayout.NORTH); //JPanel uses FlowLayout by default


    }

}
