import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;



class SwahiliToEnglishDictionary {
    private final Map<String, String> swahiliToEnglish;


    public SwahiliToEnglishDictionary() {
        swahiliToEnglish = new HashMap<>();
        // Populate Swahili to English dictionary
        swahiliToEnglish.put("karibu", "welcome");
        swahiliToEnglish.put("rafiki", "friend");
        swahiliToEnglish.put("jina", "name");
        swahiliToEnglish.put("nyumbani", "home");
        // Add more entries as needed for Swahili to English
    }

    public String translate(String swahiliWord) {
        return swahiliToEnglish.getOrDefault(swahiliWord.toLowerCase(), "Translation not found");
    }
    public Map<String, String> getSwahiliToEnglish() {
        return swahiliToEnglish;
    }

}

class EnglishToSwahiliDictionary {
    private final Map<String, String> englishToSwahili;

    public EnglishToSwahiliDictionary() {
        englishToSwahili = new HashMap<>();
        // Populate English to Swahili dictionary
        englishToSwahili.put("welcome", "karibu");
        englishToSwahili.put("friend", "rafiki");
        englishToSwahili.put("name", "jina");
        englishToSwahili.put("home", "nyumbani");
        // Add more entries as needed for English to Swahili
    }

    public String translate(String englishWord) {
        return englishToSwahili.getOrDefault(englishWord.toLowerCase(), "Translation not found");
    }
    public Map<String, String> getEnglishToSwahili() {
        return englishToSwahili;
    }
}

class ASLToSwahiliDictionary {
    private final Map<String, String> aslToSwahili;

    public ASLToSwahiliDictionary() {
        aslToSwahili = new HashMap<>();
        // Populate ASL to Swahili dictionary
        aslToSwahili.put("👐🤙👍🤘👌👆🤙", "welcome");
        aslToSwahili.put("✋☝️🤞🤙👇🤚", "friend");
        aslToSwahili.put("👇✌️👆🤙", "name");
        aslToSwahili.put("🖐👌👆🤙", "home");
        // Add more entries as needed for ASL to Swahili
    }

    public String translate(String aslWord) {
        return aslToSwahili.getOrDefault(aslWord, "Translation not found");
    }
    public Map<String, String> getASLToSwahili() {
        return aslToSwahili;
    }
}

class ASLToEnglishDictionary {
    private final Map<String, String> aslToEnglish;

    public ASLToEnglishDictionary() {
        aslToEnglish = new HashMap<>();
        // Populate ASL to English dictionary
        aslToEnglish.put("👐🤙👍🤘👌👆🤙", "welcome");
        aslToEnglish.put("✋☝️🤞🤙👇🤚", "friend");
        aslToEnglish.put("👇✌️👆🤙", "name");
        aslToEnglish.put("🖐👌👆🤙", "home");
        // Add more entries as needed for ASL to English
    }

    public String translate(String aslWord) {
        return aslToEnglish.getOrDefault(aslWord, "Translation not found");
    }
    public Map<String, String> getASLToEnglish() {
        return aslToEnglish;
    }
}




public class LanguageTeachingApp {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        SwahiliToEnglishDictionary swahiliToEnglishDictionary = new SwahiliToEnglishDictionary();
        EnglishToSwahiliDictionary englishToSwahiliDictionary = new EnglishToSwahiliDictionary();
        ASLToSwahiliDictionary aslToSwahiliDictionary = new ASLToSwahiliDictionary();
        ASLToEnglishDictionary aslToEnglishDictionary = new ASLToEnglishDictionary();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Language Translation App!");

