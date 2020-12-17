import java.util.Scanner;

public class FirstTask  {

    public float scan(){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextFloat()) {
        float num = sc.nextFloat();
        return num;
        } else
            System.out.println("Введите пожалуйста число");
            return scan();
    }

    public void ifNumSeven(){
        System.out.println("Введите число ");
        if(scan()>7){
            System.out.println("Привет");

        } else System.out.println("Ваше число меньше либо равно 7");
    }
}

