public class EmployeeBook {

    private final int BOOKLIMIT = 10;

    private Employee[] employees = new Employee[BOOKLIMIT];

    public void addNewEmployee(Employee employee) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] == null) {
                this.employees[i] = employee;
                return;
            }
        }
    }

    public void delEmployee(Employee employee) {
        for (int i = 0; i < this.employees.length; i++) {
            if (employee.equals(this.employees[i])) {
                this.employees[i] = null;
                return;
            }
        }
    }

    public void printEmployees() {
        for (Employee emp: employees) {
            if (emp != null) {
                System.out.println(emp.toString());
            }
        }
    }

    public int totalSalary() {
        int total = 0;
        for (Employee emp: employees) {
            if (emp != null) {
                total += emp.getSalary();
            }
        }
        return total;
    }

    public Employee minSalaryEmployee() {
        int minSalary = Integer.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee emp: employees) {
            if (emp != null) {
                if (emp.getSalary() < minSalary) {
                    minSalary = emp.getSalary();
                    employeeWithMinSalary = emp;
                }
            }
        }
        return employeeWithMinSalary;
    }

    public Employee maxSalaryEmployee() {
        int maxSalary = 0;
        Employee employeeWithMaxSalary = null;
        for (Employee emp: employees) {
            if (emp != null) {
                if (emp.getSalary() > maxSalary) {
                    maxSalary = emp.getSalary();
                    employeeWithMaxSalary = emp;
                }
            }
        }
        return employeeWithMaxSalary;
    }

    public double averageSalary() {
        int counter = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                counter++;
            }
        }
        return (double) (totalSalary() / counter);
    }

    public void printFIO() {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp.getSurname() + " " + emp.getName() + " " + emp.getFatherName());
            }
        }
    }

    public void indexSalary(double percent) {
        double index = 1 + percent/100;
        for (Employee emp : employees) {
            if (emp != null) {
                emp.setSalary((int) (emp.getSalary() * index));
            }
        }
    }

    public Employee minSalaryDepartment(Department department) {
        int minSalary = Integer.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    if (emp.getSalary() < minSalary) {
                        minSalary = emp.getSalary();
                        employeeWithMinSalary = emp;
                    }
                }
            }
        }
        return employeeWithMinSalary;
    }

    public Employee maxSalaryDepartment(Department department) {
        int maxSalary = 0;
        Employee employeeWithMaxSalary = null;
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    if (emp.getSalary() > maxSalary) {
                        maxSalary = emp.getSalary();
                        employeeWithMaxSalary = emp;
                    }
                }
            }
        }
        return employeeWithMaxSalary;
    }

    public int totalSalaryDepartment(Department department) {
        int total = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    total += emp.getSalary();
                }
            }
        }
        return total;
    }

    public double averageSalaryDepartment(Department department) {
        int counter = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    counter++;
                }
            }
        }
        return totalSalaryDepartment(department)/counter;
    }

    public void indexSalaryDepartment(Department department, double percent) {
        double index = 1 + percent / 100;
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    emp.setSalary((int) (emp.getSalary() * index));
                }
            }
        }
    }

    public void printEmployeesDepartment(Department department) {
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    System.out.println(emp.getSurname() + " " + emp.getName() + " " + emp.getFatherName());
                }
            }
        }
    }

    public void printWithSalaryLessThan(int salary) {
        for (Employee emp: employees) {
            if (emp != null) {
                if (emp.getSalary() < salary) {
                    System.out.println(emp.toString());
                }
            }
        }
    }

    public void findEmpByFioAndChangeSalaryAndDep(String fio, int salary) {
        String[] fioArr = fio.split(" ");
        String surname = fioArr[0];
        String name = fioArr[1];
        String fatherName = fioArr[2];
        for (Employee emp: this.employees) {
            if (emp != null) {
                if (name.equalsIgnoreCase(emp.getName()) &&
                        surname.equalsIgnoreCase(emp.getSurname()) &&
                        fatherName.equalsIgnoreCase(emp.getFatherName())) {
                    emp.setSalary(salary);
                }
            }
        }
    }

    public void findEmpByFioAndChangeSalaryAndDep(String fio, Department department) {
        String[] fioArr = fio.split(" ");
        String surname = fioArr[0];
        String name = fioArr[1];
        String fatherName = fioArr[2];
        for (Employee emp: this.employees) {
            if (emp != null) {
                if (name.equalsIgnoreCase(emp.getName()) &&
                        surname.equalsIgnoreCase(emp.getSurname()) &&
                        fatherName.equalsIgnoreCase(emp.getFatherName())) {
                    emp.setDepartment(department);
                }
            }
        }
    }

    public void findEmpByFioAndChangeSalaryAndDep(String fio, int salary, Department department) {
        String[] fioArr = fio.split(" ");
        String surname = fioArr[0];
        String name = fioArr[1];
        String fatherName = fioArr[2];
        for (Employee emp: this.employees) {
            if (emp != null) {
                if (name.equalsIgnoreCase(emp.getName()) &&
                        surname.equalsIgnoreCase(emp.getSurname()) &&
                        fatherName.equalsIgnoreCase(emp.getFatherName())) {
                    emp.setSalary(salary);
                    emp.setDepartment(department);
                }
            }
        }
    }

    public void printAllEmployeesByDepartments(){
        for (Department dep: Department.values()) {
            System.out.println("Департамент " + dep + ":");
            for (Employee emp: this.employees) {
                if (emp != null) {
                    if (dep == emp.getDepartment()) {
                        System.out.println(emp.getSurname() + " " + emp.getName() + " " + emp.getFatherName());
                    }
                }
            }
        }
    }
}
