package differentScope;

public abstract class Chinese {
	public Chinese(){
		System.out.println("Srpringʵ��������Bean��Chinese");
	}
	public abstract Axe getAxe();
	public void useAxe(){
		System.out.println("����ʹ��"+getAxe()+"����");
		System.out.println(getAxe().chop());
	}
}
