package jaxWs.server;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@WebService(serviceName="jaxWsService")
public class Hello1Service implements Service{
	@Autowired
	RPCService rpcService;
	@WebMethod
	public List<User> getAllUser(){
		return rpcService.getAllUser();
	}

}
