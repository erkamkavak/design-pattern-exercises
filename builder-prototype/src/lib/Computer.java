package lib;

import java.util.ArrayList;

import lib.computer_parts.*;

public class Computer {
    ArrayList<SSD> ssdList = new ArrayList<>();
    ArrayList<HDD> hddList = new ArrayList<>();
    ArrayList<RAM> ramList = new ArrayList<>();
    CPU cpu;
    GPU gpu;

    String os; 

    public void setSSDList(ArrayList<SSD> ssdList) {
        this.ssdList = ssdList;
    }

    public void setHDDList(ArrayList<HDD> hddList) {
        this.hddList = hddList;
    }

    public void setRAMList(ArrayList<RAM> ramList) {
        this.ramList = ramList;
    }

    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    public void setGPU(GPU gpu) {
        this.gpu = gpu;
    }

    public void setOS(String os) {
        this.os = os;
    }
}