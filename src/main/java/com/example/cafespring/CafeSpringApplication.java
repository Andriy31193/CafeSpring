package com.example.cafespring;

import com.example.cafespring.Entity.ClientEntity;
import com.example.cafespring.Repository.ClientRepository;
import com.example.cafespring.Service.ClientService;
import com.example.cafespring.Service.impl.ClientServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class CafeSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(CafeSpringApplication.class, args);

		ClientServiceImpl clientService = context.getBean(ClientServiceImpl.class);

		ClientEntity clientEntity = new ClientEntity();
		clientEntity.setName("Володя");
		clientEntity.setDiscount(50.0);
		Calendar calendar = Calendar.getInstance();
		calendar.set(2005, Calendar.DECEMBER, 16, 0, 0, 0); // Устанавливаем секунды, минуты и часы в ноль
		calendar.set(Calendar.MILLISECOND, 0); // Устанавливаем миллисекунды в ноль
		Date date = calendar.getTime();

		clientEntity.setBirthDate(date);

		clientService.saveClient(clientEntity);

	}

}
