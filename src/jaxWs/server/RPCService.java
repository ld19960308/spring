package jaxWs.server;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public interface RPCService {
	@WebMethod
	List<User> getAllUser();
	@WebMethod
	String hello(String name);
}
