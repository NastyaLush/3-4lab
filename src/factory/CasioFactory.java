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
}
