public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is fun. Java is powerful.";
        String oldWord = "Java";
        String newWord = "Python";

        String result = sentence.replace(oldWord, newWord);

        System.out.println("Modified Sentence: " + result);
    }
}

