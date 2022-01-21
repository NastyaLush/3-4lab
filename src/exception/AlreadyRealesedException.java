package exception;

public class AlreadyRealesedException extends RuntimeException{
    private String message;
    public AlreadyRealesedException(String message){
        super(message);
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}