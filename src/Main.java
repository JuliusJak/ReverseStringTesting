public class Main {
    public static void main(String[] args) {
        String phrase = "Hello World";


        for (char phraseArray : phrase.toCharArray()) {
            System.out.println(phraseArray);
        }
        //adding some random code i guess???
        char[] phraseArray = phrase.toCharArray();

        for (int i = phrase.length()-1; i >= 0 ; i--){
            char reverseArray = phraseArray[i];
            System.out.println(reverseArray);
        }
        for (int i = phrase.length()-1; i >= 0 ; i--){
            System.out.print(phraseArray[i]);
        }
    }
}

//hello me!