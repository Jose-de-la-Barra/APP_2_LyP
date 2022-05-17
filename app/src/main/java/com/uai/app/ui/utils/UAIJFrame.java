package com.uai.app.ui.utils;

import com.uai.app.exceptions.NotMainPanelLoadedException;

import javax.swing.*;

public class UAIJFrame extends JFrame {

    private JPanel mainPanel;

    public UAIJFrame(String title) {
        super(title);
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        this.setContentPane(mainPanel);
    }

    public void showUI() throws NotMainPanelLoadedException {
        if (AppUtils.isNull(mainPanel)){
            throw new NotMainPanelLoadedException();
        }
        this.setSize(800,800);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
