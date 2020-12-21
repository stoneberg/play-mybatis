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
import kr.co.cesco.econtract.test.domain.Employee;
import kr.co.cesco.econtract.test.domain.EmployeeReq;
import kr.co.cesco.econtract.test.domain.EmployeeRes.ResultDto;
import kr.co.cesco.econtract.test.dto.StateDto;
import kr.co.cesco.econtract.test.service.TestService;
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
    
    @PostMapping("employees2")
    public List<ResultDto> getEmployees(@RequestBody EmployeeReq.SearchDto searchDto) {
    	return testService.getEmployees(searchDto);
    }
    
    @GetMapping("customers")
    public List<Customer> getCustomers() {
    	log.info("@customers===================>");
    	return testService.findCustomers();
    }
    
    // call procedure
    @GetMapping("customers2")
    public List<Customer> getCustomers2() {
    	log.info("@customers2===================>");
    	return testService.findCustomers2();
    }
    
    // result to hashmap
    @GetMapping("customers3")
    public List<?> getCustomers3() {
    	log.info("@customers3===================>");
    	return testService.findCustomers3();
    }
    
	// return hashmap to pojo
    @GetMapping("customers4")
    public List<?> getCustomers4() {
    	log.info("@customers4===================>");
    	return testService.findCustomers4();
    }
    
    @GetMapping("customers/state/{state}")
    public List<?> getCustomersByState(@PathVariable("state") String state) {
    	log.info("@getCustomersByState===================>");
    	return testService.getCustomersByState(state);
    }
    
    @GetMapping("customers2/state/{state}")
    public List<?> getCustomersByState2(@PathVariable("state") String state) {
    	log.info("@getCustomersByState2===================>");
    	return testService.getCustomersByState2(state);
    }
    
    @PostMapping("customers3/state")
    public List<?> getCustomersByState3(@RequestBody StateDto state) {
    	log.info("@getCustomersByState3===================>");
    	return testService.getCustomersByState3(state);
    }
    
    @PostMapping("customers4/state")
    public List<?> getCustomersByState4(@RequestBody CustomerReq.SearchDto searchDto) {
    	log.info("@getCustomersByState4===================>");
    	return testService.getCustomersByState4(searchDto);
    }
    
    
}
