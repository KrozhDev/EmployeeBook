public class Employee {
    private String name;
    private String surname;
    private String fatherName;
    private int id;
    private Department department;

    private int salary;






    private static int idCounter = 0;


    public static final int FIRST = 1;
    public static final int SEC = 2;
    public static final int THIRD = 3;
    public static final int FOURTH = 4;
    public static final int FIFTH = 5;

    public Employee(String name, String surname, String fatherName, Department department, int salary) {
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.salary = salary;
        this.department = department;
        this.id = ++idCounter;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
