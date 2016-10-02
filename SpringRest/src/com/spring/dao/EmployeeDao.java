package com.spring.dao;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.model.Employee;

@Repository
public class EmployeeDao {

	/**
	 * @return
	 */
	public List<Employee> getListOfEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		Connection connection = ConnectionsUtils.getConnection();
		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement
						.executeQuery("select * from employee");
				while (resultSet.next()) {
					Employee employee = new Employee();
					employee.setId(resultSet.getInt("ID"));
					employee.setDeptId(resultSet.getInt("DEPT_ID"));
					employee.setName(resultSet.getString("NAME"));
					employee.setSalary(resultSet.getDouble("SALARY"));
					String hobbies = resultSet.getString("hibbies");
					if(hobbies != null) {
						employee.setHobbies(hobbies.split(","));
					}
					list.add(employee);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

}
