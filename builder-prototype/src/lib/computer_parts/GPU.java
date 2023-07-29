package lib.computer_parts;

public class GPU extends ComputerPart {
    public static final GPU GTX_1080 = new GPU(500);
    public static final GPU GTX_1080_TI = new GPU(700);
    public static final GPU RTX_2080 = new GPU(800);
    public static final GPU RTX_2080_TI = new GPU(1000);
    public static final GPU RTX_3080 = new GPU(1200);

    public GPU(int cost) {
        super(cost);
    }
}
