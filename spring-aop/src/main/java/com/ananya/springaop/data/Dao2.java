package com.ananya.springaop.data;

import org.springframework.stereotype.Repository;

import com.ananya.springaop.aspect.TrackTime;

@Repository
public class Dao2 {

	@TrackTime
	public String retrieveSomething() {
		return "Dao2";
	}

}
