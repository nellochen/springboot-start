package com.xiaofeng.utils.designpatterns.facade;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/20
 * @email chenxf84@gmail.com
 */


public class ComputerFacade extends AbstractComputerFacade{
    private static long BOOT_ADDRESS = 0;
    private static long BOOT_SECTOR = 0;
    private static int SECTOR_SIZE = 0;

    private CPU cpu;
    private HardDrive hardDrive;
    private Memory memory;

    public ComputerFacade() {
        cpu = new CPU();
        hardDrive = new HardDrive();
        memory = new Memory();
    }


    public void startComputer() {
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}
