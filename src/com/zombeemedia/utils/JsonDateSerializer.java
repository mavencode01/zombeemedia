package com.zombeemedia.utils;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

@Component
public class JsonDateSerializer extends JsonSerializer<DateTime> {

	@Override
	public void serialize(DateTime date, JsonGenerator gen, SerializerProvider arg2) throws IOException, JsonProcessingException 
	{		
		gen.writeString(date.toString());		
	}
}
