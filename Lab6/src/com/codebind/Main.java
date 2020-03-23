package com.codebind;

public class Main {
    public static void main(String args[]){
        MainFrame mf = new MainFrame();
        DrawingPanel canvas = new DrawingPanel(mf);
        mf.setVisible(true);

    }
}
