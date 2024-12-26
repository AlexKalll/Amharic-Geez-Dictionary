import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToggleJListVisibility {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Toggle JList Visibility Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JPanel panel = new JPanel();
        
        // Create the JList with some sample data
        String[] data = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JList<String> list = new JList<>(data);
        JScrollPane scrollPane = new JScrollPane(list);
        
        // Create a button to toggle the visibility of the JList
        JButton toggleButton = new JButton("Toggle JList Visibility");
        
        // Add an ActionListener to the button to toggle the JList visibility
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.setVisible(!list.isVisible());
                // Optionally, revalidate and repaint the panel to update the layout
                panel.revalidate();
                panel.repaint();
            }
        });
        
        panel.add(scrollPane);
        panel.add(toggleButton);
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
