package timer;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("timer/timer.xml");
        Timer timer=(Timer)ctx.getBean("timer");
        Long start=System.currentTimeMillis();
        while(System.currentTimeMillis()-start<20000){
        	
        }
        System.exit(0);
	}

}
