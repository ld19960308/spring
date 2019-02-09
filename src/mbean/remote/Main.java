package mbean.remote;

import java.io.IOException;

import javax.management.Attribute;
import javax.management.AttributeNotFoundException;
import javax.management.InstanceNotFoundException;
import javax.management.InvalidAttributeValueException;
import javax.management.MBeanException;
import javax.management.MBeanServerConnection;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.ReflectionException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)  {
		ApplicationContext server=new ClassPathXmlApplicationContext("mbean/remote/server.xml");
		System.out.println("server文件加载完成");
        ApplicationContext client=new ClassPathXmlApplicationContext("mbean/remote/client.xml");
        System.out.println("client文件加载完成");
        MBeanServerConnection con=(MBeanServerConnection)client.getBean("mbeanClient");
        //得到注册bean的个数
        try {
			System.out.println("注册bean的个数"+con.getMBeanCount());
		} catch (IOException e) {
			e.printStackTrace();
		}
        try {
			java.util.Set mbeanNames=con.queryNames(null, null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			int ex=(int) con.getAttribute(new ObjectName("remote:name=RemoteBean"), "Id");
			System.out.println("id:"+ex);
		} catch (AttributeNotFoundException | InstanceNotFoundException | MalformedObjectNameException | MBeanException
				| ReflectionException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			con.setAttribute(new ObjectName("remote:name=RemoteBean"), new Attribute("Id",10));
			System.out.println("id属性设置成功");
		} catch (InstanceNotFoundException | AttributeNotFoundException | InvalidAttributeValueException
				| MalformedObjectNameException | MBeanException | ReflectionException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			System.out.println("1+2="+con.invoke(new ObjectName("remote:name=RemoteBean"), "add",new Object[]{1,2}, new String[]{"int","int"}));
		} catch (InstanceNotFoundException | MalformedObjectNameException | MBeanException | ReflectionException
				| IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
