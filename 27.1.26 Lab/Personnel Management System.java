class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeId;
    double salary;

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);   // calling Person constructor
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

class Main {
    public static void main(String[] args) {

        Employee e = new Employee("Krishnendu", 20, 101, 25000);

        e.displayEmployee();
    }
}

/*
Output:
Name: Krishnendu
Age: 20
Employee ID: 101
Salary: 25000.0
*/
