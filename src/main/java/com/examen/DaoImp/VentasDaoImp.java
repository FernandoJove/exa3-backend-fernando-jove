package com.examen.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.examen.Dao.VentasDao;

@Repository
public class VentasDaoImp implements VentasDao{
@Autowired
private JdbcTemplate jdbc;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL="SELECT DISTINCT dv.cantidad, dv.nomprod, p.precio as PRECIO ,dv.precio as IMPORTE from detalle_ventas dv,producto p  where p.idproducto = dv.idproducto;";
		return jdbc.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
