package demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("helloService")
public class HelloService {
	@Value(value="ע��")
	private String info;
	public void sayHello() {
		System.out.println(info+"����");
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
