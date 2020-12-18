package com.examen.ServiceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.Dao.ProductoDao;
import com.examen.Entity.Producto;
import com.examen.Service.ProductoService;

@Service
public class ProductoServiceImp implements ProductoService{

	@Autowired
	private ProductoDao pd;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return pd.readAll();
	}

	@Override
	public int update(Producto producto) {
		// TODO Auto-generated method stub
		return pd.update(producto);
	}

	@Override
	public List<Map<String, Object>> read(String nomprod) {
		// TODO Auto-generated method stub
		return pd.read(nomprod);
	}

}
