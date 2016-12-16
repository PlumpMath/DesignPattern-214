package test;

import org.junit.Test;

import creational.abstractFactory.abstractFactory.IAnimalFactory;
import creational.abstractFactory.abstractProduct.ICat;
import creational.abstractFactory.abstractProduct.IDog;
import creational.abstractFactory.concreteFactory.BlackAnimalFactory;
import creational.abstractFactory.concreteFactory.WhiteAnimalFactory;
import creational.builder.concreteBuilder.ManBuilder;
import creational.builder.director.PersonDirector;
import creational.builder.product.Person;
import creational.factoryMethod.concreteCreator.StudentWorkFactory;
import creational.factoryMethod.concreteCreator.TeacherWorkFactory;
import creational.factoryMethod.creator.IWorkFactory;
import creational.prototype.ConcretePrototype;
import creational.prototype.Prototype;
import creational.singleton.Singleton;

public class CreatorTest {

	@Test
	public void abstractFactory() {
		IAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
		ICat blackCat = blackAnimalFactory.createCat();
		blackCat.eat();
		IDog blackDog = blackAnimalFactory.createDog();
		blackDog.eat();

		IAnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();
		ICat whiteCat = whiteAnimalFactory.createCat();
		whiteCat.eat();
		IDog whiteDog = whiteAnimalFactory.createDog();
		whiteDog.eat();
	}

	@Test
	public void factoryMethod() {
		IWorkFactory studentWorkFactory = new StudentWorkFactory();
		studentWorkFactory.getWork().doWork();

		IWorkFactory teacherWorkFactory = new TeacherWorkFactory();
		teacherWorkFactory.getWork().doWork();
	}

	@Test
	public void singleton() {
		Singleton sing = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();

		System.out.println(sing);
		System.out.println(sing2);
	}

	@Test
	public void builder() {
		PersonDirector pd = new PersonDirector();
		Person person = pd.constructPerson(new ManBuilder());
		System.out.println(person.getBody());
		System.out.println(person.getFoot());
		System.out.println(person.getHead());
	}

	@Test
	public void prototype() {
		Prototype pro = new ConcretePrototype("prototype");
		Prototype pro2 = (Prototype) pro.clone();
		System.out.println(pro.getName());
		System.out.println(pro2.getName());
	}

}
