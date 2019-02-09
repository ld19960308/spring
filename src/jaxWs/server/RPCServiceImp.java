package jaxWs.server;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.springframework.stereotype.Component;
@Component("rmiService")
@WebService(serviceName="jaxService")
public class RPCServiceImp implements RPCService{

	@Override
	public List<User> getAllUser() {
		List<User> users=new ArrayList<>();
		User u=new User();
		u.setName("li");
		users.add(u);
		return users;
	}

	@Override
	public String hello(String name) {
		return name;
	}

}
