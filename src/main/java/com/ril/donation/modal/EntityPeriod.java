package com.ril.donation.modal;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "DT_EntityMaster")
public class EntityPeriod 
{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EntityID", nullable = false)
    private Integer entityId;

    @Column(name = "EntityCode", nullable = false)
    private String entityCode;

    @Column(name = "PeriodCode", nullable = false)
    private String periodCode;

    @Column(name = "EntityPeriodStatus", nullable = false)
    private String entityPeriodStatus;

    @Column(name = "EntityDescription")
    private String entityDescription;

    @Column(name = "ApplicableFrom", nullable = false)
    private LocalDate applicableFrom;

    @Column(name = "ApplicableTo")
    private LocalDate applicableTo;

    @Column(name = "IsActive")
    private boolean isActive;

    @Column(name = "IsDelete")
    private boolean isDelete;

    @Column(name = "CreatedBy", nullable = false)
    private String createdBy;

    @Column(name = "CreatedOn", nullable = false)
    @CreationTimestamp
    private LocalDateTime CreatedOn;

    @Column(name = "UpdatedBy")
    private String updatedBy;

    @Column(name = "UpdatedOn")
    @UpdateTimestamp
    private LocalDateTime updatedOn;

    @Column(name = "Timestamp")
    @CreationTimestamp
    private LocalDateTime timestamp;

	public Integer getEntityId() {
		return entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public String getEntityCode() {
		return entityCode;
	}

	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	public String getPeriodCode() {
		return periodCode;
	}

	public void setPeriodCode(String periodCode) {
		this.periodCode = periodCode;
	}

	public String getEntityPeriodStatus() {
		return entityPeriodStatus;
	}

	public void setEntityPeriodStatus(String entityPeriodStatus) {
		this.entityPeriodStatus = entityPeriodStatus;
	}

	public String getEntityDescription() {
		return entityDescription;
	}

	public void setEntityDescription(String entityDescription) {
		this.entityDescription = entityDescription;
	}

	public LocalDate getApplicableFrom() {
		return applicableFrom;
	}

	public void setApplicableFrom(LocalDate applicableFrom) {
		this.applicableFrom = applicableFrom;
	}

	public LocalDate getApplicableTo() {
		return applicableTo;
	}

	public void setApplicableTo(LocalDate applicableTo) {
		this.applicableTo = applicableTo;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedOn() {
		return CreatedOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		CreatedOn = createdOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
    
	
}
