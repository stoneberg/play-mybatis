package kr.co.cesco.econtract.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.cesco.econtract.test.domain.Customer;
import kr.co.cesco.econtract.test.domain.CustomerReq;
import kr.co.cesco.econtract.test.dto.StateDto;
import kr.co.cesco.econtract.test.service.TestService;
import kr.co.cesco.econtract.web.users.domain.Employee;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/test")
@RestController
public class TestApiController {
	
	private final TestService testService;
	
    @GetMapping("employees")
    public List<Employee> getEmps() {
    	return testService.findEmps();
    }
    
    @GetMapping("customers")
    public List<Customer> getCustomers() {
    	return testService.findCustomers();
    }
    
    @GetMapping("customers2")
    public List<Customer> getCustomers2() {
    	return testService.findCustomers2();
    }
    
    @GetMapping("customers3")
    public List<?> getCustomers3() {
    	return testService.findCustomers3();
    }
    
    @GetMapping("customers4")
    public List<?> getCustomers4() {
    	return testService.findCustomers4();
    }
    
    @GetMapping("customers/state/{state}")
    public List<?> getCustomersByState(@PathVariable("state") String state) {
    	return testService.getCustomersByState(state);
    }
    
    @GetMapping("customers2/state/{state}")
    public List<?> getCustomersByState2(@PathVariable("state") String state) {
    	return testService.getCustomersByState2(state);
    }
    
    @PostMapping("customers3/state")
    public List<?> getCustomersByState3(@RequestBody StateDto state) {
    	return testService.getCustomersByState3(state);
    }
    
    @PostMapping("customers4/state")
    public List<?> getCustomersByState4(@RequestBody CustomerReq.SearchDto searchDto) {
    	return testService.getCustomersByState4(searchDto);
    }
    
    
}
