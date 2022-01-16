package factory;

import peoples.Human;

public interface Factory {
    Human[] getEmployees();
    int getNumberOfEmployees();
}
