import java.util.Scanner;

public class SecondTask {

    public String  scan(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }

    public void nameCheck(){
        System.out.println("Введите имя");
        switch(scan()){
            case "Вячеслав":
                System.out.println("Привет, Вячеслав");
                break;
            default:
                System.out.println("Нет такого имени");
                break;
        }


    }


}
