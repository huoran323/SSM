package com.hr.ssm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hr.ssm.bean.Emp;
import com.hr.ssm.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	private EmpService empService; 
	
	@RequestMapping(value="/emps", method=RequestMethod.GET)
	public String getAllEmp(Map<String, Object> map) {
		
		List<Emp> empList = empService.getAllEmp();
		map.put("empList", empList);
		return "list";
	}
}
