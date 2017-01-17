package org.ldap.authentication.impl;

import org.ldap.authentication.LdapAuthentication;
import org.ldap.authentication.model.UserDTO;

public class LdapAuthenticationImpl implements LdapAuthentication {

	@Override
	public UserDTO autenticate(String user, String password) {
		return new UserDTO("Pepito", "de los palotes", "pepitodelospalotes@gmail.com");

	}

}
