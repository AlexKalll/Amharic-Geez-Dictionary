
// package aau;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calc extends JFrame implements ActionListener, ItemListener {
  JMenuBar mb;
  JMenu menu;
  JMenuItem wButton, woutButton;

  JTextField n1, n2, r;
  JButton result, clear;
  JLabel lbln1, lbln2, lblresult;
  JPanel p1, p2, p3;
  JComboBox<String> cb;
  private final GridBagLayout layout; // layout
  private final GridBagConstraints constraints;
  private boolean withButton;

  public Calc() {
    withButton = true;
    mb = new JMenuBar();
    setJMenuBar(mb);
    menu = new JMenu("File");
    wButton = new JMenuItem("with button");
    woutButton = new JMenuItem("without button");
    mb.add(menu);
    menu.add(woutButton);
    menu.add(wButton);
    wButton.addActionListener(this);
    woutButton.addActionListener(this);
    String[] op = { "add", "sub", "div", "mul" };
    layout = new GridBagLayout();
    setLayout(layout); // set frame layout
    constraints = new GridBagConstraints();
    lbln1 = new JLabel("Num1:");
    lbln2 = new JLabel("Num2:");
    lblresult = new JLabel("Result");
    n1 = new JTextField("", 15);
    n2 = new JTextField("", 15);
    r = new JTextField("", 15);
    r.enableInputMethods(false);
    result = new JButton("Result");
    result.addActionListener(this);
    clear = new JButton("Clear");
    clear.addActionListener(this);
    cb = new JComboBox<String>(op);
    cb.addItemListener(this);
    constraints.weighty = 1; // can grow taller
    addComponent(lbln1, 0, 1, 1, 1);
    addComponent(n1, 0, 2, 1, 1);
    constraints.weighty = 1; // can grow taller
    addComponent(lbln2, 1, 1, 1, 1);
    addComponent(n2, 1, 2, 1, 1);

    // constraints.weightx = 1000; // can grow wider
    constraints.weighty = 1; // can grow taller
    addComponent(lblresult, 2, 1, 1, 1);
    addComponent(r, 2, 2, 1, 1);
    // constraints.weightx = 1000; // can grow wider

    constraints.weighty = 1; // can grow taller
    addComponent(cb, 3, 1, 1, 1);
    addComponent(result, 3, 2, 1, 1);
    addComponent(clear, 3, 3, 1, 1);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Calculator");
    setSize(300, 300);
    setBackground(Color.GRAY);
  }

  private void addComponent(Component component,
      int row, int column, int width, int height) {
    constraints.gridx = column;
    constraints.gridy = row;
    constraints.gridwidth = width;
    constraints.gridheight = height;
    layout.setConstraints(component, constraints); // set constraints
    add(component); // add component
  }

  public void actionPerformed(ActionEvent ae) {
    if ((ae.getSource() == clear)) {
      n1.setText("");
      n2.setText("");
      r.setText("");
    }
    if (ae.getSource() == wButton) {
      withButton = true;
      result.setVisible(true);
    } else if (ae.getSource() == woutButton) {
      withButton = false;
      result.setVisible(false);
    }
    if (withButton == true) {
      if ((ae.getSource() == result) && (cb.getSelectedItem() == "add")) {
        double x, y, re;
        x = Double.parseDouble(n1.getText());
        y = Double.parseDouble(n2.getText());
        re = x + y;
        r.setText(Double.toString(re));

      }
      if ((ae.getSource() == result) && (cb.getSelectedItem() == "sub")) {
        double x, y, re;
        x = Double.parseDouble(n1.getText());
        y = Double.parseDouble(n2.getText());
        re = x - y;
        r.setText(Double.toString(re));

      }
      if ((ae.getSource() == result) && (cb.getSelectedItem() == "mul")) {
        double x, y, re;
        x = Double.parseDouble(n1.getText());
        y = Double.parseDouble(n2.getText());
        re = x * y;
        r.setText(Double.toString(re));

      }
      if ((ae.getSource() == result) && (cb.getSelectedItem() == "div")) {
        double x, y, re;
        x = Double.parseDouble(n1.getText());
        y = Double.parseDouble(n2.getText());
        re = x / y;
        r.setText(Double.toString(re));

      }
    }
  }

  public void itemStateChanged(ItemEvent e) {
    if (withButton == false) {

      String selectedOperation = (String) cb.getSelectedItem();
      double x, y, re;
      x = Double.parseDouble(n1.getText());
      y = Double.parseDouble(n2.getText());
      re = 0;

      switch (selectedOperation) {
        case "add":
          re = x + y;
          break;
        case "sub":
          re = x - y;
          break;
        case "mul":
          re = x * y;
          break;
        case "div":
          re = x / y;
          break;
      }
      if (re == 0) {
        r.setText("");
      }

      r.setText(Double.toString(re));
    }
  }

  public static void main(String[] args) {
    Calc trial = new Calc();

    trial.setVisible(true);

  }

}
