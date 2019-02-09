package mbean;

public class Service {
	private static final int DEFAULT_SIZE=25;
	private int pageSize=DEFAULT_SIZE;
	public  int getPageSize() {
		return pageSize;
	}
	public  void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	

}
