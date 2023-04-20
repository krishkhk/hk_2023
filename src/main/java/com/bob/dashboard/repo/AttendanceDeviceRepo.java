package com.bob.dashboard.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.bob.dashboard.entity.AttendanceDeviceSummary;

public interface AttendanceDeviceRepo extends JpaRepository<AttendanceDeviceSummary, Integer> {

	Page<AttendanceDeviceSummary> findAll(Pageable pageable);
	
	
	@Procedure(name="attendance_summary")
	public List<AttendanceDeviceSummary> getAttendanceSummary();

}
