package lib;

import lib.computer_parts.*;

public class ComputerValueBuilder extends Builder<Integer> {
    public ComputerValueBuilder() {
    }

    public Integer build() {
        Integer cost = 0; 
        for (SSD ssd : this.ssdList) {
            cost += ssd.getCost();
        }
        for (HDD hdd : this.hddList) {
            cost += hdd.getCost();
        }
        for (RAM ram : this.ramList) {
            cost += ram.getCost();
        }
        cost += this.cpu.getCost();
        cost += this.gpu.getCost();
        return cost;
    }
}
