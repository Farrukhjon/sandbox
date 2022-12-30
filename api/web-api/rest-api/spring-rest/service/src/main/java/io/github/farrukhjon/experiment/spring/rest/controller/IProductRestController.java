/**
 * 
 */
package io.github.farrukhjon.experiment.spring.rest.controller;

import io.github.farrukhjon.experiment.spring.rest.dto.ProductResponse;
import org.springframework.http.HttpEntity;

/**
 * @author Farrukhjon SATTOROV
 *
 */
public interface IProductRestController {
	
	public HttpEntity<ProductResponse> getProducts();

}
