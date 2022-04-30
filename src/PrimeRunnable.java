public class PrimeRunnable implements Runnable {
    int number;

    PrimeRunnable(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        try {
            if (number == 0 || number == 1) {
                System.out.println(number + " is not prime number");
            }
            if (number % 2 == 0) {
                System.out.println(number + " is prime number");

            } else
                System.out.println(number + " is prime number");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public static void main(String args[]) {

        Prime p1 = new Prime(9);
        Thread thread=new Thread(p1);
        thread.start();
    }
}
