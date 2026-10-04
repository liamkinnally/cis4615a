// Rule 08. Visibility and Atomicity (VNA)
// VNA02-J. Ensure that compound operations on shared variables are atomic

final class R08_VNA02_J {
    private boolean flag = true;

    public void toggle() { // Unsafe
        flag = !flag;
    }

    public boolean getFlag() { // Unsafe
        return flag;
    }
}

