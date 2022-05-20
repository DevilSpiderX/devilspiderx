package devilSpiderX.server.webServer.service.information;

import java.text.DecimalFormat;

@SuppressWarnings("UnusedReturnValue")
public class CPU {
    /**
     * CPU名
     */
    private String name;
    /**
     * CPU物理核心数
     */
    private int physicalNum;
    /**
     * CPU逻辑核心数
     */
    private int logicalNum;
    /**
     * CPU使用率
     */
    private double usedRate;
    /**
     * 是否是64位处理器
     */
    private boolean is64bit;
    /**
     * CPU温度
     */
    private double cpuTemperature;

    public String getName() {
        return name;
    }

    public CPU setName(String name) {
        this.name = name;
        return this;
    }

    public int getPhysicalNum() {
        return physicalNum;
    }

    public CPU setPhysicalNum(int physicalNum) {
        this.physicalNum = physicalNum;
        return this;
    }

    public int getLogicalNum() {
        return logicalNum;
    }

    public CPU setLogicalNum(int logicalNum) {
        this.logicalNum = logicalNum;
        return this;
    }

    public double getUsedRate() {
        return usedRate;
    }

    public CPU setUsedRate(double usedRate) {
        this.usedRate = usedRate;
        return this;
    }

    public boolean is64bit() {
        return is64bit;
    }

    public CPU set64bit(boolean is64bit) {
        this.is64bit = is64bit;
        return this;
    }

    public double getCpuTemperature() {
        return cpuTemperature;
    }

    public CPU setCpuTemperature(double cpuTemperature) {
        this.cpuTemperature = cpuTemperature;
        return this;
    }

    public String getFreePercent() {
        return new DecimalFormat("#.##%").format(1 - usedRate);
    }

    public String getUsedPercent() {
        return new DecimalFormat("#.##%").format(usedRate);
    }

    @Override
    public String toString() {
        return "CPU{" +
                "name='" + name + '\'' +
                ", physicalNum=" + physicalNum +
                ", logicalNum=" + logicalNum +
                ", usedRate=" + usedRate +
                ", is64bit=" + is64bit +
                ", cpuTemperature=" + cpuTemperature +
                '}';
    }
}
