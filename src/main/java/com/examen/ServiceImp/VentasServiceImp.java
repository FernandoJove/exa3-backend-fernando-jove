package com.examen.ServiceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.Dao.VentasDao;
import com.examen.Service.VentasService;
@Service
public class VentasServiceImp implements VentasService{

	@Autowired
	private VentasDao vd;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		
		return vd.readAll();
	}

	@Override
	public List<Map<String, Object>> read(int id) {
		// TODO Auto-generated method stub
		return vd.read(id);
	}

}
