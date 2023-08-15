package src;

import src.phone.*;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.ring();
        phone.setState(PhoneStateEnum.MUTED);

        for (int i = 0; i < 7; i++) {
            phone.ring();
        }
    }
}
