package com.adp.mincoinproblem.requestchange.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.adp.mincoinproblem.requestchange.exception.RequestedChangeNotFoundException;

@RestController
@RequestMapping("/reqChange")
public class RequestChangeController {
	
	@GetMapping("/coins/{bill}")
	public ResponseEntity getMinCoins(@PathVariable("bill")long bill)
	{
		try {
		List<Double> list=null;
			return new ResponseEntity<List<Double>>(list,HttpStatus.OK);
		}
		catch(RequestedChangeNotFoundException exception)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Change cannot be tendered");
		}
		
	}

}
