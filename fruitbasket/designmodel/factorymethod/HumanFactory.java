package fruitbasket.designmodel.factorymethod;

public class HumanFactory extends AbstractHumanFactory {

	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		//����һ������������
		Human human=null;
		try{
			//����һ������
			human=(T)Class.forName(c.getName()).newInstance();
		}catch(Exception e){
			System.out.println("�������ɴ���");
			e.printStackTrace();
		}
		return (T)human;
	}
}
