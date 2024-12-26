package layout;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class SimpleDictionary extends JFrame {
    private JTextField wordField;
    private JTextField meaningField;
    private JTextField searchField;
    private JTextArea resultArea;
    private HashMap<String, String> dictionary;

    public SimpleDictionary() {
        dictionary = new HashMap<>();

        setTitle("Simple Dictionary");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        inputPanel.add(new JLabel("Word:"));
        wordField = new JTextField();
        inputPanel.add(wordField);

        inputPanel.add(new JLabel("Meaning:"));
        meaningField = new JTextField();
        inputPanel.add(meaningField);

        JButton addButton = new JButton("Add Word");
        inputPanel.add(addButton);

        add(inputPanel, BorderLayout.NORTH);

        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new BorderLayout());

        searchPanel.add(new JLabel("Search Word:"), BorderLayout.WEST);
        searchField = new JTextField();
        searchPanel.add(searchField, BorderLayout.CENTER);

        JButton searchButton = new JButton("Search");
        searchPanel.add(searchButton, BorderLayout.EAST);

        add(searchPanel, BorderLayout.CENTER);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea), BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word = wordField.getText().trim();
                String meaning = meaningField.getText().trim();
                if (!word.isEmpty() && !meaning.isEmpty()) {
                    dictionary.put(word, meaning);
                    wordField.setText("");
                    meaningField.setText("");
                    JOptionPane.showMessageDialog(SimpleDictionary.this, "Word added successfully!");
                } else {
                    JOptionPane.showMessageDialog(SimpleDictionary.this, "Please enter both word and meaning.");
                }
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchWord = searchField.getText().trim();
                if (!searchWord.isEmpty()) {
                    String meaning = dictionary.get(searchWord);
                    if (meaning != null) {
                        resultArea.setText(searchWord + ": " + meaning);
                    } else {
                        resultArea.setText("Word not found.");
                    }
                } else {
                    JOptionPane.showMessageDialog(SimpleDictionary.this, "Please enter a word to search.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleDictionary().setVisible(true);
            }
        });
    }
}