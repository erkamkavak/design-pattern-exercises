package lib;

import java.util.ArrayList;

import lib.computer_parts.*;

public abstract class Builder<T> {
    T type;

    protected ArrayList<SSD> ssdList = new ArrayList<>();
    protected ArrayList<HDD> hddList = new ArrayList<>();
    protected ArrayList<RAM> ramList = new ArrayList<>();
    protected CPU cpu = new CPU(0);
    protected GPU gpu = new GPU(0);
    
    public Builder<T> addSSD(SSD ssd) {
        this.ssdList.add(ssd);
        return this;
    }

    public Builder<T> addHDD(HDD hdd) {
        this.hddList.add(hdd);
        return this;
    }

    public Builder<T> addRAM(RAM ram) {
        this.ramList.add(ram);
        return this;
    }

    public Builder<T> setCPU(CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    public Builder<T> setGPU(GPU gpu) {
        this.gpu = gpu;
        return this;
    }

    public abstract T build(); 
}
