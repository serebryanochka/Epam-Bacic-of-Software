package home.company;

import java.util.Scanner;

public class PracticeBasic {
    public static void main(String args[]) {
        function1(3, 13);
        value2(1, 115.5, 20);
        value3(100.4, 20);
        value4(222.777);
        time(33896);
        value5(6, 8);
        triangle(20, 40);
        max(13, 44, 1, 78);
        points(3, 45, 99, 4, 33, 5);
        hole(12, 5, 6, 4, 11);
        function(-5);

        // sumOfNumbers();
        functionValue(1, 2, 4, 5, 6);
        sumOfSquares();
        multiOfSquares();
        numbersRow(0.0000008, 100);
        charSymbols();
        dividers();
        sameNumbers();
    }

    //Линейные программы. 1.1 Вычислить значение функции...
    private static void function1(double a, double b) {
        double z = ((a - 3) * b / 2);
        System.out.printf("Значение функции 1: %.2f \n", z);
    }

    // 1.2 Вычислить значение по формуле...
    private static void value2(double a, double b, double c) {
        double x = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.printf("Значение выражения 2: %.2f \n ", x);
    }

    // 1.3 Вычислить значение по формуле...
    private static void value3(double x, double y) {
        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.printf("Значение выражения 3: %.3f\n ", result);

    }

    // 1.4 Поменять местами дробную и целую части...
    private static void value4(double x) {
        double res = (x * 1000) % 1000 + (double) ((int) (x)) / 1000;
        System.out.println("Значение выражения 4: " + res);
    }

    // 1.5 Дано время Т в секундах. Выразить в форме: часы, минуты, сек
    private static void time(int T) {
        int hour = T / 3600;
        int min = (T - (hour * 3600)) / 60;
        int sec = T - hour * 3600 - min * 60;
        System.out.println(hour + "ч " + min + "мин " + sec + "с ");
    }

    // 1.6 Составить программу, которая печает trye если точка (x,y) принадлежит закрашенной области и false в противном случае
    private static void value5(int x, int y) {
        int Xmax = 4;
        int Xmin = -4;
        int Ymax = 4;
        int Ymin = -3;
        if (x >= Xmin && x <= Xmax && y >= Ymin && y <= Ymax) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //Ветвления. 1.2 Даны два треугольника (в градусах). Определить существует ли такой треугольник, будет ли он прямоугольным.
    private static void triangle(int t, int t2) {
        if (180 - t - t2 > 0) {
            System.out.println("triangle exists");
            if (t + t2 == 90 || t == 90 || t2 == 90)
                System.out.println("rectangular triangle");
        } else
            System.out.println("triangle doesn't exists");
    }

    //2.2 Найти max{min(a,b), min(c,d)}
    private static void max(int a, int b, int c, int d) {
        int res = Math.min(a, b);
        int res1 = Math.min(c, d);
        int res2 = Math.max(res, res1);
        System.out.println("Максимальное значение: " + res2);
    }

    // 2.3 Даны три точки...Определить будут ли они лежать на одной прямой
    private static void points(int x1, int y1, int x2, int y2, int x3, int y3) {
        double Tol = 1e-10;
        if (Math.abs((x3 - x1) / (x2 - x1) - (y3 - y1) / (y2 - y1)) <= Tol)

            System.out.println("points belong to a line");
        else
            System.out.println("points do not belong to a line");
    }

    // 2.4 Заданы размеры A, B прямоугольного отверстия и размеры X, Y, Z кирпича. Определить, пройдет ли кирпич через отверстие
    private static void hole(int A, int B, int x, int y, int z) {
        if ((x < A) && (y < B)
                || (x < A) && (z < B)
                || (z < A) && (y < B)
                || (y < A) && (x < B)
                || (z < A) && (x < B)
                || (y < A) && (z < B)) {
            System.out.println("brick will");
        } else
            System.out.println("brick will not");
    }

    // 2.5 Вычислить значение функции
    private static void function(int x) {
        double result;
        if (x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.printf("Значение функции: %.2f \n", result);
    }
// 3 Циклы. Напишите программу, где пользователь вводит число, а программа суммирует все числа от 1 до введенного числа

    // private static void sumOfNumbers() {
    //  System.out.println("Введите целое положительное число: ");
    // Scanner scan = new Scanner(System.in);
    // int number = scan.nextInt();
    // int sum = 0;
    //  for (int i = 1; i <= number; i++) {
    // sum += i; //
    // }
    // System.out.println(sum);
    // }

    // 3.2 Вычислить значение функции на отрезке [a,b] c шагом h...
    private static void functionValue(int a, int b, int x, int y, int h) {
        for (double i = a; i <= b; i += h) {
            if (x > 2) {
                y = x;
            } else y = -x;
            System.out.println("Значение функции на отрезке равно " + y);
        }
    }

    // 3.3 Найти сумму квадратов первых 100 чисел
    private static void sumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println("Сумма квадратов первых 100 чисел: " + sum);
    }

    // 3.4 Составить программу произведения квадратов первых двухсот чисел
    private static void multiOfSquares() {
        long multi = 1;
        for (int i = 1; i <= 200; i++) {
            multi *= i * i;
        }
        System.out.println("Произведение квадратов первых 200 чисел: " + multi);
    }

    // 3.5 Дан числовой ряд и некоторое число е...
    private static void numbersRow(double e, int n) {
        double sum = 0;
        for (int i = 1; i < n; i++) {
            double a = (1 / (Math.pow(2, i))) + (1 / (Math.pow(3, i)));
            if (Math.abs(a) >= e) {
                sum += a;

                n++;
            }
        }
        System.out.println("Сумма членов ряда: " + sum);
    }

    // 3.6 Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    private static void charSymbols() {
        for (int i = 33; i < 256; i++) {
            char ch = (char) i;
            System.out.println(i + " " + ch);
        }
    }

    // 3.7 Для каждого натурального числа от m до n вывести все делители, кроме 1 и самого числа.
    private static void dividers() {
        System.out.println("Введите два натуральных числа m,n (где m<n)");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = m; i < n; i++) {
            String result = "";
            for (int j = 2; j < i; j++) {
                if (i % j == 0 && i != j) {
               result  +=j +",";
                }
            }
            System.out.println("Число "+i +" делители "+ result);
        }

    }

    // 3.8 Дaны два числа. Определить числа, входящие в запись, как первого, так и второго.
    private static void sameNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x: ");
        int x = in.nextInt();
        System.out.println("Введите y: ");
        int y = in.nextInt();
        int[] arr = new int[10];
        String numbers ="";
        while (x != 0) {
            arr[x % 10]++;
            x /= 10;
        }
        while (y != 0) {
            if (arr[y % 10] != 0)
               numbers += y%10+",";
            y /= 10;
        }
        System.out.println("Совпадают цифры "+numbers);
    }
}
//ctrl+alt+l (редактирует/располагает/упорядочивает код по правилам этой среды разработки)
//ctr+z - отменяет действия, shift+F10 - запускает код в main, ctrl+F - поиск по коду по слову, значению