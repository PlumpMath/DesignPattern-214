package creational.abstractFactory.abstractFactory;

import creational.abstractFactory.abstractProduct.ICat;
import creational.abstractFactory.abstractProduct.IDog;

public interface IAnimalFactory {
	ICat createCat();

	IDog createDog();
}
