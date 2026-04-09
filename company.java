class Employee {
    String name;
    double salary;

    Employee(String name) {
        this.name = name;
    }

    void calculateSalary() {
        System.out.println("Calculating salary...");
    }
}

// Derived class - Permanent Employee
class PermanentEmployee extends Employee {
    double basic = 30000;
    double bonus = 5000;

    PermanentEmployee(String name) {
        super(name);
    }

    void calculateSalary() {
        salary = basic + bonus;
        System.out.println(name + " (Permanent) Salary: " + salary);
    }
}

// Derived class - Contract Employee
class ContractEmployee extends Employee {
    int hours;
    double rate = 200;

    ContractEmployee(String name, int hours) {
        super(name);
        this.hours = hours;
    }

    void calculateSalary() {
        salary = hours * rate;
        System.out.println(name + " (Contract) Salary: " + salary);
    }
}


class company {
    public static void main(String[] args) {
        Employee e1 = new PermanentEmployee("Saran");
        Employee e2 = new ContractEmployee("Arun", 100);

        e1.calculateSalary();
        e2.calculateSalary();
    }
}
