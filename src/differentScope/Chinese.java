package differentScope;

public abstract class Chinese {
	public Chinese(){
		System.out.println("Srpring实例化主调Bean：Chinese");
	}
	public abstract Axe getAxe();
	public void useAxe(){
		System.out.println("正在使用"+getAxe()+"砍柴");
		System.out.println(getAxe().chop());
	}
}
