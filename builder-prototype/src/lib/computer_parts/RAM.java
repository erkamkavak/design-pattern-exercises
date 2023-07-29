package lib.computer_parts;

public class RAM extends ComputerPart {
    public static final RAM DDR3_4GB = new RAM(1000);
    public static final RAM DDR3_8GB = new RAM(2000);
    public static final RAM DDR4_4GB = new RAM(1500);
    public static final RAM DDR4_8GB = new RAM(2500);

    RAM(int cost) {
        super(cost);
    }
}
