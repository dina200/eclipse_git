package task15;

public class Accum {
    private int counter = 0;
    private static Accum a = new Accum();

    private Accum() { }

    public static Accum getAccum () {
        return a;
    }
    public void updateCounter(int add) {
        counter += add;
    }

    public int getCount() {
        return counter;
    }
}
