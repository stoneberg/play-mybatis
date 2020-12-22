package kr.co.cesco.econtract.test.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

import kr.co.cesco.econtract.test.domain.BrandReq.CreateDto;
import kr.co.cesco.econtract.test.domain.Customer;
import kr.co.cesco.econtract.test.domain.CustomerReq;
import kr.co.cesco.econtract.test.domain.CustomerRes;
import kr.co.cesco.econtract.test.dto.Person;
import kr.co.cesco.econtract.test.dto.StateDto;

@Mapper
public interface SalesMapper {
	
	// Select ===================================================================

	List<Customer> findCustomers();

	// call procedure
	List<Customer> findCustomers2();

	// return hashmap
	List<Map<String, Object>> findCustomers3();

	List<Customer> findCustomersByState(@Param("state") String state);

	@Select(value = "{CALL getCustomersByState(#{state, mode=IN, javaType=String})}")
	@Options(statementType = StatementType.CALLABLE)
	List<Customer> getCustomersByState2(@Param("state") String state);
	
	@Select(value = "{CALL getCustomersByState(#{state, mode=IN, javaType=String})}")
	@Options(statementType = StatementType.CALLABLE)
	List<Customer> getCustomersByState3(StateDto state);
	
	@Select(value = "{CALL getCustomersByState(#{state, mode=IN, javaType=String})}")
	@Options(statementType = StatementType.CALLABLE)
	List<CustomerRes.CustomerDto> getCustomersByState4(CustomerReq.SearchDto searchDto);
	
	
	void addPerson(Person person);
	 
	Person getPerson(Integer personId);
	
	
	// Insert ===================================================================

	@Insert(value = "{CALL production.insertNewBrand(#{brandName, mode=IN, javaType=String})}")
	@Options(statementType = StatementType.CALLABLE)
	int insertBrand(CreateDto createDto);





}
