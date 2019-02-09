package international;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("international/bean.xml");
		String[] a={"∂¡’ﬂ"};
		String hello=ctx.getMessage("hello",a, Locale.getDefault());
		Object[] b={new Date()};
		String now=ctx.getMessage("now",b, Locale.getDefault());
        System.out.println(hello);
        System.out.println(now);
	}

}
