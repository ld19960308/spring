package AnnotationConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //修饰一个java配置类
public class AppConfig {
	//修饰一个Field用于为配置一个值
	@Value("孙悟空") String personName;
    //修饰一个方法将该方法的返回值定义成容器的一个Bean
	@Bean(name="chinese")
	public Chinese chinese(){
		Chinese p=new Chinese();
		p.setAxe(stoneAxe());
		p.setName(personName);
		return p;
	}
	@Bean(name="stoneAxe")
	public Axe stoneAxe(){
		return new StoneAxe();
	}
	@Bean(name="steelAxe")
	public Axe steelAxe(){
		return new SteelAxe();
	}
    /*其他的Annotation
     * @Import:修饰一个Java配置类，用于箱单前Java配置类中导入其他的Java配置类
     * @Scope:修饰方法来指定Bean生命域
     * @Lazy:修饰方法来指定Bean是否采用延迟加载
     * @DependOn:修饰方法，指定在初始化该方法对应的Bean之前初始化指定Bean
     */
}
