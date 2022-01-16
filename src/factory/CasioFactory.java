package factory;

import exception.EmployeesException;
import peoples.Human;
import watches.CasioGShock;

public class CasioFactory implements Factory, CasioGShockProduction{
    private Human[] employees = new Human[0];
    private int numberOfEmployees = 0;
    public void addEmployee(Human employee){
        Human[] newEmployees = new Human[numberOfEmployees+1];
        for(int i = 0; i < numberOfEmployees; i++)
            newEmployees[i] = employees[i];
        newEmployees[numberOfEmployees] = employee;
        employees = newEmployees;
        numberOfEmployees++;
    }
    public void deleteEmployee(Human employee){
        if(numberOfEmployees == 0) throw new EmployeesException("Нельзя уволить сотрудника! Он не работает тут..");
        Human[] newEmployees = new Human[numberOfEmployees-1];
        int j = -1;
        for(Human e:employees){
            if(e.equals(employee)) j++;
        }
        if(j==-1) throw new EmployeesException("Нельзя уволить сотрудника! Он не работает тут..");
        for(int i = 0; i < numberOfEmployees-1; i++){
            if(employees[i].equals(employee)) {
                j++;
                continue;
            }
            newEmployees[i] = employees[j];
            j++;
        }
        employees = newEmployees;
        numberOfEmployees--;
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
