package com.hr.ssm.mapper;

import java.util.List;

import com.hr.ssm.bean.Dept;

public interface DeptMapper {

	//获取所有的部门信息
	List<Dept> getAllDept();
}
