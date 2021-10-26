package com.adp.mincoinproblem.requestchange.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.adp.mincoinproblem.requestchange.exception.RequestedChangeNotFoundException;

public class RequestChangeService {
	
	long[] availableBills = {1,2,5,10,20,50,100};
	
	Map<Double,Integer> coins = new HashMap<Double,Integer>();
	
	RequestChangeService()
	{
		coins.put(0.01d, 100);
		coins.put(0.05d, 100);
		coins.put(0.10d, 100);
		coins.put(0.25d, 100);

	}
	
	public void getMinCoins(long bill) throws Exception
	{
		Optional<Map<String,String>> change = findMinCoinsByBill(bill);
		
		if(!change.isPresent())
			throw new RequestedChangeNotFoundException("Change cannot be tendered");
		else
			change.get();
		
	}

	private Optional<Map<String, String>> findMinCoinsByBill(long bill) {

		
		
		if(!Arrays.asList(availableBills).contains(bill))
			return null;
		else
		{
			
			
			return null;
		}
	}

}
