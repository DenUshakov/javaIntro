package lesson02;

public class Person {
    String firstName;
    String secondName;
    int age;
    private static int count = 0;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        count++;
    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        count++;
    }

    void doSmth(){
        prntLn(count + "made that");
    }

    static void doSmthElse(){
        prntLn(count + "made again");
    }

    static {
        prntLn(count + "Person was created");
    }

    private static void  prntLn(String out) {
        System.out.println(out);
    }


}
