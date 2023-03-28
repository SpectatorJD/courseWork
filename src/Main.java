

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.addEmployee("Иванов Иван Иванович", "1", 10000);
        employee.addEmployee("Петров Иван Иванович", "2", 20000);
        employee.addEmployee("Сидоров Иван Иванович", "3", 30000);
        employee.addEmployee("Иванова Татьяна Ивановна", "4", 40000);
        employee.addEmployee("Петрова Наталья Петровна", "5", 50000);


        employee.printAllEmployee();
        employee.printAllSalary();
        employee.printMinSalary();
        employee.printMaxSalary();
        employee.printAverageSalary();
        employee.printAllFio();

    }
}








