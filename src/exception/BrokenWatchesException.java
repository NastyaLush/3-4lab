package exception;

public class BrokenWatchesException extends RuntimeException{
    private String message;
    public BrokenWatchesException(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
