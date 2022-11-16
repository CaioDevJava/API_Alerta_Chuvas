package api.inmet.newton.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	private JsonUtil() {
		throw new IllegalStateException("Utily Class"); 
		
	}
	
	private static final ObjectMapper mapper = new ObjectMapper();
	
	public static String convertToString(Object object ) throws JsonProcessingException {
		return mapper.writeValueAsString(object);
	}
	
	public static <T> T convertToObject(String json, Class<T> object) throws IOException {
		return mapper.readValue(json,  object);
	}

}
