package fruitbasket.initializationblock;

/**
 *
 * Author: FruitBasket
 * Time: 2017��9��12��
 * Email: FruitBasket@qq.com
 * GitHub: github.com/Fruit-Basket
 */
class Father {
	
	protected static String sex;
	
	protected String name;
	
	//��̬��ʼ����
	static{
			//name="";//��������﷨���󣬾�̬��ʼ�����в��ܳ�ʼ����Ա����
			sex="female";
			System.out.println("Father static initialization block: "+sex);
	}
	
	//��ʼ����
	{
		name="Father";
		System.out.println("Father initialization block: "+name);
	}
	
	Father(){
		System.out.println("Father constructor: "+ name);
	}

}
