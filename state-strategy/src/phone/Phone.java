package src.phone;

public class Phone {
    private PhoneState state;

    private AudibleState audibleState = new AudibleState(this);
    private VibrationState vibrationState = new VibrationState(this);
    private MutedState mutedState = new MutedState(this);

    public Phone() {
        this.state = new AudibleState(this);
    }

    public void setState(PhoneStateEnum state) {
        switch (state) {
            case AUDIBLE:
                this.state = this.audibleState;
                break;
            case VIBRATION:
                this.state = this.vibrationState;
                break;
            case MUTED:
                this.state = this.mutedState;
                break;
            default:
                this.state = this.audibleState;
                break;
        }
    }

    public void ring() {
        this.state.ring();
    }
}
