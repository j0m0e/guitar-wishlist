package com.guitar.controller;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.guitar.model.Guitar;
import com.guitar.data_stub.GuitarStub;

@RestController
public class GuitarController {
	
	@RequestMapping(value="/guitars", method=RequestMethod.GET)
	public List<Guitar> getGuitars(){
		return GuitarStub.getAllGuitars();
	}
	
	@RequestMapping(value="/guitars/{id}", method=RequestMethod.GET)
	public Guitar get(@PathVariable Long id) {
		return GuitarStub.get(id);
	}
	

}
