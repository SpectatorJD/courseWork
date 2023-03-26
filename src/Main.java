public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.addEmployee("Иванов Иван Иванович", "1", 22000);
        employee.addEmployee("Петров Иван Иванович", "2", 32000);
        employee.addEmployee("Сидоров Иван Иванович", "3", 43000);
        employee.addEmployee("Иванова Татьяна Ивановна", "4", 40000);
        employee.addEmployee("Петрова Наталья Петровна", "5", 20000);


        employee.printAllEmployee();







    }
}