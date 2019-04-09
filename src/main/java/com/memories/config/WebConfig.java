package com.memories.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.memories.interceptor.LoginInterceptor;

@SuppressWarnings("deprecation")
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

//	@Override
//	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//		converters.add(null);
//	}
	
//	public MarshallingHttpMessageConverter marshallingHttpMessageConverter(){
//	    MarshallingHttpMessageConverter marshallingHttpMessageConverter = new MarshallingHttpMessageConverter();
//	    List<MediaType> mediaTypes = new ArrayList<MediaType>();
//	    mediaTypes.add(MediaType.TEXT_XML);
//	    mediaTypes.add(MediaType.APPLICATION_XML);
//	    XStreamMarshaller xStreamMarshaller=new XStreamMarshaller();
//	    marshallingHttpMessageConverter.setSupportedMediaTypes(mediaTypes);
//	    marshallingHttpMessageConverter.setMarshaller(xStreamMarshaller);
//	    marshallingHttpMessageConverter.setUnmarshaller(xStreamMarshaller);
//	    return marshallingHttpMessageConverter;
//	}
	
	//拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor());
		super.addInterceptors(registry);
	}
	
	
	
}
