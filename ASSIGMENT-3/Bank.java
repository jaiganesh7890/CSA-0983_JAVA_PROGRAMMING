class Bank {
    double getRateOfInterest() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 8.0;
    }
}

class ICICI extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}

class AXIS extends Bank {
    @Override
    double getRateOfInterest() {
        return 9.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest() + "%");
        System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest() + "%");
        System.out.println("AXIS Rate of Interest: " + axis.getRateOfInterest() + "%");
    }
}
