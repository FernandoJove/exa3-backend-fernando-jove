package com.examen.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.examen.Dao.ProductoDao;
import com.examen.Entity.Producto;
@Repository
public class ProductoDaoImp implements ProductoDao{

	@Autowired
	private JdbcTemplate jdbc;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL="select * from producto";
		return jdbc.queryForList(SQL);
	}

	@Override
	public int update(Producto producto) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public List<Map<String, Object>> read(String nomprod) {
		// TODO Auto-generated method stub
		String SQL="select * from producto where nomprod like '?%'";
		return jdbc.queryForList(SQL);
	}

}
