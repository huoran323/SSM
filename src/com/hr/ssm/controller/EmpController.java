package com.hr.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hr.ssm.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	private EmpService empService; 
}
