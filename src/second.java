//Вариант 5
//
//Задание 2

public class second{
    public static void main(String[] args) {
        double x = 0.1;

        double cosX = Math.cos(x);
        double cosX3 = Math.pow(cosX, 3.0);

        double sin2X = Math.sin(2 * x);
        double ctgX = 1/ Math.tan(x);

        double res = cosX3 - sin2X + ctgX;

        System.out.print(res);

    }
}