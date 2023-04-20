package com.bob.dashboard.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "attendance_device_summary")
public class AttendanceDeviceSummary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "CreatedTime")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date createdTime;

	@Column(name = "Status")
	private Integer status;

	@Column(name = "Reson")
	private String reason;

	@Column(name = "RecordCount")
	private Integer recordCount;

	@Column(name = "RecordFetchedStartTime")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date recordFetchedStartTime;

	@Column(name = "RecordFetchedEndTime")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date recordFetchedEndTime;

	@Column(name = "DeviceIP")
	private String deviceIP;

	@Column(name = "DeviceStatus")
	private Integer deviceStatus;

	@Column(name = "DeviceLastUpdatedTime")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date deviceLastUpdatedTime;

	@Column(name = "DeviceSerialId")
	private String deviceSerialId;

	public AttendanceDeviceSummary() {
	}

	public AttendanceDeviceSummary(Integer id, Date createdTime, Integer status, String reason, Integer recordCount,
			Date recordFetchedStartTime, Date recordFetchedEndTime, String deviceIP, Integer deviceStatus,
			Date deviceLastUpdatedTime, String deviceSerialId) {
		super();
		this.id = id;
		this.createdTime = createdTime;
		this.status = status;
		this.reason = reason;
		this.recordCount = recordCount;
		this.recordFetchedStartTime = recordFetchedStartTime;
		this.recordFetchedEndTime = recordFetchedEndTime;
		this.deviceIP = deviceIP;
		this.deviceStatus = deviceStatus;
		this.deviceLastUpdatedTime = deviceLastUpdatedTime;
		this.deviceSerialId = deviceSerialId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}

	public Date getRecordFetchedStartTime() {
		return recordFetchedStartTime;
	}

	public void setRecordFetchedStartTime(Date recordFetchedStartTime) {
		this.recordFetchedStartTime = recordFetchedStartTime;
	}

	public Date getRecordFetchedEndTime() {
		return recordFetchedEndTime;
	}

	public void setRecordFetchedEndTime(Date recordFetchedEndTime) {
		this.recordFetchedEndTime = recordFetchedEndTime;
	}

	public String getDeviceIP() {
		return deviceIP;
	}

	public void setDeviceIP(String deviceIP) {
		this.deviceIP = deviceIP;
	}

	public Integer getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(Integer deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public Date getDeviceLastUpdatedTime() {
		return deviceLastUpdatedTime;
	}

	public void setDeviceLastUpdatedTime(Date deviceLastUpdatedTime) {
		this.deviceLastUpdatedTime = deviceLastUpdatedTime;
	}

	public String getDeviceSerialId() {
		return deviceSerialId;
	}

	public void setDeviceSerialId(String deviceSerialId) {
		this.deviceSerialId = deviceSerialId;
	}

}
