package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Gui {
    private final String title = "Boarding Ticket";
    private final String genders[] = {"Male", "Female", "Other"};
    private final int width = 1000;
    private final int height = 600;
    private final JFrame frame;
    private final JPanel panel;
    private final JPanel panelCenter;
    private JLabel label;
    private JTextField name = new JTextField(20);
    private JTextField email = new JTextField(20);
    private JTextField phoneNumber = new JTextField(20);
    private JComboBox gender = new JComboBox(genders);
    private JTextField age = new JTextField(20);
    private JTextField date = new JTextField(20);
    private JTextField destination = new JTextField(20);
    private JTextField departureTime = new JTextField(20);
    private JButton submit = new JButton("Submit");
    public Gui()
    {
        frame = new JFrame(title);
        panel = new JPanel();
        panelCenter = new JPanel();
        frame.setSize(width, height);
        frame.setResizable(false);

        frame.setDefaultCloseOperation((JFrame.DISPOSE_ON_CLOSE));
        label = new JLabel("Name:");
        panel.add(label);
        panel.add(name);
        label = new JLabel("Email:");
        panel.add(label);
        panel.add(email);
        label = new JLabel("Phone #:");
        panel.add(label);
        panel.add(phoneNumber);
        label = new JLabel("Gender:");
        panelCenter.add(label);
        panelCenter.add(gender);
        label = new JLabel("Age:");
        panelCenter.add(label);
        panelCenter.add(age);
        label = new JLabel("Date:");
        panelCenter.add(label);
        panelCenter.add(date);
        label = new JLabel("Destination:");
        panelCenter.add(label);
        panelCenter.add(destination);
        label = new JLabel("Depart.Time");
        panelCenter.add(label);
        panelCenter.add(departureTime);
        //panel.add(submit);
        panel.setBackground(Color.CYAN);
        panelCenter.setBackground(Color.CYAN);

        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                returnFields();
            }
        });
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, submit);
        frame.getContentPane().add(BorderLayout.CENTER, panelCenter);

        //frame.setLayout(new FlowLayout());
        //frame.pack();
        frame.setVisible(true);
    }

    public Object returnFields()
    {
        ArrayList output = new ArrayList();
        output.add(name.getText());
        output.add(email.getText());
        output.add(phoneNumber.getText());
        output.add(gender.getSelectedItem());
        output.add(age.getText());
        output.add(date.getText());
        output.add(destination.getText());
        output.add(departureTime.getText());
        for(int i = 0; i < output.size(); i++)
        {
            System.out.println(output.get(i));
        }
        return output;
    }

}