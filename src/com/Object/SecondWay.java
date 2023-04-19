package com.Object;

class AnotherWay {
	int id = 103;

	public AnotherWay() {
		System.out.println("I Am AnotherWay");
	}

}

public class SecondWay {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		// Load the class

		Class forName = Class.forName("com.Object.AnotherWay");

		// newInstance() => Available in lang package method is used to create object

		AnotherWay aw = (AnotherWay) forName.newInstance();

		System.out.println(aw.id);
		aw.id = 303;
		System.out.println(aw.id);

	}

}
