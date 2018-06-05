package com.tydic.domain;

import java.math.BigDecimal;
import java.util.Date;


public class T_Logger {
    private String id;

    private String mid;

    private String type;

    private String name;

    private Date time;

    private String uname;

    private String ip;

    private String stype;

    private String bmbh;

    private String usfzh;

    private String sessionId;

    private String remark;

    private String exp;

    private String macaddress;

    private String shqk;

    private String czcs;

    private BigDecimal jgsl;

    private BigDecimal xhsj;

    private String jobid;

    private String modelid;

    private String cnt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
    }

    public String getBmbh() {
        return bmbh;
    }

    public void setBmbh(String bmbh) {
        this.bmbh = bmbh == null ? null : bmbh.trim();
    }

    public String getUsfzh() {
        return usfzh;
    }

    public void setUsfzh(String usfzh) {
        this.usfzh = usfzh == null ? null : usfzh.trim();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp == null ? null : exp.trim();
    }

    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress == null ? null : macaddress.trim();
    }

    public String getShqk() {
        return shqk;
    }

    public void setShqk(String shqk) {
        this.shqk = shqk == null ? null : shqk.trim();
    }

    public String getCzcs() {
        return czcs;
    }

    public void setCzcs(String czcs) {
        this.czcs = czcs == null ? null : czcs.trim();
    }

    public BigDecimal getJgsl() {
        return jgsl;
    }

    public void setJgsl(BigDecimal jgsl) {
        this.jgsl = jgsl;
    }

    public BigDecimal getXhsj() {
        return xhsj;
    }

    public void setXhsj(BigDecimal xhsj) {
        this.xhsj = xhsj;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid == null ? null : jobid.trim();
    }

    public String getModelid() {
        return modelid;
    }

    public void setModelid(String modelid) {
        this.modelid = modelid == null ? null : modelid.trim();
    }

    public String getCnt() {
        return cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt == null ? null : cnt.trim();
    }
}