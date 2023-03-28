import java.util.Arrays;

public class Employee {
    private  Employee[] employees;

    private int id;
    private String FIO;

    private String department;

    private int salary;
public Employee(){
this.employees =new Employee[10];
}


    public Employee(String FIO, String department, int salary) {
        this.FIO = FIO;
        this.department = department;
        this.salary = salary;
    }

    public String getFIO() {
        return FIO;

    }

    public String getDepartment() {
        return department;

    }
    public int getSalary(){
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;

    }
    public void setSalary (int salary){
        this.salary = salary;
    }




    public void addEmployee(String FIO, String department, int salary) {
        if (id >= employees.length) {
            System.out.println("В книге сотрудников нет места");
        }
        Employee newEmployee = new Employee(FIO, department, salary);
        employees[id++] = newEmployee;
    }

    public void printAllEmployee() {
        for (int i = 0; i < id; i++) {
            Employee employee = employees[i];
            System.out.println(i + "." + " ФИО сотрудника " + employee.getFIO() + " Отдел " + employee.getDepartment()+ " Зарплата " + employee.getSalary() + " рублей");
        }
    }
    public void printAllSalary() {
        int sum = 0;


        for (int i = 0; i < id; i++)
        sum += employees[i].getSalary();
        System.out.println("Сумма затрат на зарплаты в месяц " + sum + " рублей");

    }
        public void printMinSalary(){
    int min = employees[0].getSalary();

    for (int i=0; i <id; i++){
        if (employees[i].getSalary() < min){
            min = employees[i].getSalary();
        }

        }
            System.out.println("Минимальня зарплата " + min + " рублей");
    }
    public void printMaxSalary(){
        int max = employees[0].getSalary();

        for (int i=0; i <id; i++){
            if (employees[i].getSalary() > max){
                max = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная заплата " + max + " рублей");
    }
    public void printAverageSalary(){
    double avarage = 0;
        for (int i = 0; i < id; i++) {

            avarage +=employees[i].getSalary() / employees.length;
        }
        System.out.println("Средняя зарплата составляет "+ avarage +" рублей");
    }
    public void printAllFio() {
        for (int i = 0; i < id; i++) {
            Employee employee = employees[i];
            System.out.println(i + "." + " ФИО сотрудника " + employee.getFIO());
        }
    }







    @Override
    public String toString() {
        return "StaffBook{" +
                "employees=" + Arrays.toString(employees) +
                ", id=" + id +
                '}';
    }
}