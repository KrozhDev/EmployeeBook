
public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Иван", "Иванов", "Иванович", Department.FIRST, 150_000);
        System.out.println(emp1.getId());
        Employee emp2 = new Employee("Петр", "Петрович", "Иванович", Department.FIRST, 200_000);
        System.out.println(emp2.getId());
    }
}