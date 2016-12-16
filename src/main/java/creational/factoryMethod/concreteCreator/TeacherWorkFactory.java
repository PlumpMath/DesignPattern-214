package creational.factoryMethod.concreteCreator;

import creational.factoryMethod.concreteProduct.TeacherWork;
import creational.factoryMethod.creator.IWorkFactory;
import creational.factoryMethod.product.Work;

public class TeacherWorkFactory implements IWorkFactory {

	@Override
	public Work getWork() {
		return new TeacherWork();
	}

}
