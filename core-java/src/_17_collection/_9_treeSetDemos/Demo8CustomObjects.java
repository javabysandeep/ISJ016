package _17_collection._9_treeSetDemos;

import java.util.*;

public class Demo8CustomObjects {
    public static void main(String[] args) {
        class Employee {
            private int id;
            private String name;
            private int salary;

            public Employee() {
            }

            public Employee(int id, String name, int salary) {
                this.id = id;
                this.name = name;
                this.salary = salary;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getSalary() {
                return salary;
            }

            public void setSalary(int salary) {
                this.salary = salary;
            }

            @Override
            public String toString() {
                return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
            }

            @Override
            public boolean equals(Object object) {
                if (this == object) return true;
                if (object == null || getClass() != object.getClass()) return false;
                Employee employee = (Employee) object;
                return id == employee.id;
            }

            @Override
            public int hashCode() {
                return Objects.hashCode(id);
            }
        }
        //using generic we have specified to have the list of only employee objects


        Comparator<Employee> comparator = (e1, e2) -> e1.id - e2.id;

        Set<Employee> employeeSet = new TreeSet<>(comparator);

        Employee employee1 = new Employee(101, "Suraj", 10000);
        Employee employee2 = new Employee(12, "Rahul", 12000);
        Employee employee3 = new Employee(23, "Komal", 9000);
        Employee employee4 = new Employee(45, "Shital", 15000);
        Employee employee5 = new Employee(47, "Rutuja", 1200);
        Employee employee6 = new Employee(102, "Vaishnawi", 9000);
        Employee employee7 = new Employee(102, "Vaishnawi", 9000);
        Employee employee8 = new Employee(102, "Vaishnawi", 9000);

        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);
        employeeSet.add(employee6);
        employeeSet.add(employee7);
        employeeSet.add(employee8);

        employeeSet.forEach(System.out::println);


    }
}
