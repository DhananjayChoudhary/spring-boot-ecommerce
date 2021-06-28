package com.training.ecommerce.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.training.ecommerce.domain.Country;
import com.training.ecommerce.domain.Product;
import com.training.ecommerce.domain.ProductCategory;
import com.training.ecommerce.domain.State;

@Configuration
public class DataRestConfig implements RepositoryRestConfigurer {

	private EntityManager entityManager;
	
	@Autowired
	DataRestConfig(EntityManager entityManager){
		this.entityManager = entityManager;
	}
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		
		HttpMethod [] theUnsupportedActions = {HttpMethod.DELETE, HttpMethod.POST, HttpMethod.PUT};
		
		config.getExposureConfiguration()
			.forDomainType(Product.class)
			.withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
			 .withCollectionExposure((metdata,httpMethods) ->  httpMethods.disable(theUnsupportedActions))
			 ;		
		
		config.getExposureConfiguration()
		.forDomainType(ProductCategory.class)
		.withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
		 .withCollectionExposure((metdata,httpMethods) ->  httpMethods.disable(theUnsupportedActions))
		 ;		
		
		config.getExposureConfiguration()
		.forDomainType(Country.class)
		.withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
		 .withCollectionExposure((metdata,httpMethods) ->  httpMethods.disable(theUnsupportedActions))
		 ;	
		config.getExposureConfiguration()
		.forDomainType(State.class)
		.withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
		 .withCollectionExposure((metdata,httpMethods) ->  httpMethods.disable(theUnsupportedActions))
		 ;	
		//call an internal method
		exposedIds(config);
		
	}

	private void exposedIds(RepositoryRestConfiguration config) {
		
		Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();
		
		List<Class> entityClasses = new ArrayList<>();
		
		for(EntityType tempEntityType : entities) {
			entityClasses.add(tempEntityType.getJavaType());
		}
		
		Class[] domainTypes = entityClasses.toArray(new Class[0]);
		config.exposeIdsFor(domainTypes);
	}
	
}
