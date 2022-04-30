class PrintMessage  extends Thread{
    String printedMessage;
    public void run() {
        try {
            for(int i=0;i<10;i++) {
                sleep(5000);
                System.out.println("It's been 5 seconds");
            }
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}

public class Timer{
    public static void main(String[] args) {
        PrintMessage m1=new PrintMessage();
        m1.start();
    }


}

