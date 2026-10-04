// Rule 10. Thread APIs (THI)
// THI00-J. Do not invoke Thread.run()

public final class R10_THI00_J implements Runnable {
    @Override public void run() {
        // ...
    }

    public static void main(String[] args) {
        R10_THI00_J foo = new R10_THI00_J();
        new Thread(foo).start();
    }
}