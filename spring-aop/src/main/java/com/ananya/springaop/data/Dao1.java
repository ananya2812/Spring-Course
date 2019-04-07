package com.ananya.springaop.data;

import org.springframework.stereotype.Repository;

import com.ananya.springaop.aspect.TrackTime;

@Repository
public class Dao1 {

	@TrackTime
	public String retrieveSomething() {
		return "Dao1";
	}

}
