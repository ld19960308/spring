package differentScope;

public class SteelAxe implements Axe {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("实例化依赖Bean：SteelAxe实例");
	}
	public String chop(){
		return  "刚斧砍柴真快";
	}

}
