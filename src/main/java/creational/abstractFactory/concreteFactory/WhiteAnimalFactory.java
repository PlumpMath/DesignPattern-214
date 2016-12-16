package creational.abstractFactory.concreteFactory;

import creational.abstractFactory.abstractFactory.IAnimalFactory;
import creational.abstractFactory.abstractProduct.ICat;
import creational.abstractFactory.abstractProduct.IDog;
import creational.abstractFactory.concreteProduct.WhiteCat;
import creational.abstractFactory.concreteProduct.WhiteDog;

public class WhiteAnimalFactory implements IAnimalFactory {
	public ICat createCat() {
		return new WhiteCat();
	}

	public IDog createDog() {
		return new WhiteDog();
	}
}
