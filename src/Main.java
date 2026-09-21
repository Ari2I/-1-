//вариант 4


//задание 1


//double a = 1461;
//char p = 'A';
//boolean value = false;
//double staticVar1 = 15.1111;
//char staticVar2 = 2222;
//double y = 1.90;
//long n = 'm';
//double text = 7813.7870100278167603;
//boolean e = true;
//float words = 'V';
//String classVar = "669";
//byte j = "12";
//short k = 8349;
//String b = "X";
//double secret = 8803.41852977086517756;


//Вариант 5
//
//Задание 2

//public class Main{
//    public static void main(String[] args) {
//        double x = 0.1;
//
//        double cosX = Math.cos(x);
//        double cosX3 = Math.pow(cosX, 3.0);
//
//        double sin2X = Math.sin(2 * x);
//        double ctgX = 1/ Math.tan(x);
//
//        double res = cosX3 - sin2X + ctgX;
//
//        System.out.print(res);
//
//    }
//}

//Вариант 4
//
//Задание 3

//public class Main{
//    public static void main(String[] args){
//        double a = 16.1;
//        double b = 19.4;
//
//        if (a > b) {
//            System.out.print(a);
//        } else {
//            System.out.print(b);
//        }
//    }
//}



//Задание 4

import java.util.Scanner;

public class Main {
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