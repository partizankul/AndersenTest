import java.util.Scanner;

public class ThirdTask {

    public float scan(){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextFloat()) {
            float num = sc.nextFloat();
            return num;
        } else
            System.out.println("Введите пожалуйста число");
        return scan();
    }

    public void createArr(){
        System.out.println("Укажите длинну массива от 1 до 20 включительно");
        float[] myArray = new float[(int) scan()];
        System.out.println("Заполните массив числами");
        for(int i = 0; i< myArray.length; i++ ){
            myArray[i] = scan();
        }
        System.out.println("Ваш массив:");
        for (float arr : myArray){
            System.out.print( " " + arr + " ");
        }
        System.out.println("");
        System.out.println("Элементы вашего масива кратные 3: ");
        for(int i = 0; i< myArray.length-1; i++ ){
            if (myArray[i]%3==0){
                System.out.print(" " + myArray[i] + " ");
            }
        }
    }

}
