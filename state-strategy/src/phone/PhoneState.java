package src.phone;

public abstract class PhoneState {
    protected Phone phone;
    protected int totalRingCount;

    public PhoneState(Phone phone) {
        this.phone = phone;
        this.totalRingCount = 0;
    }
    
    abstract public void ring();
}
