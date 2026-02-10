interface RemoteControl {
    void powerOn();
    void powerOff();
    void volumeUp();
}

class Television implements RemoteControl {
    public void powerOn() {
        System.out.println("TV screen is glowing");
    }

    public void powerOff() {
        System.out.println("TV is turned off");
    }

    public void volumeUp() {
        System.out.println("TV volume increased");
    }
}

class AudioSystem implements RemoteControl {
    public void powerOn() {
        System.out.println("Audio speakers are booming");
    }

    public void powerOff() {
        System.out.println("Audio system turned off");
    }

    public void volumeUp() {
        System.out.println("Audio volume increased");
    }
}

class Main {
    public static void main(String[] args) {

        RemoteControl r;

        r = new Television();
        r.powerOn();

        r = new AudioSystem();
        r.powerOn();
    }
}

/*
Output:
TV screen is glowing
Audio speakers are booming
*/
