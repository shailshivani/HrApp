package com.nagarro.Hrlogin.service;



import java.util.*;

import com.nagarro.Hrlogin.model.Employee;

public interface HrService {
	String getUserByUsernameAndPassword(String username,String pass);

	Employee[] getEmployees(String username);

	Employee getEmployeeByEmployeeCode(long employeecode);

	void deleteEmployeeByEmployeeCode(long employeecode);

	void saveEmployee(Employee employee);
}
