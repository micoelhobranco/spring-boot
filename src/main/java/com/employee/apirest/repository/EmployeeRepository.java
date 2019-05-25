package com.employee.apirest.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employee.apirest.models.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {

	Employee findById(long id);		
	Employee findByCpf(int cpf);
	Employee findByNome(String nome);		
	Employee findByCargo(String cargo);
	Employee findByCreationdate(Date creationdate);
	Employee findByStatus(String status);

}
