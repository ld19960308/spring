package rpc.hessian;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component("rmiService")
public class RPCServiceImp implements RPCService{

	@Override
	public List<User> getAllUser() {
		List<User> users=new ArrayList<>();
		User u=new User();
		u.setName("li");
		users.add(u);
		return users;
	}

}
