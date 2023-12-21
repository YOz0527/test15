class Test extends Thread {
    private String id;

    public Test(String str) {
        id = str;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(id + " " + i);
        }
        for (int j = 0; j < 100000000; j++);
        System.out.println(id + " Done");
    }

    public static void main(String[] args) {
        Test morning = new Test("Good morning");
        Test night = new Test("Good night");

        morning.start();
        night.start();

        Test morning1 = new Test("Good morning");
        morning1.start(); 
        new Test("Good morning").start(); 
        new Test("Good morning").start(); 

        Test night1 = new Test("Good night");
        night1.start(); 
    }
}
