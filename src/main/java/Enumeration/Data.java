package Enumeration;

public enum Data {
    General_Manager(41000),
    Chief_Manager(80000),
    Senior_Manager(90000),
    Manager(95000),
    Clerk(30000);

    final int salary;

    Data(int salary) {
        this.salary = salary;
    }
    public int perHour(){
        return salary/240;
    }
}
