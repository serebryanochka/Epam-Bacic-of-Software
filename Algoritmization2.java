package course.epam.Katya;

import java.util.Arrays;
import java.util.Scanner;

public class Algoritmization2 {
    public static void main(String[] args) {
      /*  oddСolumns();
        diagonal();
        rowСolumn();
        formMatrix();
        formMatrix2();
        formMatrix3();
        formMatrix4();
        swapColumn();
        maxSumColumn();
        positiveElements();
        randomMatrix();
        sortMatrix();
        sortMatrix2();
        sortMatrix3();
        maxElement();*/
        magicSquare();
    }

    //Задачи. Массив массивов.
    //1.Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
    public static void oddСolumns() {
        int[][] matrix = {{9, 5, 3, 5, 8},
                {3, 4, 5, 7, 5},
                {6, 7, 8, 2, 3},
                {2, 10, 9, 4, 1}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length - 1][j])
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //2.Дана квадратная матрица. Вывести на экран элементы, стоящие по диагонали
    public static void diagonal() {
        int[][] m = {{1, 5, 3, 5},
                {3, 4, 5, 7},
                {6, 7, 8, 2},
                {2, 1, 9, 4}};
        System.out.print("По диагонали: ");
        for (int i = 0; i < m.length; i++) { // for (int m : m)
            for (int j = 0; j < m[i].length; j++) {
                if (i == j)
                    System.out.print(m[i][j] + " ");
            }
        }
        System.out.println();
    }

