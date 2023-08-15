package src.phone;

public class AudibleState extends PhoneState {
    public AudibleState(Phone phone) {
        super(phone);
    }

    @Override
    public void ring() {
        System.out.println("Bildirim çaldi."); 
        totalRingCount++;
    }
    
}
