package org.ldap.authentication;

import org.ldap.authentication.model.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface LdapAuthentication {

	public UserDTO autenticate(String user, String password);
}
