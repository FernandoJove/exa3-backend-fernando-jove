package com.examen.Security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.examen.Dao.AccesosDao;
import com.examen.Dao.PersonaDao;
import com.examen.Dao.UsuarioDao;
import com.examen.Entity.Persona;
import com.examen.Entity.Usuario;


@Component
public class InfoAdicionalToken implements TokenEnhancer{
	@Autowired
	private UsuarioDao usuarioDao;
	@Autowired
	private AccesosDao accesoDao;
	@Autowired
	private PersonaDao personaDao;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {

		Usuario user = usuarioDao.read(authentication.getName());
		Persona per = personaDao.read(user.getIdpersona());
		List<Map<String,Object>> accesos = new ArrayList<>();
		accesos = accesoDao.read(user.getIdusuario());
		Map<String, Object> datos= new HashMap<>();
		datos.put("iduser", user.getIdusuario());
		datos.put("nombre", per.getNombres());
		datos.put("user", user.getUsername());
		datos.put("accesos", accesos);
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(datos);


		return accessToken;
	}

}