    //3.Дана матрица. Вывести на экран k-ю строку и p-й столбец матрицы.
    public static void rowСolumn() {
        int k = 2, p = 3;

        int[][] a = {{1, 5, 3, 5},
                {3, 4, 5, 7},
                {6, 7, 8, 2},
                {2, 1, 9, 4}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == k - 1)
                    System.out.print(a[i][j] + " ");
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == p - 1)
                    System.out.print(a[i][j] + " ");
            }
        }
        System.out.println();
    }

    //4.Сформировать квадратную матрицу порядка n по заданному образцу (n - четное число):
    public static void formMatrix() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите четное число n > 3");
        int n = s.nextInt();
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    m[i][j] = j + 1;
                    System.out.print(m[i][j] + "\t");
                }
                System.out.println();
            } else {
                for (int j = 0; j < m[i].length; j++) {
                    m[i][j] = m[j].length - j;

                    System.out.print(m[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    //5.Сформировать квадратную матрицу порядка n по заданному образцу (n - четное число):
    public static void formMatrix2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четное число n ");
        int n = sc.nextInt();
        int[][] m2 = new int[n][n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - count) {
                    for (; j < n; j++) {
                        m2[i][j] = 0;
                    }
                } else
                    m2[i][j] = i + 1;
            }
            count++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }
    }

    //6.Сформировать квадратную матрицу порядка n по заданному образцу (n - четное число):
    public static void formMatrix3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четное число n ");
        int n = sc.nextInt();
        int[][] m3 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i > j && i < n - (j + 1)) || (i < j && i > n - (j + 1))) {
                    m3[i][j] = 0;
                } else m3[i][j] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }

    //7.Сформировать квадратную матрицу порядка N по правилу: A[i,j]=sin(j^2-j^2/N) и подсчитать количество полож. элементов в ней
    public static void formMatrix4() {
        int n = 4;
        int[][] m4 = {{1, 5, 3, 5},
                {3, 4, 5, 7},
                {6, 7, 8, 2},
                {2, 1, 9, 4}};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m4[i].length; j++) {
                m4[i][j] = (int) Math.sin(((i * i - j * j) / n));
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m4[i][j] + " ");
            }
            System.out.println();
        }
    }

    //8. В числовой матрице поменять местами 2 любых столбца. Номера столбцов пользователь вводит с клавиатуры
    public static void swapColumn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 разных числа <4, обозначающие номера столбцов");
        int column1 = scanner.nextInt();
        int column2 = scanner.nextInt();
        int[][] arr = {{1, 5, 3, 5},
                {3, 4, 5, 7},
                {6, 7, 8, 2},
                {2, 1, 9, 4}};
        {
            for (int i = 0; i < arr.length; i++) {
                int x = arr[i][column1];
                arr[i][column1] = arr[i][column2];
                arr[i][column2] = x;
            }
        }
        for (int y = 0; y < arr.length; y++) {
            System.out.println(Arrays.toString(arr[y]));
        }
    }

    //9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить какой столбец содержит максим сумму
    public static void maxSumColumn() {
        int[][] arr = new int[][]{{1, 5, 3, 5},
                {3, 4, 5, 7},
                {6, 7, 8, 2},
                {2, 1, 9, 4}};
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                count += arr[j][i];
            }
            sum = Math.max(sum, count);
        }
        System.out.println(sum);
    }

    //10. Найти положительные элементы главной диагонали квадратной матрицы.
    public static void positiveElements() {
        int[][] arr = new int[][]{{1, 5, 3, 5},
                {3, 4, 5, 7},
                {6, 7, -8, 2},
                {2, 1, 9, -4}};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] > 0)
                System.out.println(arr[i][i] + " ");
        }
    }

    //11. Матрицу 10x20 заполнить случайными числами от 0 до15. Вывести на экран матрицу и номера строк, в которых число 5 встречается 3 и > раз.
    public static void randomMatrix() {
        int[][] arr = new int[10][20];
        String s = "Больше трех раз 5 повторяется в строках:";
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 20; j++) {
                arr[i][j] = (int) (Math.random() * 15);
                System.out.print(arr[i][j] + "\t");
                if (arr[i][j] == 5) {
                    count++;
                }
            }
            System.out.println();
            if (count >= 3) {
                s = s + i + "\t";
            }
        }
        System.out.println(s);
    }

    //12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов
    public static void sortMatrix() {
        int a[][] = new int[5][5];
        int min = 50;
        int max = 100;
        int b;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = min + (int) (Math.random() * (max - min + 1));
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("...........");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                for (int k = j + 1; k < a.length; k++) {
                    if (a[i][j] > a[i][k]) {
                        b = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = b;
                    }
                }
            }
        }
        // что же получилось
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    //13. Отсортировать cтолбцы матрицы по возрастанию и убыванию значений элементов
    public static void sortMatrix2() {
        int a2[][] = new int[5][5];
        int min = 50;
        int max = 100;
        int b;

        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                a2[i][j] = min + (int) (Math.random() * (max - min + 1));
                System.out.print(a2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("...........");

        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                for (int k = i + 1; k < a2.length; k++) {
                    if (a2[i][j] > a2[k][j]) {
                        b = a2[i][j];
                        a2[i][j] = a2[k][j];
                        a2[k][j] = b;
                    }
                }
            }
        }
        // смотри какая красота...
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                System.out.print(a2[i][j] + " ");
            }
            System.out.println();
        }
    }

    //14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
    public static void sortMatrix3() {
        int m = 7;
        int n = 5;
        int[][] a3 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    a3[i][j] = 1;
                }
                System.out.print(a3[i][j] + " ");
            }
            System.out.println();
        }
    }

    //15. Найти наибольший элемент матрицы и заменить все нечетные элементы на него.
    public static void maxElement() {
        int[][] arr = new int[5][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0 + (int) (Math.random() * (50 - 0 + 1));
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Максимальное число " + max);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 2 != 0) {
                    arr[i][j] = max;
                }
            }
        }

        for (int y = 0; y < arr.length; y++) {
            System.out.println(Arrays.toString(arr[y]));
        }
    }

    //16. Задача на магический квадрат порядка n (матрица n x n). Построить
    public static void magicSquare() {
        int n = 3;
        int array[][] = new int[n][n];
        int i = 0;
        int j = n / 2;
        for (int k = 1; k <= n * n; k++) {
            array[i][j] = k;
            if (k % n == 0) {  // Если текущее число кратно n, спускаемся вниз
                i++;
            } else {  // Если текущее число не кратно n, идем вверх влево
                i--;
                j++;
                if (i < 0) i = n - 1;
                if (j > n - 1) j = 0;
            }
        }
        for (int w = 0; w < array.length; w++) {
            for (int e = 0; e < array[w].length; e++) {
                System.out.printf("%4d", array[w][e]);
            }
            System.out.println();
        }
    }

}