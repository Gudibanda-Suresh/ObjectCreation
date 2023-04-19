package com.Object;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Apple {
	String name;

	public Apple() {
		System.out.println("I Am Apple");
	}

}

public class ThirdWay {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException

	{

		Constructor<Apple> con = Apple.class.getConstructor();
		Apple ap = con.newInstance();
		ap.name = "ThirdWay";
		System.out.println(ap.name);

	}

}
