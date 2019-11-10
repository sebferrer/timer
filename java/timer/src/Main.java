public class Main {

    public static void main(String[] args) {

        Timer timer = new Timer("seconds", 1000);

        timer.enable();

        while(timer.getTick() < 10) {

            timer.run();

            if(timer.nextTick()) {
                System.out.println(timer.getTick() + " seconds elapsed");
            }

        }

    }

}
