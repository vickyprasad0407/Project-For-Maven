package com.restAssured;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainEmployee {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		int [] arr1= {123,456};
		int [] arr2= {145,987};
		Employee  e1=new Employee(101, "vicky", arr1);
		Employee e2=new Employee(102, "suman", arr2);
		ObjectMapper ob=new ObjectMapper();
		ob.writeValue(new File("./emp.json"), e1);
		ob.writeValue(new File("./emp.json"), e2);
	}

}
