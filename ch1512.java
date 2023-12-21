import java.util.Random;

class PrePaid extends Thread {
    private int sum = 200;

    public void run() {
        for (int i = 0; i < 5; i++) {
            int fee = new Random().nextInt(100); 
            if (sum > 10) {
                talk(fee);
            } else {
                System.out.println("餘額不足，無法打電話");
                break;
            }
        }
    }

    public synchronized void talk(int fee) {
        try {
            Thread.sleep(100); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sum -= fee;
        System.out.println("打了" + fee + "元，餘額" + sum + "元");
    }

    public static void main(String[] args) {
        PrePaid phone1 = new PrePaid();
        PrePaid phone2 = new PrePaid();
        PrePaid phone3 = new PrePaid();

        phone1.start();
        phone2.start();
        phone3.start();
    }
}
