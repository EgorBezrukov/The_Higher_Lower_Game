import java.util.Scanner;

public class Hilo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Генерация случайного числа, которое будет угадывать пользователь
        int theNumber = (int) (Math.random() * 100 + 1);
        //System.out.println(theNumber);
        int guess = 0;
        while (guess != theNumber) {
            System.out.println("Угадайте и введите число от 1 до 100");
            guess = sc.nextInt();
            System.out.println("Вы ввели " + guess + " .");

            if (guess < theNumber)
                System.out.println(guess + " меньше. Попробуйте снова.");
            else if (guess > theNumber)
                System.out.println(guess + " больше. Попробуйте снова");
            else
                System.out.println("Поздравляю!" + guess +  " Верно!" );
        }
    }
}
