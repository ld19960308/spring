package mbean.demo;

import java.io.Serializable;  

public interface HelloMBean extends Serializable {  
    public void setName(String name);  
  
    public String getName();  
  
    public void sayHello();  
  
}  