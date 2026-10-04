// Rule 08. Visibility and Atomicity (VNA)
// VNA02-J. Ensure that compound operations on shared variables are atomic

final class R08_VNA02_J {
    private boolean flag = true;

    public synchronized void toggle() {
        flag ^= true; // Same as flag = !flag;
    }

    public synchronized boolean getFlag() {
        return flag;
    }
}