        while (true) {
            System.out.println("\nEnter 1 for Swahili to English translation");
            System.out.println("Enter 2 for English to Swahili translation");
            System.out.println("Enter 3 for ASL to Swahili translation");
            System.out.println("Enter 4 for ASL to English translation");
            System.out.println("Enter 5 to exit");
            System.out.println("Enter 6 for translation quiz");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter a word in Swahili to translate: ");
                    String swahiliWord = scanner.nextLine().toLowerCase();
                    String translatedToEnglish = swahiliToEnglishDictionary.translate(swahiliWord);
                    System.out.println("Translation in English: " + translatedToEnglish);
                }
                case 2 -> {
                    System.out.print("Enter a word in English to translate: ");
                    String englishWord = scanner.nextLine().toLowerCase();
                    String translatedToSwahili = englishToSwahiliDictionary.translate(englishWord);
                    System.out.println("Translation in Swahili: " + translatedToSwahili);
                }
                case 3 -> {
                    System.out.print("Enter a word in ASL to translate to Swahili: ");
                    String aslWordToSwahili = scanner.nextLine().toLowerCase();
                    String translatedToSwahili = aslToSwahiliDictionary.translate(aslWordToSwahili);
                    System.out.println("Translation in Swahili: " + translatedToSwahili);
                }
                case 4 -> {
                    System.out.print("Enter a word in ASL to translate to English: ");
                    String aslWordToEnglish = scanner.nextLine().toLowerCase();
                    String translatedToEnglish = aslToEnglishDictionary.translate(aslWordToEnglish);
                    System.out.println("Translation in English: " + translatedToEnglish);
                }
                case 5 -> {
                    System.out.println("Thank you for using the Language Translation App!");
                    return;
                }
                case 6 -> conductTranslationQuiz(swahiliToEnglishDictionary, englishToSwahiliDictionary,
                        aslToSwahiliDictionary, aslToEnglishDictionary);
                default -> System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
    private static void conductTranslationQuiz(SwahiliToEnglishDictionary swahiliToEnglishDictionary,
                                               EnglishToSwahiliDictionary englishToSwahiliDictionary,
                                               ASLToSwahiliDictionary aslToSwahiliDictionary,
                                               ASLToEnglishDictionary aslToEnglishDictionary) {
        System.out.println("Translation Quiz");
        int totalQuestions = 5; // Number of quiz questions
        int correctAnswers = 0;

        for (int i = 0; i < totalQuestions; i++) {
            String randomWord = getRandomWord(swahiliToEnglishDictionary, englishToSwahiliDictionary,
                    aslToSwahiliDictionary, aslToEnglishDictionary);
            String correctTranslation = getCorrectTranslation(randomWord, swahiliToEnglishDictionary,
                    englishToSwahiliDictionary, aslToSwahiliDictionary, aslToEnglishDictionary);

            System.out.println("\nTranslate the word: " + randomWord);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().toLowerCase();

            if (userAnswer.equals(correctTranslation)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Incorrect. The correct translation is: " + correctTranslation);
            }
        }

        System.out.println("\nQuiz Summary:");
        System.out.println("Total Questions: " + totalQuestions);
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Incorrect Answers: " + (totalQuestions - correctAnswers));
    }

    private static String getRandomWord(SwahiliToEnglishDictionary swahiliToEnglishDictionary,
                                        EnglishToSwahiliDictionary englishToSwahiliDictionary,
                                        ASLToSwahiliDictionary aslToSwahiliDictionary,
                                        ASLToEnglishDictionary aslToEnglishDictionary) {
        Map<String, String>[] dictionaries = new Map[]{
                swahiliToEnglishDictionary.getSwahiliToEnglish(),
                englishToSwahiliDictionary.getEnglishToSwahili(),
                aslToSwahiliDictionary.getASLToSwahili(),
                aslToEnglishDictionary.getASLToEnglish()
        };

        int randomDictionaryIndex = random.nextInt(dictionaries.length);
        Map<String, String> selectedDictionary = dictionaries[randomDictionaryIndex];

        int randomWordIndex = random.nextInt(selectedDictionary.size());
        return (String) selectedDictionary.keySet().toArray()[randomWordIndex];
    }

    private static String getCorrectTranslation(String word, SwahiliToEnglishDictionary swahiliToEnglishDictionary,
                                                EnglishToSwahiliDictionary englishToSwahiliDictionary,
                                                ASLToSwahiliDictionary aslToSwahiliDictionary,
                                                ASLToEnglishDictionary aslToEnglishDictionary) {
        String[] dictionaries = new String[]{
                swahiliToEnglishDictionary.translate(word),
                englishToSwahiliDictionary.translate(word),
                aslToSwahiliDictionary.translate(word),
                aslToEnglishDictionary.translate(word)
        };

        for (String translation : dictionaries) {
            if (!translation.equals("Translation not found")) {
                return translation;
            }
        }
        return "Translation not found";
    }
}
