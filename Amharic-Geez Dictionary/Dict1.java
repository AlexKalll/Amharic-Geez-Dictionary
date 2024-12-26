//package EAO_Dictionary;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class Dict extends JFrame implements ActionListener {
  JMenuBar mb;
  JMenu menu;
  JMenuItem englishToAfanOromoItem, afanOromoToEnglishItem, aboutAppItem, exitAppItem, viewFavoritesItem;

  JTextField inputText;
  JTextArea resultArea;
  JButton translateButton, clearButton, addToFavoritesButton, copyButton;
  //JLabel resultLabel;
  private final GridBagLayout layout;
  private final GridBagConstraints constraints;
  private boolean isEnglishToAfanOromo;
  private DictionaryManager dictionaryManager;

  public Dict() {
    isEnglishToAfanOromo = true;
    dictionaryManager = new DictionaryManager();
    mb = new JMenuBar();
    setJMenuBar(mb);
    menu = new JMenu("App Menu");
    englishToAfanOromoItem = new JMenuItem("English to AfaanOromoo");
    afanOromoToEnglishItem = new JMenuItem("AfaanOromoo to English");
    aboutAppItem = new JMenuItem("About App");
    exitAppItem = new JMenuItem("Exit App");
    viewFavoritesItem = new JMenuItem("View Favorites");
    mb.add(menu);
    menu.add(englishToAfanOromoItem);
    menu.add(afanOromoToEnglishItem);
    menu.add(viewFavoritesItem);
    menu.add(aboutAppItem);
    menu.add(exitAppItem); 
    englishToAfanOromoItem.addActionListener(this);
    afanOromoToEnglishItem.addActionListener(this);
    aboutAppItem.addActionListener(this);
    exitAppItem.addActionListener(this);
    viewFavoritesItem.addActionListener(this);

    layout = new GridBagLayout();
    setLayout(layout);
    constraints = new GridBagConstraints();

    //resultLabel = new JLabel("Result:");
    inputText = new JTextField("Enter a word", 20);
    resultArea = new JTextArea(5, 25);
    resultArea.setEditable(false);
    resultArea.setLineWrap(true);
    resultArea.setWrapStyleWord(true);
    JScrollPane scrollPane = new JScrollPane(resultArea);
    translateButton = new JButton("Find");
    translateButton.addActionListener(this);
    clearButton = new JButton("Clear");
    clearButton.addActionListener(this);
    addToFavoritesButton = new JButton("Add to Favorite");
    addToFavoritesButton.addActionListener(this);
    copyButton = new JButton("Copy");
    copyButton.addActionListener(this);

    constraints.weighty = 1;
    addComponent(inputText, 0, 0, 1, 1);
    addComponent(translateButton, 0, 1, 1, 1);
    addComponent(clearButton, 0, 2, 1, 1);
    //addComponent(resultLabel, 1, 0, 1, 1);
    addComponent(scrollPane, 1, 0, 3, 1);
    addComponent(addToFavoritesButton, 2, 0, 1, 1);
    addComponent(copyButton, 2, 1, 1, 1);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("English<>AfaanOromoo Dictionary App");
    setSize(450, 300);
    setBackground(Color.GRAY);
  }

  private void addComponent(Component component, int row, int column, int width, int height) {
    constraints.gridx = column;
    constraints.gridy = row;
    constraints.gridwidth = width;
    constraints.gridheight = height;
    layout.setConstraints(component, constraints);
    add(component);
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == clearButton) {
      inputText.setText("");
      resultArea.setText("");
    } else if (ae.getSource() == englishToAfanOromoItem) {
      isEnglishToAfanOromo = true;
    } else if (ae.getSource() == afanOromoToEnglishItem) {
      isEnglishToAfanOromo = false;
    } else if (ae.getSource() == aboutAppItem) {
      showContactInfo();
    } else if (ae.getSource() == exitAppItem) {
      System.exit(0);
    } else if (ae.getSource() == viewFavoritesItem) {
      viewFavorites();
    } else if (ae.getSource() == translateButton) {
      String inputString = inputText.getText();
      if (isEnglishToAfanOromo) {
        translateEnglishToAfanOromo(inputString);
      } else {
        translateAfanOromoToEnglish(inputString);
      }
    } else if (ae.getSource() == addToFavoritesButton) {
      addToFavorites();
    } else if (ae.getSource() == copyButton) {
      copyToClipboard();
    }
  }

  private void showContactInfo() {
    JOptionPane.showMessageDialog(this, "Email: kal@gmail.com\nPhone: 097986786", "Contact Info", JOptionPane.INFORMATION_MESSAGE);
  }

  private void addToFavorites() {
    String currentText = inputText.getText();
    if (!currentText.isEmpty()) {
      dictionaryManager.addToFavorites(currentText);
      JOptionPane.showMessageDialog(this, "Added to Favorites: " + currentText, "Favorites", JOptionPane.INFORMATION_MESSAGE);
    }
  }

  private void viewFavorites() {
    String favoriteWords = dictionaryManager.viewFavorites();
    if (favoriteWords.isEmpty()) {
      JOptionPane.showMessageDialog(this, "No favorite words selected.", "Favorites", JOptionPane.INFORMATION_MESSAGE);
    } else {
      JOptionPane.showMessageDialog(this, favoriteWords, "Favorites", JOptionPane.INFORMATION_MESSAGE);
    }
  }

  private void translateEnglishToAfanOromo(String input) {
    String translation = dictionaryManager.translateEnglishToAfanOromo(input);
    resultArea.setText(translation);
  }

  private void translateAfanOromoToEnglish(String input) {
    String translation = dictionaryManager.translateAfanOromoToEnglish(input);
    resultArea.setText(translation);
  }

  private void copyToClipboard() {
    String wordToCopy = inputText.getText();
    if (!wordToCopy.isEmpty()) {
      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      StringSelection selection = new StringSelection(wordToCopy);
      clipboard.setContents(selection, null);
      JOptionPane.showMessageDialog(this, "'" + wordToCopy + "' is copied to clipboard.", "Clipboard", JOptionPane.INFORMATION_MESSAGE);
    }
  }

  public static void main(String[] args) {
    Dict dictionary = new Dict();
    dictionary.setVisible(true);
  }
}
