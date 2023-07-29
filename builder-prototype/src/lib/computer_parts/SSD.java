package lib.computer_parts;

public class SSD extends ComputerPart {
    public static final SSD SAMSUNG_1TB = new SSD(3000);
    public static final SSD SAMSUNG_2TB = new SSD(2500);
    public static final SSD SAMSUNG_3TB = new SSD(2000);
    public static final SSD WD_1TB = new SSD(3000);
    public static final SSD WD_2TB = new SSD(2500);

    SSD(int cost) {
        super(cost);
    }
}
