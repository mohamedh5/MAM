package com.dmc.mam.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;

import org.springframework.stereotype.Component;

/**
 * this class hold all the data needed from ASTRA XML
 *
 * @author Automation/Mohamed
 * @version 1.0
 * @since 7/9/2018
 */
@Component
@Entity
public class Material {
	@Id
    private String id;
    private String name;
    @Column(name = "action" ,length = 1)
    private String operation;
    private String idec;
    private String jobId;
    private String recId;
    private String device;
    private String inaddr;
    private String outaddr;
    private String origInAddr;
    private String origOutAddr;
    //private int writeProtected;
    private String cat1;
    private String cat2;
    private String cat4;
    private String mainQC;
    
    @OneToMany(orphanRemoval = true ,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<MetaData> metadata;
    
    private LocalDateTime created;
   
    private LocalDateTime modified;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * @param operation the operation to set
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * @return the idec
     */
    public String getIdec() {
        return idec;
    }

    /**
     * @param idec the idec to set
     */
    public void setIdec(String idec) {
        this.idec = idec;
    }

    /**
     * @return the jobId
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * @param jobId the jobId to set
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * @return the recId
     */
    public String getRecId() {
        return recId;
    }

    /**
     * @param recId the recId to set
     */
    public void setRecId(String recId) {
        this.recId = recId;
    }

    /**
     * @return the device
     */
    public String getDevice() {
        return device;
    }

    /**
     * @param device the device to set
     */
    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * @return the inaddr
     */
    public String getInaddr() {
        return inaddr;
    }

    /**
     * @param inaddr the inaddr to set
     */
    public void setInaddr(String inaddr) {
        this.inaddr = inaddr;
    }

    /**
     * @return the outaddr
     */
    public String getOutaddr() {
        return outaddr;
    }

    /**
     * @param outaddr the outaddr to set
     */
    public void setOutaddr(String outaddr) {
        this.outaddr = outaddr;
    }

    /**
     * @return the origInAddr
     */
    public String getOrigInAddr() {
        return origInAddr;
    }

    /**
     * @param origInAddr the origInAddr to set
     */
    public void setOrigInAddr(String origInAddr) {
        this.origInAddr = origInAddr;
    }

    /**
     * @return the origOutAddr
     */
    public String getOrigOutAddr() {
        return origOutAddr;
    }

    /**
     * @param origOutAddr the origOutAddr to set
     */
    public void setOrigOutAddr(String origOutAddr) {
        this.origOutAddr = origOutAddr;
    }

//    /**
//     * @return the writeProtected
//     */
//    public int getWriteProtected() {
//        return writeProtected;
//    }
//
//    /**
//     * @param writeProtected the writeProtected to set
//     */
//    public void setWriteProtected(int writeProtected) {
//        this.writeProtected = writeProtected;
//    }

    /**
     * @return the cat1
     */
    public String getCat1() {
        return cat1;
    }

    /**
     * @param cat1 the cat1 to set
     */
    public void setCat1(String cat1) {
        this.cat1 = cat1;
    }

    /**
     * @return the cat2
     */
    public String getCat2() {
        return cat2;
    }

    /**
     * @param cat2 the cat2 to set
     */
    public void setCat2(String cat2) {
        this.cat2 = cat2;
    }

    /**
     * @return the cat4
     */
    public String getCat4() {
        return cat4;
    }

    /**
     * @param cat4 the cat4 to set
     */
    public void setCat4(String cat4) {
        this.cat4 = cat4;
    }

    /**
     * @return the mainQC
     */
    @XmlElement(name = "Crit3")
    public String getMainQC() {
        return mainQC;
    }

    /**
     * @param mainQC the mainQC to set
     */
    public void setMainQC(String mainQC) {
        this.mainQC = mainQC;
    }

    /**
     * @return the metadata
     */
    public List<MetaData> getMetadata() {
        return metadata;
    }

    /**
     * @param metadata the metadata to set
     */
    public void setMetadata(List<MetaData> metadata) {
        this.metadata = metadata;
    }

    /**
     * @return the created
     */
    public LocalDateTime getCreated() {
        return created;
    }

    /**
     * @param created the created to set
     */
    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    /**
     * @return the modified
     */
    public LocalDateTime getModified() {
        return modified;
    }

    /**
     * @param modified the modified to set
     */
    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }
}
