package aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	@Pointcut("execution(* aop.annotation.*.performance*(..))")
	public void performance(){}
	@Before("performance()")
	public void takeSeats(){
		System.out.println("the audience is taking their seats.");
	}
	@Before("performance()")
	public void turnOffCellPhones(JoinPoint point){
		//point.getTarget();
		System.out.println("参数开始");
		Object[] args=point.getArgs();
		for(Object o:args){
			System.out.println(o);
		}
		System.out.println("参数结束");
		System.out.println("the audience is turning off their cellphones");
	}
    @AfterReturning("performance()")
    public void applaud(){
    	System.out.println("clap clap clap clap");
    }
    @AfterThrowing("performance()")
    public void demandRefund(){
    	System.out.println("boo! we want our money back!");
    }
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
    	System.out.println("the around start");
    	try {
			joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("the around end");
    }
}
