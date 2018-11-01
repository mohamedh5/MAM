package com.dmc.mam.config;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.data.web.HateoasPageableHandlerMethodArgumentResolver;

@Configuration
class CustomRestConfiguration extends RepositoryRestMvcConfiguration {

	public CustomRestConfiguration(ApplicationContext context, ObjectFactory<ConversionService> conversionService) {
		super(context, conversionService);
		// TODO Auto-generated constructor stub
	}
	
	@ConfigurationProperties(prefix = "spring.data.rest")
	@Override
	public RepositoryRestConfiguration repositoryRestConfiguration() {
		// TODO Auto-generated method stub
		return super.repositoryRestConfiguration();
	}
	
	@Override
	@Bean
	public HateoasPageableHandlerMethodArgumentResolver pageableResolver() {

		HateoasPageableHandlerMethodArgumentResolver resolver = super.pageableResolver();
		resolver.setMaxPageSize(200);
		resolver.setOneIndexedParameters(true);
		return resolver;
	}
}