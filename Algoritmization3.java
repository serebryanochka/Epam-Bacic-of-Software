package course.epam.Katya;

public class Algoritmization3 {
    public static void main(String[] args) {
        // Одномерные массивы.Сортировки
        // 1.Заданы 2 одномерных массива с разл.количеством элементов и натур число k. Объеденить их в один массив...
int [] a = {2,3,5,6,7,8,9};
int [] b = {10,30,56,78};
int [] c = new int[a.length+b.length];
int k = 1;
int count = 0;

        for(int i = 0; i<a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for(int j = 0; j<b.length; j++) {
            c[count++] = b[j];
        }
        for(int i = 0;i<c.length;i++)
            System.out.print(c[i]+" ");
    }

    }
