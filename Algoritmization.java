package course.epam.Katya;

import java.util.*;

public class Algoritmization {
    public static void main(String[] args) {
        System.out.println(sumOfElements(3));
        System.out.println(Elements(7));
        System.out.println(negativePositiveZero());
        System.out.println(swap());
        print();
        System.out.println(sumOfPrimeNumbers());
        System.out.println(sumOfMax());
        withoutMin();
        withoutMin2();
        getFrequentNumber();
        narrowArray();
    }

    //1. Algoritmization В массив А[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
    private static int sumOfElements(int K) {
        int[] A = {2, 4, 5, 9, 3, 1, 9};
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % K == 0) {
                sum += A[i];
            }
        }
        return sum;
    }

    //2.Дана последовательность действ. чисел а1, а2,...аn. Заменить все ее члены, большие данного Z этим числом. Подсчитать количество замен
    private static int Elements(int Z) {
        int[] mas = {9, 8, 5, 4, 3, 1, 0};
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > Z) {
                mas[i] = Z;
                count++;
            }
        }
        return count;
    }

    //3.Дан массив действительных чисел, размером N. Подсчитать, сколько в нем отриц., полож., нулевых элементов.
    private static String negativePositiveZero() {
        int[] arr = {10, -7, 5, -2, 3, 1, -9, 0, 0};
        int countNeg = 0;
        int countPos = 0;
        int countZero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                countNeg++;
            }
            if (arr[i] > 0) {
                countPos++;
            } else countZero++;
        }
        String a = Integer.toString(countNeg) + ";" + Integer.toString(countPos) + ";" + Integer.toString(countZero);
        return a;

    }

    //4.Даны действительные числа а1,а2...аn. Поменять местами наибольший и наименьший элементы.
    private static String swap() {
        int[] arr = {8, 4, 5, 9, 3, 1, 0};
        int max;
        int maxN = 0;

        max = arr[0];
        for (int i = 0; i < arr.length; i++) { //ищем макс элемент
            if (arr[i] > max) {
                max = arr[i];
                maxN = i;//запоминаем номер элемента
            }
        }
        int min;
        int minN;
        minN = 0;
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {//ищем минимальный элемент
            if (arr[i] < min) {
                min = arr[i];
                minN = i;//запоминаем номер элемента
            }
        }
        int revers;
        revers = arr[maxN];
        arr[maxN] = arr[minN];
        arr[minN] = revers;
        return Arrays.toString(arr);
    }

    //5. Даны целые числа а1, а2,...аn. Вывести на печать только те числа, для которых Ai>i
    public static void print() {
        String res = "";
        int[] A = {1, 3, 5, 9, -5, 1, 10};
        for (int i = 0; i < A.length; i++) {
            if (A[i] > i) {
                res = A[i] + " ";
            }
            if (A[i] <= i) continue;
            System.out.print(res);
        }
        System.out.println();
    }

    //6. Дана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми
    private static int sumOfPrimeNumbers() { //Простое число делится на себя и единицу
        int[] N = {6, 5, 1, 5, 1, 7, 6, 1};
        int sum = 0;
        int prime = N[2];
        for (int i = 3; i < N.length; i++) {
            for (int j = 2; j < i; j++)
                if (i % j == 0) { //если остаток от деления числа на значение шага цикла равен нулю, то Не простое//
                    continue;
                }
            sum += N[i];
        }
        return sum + prime;
    }

    //7. Даны действительные числа A1,A2...An. Найти max(A1+A2n, A2+A2n-1....An+An+1)
    private static int sumOfMax() {
        int[] array = {8, 16, 2, 3, 5, 6, 7, 8};
        int maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }
        }
        return maxSum;
    }

    //8. Дана последовательность целых чисел. Образовать новую последовательность, выбросив из исходной те члены, которые равны min(A1,A2,,,An)
    private static void withoutMin() {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(12);
        arraylist.add(3);
        arraylist.add(-4);
        arraylist.add(5);
        System.out.println(arraylist.remove(Collections.min(arraylist)));
        System.out.println("Первый способ " + arraylist);
    }

    private static void withoutMin2() {
        int[] arr = {12, 3, -4, 5};
        int[] arr2 = new int[arr.length - 1];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            arr2[i] = arr[i + 1];
        }
        System.out.println(Arrays.toString(arr2));
    }

    //9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, определить наименьшее из них
    private static void getFrequentNumber() {
        int[] array = {2, 9, 3, 2, 5, 6, 2, 3, 4, 9, 8, 2, 2};

        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (myMap.containsKey(array[i])) {
                myMap.put(array[i], myMap.get(array[i]) + 1);
            } else {
                myMap.put(array[i], 1);
            }
        }
        int maxCount = 0, result = 0;
        for (Map.Entry<Integer, Integer> val : myMap.entrySet()) {
            if (maxCount < val.getValue()) {
                result = val.getKey();
                maxCount = val.getValue();
            }
        }
        System.out.println("Число " + result + " встречается " + maxCount + " раз");
    }

    //10. Дан целочисленный массив элементов n. Сжать массив, выбросив из него каждый второй элемент (заполнить нулями). Доп.массив не использовать
    private static void narrowArray() {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < A.length; i++) {
            if (i % 2 != 0) {
                A[i] = 0;
            }
        }
        System.out.println(Arrays.toString(A));
    }

}
