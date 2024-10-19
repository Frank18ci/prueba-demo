package com.example.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.model.Address;
import com.example.demo1.model.Employee;
import com.example.demo1.repository.IEmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	@Autowired
	private AddressService addressService;
	@Autowired
	private IEmployeeRepository employeeRepository;
	
	@Transactional
	public Employee addEmploye(Employee employee) throws Exception{
		Employee employeeSavedToDB = this.employeeRepository.save(employee);
		
		Address address = new Address();
		address.setId(123L);
		address.setAddress("Varanasi");
		address.setEmployee(employee);
		
		this.addressService.addAddress(address);
		return employeeSavedToDB;
	}
}
