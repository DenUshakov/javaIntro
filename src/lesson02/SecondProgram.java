package lesson02;

public class SecondProgram {
    public static void main(String[] args) {
        Person.doSmthElse();
        Person p1 = new Person("Dima", "Skvortsov", 39);
        p1.doSmth();
        Person p2 = new Person("Vital`ka", "Bek", 22);
        p2.doSmth();

        final Person p3 = p2;
        p2.secondName = "Ivanov";
        System.out.println(p3.secondName);

        String str1 = new String("str");
        String str2 = new String("str");

        if (p1.firstName==p2.firstName){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(""+p1.equals(p2));
        System.out.println(p2);
    }
}
