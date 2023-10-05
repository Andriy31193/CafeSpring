package com.example.cafespring;

import com.example.cafespring.Service.interfaces.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CafeSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(CafeSpringApplication.class, args);
		ClientService clientService = context.getBean(ClientService.class);
		OrderService orderService = context.getBean(OrderService.class);
		StaffService staffService = context.getBean(StaffService.class);
		DishService dishService = context.getBean(DishService.class);
		WorkScheduleService workScheduleService = context.getBean(WorkScheduleService.class);


		System.out.println(workScheduleService.findAllWorkSchedules());







	}

}
