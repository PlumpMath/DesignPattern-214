package creational.factoryMethod.concreteCreator;

import creational.factoryMethod.concreteProduct.StudentWork;
import creational.factoryMethod.creator.IWorkFactory;
import creational.factoryMethod.product.Work;

public class StudentWorkFactory implements IWorkFactory {

	@Override
	public Work getWork() {
		return new StudentWork();
	}

}
