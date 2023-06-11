package processor;

public class Processor {
    private  String text;
    //construct
    public Processor(String text) {
        this.text = text;
    }
    // get,set
    public  String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void capitalizeFirstLetterInEachSentence() {
        String capitalizedText = text.substring(0, 1).toUpperCase() + text.substring(1);
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == '.' && Character.isWhitespace(text.charAt(i + 1))) {
                capitalizedText = capitalizedText.substring(0, i + 2) +
                        capitalizedText.substring(i + 2, i + 3).toUpperCase() +
                        capitalizedText.substring(i + 3);
            }
        }
        text = capitalizedText;
    }

    public void removeExtraSpaces() {
        text = text.replaceAll(" +", " ");
        // replace all consecutive spaces (spaces) with a single space, " +" represents one or more consecutive spaces,
        // and they will be replaced by a single space
    }

    public void rewriteNewGenerationUniversity() {
        text = text.replaceAll("new generation university", "New Generation University");

    }

    public void capitalizeVietnam() {
        text = text.replaceAll("Vietnam", "VIETNAM");
    }

    public void replaceFinancingPromotingTechnologyWithFPTUniversity() {
        text = text.replaceAll("financing Promoting Technology", "FPT University");
    }

    public int countVowels() {
        int vowels = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
        }
        return vowels;
    }

    public int countConsonants() {
        int consonants = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c) && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                consonants++;
            }
        }
        return consonants;
    }

}
