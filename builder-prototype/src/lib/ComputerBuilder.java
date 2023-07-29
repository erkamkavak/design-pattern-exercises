package lib;

public class ComputerBuilder extends Builder<Computer> {
    public ComputerBuilder() {
    }

    public Computer build() {
        Computer computer = new Computer();
        computer.setSSDList(this.ssdList);
        computer.setHDDList(this.hddList);
        computer.setRAMList(this.ramList);
        computer.setCPU(this.cpu);
        computer.setGPU(this.gpu);
        return computer;
    }
}
