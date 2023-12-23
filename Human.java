package Storage;
import java.util.Scanner;

public abstract class Human {
    String name;
    String age;

    Scanner scan = new Scanner(System.in);
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setData() {
        String temp;
        System.out.println("Доступные данные - Имя, возраст");
        System.out.println();
        System.out.println("Укажите имя человека:");
        temp = scan.nextLine();
        setName(temp);
        System.out.println("Укажите возраст человека:");
        temp = scan.nextLine();
        setAge(temp);
        }
    }

