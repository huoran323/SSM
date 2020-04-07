package com.hr.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.ssm.bean.Emp;
import com.hr.ssm.mapper.EmpMapper;
import com.hr.ssm.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpMapper mapper;

	@Override
	public List<Emp> getAllEmp() {
		
		return mapper.getAllEmp();
	}

	@Override
	public Emp getEmpByEid(String eid) {
		
		return mapper.getEmpByEid(eid);
	}

	@Override
	public void updateEmp(Emp emp) {
		mapper.updateEmp(emp);
	}
	
}
