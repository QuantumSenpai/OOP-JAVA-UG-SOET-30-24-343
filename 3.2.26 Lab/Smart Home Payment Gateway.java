interface Electronic {
    void consumePower();
}

interface SmartFeature {
    void connectToInternet();
}

class SmartFridge implements Electronic, SmartFeature {

    int coolingLevel = 3;

    public void consumePower() {
        System.out.println("Power Consumption: " + (coolingLevel * 100) + " watts");
    }

    public void connectToInternet() {
        System.out.println("Connected to Internet with IP: 192.168.1.10");
    }

    public static void main(String[] args) {

        SmartFridge f = new SmartFridge();
        f.consumePower();
        f.connectToInternet();
    }
}

/*
Output:
Power Consumption: 300 watts
Connected to Internet with IP: 192.168.1.10
*/
