/**
 * 
 */
package io.github.farrukhjon.experiment.spring.rest.service.demo.requestMapping;

import io.github.farrukhjon.experiment.spring.rest.dto.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Farrukhjon SATTOROV
 *
 */

@Controller
public class RequestMappingWithProducesConcumes {

	@RequestMapping(value = "/person1", produces = { "application/json", "application/xml" })
	@ResponseBody
	public Person getPerson() {
		Person person = new Person(1, "Person1");
		return person;
	}
}
