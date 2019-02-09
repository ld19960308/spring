package mbean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;
@Component(value="annoService")
@ManagedResource(objectName="test:name=AnnoService")
public class AnnoService {
	private String name;
	@ManagedAttribute
	public String getName(){ return name;}
	@ManagedAttribute
	public void setName(String name){ this.name=name;}
	 @ManagedOperation    
	    @ManagedOperationParameters({    
	    @ManagedOperationParameter(name = "x", description = "The first number"),    
	    @ManagedOperationParameter(name = "y", description = "The second number")})    
	    public int add(int x, int y) {    
	        return x + y;    
	    }  

}
