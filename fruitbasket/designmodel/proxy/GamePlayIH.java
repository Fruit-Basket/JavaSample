package fruitbasket.designmodel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {
	
	Class cls=null;//被代理者
	Object obj=null;//被代理的实例
	
	public GamePlayIH(Object obj){
		this.obj=obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result=method.invoke(this.obj, args);
		if(method.getName().equalsIgnoreCase("login")){
			System.out.println("有人在用我的账号登陆！");
		}
		return result;
	}

}
