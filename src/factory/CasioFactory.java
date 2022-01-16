package factory;

import peoples.Human;
import watches.CasioGShock;

public class CasioFactory {
    private Human[] employees;
    private int numberOfEmployees = 0;
    public void addEmployee(Human employee){
        employees[numberOfEmployees] = employee;
        numberOfEmployees++;
    }
    public CasioGShock makeCasioGShock(){
        return CasioGShock.createCasioGShockInstance();
    }
    public String toString(){
        return "Фабрика Casio";
    }

    public Human[] getEmployees() {
        return employees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
