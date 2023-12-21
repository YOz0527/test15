class Sub implements Runnable {
    private int n;
    private int sum = 1;

    public Sub(int a) {
        n = a;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println("Result for n = " + n + ": " + sum);
    }

    public static void main(String[] args) {
        Sub sub5 = new Sub(5);
        Thread thread5 = new Thread(sub5);
        thread5.start();

        Sub sub10 = new Sub(10);
        Thread thread10 = new Thread(sub10);
        thread10.start();
    }
}
