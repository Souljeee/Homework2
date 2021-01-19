import java.util.Random;

public class Homework2 {

    public static void main(String[] args) {

        int[] arr1 = {0,1,1,0,1,1,0,1,0,0,0,1,0,1};

        int[] arr2 = new int[8];

        int[] arr3 = {1,5,3,2,11,4,5,2,4,8,9,1};

        int[][] arr4 = {{8,3,6},{4,9,2},{3,9,4}};

        int[] arr5 = new int [10];

        int[] arr6 = new int[8];

        int[] arr7 = new int[8];


        Random r =new Random();

        //Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        for (int i = 0;i< arr1.length;i++){

            if(arr1[i] == 1){

                arr1[i] = 0;

            }else{

                arr1[i] = 1;

            }
        }
        System.out.println("Задание 1:");
        for (int i =0;i< arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println(" ");

        //Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        for (int i =1;i< arr2.length;i++){

            arr2[i] = arr2[i-1] + 3;

        }
        System.out.println("Задание 2:");
        for (int i =0;i< arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println(" ");
        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        for (int i =0;i< arr3.length;i++){

            if (arr3[i] < 6){
                arr3[i]*=2;
            }

        }
        System.out.println("Задание 3:");
        for (int i =0;i< arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println(" ");
        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
        // заполнить его диагональные элементы единицами;
        for (int i = 0;i < arr4.length;i++){
            for (int j = 0;j < arr4[i].length;j++){
                if(i == j){
                    arr4[i][j] = 1;
                }
            }
        }
        System.out.println("Задание 4:");
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(" ");
        //Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        System.out.println("Задание 5:");
        for(int i = 0;i<arr5.length;i++){
            arr5[i] = r.nextInt(100);
            System.out.print(arr5[i]+" ");
        }


        int max = arr5[0];
        int min = arr5[0];

        System.out.println("  ");

        for(int i = 0;i< arr5.length;i++){
            if(arr5[i] < min) {
                min = arr5[i];
            }
            if(arr5[i] > max){
                max = arr5[i];
            }
        }
        System.out.print("Максимальное число: ");
        System.out.println(max);
        System.out.print("Минимальное число: ");
        System.out.println(min);


        //Вывод 6 задания в консоль
        System.out.println("Задание 6:");
        System.out.println(checkBalance(arr6));

        System.out.println("   ");

        //Вывод 7 задания в консоль
        System.out.println("Задание 7:");
        arr7 = shiftArray(arr7,10);
        for (int i = 0;i<arr7.length;i++){
            System.out.print(arr7[i]+" ");
        }
    }
    //Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место,
    // в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
    // эти символы в массив не входят.
    public static boolean checkBalance(int[] arr6){
        Random r =new Random();
        int sum = 0;
        int sumRight = 0;
        boolean equal = false;
        for(int i = 0;i<arr6.length;i++){
            arr6[i] = r.nextInt(10);
            System.out.print(arr6[i]+" ");
        }

        for(int i =0;i<arr6.length;i++){
            sum+=arr6[i];
        }

        for (int i = 0;i< arr6.length;i++){
            sumRight+=arr6[i];
            if(sumRight == sum - sumRight){
                equal = true;
            }
        }
        return equal;

    }
    //Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций.
    // Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.
    public static int[] shiftArray(int[] arr7, int n) {
        Random r =new Random();
        for(int i = 0;i<arr7.length;i++){
            arr7[i] = r.nextInt(10);
            System.out.print(arr7[i]+" ");
        }
        System.out.println(" ");
        if(n != 0){
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    int t = arr7[0];
                    arr7[0] = arr7[arr7.length - 1];

                    for (int j = 1; j < arr7.length - 1; j++) {
                        arr7[arr7.length - j] = arr7[arr7.length - j - 1];
                    }

                    arr7[1] = t;
                }
            }
            else if (n < 0) {
                for (int i = 0; i > n; i--) {
                    int t = arr7[arr7.length - 1];
                    arr7[arr7.length - 1] = arr7[0];

                    for (int j = 1; j < arr7.length - 1; j++) {
                        arr7[j - 1] = arr7[j];
                    }

                    arr7[arr7.length - 2] = t;
                }
            }
        }

        return arr7;
    }
}
