import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnglishToAmharicDictionary extends JFrame {

    private JTextField searchField;
    private JButton searchButton;
    private JTextArea resultArea;
    private JPanel p1, p2, p3, p4;
    private DictionaryMap dictionary;

    JMenuBar mb;
    JMenu menu;
    JMenuItem EnglishToAfanOromo, AfanOromoToEnglish;

    public EnglishToAmharicDictionary() {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        setTitle("English-To-Amharic Dictionary");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize the dictionary
        dictionary = new DictionaryMap();
        p1 = new JPanel();
        p1.setLayout(new BorderLayout());

        searchField = new JTextField(20);
        searchButton = new JButton("Search");
        resultArea = new JTextArea(15, 40);

        p1.add(searchField, BorderLayout.NORTH);
        p1.add(searchButton, BorderLayout.CENTER);
        p1.add(resultArea, BorderLayout.SOUTH);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchWord = searchField.getText();
                String result = searchDictionary(searchWord);
                resultArea.setText(result);
            }
        });

        add(p1);
        setVisible(true);
    }

    private String searchDictionary(String word) {
        String amharicTranslation = dictionary.getAmharicTranslation(word);
        if (amharicTranslation != null) {
            return "English: " + word + "\nAmharic: " + amharicTranslation;
        } else {
            return "Sorry, the word '" + word + "' is not found in the dictionary.";
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EnglishToAmharicDictionary();
            }
        });
    }
}
