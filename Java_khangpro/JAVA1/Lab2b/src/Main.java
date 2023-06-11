import textprocessor.*;
import textprocessor.TextProcessor;

        public class Main {
            public static void main(String[] args) {
                String text = "financing Promoting Technology was established with the mission to develop a ‘new generation university’ with a    modern educational philosophy which combines training    activities with the actual need for skills in   the country, leveraging Vietnam to a level at which it can compete    with developed countries in the world. financing     Promoting Technology trains industrial engineers, and this requires a close association with IT firms, combining   training with      reality to be able to implement the most advanced technologies.";
                TextProcessor textProcessor = new TextProcessor(text);
               textProcessor.capitalizeFirstLetterInEachSentence();
               textProcessor.removeExtraSpaces();
        textProcessor.replaceNewGenerationUniversityWithFPTUniversity();
        textProcessor.capitalizeVietnam();
        textProcessor.replaceFinancingPromotingTechnologyWithFPTUniversity();
                int vowels = textProcessor.countVowels();
                int consonants = textProcessor.countConsonants();
                System.out.println();
                System.out.println("Vowels: " + vowels);
                System.out.println("Consonants: " + consonants);
    }
}
