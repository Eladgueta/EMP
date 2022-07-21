public class Emplyee {

    String firstName;
    String lastName;
    double salary;
    int floor;
    int id;


    public Emplyee(String firstName, String lastName, double salary, int floor, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.floor = floor;
        this.id = id;
    }

    void riseUpSalary() {
        this.salary = this.salary + 2000;
    }

    void changeFloor(int newfloor) {
        this.floor = newfloor;
    }

    @Override
    public String toString() {
        return "Emplyee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", floor=" + floor +
                ", id=" + id +
                '}';
    }
}
