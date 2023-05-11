public class Employee {
    private String name;
    private String surname;
    private String fatherName;
    private int id;
    private Department department;

    private int salary;

    //todo попробовать билдер






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

    public int getSalary() {
        return this.salary;
    }

    public Department getDepartment() {
        return department;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setIdCounter(int idCounter) {
        Employee.idCounter = idCounter;
    }

    @Override
    public String toString(){
        return this.surname + " " +
                this.name + " " +
                this.fatherName + " " +
                this.department + " департамент " +
                this.salary + " рублей";
    }


}
