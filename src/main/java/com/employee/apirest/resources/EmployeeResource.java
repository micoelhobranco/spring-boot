package com.employee.apirest.resources;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.apirest.repository.EmployeeRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.employee.apirest.models.Employee;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Employees")
@CrossOrigin(origins = "*")

public class EmployeeResource {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
	@ApiOperation(value = "Método para retorno da lista de todos funcionários. Não recebe nenhum argumento como parâmetro.")
	public List<Employee> listaEmployees(){
		return employeeRepository.findAll();		
	}

	@GetMapping("/employee/{id}")
	@ApiOperation(value = "Método para retorno de um unico funcionario(a). Recebe o ID como parâmetro.")
	public Employee listaEmployeeSingle(@PathVariable(value="id") long id){
		return employeeRepository.findById(id);		
	}	
	
	@GetMapping("/employees/cpf/{cpf}")
	@ApiOperation(value = "Método para retorno de um unico funcionario(a). Recebe o CPF como parâmetro. ")
	public Employee listaEmployeeCpf(@PathVariable(value="cpf") int cpf){
		return employeeRepository.findByCpf(cpf);		
	}	
	
	@GetMapping("/employee/nome/{nome}")
	@ApiOperation(value = "Método para retorno da lista de funcionário(s) através do parâmetro nome.")
	public Employee listaEmployeeNome(@PathVariable(value="nome") String nome){
		return employeeRepository.findByNome(nome);		
		
	}
	
	@GetMapping("/employee/creationdate/{creationdate}")
	@ApiOperation(value = "Método para retorno da lista de funcionário(s) através da data de cadastro.")
	public Employee listaEmployeeCreationdate(@PathVariable(value="creationdate") Date creationdate){
		return employeeRepository.findByCreationdate(creationdate);		
		
	}
	
	@GetMapping("/employee/cargo/{cargo}")
	@ApiOperation(value = "Método para retorno da lista de funcionário(s) através do parâmetro cargo.")
	public Employee listaEmployeeCargo(@PathVariable(value="cargo") String cargo){
		return employeeRepository.findByCargo(cargo);		
		
	}
	
	@GetMapping("/employee/status/{status}")
	@ApiOperation(value = "Método para retorno da lista de funcionário(s) através do parâmetro status (ATIVO ou BLOQUEADO).")
	public Employee listaEmployeeStatus(@PathVariable(value="status") String status){
		return employeeRepository.findByStatus(status);		
		
	}
	
	@PostMapping("/employee")
	@ApiOperation(value = "Método que insere um funcionario(a).")
	public Employee salveEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@DeleteMapping("/employee")
	@ApiOperation(value = "Método que exclui o cadastro de um funcionario(a).")
	public void deleteEmployee(@RequestBody Employee employee) {
		employeeRepository.delete(employee);
	}
		
		@PutMapping("/employee")
	@ApiOperation(value = "Método que atualiza o cadastro de um funcionario(a).")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}	
	
}
