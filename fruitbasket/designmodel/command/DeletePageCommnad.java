package fruitbasket.designmodel.command;

public class DeletePageCommnad extends Command {

	@Override
	public void execute() {
		super.pg.find();
		super.pg.delete();
		super.pg.plan();
	}

}
