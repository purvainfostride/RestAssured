package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

import json.parsing.PersonDetails;

public class Test_jsonparsing {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] jsonData=Files.readAllBytes(Paths.get("C:\\Users\\ASUS\\eclipse-workspace\\JSON_parsing\\Config\\Data.json"));
		ObjectMapper mapper=new ObjectMapper();
		PersonDetails person=mapper.readValue(jsonData, PersonDetails.class);
		System.out.println(person.getEmail());
		System.out.println(person.getAddress().getCountry());
		System.out.print(person.getAddress().getDet().getDist());
		
	}
}
