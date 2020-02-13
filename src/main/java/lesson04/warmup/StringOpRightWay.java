package lesson04.warmup;

public class StringOpRightWay {
    public boolean isVowel(char letter){
        String vowels = "aeiou";
        return vowels.indexOf(Character.toLowerCase(letter)) >= 0;
    }
    public boolean isConsonant(char letter){
        return !isVowel(letter);
    }
    public boolean isSmall(char letter){
        return letter >= 'a' && letter <= 'z';
    }
    public boolean isCapital(char letter){
        return letter >= 'A' && letter <= 'Z';
    }
    public boolean isLetter(char letter){
        return isCapital(letter) || isSmall(letter);
    }
    public String alphabetSmall(){
        StringBuilder stringBuilder = new StringBuilder();
        for(char i = 'a';i <= 'z';i++){
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }
    public String alphabetCapital(){
        return alphabetSmall().toUpperCase();
    }
    public char randomSmallLetter(){
        String alphabet = alphabetSmall();
        return alphabet.charAt((int) (Math.random() * alphabet.length() - 1));
    }
    public char randomCapitalLetter(){
        return Character.toUpperCase(randomSmallLetter());
    }
    public char randomLetter(){
        return ((int)(Math.random() * 2)) != 0 ? // 0 or 1 can be get
                randomCapitalLetter() : randomSmallLetter();
    }
    public String generateRandomSmallLetters(int length){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(randomSmallLetter());
        }
        return stringBuilder.toString();
    }
    public String generateRandomCapitalLetters(int length){
        return generateRandomSmallLetters(length).toUpperCase();
    }
    public String generateRandomLetters(int length){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(randomLetter());
        }
        return stringBuilder.toString();
    }
    public String generateRandomVowels(int length){
        StringBuilder stringBuilder = new StringBuilder();
        char[] vowels = {'a','e','i','o','u'};
        for (int i = 0; i < length; i++) {
            stringBuilder.append(vowels[(int)(Math.random() * vowels.length)]);
        }
        return stringBuilder.toString();
    }
}
