package kr.co.cesco.econtract.test.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

import kr.co.cesco.econtract.test.domain.Customer;
import kr.co.cesco.econtract.test.domain.CustomerReq;
import kr.co.cesco.econtract.test.domain.CustomerRes;
import kr.co.cesco.econtract.test.dto.StateDto;

@Mapper
public interface SalesMapper {

	List<Customer> findCustomers();

	List<Customer> findCustomers2();

	List<Map<String, Object>> findCustomers3();

	List<Customer> getCustomersByState(@Param("state") String state);

	@Select(value = "{CALL getCustomersByState(#{state, mode=IN, javaType=String})}")
	@Options(statementType = StatementType.CALLABLE)
	List<Customer> getCustomersByState2(@Param("state") String state);
	
	@Select(value = "{CALL getCustomersByState(#{state, mode=IN, javaType=String})}")
	@Options(statementType = StatementType.CALLABLE)
	List<Customer> getCustomersByState3(StateDto state);
	
	@Select(value = "{CALL getCustomersByState(#{state, mode=IN, javaType=String})}")
	@Options(statementType = StatementType.CALLABLE)
	List<CustomerRes.CustomerDto> getCustomersByState4(CustomerReq.SearchDto searchDto);

}
