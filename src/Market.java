import java.util.ArrayList;

class Market1 {
    private  ArrayList<String> fruits = new ArrayList<>();
    private int capacity;

    Market1(int capacity){

       
        this.capacity=capacity;

    }
    synchronized void buy(String fruit) {
        while(true) {
            if (!isEmpty(fruit)) {
                System.out.println(Thread.currentThread().getName() + "  " + fruit + " is Empty ");

                try {
                    wait();
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
            if (isEmpty(fruit)) {
                System.out.println(Thread.currentThread().getName() + "  " + fruit + " is going to buy");
                fruits.remove(fruit);
                System.out.println(Thread.currentThread().getName() + "  " + fruit + " is bought  ");
                notifyAll();
                break;
            }

        }








    }




    synchronized void provides(String fruit) {
        while (true) {
            if (isMarketFull()) {
                System.out.println(Thread.currentThread().getName() + "  " + "market  is full now which the capacity is   " + capacity + ", market can't accept more " + fruit);
                try {
                    wait();
                } catch (Exception e) {
                }
            }

            System.out.println(Thread.currentThread().getName() + "  " + fruit + " going to provided");
            fruits.add(fruit);
            System.out.println(Thread.currentThread().getName() + "  " + fruit + " is provided now  ");
            notifyAll();
            break;

        }
    }
    synchronized Boolean  isMarketFull(){
        if (fruits.size()==capacity)
            return true;
        return false;
    }
    synchronized Boolean isEmpty(String fruit){
        return fruits.contains(fruit);
    }

}







public class Market {
    public static void main(String[] args) {
        String apple = new String("apple");
        String orange = new String("orange");
        String grape = new String("grape");
        String watermelon = new String("watermelon");


        Market1 said = new Market1(3);

        new Thread() {
            @Override
            public void run() {
                said.provides(orange);
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                said.provides(orange);
            }
        }.start();
        new Thread() {
            @Override
            public void run() {

                said.buy(apple);
            }
        }.start();
        Thread t2= new Thread() {
            @Override
            public void run() {

                said.provides(apple);
            }
        };
        t2.setPriority(10);
        t2.setName("apple PROVIDE");
        t2.start();
        new Thread() {
            @Override
            public void run() {

                said.provides(watermelon);
            }
        }.start();
        new Thread() {
            @Override
            public void run() {

                said.provides(apple);
            }
        }.start();
        new Thread() {
            @Override
            public void run() {

                said.provides(apple);
            }}.start();


            Thread t = new Thread() {
                @Override
                public void run() {

                    said.buy(apple);
                }
            };
       t.setPriority(6);
       t.setName("APPPLE BUY ");
       t.start();


        }
}
