package lib;

import lib.computer_parts.*;

public class Director {
    public static <T>
    T getGamingComputer(Builder<T> builder) {
        return builder.addHDD(HDD.SEAGATE_3TB)
                    .addSSD(SSD.SAMSUNG_3TB)
                    .addRAM(RAM.DDR3_8GB)
                    .addRAM(RAM.DDR3_8GB)
                    .setCPU(CPU.INTEL_I7)
                    .setGPU(GPU.RTX_3080)
                    .build();
    }

    public static <T> 
    T getOfficeComputer(Builder<T> builder) {
        return builder.addHDD(HDD.SEAGATE_1TB)
                    .addSSD(SSD.SAMSUNG_1TB)
                    .addRAM(RAM.DDR3_4GB)
                    .addRAM(RAM.DDR3_4GB)
                    .setCPU(CPU.INTEL_I7)
                    .build();
    }
}
