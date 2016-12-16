package creational.abstractFactory.concreteFactory;

import creational.abstractFactory.abstractFactory.IAnimalFactory;
import creational.abstractFactory.abstractProduct.ICat;
import creational.abstractFactory.abstractProduct.IDog;
import creational.abstractFactory.concreteProduct.BlackCat;
import creational.abstractFactory.concreteProduct.BlackDog;

public class BlackAnimalFactory implements IAnimalFactory {
	public ICat createCat() {
		return new BlackCat();
	}

	public IDog createDog() {
		return new BlackDog();
	}
}
