package kr.co.cesco.econtract.test.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Integer age;
}
