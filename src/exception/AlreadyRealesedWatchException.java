package exception;

public class AlreadyRealesedWatchException extends RuntimeException{
    private String message;
    public AlreadyRealesedWatchException(String message){
        super(message);
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
