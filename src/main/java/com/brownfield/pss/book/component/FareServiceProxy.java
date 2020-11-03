package com.brownfield.pss.book.component;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "fares-proxy", url = "http://localhost:8081/fares")
public interface FareServiceProxy {
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	Fare getFare(@RequestParam(value = "flightNumber") String flightNumber,
			@RequestParam(value = "flightDate") String flightDate);
}
