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
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

@SpringBootApplication
public class CafeSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(CafeSpringApplication.class, args);

		OrderServiceImpl orderService = context.getBean(OrderServiceImpl.class);







	}

}
