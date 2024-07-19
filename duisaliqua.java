public class Main {
    public static void handleCharacter(char character) {
        switch (character) {
            case 'M':
                System.out.println("The character is M");
                // Add additional logic for when the character is 'M'
                break;
            case 'A':
                System.out.println("The character is A");
                // Add additional logic for when the character is 'A'
                break;
            case 'Z':
                System.out.println("The character is Z");
                // Add additional logic for when the character is 'Z'
                break;
            default:
                System.out.println("Unknown character");
                // Add logic for handling unknown characters
                break;
        }
    }

    public static void main(String[] args) {
        char charInput = 'M';
        handleCharacter(charInput);
    }
}
