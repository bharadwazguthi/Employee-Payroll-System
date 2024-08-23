public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Fulltime a = new Fulltime();
        Parttime b = new Parttime();
        employee.setName("Apple");
        employee.setLocation("California");
        a.setName("Bharadwaz");
        a.setSalary(50000);
        b.setName("Arjun");
        b.setSalary(55);
        System.out.println("Company Name is : "+ employee.getName());
        System.out.println("Company Location is : "+ employee.getLocation());
        System.out.println("Employee 1 Name is : " + a.getName());
        System.out.println("Employee 1 Salary is : " + a.getSalary());
        System.out.println("Employee 2 Name is : " + b.getName());
        System.out.println("Employee 2 Salary is : " + b.getSalary());
        
    }
}