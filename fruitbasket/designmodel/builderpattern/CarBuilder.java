package fruitbasket.designmodel.builderpattern;

import java.util.ArrayList;

public abstract class CarBuilder {
	public abstract void setSequence(ArrayList<String> sequence);
	public abstract CarModel getCarModel();
}
