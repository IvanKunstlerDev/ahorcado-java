import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String world = "ESTERNOCLEIDOMASTOIDEO";
        int lifes = 5;
        int currentLife = 0;
        boolean isResolved = false;

        char[] currentTry = new char[world.length()];

        for (int i = 0; i < currentTry.length; i++) {
            currentTry[i] = '_';
        }

        while (!isResolved && currentLife < lifes) {
            //valueOf(chars array) forma un string con un array de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(currentTry));

            System.out.println("Letra:");
            // chartAt(0) devuelve la primer letra de la cadena dada
            char letter = Character.toUpperCase(scanner.next().charAt(0));
            boolean isCorrectLetter = false;

            for (int i = 0; i < world.length(); i++) {
                if (world.charAt(i) == letter) {
                    currentTry[i] = letter;
                    isCorrectLetter = true;
                }
            }

            if (!isCorrectLetter) {
                currentLife ++;
                System.out.println("Letra incorrecto, te quedan " + (lifes - currentLife) + " intentos.");
            }

            if (String.valueOf(currentTry).equals(world)) {
                isResolved = true;
                System.out.println("Felicidades, haz adivinado la palabra: " + world);
            }

        }

        if (!isResolved) {
            System.out.println("Game over, se te acabaron los intentos.");
        }

        scanner.close();
        
    }
}
