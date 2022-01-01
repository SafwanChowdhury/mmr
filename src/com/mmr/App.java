package com.mmr;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

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
                int[] arr = new int[3];
                int laps;
                String sh = compound;
                arr[0] = It1;
                arr[1] = It2;
                arr[2] = It3;
                String output = new String();
                if (sh.equals("Soft")) {
                    if (Undercut) {
                        output = Arrays.toString(mmr.mmr(arr));
                    } else {
                        output = Arrays.toString(mmr.mmru(arr));
                    }
                } else if (sh.equals("Hard")) {
                    laps = laps1;
                    if (laps == 0) {
                        output = Arrays.toString(mmr.mmrh8(arr));
                    } else if (laps == 1) {
                        output = Arrays.toString(mmr.mmrh10(arr));
                    } else if (laps == 2) {
                        output = Arrays.toString(mmr.mmrh12(arr));
                    }
                }
                String stringObject = driverT.getText() + " - " + compound + ": " + output;
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
