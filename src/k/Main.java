package k;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	private static int[] pos=new int[3];
	private static boolean changed=true;
	private static int listNum=3;
	private static int objectNum=100;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random=new Random();
		Point[] points=null;
		List<Point>[] lists=null;
		init(points,random,lists);
        cluster(lists,points,random);
        showList(lists);
	}
	@SuppressWarnings("unchecked")
	private static void init(Point[] points,Random random,List<Point>[] lists){
		points=new Point[objectNum];
		for(int i=0;i<100;i++){
			points[i]=new Point(random.nextInt(1000),random.nextInt(1000));
		}
		for(int i=0;i<points.length;i++){
			System.out.println(i+":"+points[i]);
		}
		lists=new ArrayList[listNum];
		for(int i=0;i<lists.length;){
			int j=random.nextInt(100);
			System.out.println("第"+i+"个随机数为:"+j);
			//if(isContain(j)) continue;
			if(isContain(lists,points[j])) continue;
			pos[i]=j;
			lists[i]=new ArrayList<Point>();
			lists[i].add(points[pos[i]]);
			System.out.println(lists[i]);
			i++;
		}
		/*代码1
		for(int i=0;i<points.length;i++){
		   int c=random.nextInt(3);
		   if(isContain(lists,points[i]){
		      i++;
		      continue;
		   }
		   lists[c].add(points[i]);
		}
		 */
	}
	private static boolean isContain(List<Point>[] lists,Point p){
		for(List<Point> list:lists){
			for(Point temp:list){
				if(temp==p){
					return true;
				}
			}
		}
		return false;
	}
	private static boolean isContain(int j){
		boolean a=false;
		for(int c=0;c<pos.length;c++){
			if(pos[c]==j)a=true;
		}
		return a;
	}
	/**
	 * 
	 * @param lists
	 * @param points
	 * @param r
	 */
	private static void cluster(List<Point>[] lists,Point[] points,Random r){
		System.out.println("进入count方法");
		int h=1;
		while(changed){
			int c=r.nextInt(100);
			System.out.println("生成的随机数为:"+c);
			/*if(isContain(c)){
				continue;
			}*/
			if(isContain(lists,points[c])) continue;
			int[] d=new int[3];
			for(int i=0;i<lists.length;i++){
				Point p=lists[i].get(0);
				d[i]=(int)Math.sqrt((p.getX()-points[c].getX())*(p.getX()-points[c].getX())+(p.getY()-points[c].getY())*(p.getY()-points[c].getY()));
			}
			int pos=0;
			int a=d[0];
			for(int i=1;i<d.length;i++){
				if(a>d[i]){
					a=d[i];
					pos=i;
				}
			}
			System.out.println("第"+h+"次:"+" 最小值为:"+a+",要插入的列表为:"+pos);
			putToTheRightPosition(lists,points[c],pos);
			h++;
			
		}
		System.out.println("退出count方法");
	}
	/**
	 * 将point放到所属于的列表中
	 * @param lists
	 * @param p
	 */
	private static void putToTheRightPosition(List<Point>[] lists,Point p,int pos){
		lists[pos].add(p);
		//在
		/*for(int i=0;i<lists.length;i++){
			if(i==pos){	i++;continue;	}
			for(int j=1;j<lists[i].size();j++){
				if(lists[i].get(j)==p){
					lists[i].remove(i);		
					return;
				}
			}	
		}*/
		int n=0;
		for(int i =0;i<lists.length;i++){
			n+=lists[i].size();
		}
		if(n>=100) changed=false;
	}
	private static void showList(List<Point>[] lists){
		System.out.println("结果为:");
        for(int i=0;i<lists.length;i++){
        	System.out.println("第"+(i+1)+"个列表值为:");
        	for(Point p:lists[i]){
        		System.out.print(p+",");
        	}
        	System.out.println("第"+(i+1)+"个列表结束");
        }
		
	}

}