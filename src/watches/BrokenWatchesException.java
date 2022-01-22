package watches;

public class BrokenWatchesException extends RuntimeException{
    private final static String message = "Нельзя узнать время...";
    public BrokenWatchesException(){
        super(message);
    }
    public String getMessage(){
        return message;
    }
    public void printMessage(){
        if(Math.random() <= 0.3) System.out.println("\u001B[31mУпс! Часы сломаны и время не показывают!\u001B[0m");
        else{
            if(Math.random() <= 0.5) System.out.println("\u001B[31mВот досада, часы-то сломались...\u001B[0m");
            else System.out.println("\u001B[31mМожет, сначала отдадим часы в ремонт?\u001B[0m");
        }
    }
}
