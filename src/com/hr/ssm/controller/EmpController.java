package com.hr.ssm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hr.ssm.bean.Emp;
import com.hr.ssm.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	private EmpService empService; 
	
	@RequestMapping(value="/emps/{pageNum}", method=RequestMethod.GET)
	public String getAllEmp(Map<String, Object> map, @PathVariable("pageNum")Integer pageNum) {
		
		PageHelper.startPage(pageNum, 2);
		List<Emp> empList = empService.getAllEmp();
		PageInfo<Emp> pageInfo = new PageInfo<>(empList, 5);
		map.put("empList", empList);
		return "list";
	}
}
