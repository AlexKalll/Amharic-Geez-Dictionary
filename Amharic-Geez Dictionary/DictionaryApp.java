import javax.swing.*;
import java.awt.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class DictionaryApp extends JFrame {
    private JTextField inputField;
    private JTextArea outputArea;
    private Map<String, String[]> dictionary;

    public DictionaryApp() {
        setTitle("English-Geez-Amharic Dictionary");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Set the character encoding to support Amharic
        System.setProperty("file.encoding", "UTF-8");
        Charset.defaultCharset();

        // Create the dictionary
        dictionary = new HashMap<>();
        dictionary.put("hello", new String[]{"hello", "ሠላም", "ሰላም"});
        dictionary.put("book", new String[]{"book", "መጽሐፍ", "መጽሐፍ"});
        dictionary.put("water", new String[]{"water", "ማይ", "ውሃ"});
        dictionary.put("tree", new String[]{"tree", "ዛፍ", "ዛፍ"});
        dictionary.put("house", new String[]{"house", "ቤት", "ቤት"});

        // Create the GUI components
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel inputLabel = new JLabel("Enter a word:");  
        inputField = new JTextField(20);
        JButton translateButton = new JButton("Translate");
        translateButton.addActionListener(e -> translateWord());
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);
        inputPanel.add(translateButton);

        outputArea = new JTextArea(10, 40);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        add(mainPanel);
    }

    private void translateWord() {
        String word = inputField.getText().toLowerCase();
        if (dictionary.containsKey(word)) {
            String[] translations = dictionary.get(word);
            StringBuilder output = new StringBuilder();
            output.append("English: ").append(translations[0]).append("\n");
            output.append("Geez: ").append(translations[1]).append("\n");
            output.append("Amharic: ").append(translations[2]).append("\n");
            outputArea.setText(output.toString());
        } else {
            outputArea.setText("Word not found in the dictionary.");
        }
        inputField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DictionaryApp app = new DictionaryApp();
            app.setVisible(true);
        });
    }
}
