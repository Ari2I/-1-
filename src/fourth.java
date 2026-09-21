//Задание 4

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Функция нахождения скорости");
        System.out.print("Введите время: ");
        double imp_time = scanner.nextDouble();
        System.out.print("Введите расстояние: ");
        double imp_distance = scanner.nextDouble();

        while (imp_distance <= 0) {
            System.out.println("Ошибка: Расстояние не может быть отрицательным! Введите новое расстояние:");
            imp_distance = scanner.nextDouble();
        }
        double speed = imp_time / imp_distance;

        System.out.print(speed);
    }

}