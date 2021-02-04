public class main2 {
    public static void main(String[] args) {



        Person.printSomething();
        
        Person nairouz = new Person("Nairouz", 24, true);

        System.out.println(nairouz.birthYear());
        System.out.println(nairouz.name);
        System.out.println(nairouz.age);
        if ( nairouz.female) {
            System.out.println("Female");
        } else {
            System.out.println("male");
        }
    }


public static class Person{
    public static void printSomething() {
        System.out.println("Hi");
    }
    public String name;
    public int age;
    public boolean female;

    public Person(String name, int age, boolean female) {
        this.name = name;
        this.age = age;
        this.female = female;
    }
    public int birthYear() {
        return (2021 - this.age);
    }
}



}
