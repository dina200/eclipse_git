package task15;

public class ThreadOne implements Runnable{
    @Override
    public void run() {
        Accum a = Accum.getAccum();
        for(int x = 0; x < 98; x++) {
            a.updateCounter(1000);
            try {
                Thread.sleep(50);
            }catch (InterruptedException ex) { }
        }
        System.out.println("one " + a.getCount());
    }
}
