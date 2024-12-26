//package EAO_Dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class DictionaryManager {
    private Map<String, DictionaryEntry> englishToAfanOromoDict;
    private Map<String, DictionaryEntry> afanOromoToEnglishDict;
    private Map<String, DictionaryEntry> favoriteWords;

    public DictionaryManager() {
        englishToAfanOromoDict = new HashMap<>();
        afanOromoToEnglishDict = new HashMap<>();
        favoriteWords = new HashMap<>();

        // Populate the dictionaries with sample data
        addWordToDict("hello", "Nammataa", "Greetings", "Nammataa wal-agarsiista", englishToAfanOromoDict, afanOromoToEnglishDict);
        addWordToDict("book", "Bitaannoo", "A written or printed work consisting of pages glued or sewn together along one side and bound in covers", "Bitaannoon mallattoo barreeffama tokko yoo ta'u, fuula dhiyeessaa fi kan dura wal-qaamee yoo ta'u, kan gadi-dhihaatu irratti qaamattee yoo jiraatu", englishToAfanOromoDict, afanOromoToEnglishDict);
        addWordToDict("water", "Bishaan", "A colorless, odorless, and tasteless liquid that is essential for life", "Bishaan sanyii kan jaallifamaa, furraa fi miidhaan hin qabne, kan uumama hatattamaa ta'e", englishToAfanOromoDict, afanOromoToEnglishDict);
        addWordToDict("sun", "Aduu", "The star at the center of the solar system, around which the planets orbit and from which they receive light and warmth", "Aduu qubee keenya kan adda-baafatu, kan si'a ol-muullata fi kan ifa fi ganna isaa keenya fudhatu", englishToAfanOromoDict, afanOromoToEnglishDict);
    }

    private void addWordToDict(String englishWord, String afanOromoWord, String englishDefinition, String afanOromoDefinition,
                              Map<String, DictionaryEntry> englishToAfanOromoDict, Map<String, DictionaryEntry> afanOromoToEnglishDict) {
        DictionaryEntry englishEntry = new DictionaryEntry(englishWord, afanOromoWord, englishDefinition, afanOromoDefinition);
        DictionaryEntry afanOromoEntry = new DictionaryEntry(englishWord,afanOromoWord, englishDefinition, afanOromoDefinition);
        englishToAfanOromoDict.put(englishWord, englishEntry);
        afanOromoToEnglishDict.put(afanOromoWord, afanOromoEntry);
    }

    public List<String> getMatchingWords(String prefix, boolean isEnglishToAfanOromo) {
        List<String> matchedWords = new ArrayList<>();
        if (isEnglishToAfanOromo) {
            for (Map.Entry<String, DictionaryEntry> entry : englishToAfanOromoDict.entrySet()) {
                if (entry.getKey().toLowerCase().startsWith(prefix.toLowerCase())) {
                    matchedWords.add(entry.getKey());
                }
            }
        } else {
            for (Map.Entry<String, DictionaryEntry> entry : afanOromoToEnglishDict.entrySet()) {
                if (entry.getKey().toLowerCase().startsWith(prefix.toLowerCase())) {
                    matchedWords.add(entry.getKey());
                }
            }
        }
        return matchedWords;
    }

    public String translateEnglishToAfanOromo(String word) {
        if (englishToAfanOromoDict.containsKey(word)) {
            DictionaryEntry entry = englishToAfanOromoDict.get(word);
            return "Afaan Oromoo: " + entry.getAfanOromoWord() + "\n\nDefinition: " + entry.getAfanOromoDefinition();
        } else {
            return "Translation not found.";
        }
    }

    public String translateAfanOromoToEnglish(String word) {
        if (afanOromoToEnglishDict.containsKey(word)) {
            DictionaryEntry entry = afanOromoToEnglishDict.get(word);
            return "English: " + entry.getEnglishWord() + "\n\nDefinition: " + entry.getEnglishDefinition();
        } else {
            return "Translation not found.";
        }
    }

    public void addToFavorites(String word) {
        if (englishToAfanOromoDict.containsKey(word)) {
            favoriteWords.put(word, englishToAfanOromoDict.get(word));
        } else if (afanOromoToEnglishDict.containsKey(word)) {
            favoriteWords.put(word, afanOromoToEnglishDict.get(word));
        }
    }

    public String viewFavorites() {
        if (favoriteWords.isEmpty()) {
            return "";
        } else {
            StringBuilder favoritesList = new StringBuilder("Favorite Words:\n\n");
            for (DictionaryEntry entry : favoriteWords.values()) {
                favoritesList.append("English: ").append(entry.getEnglishWord())
                             .append("\nAfaan Oromoo: ").append(entry.getAfanOromoWord())
                             .append("\nDefinition: ").append(entry.getEnglishDefinition())
                             .append("\n\n");
            }
            return favoritesList.toString();
        }
    }

    private static class DictionaryEntry {
        private String englishWord;
        private String afanOromoWord;
        private String englishDefinition;
        private String afanOromoDefinition;

        public DictionaryEntry(String englishWord, String afanOromoWord, String englishDefinition, String afanOromoDefinition) {
            this.englishWord = englishWord;
            this.afanOromoWord = afanOromoWord;
            this.englishDefinition = englishDefinition;
            this.afanOromoDefinition = afanOromoDefinition;
        }

        public String getEnglishWord() {
            return englishWord;
        }

        public String getAfanOromoWord() {
            return afanOromoWord;
        }

        public String getEnglishDefinition() {
            return englishDefinition;
        }

        public String getAfanOromoDefinition() {
            return afanOromoDefinition;
        }
    }
}
