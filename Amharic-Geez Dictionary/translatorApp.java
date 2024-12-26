    
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    
    public class translatorApp extends JFrame implements ActionListener {
    
    public static final int width = 500;
    public static final int height = 300;
    public static final int no_of_lines = 10;
    public static final int chars_per_line = 20;
    
    private JTextArea lan1;
    private JTextArea lan2;
    
    public static void main(String[] args){
    
    translatorApp gui = new translatorApp();
    gui.setVisible(true);
    
    }
    
    public translatorApp(){
    
    super("language translator");
    setSize(width, height);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(2,1));
    
    
    
    JPanel biggerPanel = new JPanel();
    biggerPanel.setLayout(new FlowLayout());
    biggerPanel.setBackground(Color.LIGHT_GRAY);
    
    
    
    
    lan1 = new JTextArea("enter source text here \n",no_of_lines,chars_per_line);
    lan1.setFont(Vi);;
    lan1.setEditable(true);
    lan1.setLineWrap(true);
    biggerPanel.add(lan1);
    
    
    
    
    lan2 = new JTextArea(no_of_lines,chars_per_line);
    lan2.setEditable(true);
    lan2.setLineWrap(true);
    biggerPanel.add(lan2);
    
    
    add(biggerPanel);
    
    
    
    JPanel buttonsPanel = new JPanel();
    buttonsPanel.setLayout(new FlowLayout());
    buttonsPanel.setBackground(Color.LIGHT_GRAY);
    
    
    JButton translate = new JButton("translate!");
    translate.addActionListener(this);
    buttonsPanel.add(translate);
    
    
    JButton clear = new JButton("Clear");
    clear.addActionListener(this);
    buttonsPanel.add(clear);
    
    add(buttonsPanel);
    }
    
    public void actionPerformed(ActionEvent e){
    
    String buttonText = e.getActionCommand();
    
    if(buttonText.equals("translate!"))
    lan2.setText(lan2.getText());
    else if(buttonText.equals("Clear"))
    {
    lan1.setText("");
    lan2.setText("");
    }
    else
    lan2.setText("error occured");
    }
    }