package com.springpractica1.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springpractica1.beans.ClienteBean;

public class ClientesApp {

	public static void main(String[] args) {
		
		//Forma tradicional | Programador Crear sus instancias
		ClienteBean AxelCliente = new ClienteBean();
		ClienteBean AdanCliente = new ClienteBean();
		
		AxelCliente.setIdcliente("1");
		AxelCliente.setNombreCliente("Axel");
		AxelCliente.setDomicilioCliente("Ijalti");
		
		AdanCliente.setIdcliente("2");
		AdanCliente.setNombreCliente("Adancho");
		AdanCliente.setDomicilioCliente("Pomada de la campana");
		
		System.out.println("Cliente Axel:"+AxelCliente);
		System.out.println("Cliente Adancho:"+AdanCliente);
		
		//Forma Spring | IoC (Inversion of Control)
		/*Resource resource = new ClassPathResource("ClientesBeans.xml");
		BeanFactory miFactory = new XmlBeanFactory(resource);
		
		ClienteBean miCliente1 = (ClienteBean) miFactory.getBean("NeltzyCliente");
		ClienteBean miCliente2 = miFactory.getBean("GerardoCliente", ClienteBean.class);
		ClienteBean miCliente3 = (ClienteBean) miFactory.getBean("DaniCliente");
	
		System.out.println("Mi Cliente1:"+miCliente1);
		System.out.println("Mi Cliente2:"+miCliente2);
		System.out.println("Mi Cliente3:"+miCliente3);*/
		ApplicationContext context = new ClassPathXmlApplicationContext("ClientesBeans.xml");
		/*	
		ClienteBean miCliente1 = (ClienteBean) context.getBean("NeltzyCliente");
		ClienteBean miCliente2 = context.getBean("GerardoCliente", ClienteBean.class);
		ClienteBean miCliente3 = (ClienteBean) context.getBean("DaniCliente");
	
		System.out.println("Mi Cliente1:"+miCliente1);
		System.out.println("Mi Cliente2:"+miCliente2);
		System.out.println("Mi Cliente3:"+miCliente3);*/
	}

}
