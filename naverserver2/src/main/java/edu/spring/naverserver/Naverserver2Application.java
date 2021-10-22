package edu.spring.naverserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import mybatis.EmpDAO;

@SpringBootApplication
@ComponentScan
@ComponentScan(basePackageClasses =EmpDAO.class )
@MapperScan(basePackageClasses =EmpDAO.class )
public class Naverserver2Application {

	public static void main(String[] args) {
		SpringApplication.run(Naverserver2Application.class, args);
	}

}
