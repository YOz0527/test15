class Greeting implements Runnable {
    private String message;
    private int interval;
    private int repeats;

    public Greeting(String message, int interval, int repeats) {
        this.message = message;
        this.interval = interval;
        this.repeats = repeats;
    }

    public void run() {
        for (int i = 1; i <= repeats; i++) {
            System.out.println(message + " " + i);

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread hiThread = new Thread(new Greeting("Hello", 1000, 5));

        Thread byeThread = new Thread(new Greeting("Good bye", 2500, 5));

        hiThread.start();
        byeThread.start();
    }
}
