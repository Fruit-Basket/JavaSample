package fruitbasket.designmodel.builderpattern;

import java.util.ArrayList;

public class Director {
	
	private ArrayList<String> sequence=new ArrayList();
	private BenzBuilder benzBuilder=new BenzBuilder();
	private BMWBuilder bmwBuilder=new BMWBuilder();

	public BenzModel getABenzModel(){
		sequence.clear();
		sequence.add("start");
		sequence.add("stop");
		benzBuilder.setSequence(sequence);
		return (BenzModel)benzBuilder.getCarModel();
	}
	
	public BenzModel getBBenzModel(){
		sequence.clear();
		sequence.add("engine boom");
		sequence.add("start");
		sequence.add("stop");
		benzBuilder.setSequence(sequence);;
		return (BenzModel)benzBuilder.getCarModel();
	}
	
	public BMWModel getCBMWModel(){
		sequence.clear();
		sequence.add("alarm");
		sequence.add("start");
		sequence.add("stop");
		bmwBuilder.setSequence(sequence);
		return (BMWModel)bmwBuilder.getCarModel();
	}
}
