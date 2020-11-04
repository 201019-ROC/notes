package com.revature.driver;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.revature.models.Fruit;

public class Driver {

	public static void main(String[] args) {
		try {
			Class<?> f1 = Class.forName("com.revature.models.Fruit");
			System.out.println("Class name: " + f1.getName());
			System.out.println("Superclass: " + f1.getSuperclass());
			System.out.println();
			
			System.out.println("Interfaces:");
			Class<?>[] interfaces = f1.getInterfaces();
			for(Class<?> interf : interfaces) {
				System.out.println(interf);
			}
			System.out.println();
			
			System.out.println("Fields:");
			Field[] fields = f1.getDeclaredFields();
			for(Field field : fields) {
				System.out.println(field);
			}
			System.out.println();
			
			System.out.println("Manipulating Objects");
			Fruit fruit = (Fruit) f1.getDeclaredConstructor(new Class[] {int.class, String.class}).newInstance(new Object[] {3,"apple"});
			System.out.println("New instance: " + fruit);
			System.out.println();
			
			Field name = f1.getDeclaredField("name");
			name.setAccessible(true);
			name.set(fruit, "pear");
			name.setAccessible(false);
			System.out.println(fruit);
			System.out.println();
			
			Method[] methods = f1.getDeclaredMethods();
			for(Method method : methods) {
				System.out.println(method);
			}
			Method setName = f1.getDeclaredMethod("setName", String.class);
			setName.invoke(fruit, "papaya");
			System.out.println(fruit);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
