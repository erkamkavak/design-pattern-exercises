package src.phone;

public class MutedState extends PhoneState {
    public MutedState(Phone phone) {
        super(phone);
    }

    @Override
    public void ring() {
        System.out.println("Ekranda bildirim cikti.");
        totalRingCount++;
        if (totalRingCount >= 3) {
            this.phone.setState(PhoneStateEnum.VIBRATION);
            totalRingCount = 0;
        }
    }
}
