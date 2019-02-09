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
		System.out.println("hello world的结果："+exp.getValue());
		exp=parser.parseExpression("'hello world'.concat('!')");
		System.out.println("hello world.concat('!')的结果:"+exp.getValue());
		exp=parser.parseExpression("'hello world'.bytes");
		System.out.println("hello world.bytes的结果"+exp.getValue());
		exp=parser.parseExpression("'hello world'.bytes.length");
		System.out.println("hello world.bytes.length的结果"+exp.getValue());
		//使用构造器创建对象
        exp=parser.parseExpression("new String('helloworld')"+".toUpperCase()");
        System.out.println("new String('helloworld')"+".toUpperCase()的结果"+exp.getValue(String.class));
        Person p=new Person(1,"孙",new Date());
        exp=parser.parseExpression("name");
        //以指定对象作为root来计算表达式的值
        //相当于调用p.name表达式的值
        System.out.println("以p为root，name的表达式值是："+exp.getValue(p,String.class));
        exp=parser.parseExpression("name=='孙'");
        StandardEvaluationContext ctx=new StandardEvaluationContext();
        ctx.setRootObject(p);
        //指定Context来计算表达式的值
        System.out.println(exp.getValue(ctx,Boolean.class));
        List<Boolean> list=new ArrayList<Boolean>();
        list.add(true);
        EvaluationContext ctx2=new StandardEvaluationContext();
        //将list设置成一个变量
        ctx2.setVariable("list", list);
        parser.parseExpression("#list[0]").setValue(ctx2,"false");
        System.out.println("list集合的第一个元素:"+list.get(0));
        //p?.name为空时不抛出异常
        //集合选择#list.?[length()>7]判断集合长度大于7 #list.?[value>80]
        //集合投影#list.![length()]获取每个元素length方法的返回值
        //表达式模板
	}

}
