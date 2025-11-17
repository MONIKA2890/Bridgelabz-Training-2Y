public class BackgroundJob {
    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000); 
            } catch(Exception e) { }
            System.out.println("Background job finished!");
        };

        Thread worker = new Thread(task);
        worker.start();

        System.out.println("Main thread continues...");
    }
}

