package lib.computer_parts;

public class CPU extends ComputerPart {
    public static final CPU INTEL_I7 = new CPU(3000);
    public static final CPU INTEL_I5 = new CPU(2500);
    public static final CPU INTEL_I3 = new CPU(2000);
    public static final CPU AMD_RYZEN_7 = new CPU(3000);
    public static final CPU AMD_RYZEN_5 = new CPU(2500);

    public CPU(int cost) {
        super(cost);
    }
}
