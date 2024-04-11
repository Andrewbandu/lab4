
public class Main {
    public static void main(String[] args) {
        //визначення розміра масиву
        int s = 0;
        for(int i = 1; i<=99; i++){
            if(i%2 !=0){
                s++;
            }
        }
        System.out.println("кількість елементів" + s);
        //створення масива
        int[] a = new int[s];
        int b = 1;
        for(int i = 0;  i < s; i++){
            a[i] = b;
            b += 2;
        }for(int n : a){
            System.out.println(n);
        }

        System.out.println("завдання 2");


        int[] array = new int[20];

        //початковий масив

        System.out.println("початковий масив ");
        for(int i = 0; i < array.length; i++){
            array[i]=(int)(Math.random()*10);// генерує випадкове ціле число від 0 до 9
            System.out.println(array[i] + "");

        }
        //заміна непарних елементів на 0
        for (int i = 1; i < array.length;i += 2){
            array[i] = 0;


        }
        System.out.println("оновлений масив ");
        //иведення оновленого масива
        for (int num : array){
            System.out.println(num + "");
        }










    }
}