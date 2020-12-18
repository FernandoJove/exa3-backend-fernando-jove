package com.examen.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.Service.ProductoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RequestMapping("/producto")
public class ProductoController {
	@Autowired
	private ProductoService ps;
	
	@GetMapping("/")
	public List<Map<String, Object>> readAll(){
		return ps.readAll();
	}
	@GetMapping("/{nomprod}")
	public List<Map<String, Object>> read(@PathVariable String nomprod){
		return ps.read(nomprod);
	}
	

}
