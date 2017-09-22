package fruitbasket.initializationblock;

/**
 *
 * Author: FruitBasket
 * Time: 2017Äê9ÔÂ12ÈÕ
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
class Son extends Father {
	
	static{
		sex="female";
		System.out.println("Son static initialization block: "+sex);
	}
	
	{
		super.name="Son";
		System.out.println("Son initialization block: "+name);
	}

	Son(){
		super();
		System.out.println("Son constructor: "+ name);
	}
}
