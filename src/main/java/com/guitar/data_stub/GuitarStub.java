package com.guitar.data_stub;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.guitar.model.Guitar;

public class GuitarStub {
	// static block makes few guitar objects
	// a static hashmap that holds guitar objects
	// method that outputs a list of those guitar objects getAllGuitars
	// method that outputs a specific guitar object based on its id --getGuitar
	// 
	
	private static Map<Long, Guitar> guitars = new HashMap<Long, Guitar>();
	
	static {
	
		Guitar a = new Guitar(1L, "Gibson", "Les Paul Studio", 2005, 
				"http://www.musiciansfriend.com/guitars/gibson-2016-les-paul-studio-hp-electric-guitar", 
				"this is the first guitar");
		Guitar b = new Guitar(2L, "Fender", "Telecaster Thinline", 1976, 
				"http://media.musiciansfriend.com/is/image/MMGS7/Vintage-Modified-72-Telecaster-Thinline-Maple-Neck-Electric-Guitar-Natural/J13801000002000-00-120x120.jpg", 
				"this is the second guitar");
		Guitar c = new Guitar(3L, "Gibson", "SG", 1961, 
				"http://media.musiciansfriend.com/is/image/MMGS7/2017-SG-Standard-HP-Electric-Guitar-Ebony/J46351000002000-00-120x120.jpg", 
				"this is the third guitar");
		Guitar d = new Guitar(4L, "Fender", "Standard Telecaster", 1959, 
				"http://www.musiciansfriend.com/guitars/fender-standard-telecaster-electric-guitar/h76527", 
				"this is the fourth guitar");
		guitars.put(1L, a);
		guitars.put(2L, b);
		guitars.put(3L, c);
		guitars.put(4L, d);
	}
	
	public static List<Guitar> getAllGuitars(){
		return new ArrayList<Guitar>(guitars.values());
	}
	
	public static Guitar get(Long id) {
		return guitars.get(id);
	}
	
	
}
