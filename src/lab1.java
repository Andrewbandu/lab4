import java.util.Arrays;

public class lab1 {
    public static void main(String[] args) {
        // Створення та наповнення першого масиву
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 11);
        }

        // Створення та наповнення другого масиву
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 11);
        }

        // Створення третього масиву
        int[] sumArray = new int[10];
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        // Виведення усіх масивів у консоль в рядок
        System.out.println("Перший масив: " + Arrays.toString(array1));
        System.out.println("Другий масив: " + Arrays.toString(array2));
        System.out.println("Третій масив (сума перших двох): " + Arrays.toString(sumArray));

        System.out.println("завдання 5");


        int[] array = new int[15];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*11);

        }
        System.out.println("масив"+ Arrays.toString(array));
        //підрахунок кількості парних елементів
        int c1 = 0;
        for (int num :array){
            if (num%2 == 0){
                c1++;
            }
        }
        System.out.println("кількість парних елементів " +c1);



    }
}
