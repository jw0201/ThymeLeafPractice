package com.jiwon.thymeleafpractice.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CQ_MANAGER_PK implements Serializable {

    private String date;
    private String srcIP;
    private String dstIp;
    private String dstPort;
    private String deviceIp;

    public String getSrcIP() {
        return srcIP;
    }

    public void setSrcIP(String srcIP) {
        this.srcIP = srcIP;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDstIp() {
        return dstIp;
    }

    public void setDstIp(String dstIp) {
        this.dstIp = dstIp;
    }

    public String getDstPort() {
        return dstPort;
    }

    public void setDstPort(String dstPort) {
        this.dstPort = dstPort;
    }

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CQ_MANAGER_PK that = (CQ_MANAGER_PK) o;

        if (!srcIP.equals(that.srcIP)) return false;
        if (!date.equals(that.date)) return false;
        if (!dstIp.equals(that.dstIp)) return false;
        if (!dstPort.equals(that.dstPort)) return false;
        return deviceIp.equals(that.deviceIp);
    }

    @Override
    public int hashCode() {
        int result = srcIP.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + dstIp.hashCode();
        result = 31 * result + dstPort.hashCode();
        result = 31 * result + deviceIp.hashCode();
        return result;
    }
}
