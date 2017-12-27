package com.yue.springboot.web.serialize;

import java.io.IOException;
import java.util.Date;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * @Description: 自定义序列化格式化日期
 * 
 * @author zhangyue
 * @since 2017-12-27 15:10:14
 */
// @JsonComponent
public class CustomJsonDateSerializer {

	public static class Serializer extends JsonSerializer<Date> {

		@Override
		public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers)
				throws IOException, JsonProcessingException {
			
			System.out.println("====================serialize========================");	
		}
		
    }
	
	public static class Deserializer extends JsonDeserializer<Date> {

		@Override
		public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
			System.out.println("====================deserialize========================");
			return null;
		}
		
    }

}
