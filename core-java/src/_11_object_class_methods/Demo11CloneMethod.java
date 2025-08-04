package _11_object_class_methods;

public class Demo11CloneMethod {
    public static void main(String[] args) throws CloneNotSupportedException {
        class Address implements Cloneable{
            String street;
            String city;
            String state;
            String zip;
            String country;

            @Override
            public String toString() {
                return "Address{" +
                        "street='" + street + '\'' +
                        ", city='" + city + '\'' +
                        ", state='" + state + '\'' +
                        ", zip='" + zip + '\'' +
                        ", country='" + country + '\'' +
                        '}';
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }
        class Employee implements Cloneable {
            int id;
            int salary;
            String name;
            Address address;

            @Override
            public String toString() {
                return "Employee{" +
                        "id=" + id +
                        ", salary=" + salary +
                        ", name='" + name + '\'' +
                        ", address=" + address +
                        '}';
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                Employee cloneEmp = (Employee) super.clone();

                //deep cloning
                cloneEmp.address = (Address) address.clone();
                return cloneEmp;
            }
        }

        Address address = new Address();
        address.street = "Some street";
        address.city = "Some city";
        address.state = "Some state";
        address.zip = "Some zip";
        address.country = "Some country";

        Employee employee = new Employee();
        employee.salary = 10000;
        employee.name = "John Smith";
        employee.address = address;
        employee.id = 101;


        Employee employee2 = (Employee)employee.clone();
        employee2.address.city="Pune";
        System.out.println(employee);
        System.out.println(employee2);
    }
}
