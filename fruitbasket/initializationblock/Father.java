package fruitbasket.initializationblock;

/**
 *
 * Author: FruitBasket
 * Time: 2017年9月12日
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
class Father {
	
	protected static String sex;
	
	protected String name;
	
	//静态初始化块
	static{
			//name="";//这句会出现语法错误，静态初始化块中不能初始化成员变量
			sex="female";
			System.out.println("Father static initialization block: "+sex);
	}
	
	//初始化块
	{
		name="Father";
		System.out.println("Father initialization block: "+name);
	}
	
	Father(){
		System.out.println("Father constructor: "+ name);
	}

}
