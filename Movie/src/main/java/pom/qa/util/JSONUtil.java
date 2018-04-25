package pom.qa.util;

import com.google.gson.Gson;

public class JSONUtil {

	private Gson gson; 
	
	public  JSONUtil() {
		
		this.gson = new Gson();
		
	}
	
	public String getJsonForObject(Object obj) {
		
		
		return gson.toJson(obj);
	}
	
	public <T> T getObjectForJSON(String jsonString, Class<T> clazz) {
		return gson.fromJson(jsonString, clazz);
	}
	
}
