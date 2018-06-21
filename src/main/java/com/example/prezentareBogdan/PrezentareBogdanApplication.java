package com.example.prezentareBogdan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.example.exemplu2.Triangle2;
import com.example.exemplu2.Triangle3;
import com.example.exemplu2.Triangle4;

@SpringBootApplication
public class PrezentareBogdanApplication {

	public static void main(String[] args) {
		// SpringApplication.run(PrezentareBogdanApplication.class, args);

		/*
		 //Exemplul 1*
		 BeanFactory factory = new XmlBeanFactory(new
		 FileSystemResource("C:\\Bogdan\\Pregatire individuala\\Alte exercitii\\prezentareBogdan\\src\\main\\java\\spring.xml"));
		 Triangle triangle  = (Triangle) factory.getBean("triangle");
		 System.out.println(triangle);
		 */
		 
		
		
		
		//Exemplul 2
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Triangle3 triangle1 = (Triangle3) applicationContext.getBean("triangleList");
		//System.out.println(triangle1 == triangle2);
		triangle1.draw();
		
		 
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		// Triangle2 triangle1 = (Triangle2) applicationContext.getBean("triangle7");
		//
		// //triangle1.draw();
		// System.out.println(triangle1);

		// Triangle triangle1 = (Triangle) applicationContext.getBean("triangle");
		// Triangle triangle2 = (Triangle) applicationContext.getBean("triangle");
		//
		//
		// System.out.println(triangle1 == triangle2);

		// Triangle3 triangle3 = (Triangle3) applicationContext.getBean("triangleList");
		//
		// triangle3.draw();

		//
		// Triangle2 triangle2 = (Triangle2)
		// applicationContext.getBean("parentExample");
		//
		// System.out.println(triangle2);

	//	Triangle4 triangle4 = (Triangle4) applicationContext.getBean("exempluConstructorDestructor");

		//System.out.println(triangle4);

	}
}
