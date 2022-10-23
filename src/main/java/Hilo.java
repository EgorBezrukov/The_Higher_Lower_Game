import java.util.Scanner;

public class Hilo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String playAgain = "";
        do {
            //Генерация случайного числа, которое будет угадывать пользователь
            int theNumber = (int) (Math.random() * 50 + 1);
            //System.out.println(theNumber);
            int numberOfTries = 0;
            int guess = 0;
            while (guess != theNumber) {
                System.out.println("Добро пожаловать в игру Больше или меньше.");
                System.out.println("Угадайте и введите число от 1 до 50");
                guess = sc.nextInt();
                System.out.println("Вы ввели " + guess + " .");

                if (guess < theNumber)
                    System.out.println(guess + " меньше. Попробуйте снова.");

                else if (guess > theNumber)
                    System.out.println(guess + " больше. Попробуйте снова");
                else
                    System.out.println("Поздравляю!" + guess + " Верно!");
                numberOfTries =  numberOfTries + 1;
            }
            System.out.println("Число попыток = " + numberOfTries);
            System.out.println("Вы хотите повторить игру? (y/n)");
            playAgain = sc.next();
        }   while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Спасибо за вашу игру! Пока.");
        sc.close();
    }
}
