package exception;

public class EmployeesException extends RuntimeException{
    private String message;
    public EmployeesException(String message){
        super(message);
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}