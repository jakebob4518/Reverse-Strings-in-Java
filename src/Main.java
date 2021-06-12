public class Main {
    public static void main(String[] args){
        String input_string = "hello gamer";
        char[] letters = input_string.toCharArray();
        int length = letters.length;
        
        for (int i = length - 1; i >= 0; i--){
            System.out.print(letters[i]);
        }
    }
}
