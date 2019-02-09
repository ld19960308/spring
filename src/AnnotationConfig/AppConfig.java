package AnnotationConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //����һ��java������
public class AppConfig {
	//����һ��Field����Ϊ����һ��ֵ
	@Value("�����") String personName;
    //����һ���������÷����ķ���ֵ�����������һ��Bean
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
    /*������Annotation
     * @Import:����һ��Java�����࣬�����䵥ǰJava�������е���������Java������
     * @Scope:���η�����ָ��Bean������
     * @Lazy:���η�����ָ��Bean�Ƿ�����ӳټ���
     * @DependOn:���η�����ָ���ڳ�ʼ���÷�����Ӧ��Bean֮ǰ��ʼ��ָ��Bean
     */
}
