package com.wipro.app;

import com.wipro.model.Car;
import com.wipro.model.Engine;

/*
* Here, the application, CarPurchase is explicitly instantiating, initializing , injecting
* and destroying the dependencies.
*
* There strong bonding between the application and the dependencies which is not
* Suggestible, instead recommended concept is loose-coupling.
*
* How to achieve loose coupling?
* Instead of application or dependent object managing the life-cycle of dependencies,
* hand over this responsibility to some third-party so that the third-party will manage
* the dependencies.
*
* This third-party can be Spring or Struts or JSF and so on.
*
* Spring container manages the dependencies. Earlier it was dependent taking care of all these, now
* the control of managing the dependencies to handed over to a third-party ie. control has been
* inverted hence the term inversion-control.
* 
* Dependency injection (DI) is a specialized form of IoC, whereby objects define their dependencies
* (that is, the other objects they work with) only through constructor arguments, arguments to a factory method,
*  or properties that are set on the object instance after it is constructed or returned from a factory method.
* The IoC container then injects those dependencies when it creates the bean.
*
*/


public class CarPurchase {
	public static void main(String[] args) {

		Engine engine= new Engine(12345678L,2700.0,"petrol");

		//constructor injection
		Car myCar=new Car("Maruthi","Grand Vitara",engine);

		System.out.println(myCar);

		Car myAnotherCar = new Car();

		//setter injection
		myAnotherCar.setEngine(engine);
		myAnotherCar.setBrand("Hyundai");
		myAnotherCar.setModel("Verna");


		engine=null;

		System.out.println(myAnotherCar);


	}

}
