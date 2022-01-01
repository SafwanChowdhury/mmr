package com.mmr;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton button1;
    private JPanel panelMain;
    private JTextField t1Box;
    private JTextField t2Box;
    private JTextField t3Box;
    private JCheckBox undercutCheckBox;
    private JComboBox lapsCombo;
    private JTextField driverT;
    private JComboBox comboBox1;
    public static String compound;
    public static int laps1;
    public static int It1;
    public static int It2;
    public static int It3;
    public static boolean Undercut;
    public App() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                It1 = Integer.parseInt(t1Box.getText());
                It2 = Integer.parseInt(t2Box.getText());
                It3 = Integer.parseInt(t3Box.getText());
                laps1 = lapsCombo.getSelectedIndex();
                compound = (String) comboBox1.getSelectedItem();
                Undercut = undercutCheckBox.isSelected();
                String stringObject = driverT.getText() + " - " + compound;
                JOptionPane.showMessageDialog(null, stringObject);
            }
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
