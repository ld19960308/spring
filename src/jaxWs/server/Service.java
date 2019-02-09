package jaxWs.server;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Service {
	@WebMethod
	public List<User> getAllUser();

}
