package demo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("CustomerService")
@Scope("prototype")
public class CustomerService {

	@PostConstruct
	public void init(){
		System.out.println("CustomerService����ʼ����");
	}
	
	public void save(){
		System.out.println("CustomerService��save����ִ����");
	}
	
	@PreDestroy
	public void destory(){
		System.out.println("CustomerService��������");
	}
}
