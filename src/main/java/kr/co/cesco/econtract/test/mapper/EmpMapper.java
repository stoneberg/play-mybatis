package kr.co.cesco.econtract.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.cesco.econtract.web.users.domain.Employee;

@Mapper
public interface EmpMapper {
	
	List<Employee> findEmps();

}
