package kr.co.cesco.econtract.test.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.co.cesco.econtract.test.domain.BrandReq;
import kr.co.cesco.econtract.test.domain.Customer;
import kr.co.cesco.econtract.test.domain.CustomerReq;
import kr.co.cesco.econtract.test.domain.CustomerRes;
import kr.co.cesco.econtract.test.domain.Employee;
import kr.co.cesco.econtract.test.domain.EmployeeReq;
import kr.co.cesco.econtract.test.domain.EmployeeRes.ResultDto;
import kr.co.cesco.econtract.test.domain.Order;
import kr.co.cesco.econtract.test.domain.ProductDto;
import kr.co.cesco.econtract.test.dto.PeopleDto;
import kr.co.cesco.econtract.test.dto.Person;
import kr.co.cesco.econtract.test.dto.StateDto;
import kr.co.cesco.econtract.test.mapper.EmpMapper;
import kr.co.cesco.econtract.test.mapper.SalesMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestService {
	
	private final EmpMapper empRepository;
	private final SalesMapper salesRepository;
	private final ObjectMapper objectMapper;
	
	// Select =============================================================
	
	public List<Employee> findEmps() {
		return empRepository.findEmps();
	}
	
	public List<ResultDto> getEmployees(EmployeeReq.SearchDto searchDto) {
		return empRepository.findEmployees(searchDto);
	}
	
	public List<Customer> findCustomers() {
		return salesRepository.findCustomers();
	}
	
	
	public List<Customer> findCustomers2() {
		return salesRepository.findCustomers2();
	}
	
	public List<Map<String, Object>> findCustomers3() {
		return salesRepository.findCustomers3();
	}

	public List<Customer> findCustomers4() {
		
		List<Customer> customers = new ArrayList<>();
		List<?> customerMaps = salesRepository.findCustomers3(); // from hashmap
		
		customerMaps.forEach(map -> {
			Customer customer = objectMapper.convertValue(map, Customer.class);
			customers.add(customer);
		});
		
		return customers; // to pojo
	}
	
	public List<Customer> getCustomersByState(String state) {
		return salesRepository.findCustomersByState(state);
	}
	
	public List<Customer> getCustomersByState2(String state) {
		return salesRepository.getCustomersByState2(state);
	}
	
	public List<Customer> getCustomersByState3(StateDto state) {
		return salesRepository.getCustomersByState3(state);
	}
	
	public List<CustomerRes.CustomerDto> getCustomersByState4(CustomerReq.SearchDto searchDto) {
		return salesRepository.getCustomersByState4(searchDto);
	}
	
	
	public void addPerson(Person person) {
		salesRepository.addPerson(person);;
	}
	
	
	public void addPerson2(PeopleDto.PersonDto person) {
		salesRepository.addPerson2(person);;
	}
	
	public void addPerson3(PeopleDto.PersonDto person) {
		salesRepository.addPerson3(person);;
	}
	
	public Person getPerson(Integer id) {
		return salesRepository.getPerson(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Insert =============================================================
	
	public int createBrand(BrandReq.CreateDto createDto) {
		return salesRepository.insertBrand(createDto);
	}





	
	
	

}
