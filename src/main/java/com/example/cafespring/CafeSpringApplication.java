package com.example.cafespring;

import ch.qos.logback.core.pattern.Converter;
import com.example.cafespring.Entity.*;
import com.example.cafespring.Repository.ClientRepository;
import com.example.cafespring.Service.ClientService;
import com.example.cafespring.Service.DishService;
import com.example.cafespring.Service.impl.*;
import org.hibernate.query.sqm.tree.expression.Conversion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

@SpringBootApplication
public class CafeSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(CafeSpringApplication.class, args);
		ClientServiceImpl clientService = context.getBean(ClientServiceImpl.class);
		OrderServiceImpl orderService = context.getBean(OrderServiceImpl.class);
		StaffServiceImpl staffService = context.getBean(StaffServiceImpl.class);
		DishServiceImpl dishService = context.getBean(DishServiceImpl.class);

		var orders = orderService.findClientsAndBaristaTodayOrder();

		List<ClientEntity> clientEntity = (List<ClientEntity>) orders.get(0);
		List<StaffEntity> staffEntity = (List<StaffEntity>) orders.get(1);

		System.out.println(clientEntity.toString());
		System.out.println(staffEntity.toString());





	}

}
