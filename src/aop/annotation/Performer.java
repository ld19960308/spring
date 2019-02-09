package aop.annotation;

import org.springframework.stereotype.Component;

@Component("performer")
public class Performer {
	public void performance(){
		System.out.println("performing");
	}
	public void performances(String name){
		System.out.println("hello :"+name);
	}

}
