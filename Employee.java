class Employee {
    String name;
    int id;
    float salary;

    Employee(String name, int id, int salary) {
        this.salary = salary;
        this.id = id;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("The name of the Employee is "+ this.name);
        System.out.println("The name of the Employee is "+ this.id);
        System.out.println("The name of the Employee is "+ this.salary);
    }
    public static void main(String[] args) {
        Employee employee1 = new Employee("Kuntal", 001, 55000);
        Employee employee2 = new Employee("emplyee2", 002, 55000);

        employee1.displayDetails();
        employee2.displayDetails();
    }
}

// The name of the Employee is Kuntal
// The name of the Employee is 1
// The name of the Employee is 55000.0
// The name of the Employee is emplyee2
// The name of the Employee is 2
// The name of the Employee is 55000.0