package com.hr.ssm.service;

import java.util.List;

import com.hr.ssm.bean.Emp;

public interface EmpService {

	List<Emp> getAllEmp();
	
	Emp getEmpByEid(String eid);
	
	void updateEmp(Emp emp);
}
