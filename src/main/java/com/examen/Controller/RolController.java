package com.examen.Controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.Service.RolService;




@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RequestMapping("/roles")
public class RolController {
	@Autowired
	private RolService rolService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll(){
		return rolService.readAll();
	}
	

}
