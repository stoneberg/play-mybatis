package kr.co.cesco.econtract.test.dto;

import lombok.Data;

public class PeopleDto {
	
	@Data
	public static class PersonDto {
		private static final long serialVersionUID = 1L;
		private Integer id;
		private String name;
		private Integer age;
	}

}
