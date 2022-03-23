package com.jiwon.thymeleafpractice.domain;

import javax.persistence.*;

@Entity
@IdClass(CQ_MANAGER_PK.class)
@Table(name = "CQ_MANAGER")
public class Filter {

    @Id
    @Column(name="date")
    private String date;
    @Id
    @Column(name="src_ip")
    private String srcIP;
    @Id
    @Column(name="dst_ip")
    private String dstIp;
    @Id
    @Column(name="dst_port")
    private String dstPort;
    @Id
    @Column(name="device_ip")
    private String deviceIp;

    @Override
    public String toString() {
        return "Filter{" +
                "date='" + date + '\'' +
                ", srcIP='" + srcIP + '\'' +
                ", dstIp='" + dstIp + '\'' +
                ", dstPort='" + dstPort + '\'' +
                ", deviceIp='" + deviceIp + '\'' +
                '}';
    }
}
