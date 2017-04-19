package fruitbasket.designmodel.factorymethod;

public abstract class AbstractHumanFactory {
	public abstract <T extends Human> T createHuman(Class<T> a);
}
