package mbean.remote;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName="remote:name=RemoteBean")
public class RemoteBean {
	@ManagedOperation
	@ManagedOperationParameters({
		@ManagedOperationParameter(name = "x", description = "the first add number"),
		@ManagedOperationParameter(name = "y", description = "the second add number")
	})
	public int add(int x,int y){
		return x+y;
	}
	private int id;
	@ManagedAttribute
	public int getId() {
		return id;
	}
	@ManagedAttribute
	public void setId(int id) {
		this.id = id;
	}
}
