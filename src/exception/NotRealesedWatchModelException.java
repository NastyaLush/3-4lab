package exception;

public class NotRealesedWatchModelException extends RuntimeException{
    private String message;
    public NotRealesedWatchModelException(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}