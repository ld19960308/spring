package spEL;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressionParser parser=new SpelExpressionParser();
		Expression exp=parser.parseExpression("'hello world'");
		System.out.println("hello world�Ľ����"+exp.getValue());
		exp=parser.parseExpression("'hello world'.concat('!')");
		System.out.println("hello world.concat('!')�Ľ��:"+exp.getValue());
		exp=parser.parseExpression("'hello world'.bytes");
		System.out.println("hello world.bytes�Ľ��"+exp.getValue());
		exp=parser.parseExpression("'hello world'.bytes.length");
		System.out.println("hello world.bytes.length�Ľ��"+exp.getValue());
		//ʹ�ù�������������
        exp=parser.parseExpression("new String('helloworld')"+".toUpperCase()");
        System.out.println("new String('helloworld')"+".toUpperCase()�Ľ��"+exp.getValue(String.class));
        Person p=new Person(1,"��",new Date());
        exp=parser.parseExpression("name");
        //��ָ��������Ϊroot��������ʽ��ֵ
        //�൱�ڵ���p.name���ʽ��ֵ
        System.out.println("��pΪroot��name�ı��ʽֵ�ǣ�"+exp.getValue(p,String.class));
        exp=parser.parseExpression("name=='��'");
        StandardEvaluationContext ctx=new StandardEvaluationContext();
        ctx.setRootObject(p);
        //ָ��Context��������ʽ��ֵ
        System.out.println(exp.getValue(ctx,Boolean.class));
        List<Boolean> list=new ArrayList<Boolean>();
        list.add(true);
        EvaluationContext ctx2=new StandardEvaluationContext();
        //��list���ó�һ������
        ctx2.setVariable("list", list);
        parser.parseExpression("#list[0]").setValue(ctx2,"false");
        System.out.println("list���ϵĵ�һ��Ԫ��:"+list.get(0));
        //p?.nameΪ��ʱ���׳��쳣
        //����ѡ��#list.?[length()>7]�жϼ��ϳ��ȴ���7 #list.?[value>80]
        //����ͶӰ#list.![length()]��ȡÿ��Ԫ��length�����ķ���ֵ
        //���ʽģ��
	}

}
