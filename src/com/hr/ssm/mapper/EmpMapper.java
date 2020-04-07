package com.hr.ssm.mapper;

import java.util.List;

import com.hr.ssm.bean.Emp;

public interface EmpMapper {

	//获取所有的员工信息
	List<Emp> getAllEmp();
	
	//根据eid获取员工信息
	Emp getEmpByEid(String eid);
	
	//修改员工信息
	void updateEmp(Emp emp);
}
