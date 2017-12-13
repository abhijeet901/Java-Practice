package mypractice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee obj= new Employee();
obj.setEid(101);
obj.setEname("Pooja");
obj.setEaddress("Odisha");
System.out.println("Employee Details:"+obj);

//Spring

Resource resource = new ClassPathResource("pom.xml");
BeanFactory factory= new XmlBeanFactory(resource);

Employee e1= (Employee)Factory.getBean("emp");

	}

}
