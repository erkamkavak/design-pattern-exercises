package lib.computer_parts;

public class HDD extends ComputerPart {
    public static final HDD SEAGATE_1TB = new HDD(3000);
    public static final HDD SEAGATE_2TB = new HDD(2500);
    public static final HDD SEAGATE_3TB = new HDD(2000);
    public static final HDD WD_1TB = new HDD(3000);
    public static final HDD WD_2TB = new HDD(2500);
    public static final HDD WD_3TB = new HDD(2000);

    HDD(int cost) {
        super(cost);
    }
}
