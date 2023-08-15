package src.phone;

public class VibrationState extends PhoneState {
    public VibrationState(Phone phone) {
        super(phone);
    }

    @Override
    public void ring() {
        System.out.println("Titresim çaldi.");
        totalRingCount++;
        if (totalRingCount >= 3) {
            this.phone.setState(PhoneStateEnum.AUDIBLE);
            totalRingCount = 0;
        }
    }
   
}