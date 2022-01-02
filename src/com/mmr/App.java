package com.mmr;

import javax.swing.*;
import java.util.Arrays;

public class App {
    private JButton button1;
    private JPanel panelMain;
    private JTextField t1Box;
    private JTextField t2Box;
    private JTextField t3Box;
    private JTextField lapsText;
    private JTextField driverT;
    private JComboBox comboBox1;
    public static String compound;
    public static int laps1;
    public static int It1;
    public static int It2;
    public static int It3;
    public App() {
        button1.addActionListener(e -> {
            It1 = Integer.parseInt(t1Box.getText());
            It2 = Integer.parseInt(t2Box.getText());
            It3 = Integer.parseInt(t3Box.getText());
            laps1 = Integer.parseInt(lapsText.getText());
            compound = (String) comboBox1.getSelectedItem();
            int[] arr = new int[3];
            int laps;
            arr[0] = It1;
            arr[1] = It2;
            arr[2] = It3;
            String output;
            laps = laps1;
            output = Arrays.toString(mmr.mmrnew(arr,laps));
            String stringObject = driverT.getText() + " - " + compound + ": " + output;
            JOptionPane.showMessageDialog(null, stringObject);
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
