package org.istic.helloworld.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.istic.helloworld.server.HelloWorld;

public class Main {
	/**
	 * Exemple de Client WS sur un hello world
	 */
	public static void main(String[] args) {
		//Cr�ation de la factory de bean
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		//D�finition de la classe de service
		factory.setServiceClass(HelloWorld.class);
		//Adresse du service
		factory.setAddress("http://localhost:9001/helloWorld");
		//Cr�ation du Proxy client
		HelloWorld client = (HelloWorld) factory.create();
		//Appel du service
		String reply = client.sayHi("HI");
		System.out.println("Server said: " + reply);
		//sortie du programme
		System.exit(0);
	}
}