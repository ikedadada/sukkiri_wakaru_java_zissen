package p2.p2_8_challenge.c2_2;

public enum KeyType {
    PADLOCK, BUTTON, DIAL, FINGER;

    public int getRequiredTryCount() {
        switch (this) {
            case PADLOCK:
                return 1024;
            case BUTTON:
                return 10000;
            case DIAL:
                return 30000;
            case FINGER:
                return 1000000;
            default:
                return 0;
        }
    }
}