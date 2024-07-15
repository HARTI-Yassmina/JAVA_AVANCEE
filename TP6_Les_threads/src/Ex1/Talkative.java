package Ex1;

public class Talkative implements Runnable {
    private int value;

    public Talkative(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + value);
        }
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            Talkative talkative = new Talkative(i + 1);

            threads[i] = new Thread(talkative);

            threads[i].start();
        }
    }
}

