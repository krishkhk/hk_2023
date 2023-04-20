package com.bob.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bob.dashboard.entity.AttendanceDeviceSummary;
import com.bob.dashboard.repo.AttendanceDeviceRepo;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
	
	@Autowired
	private AttendanceDeviceRepo attendanceRepo;
	 
	 
	 @GetMapping("/list")
	    public ModelAndView showListPage() {
	        java.util.List<AttendanceDeviceSummary> attendanceDev = attendanceRepo.findAll();
	        ModelAndView mav = new ModelAndView("attendanceDevList");
	        mav.addObject("attendanceDev", attendanceDev);
	        mav.setViewName("dashboard");
	        return mav;
	    }
	 
	 
	 
	 
	 

}
