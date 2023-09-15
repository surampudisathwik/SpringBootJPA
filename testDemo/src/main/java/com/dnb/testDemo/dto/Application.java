package com.dnb.testDemo.dto;

import java.time.LocalDate;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.dnb.testDemo.utils.CustomApplicationIdGenerator;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class Application {
@Id
@GeneratedValue(strategy= GenerationType.SEQUENCE,generator ="application_seq")
@GenericGenerator(name = "application_seq" , strategy= "com.dnb.testDemo.utils.CustomApplicationIdGenerator", 
parameters = {@Parameter(name=CustomApplicationIdGenerator.INCREMENT_PARAM,value="50"),
		@Parameter(name= CustomApplicationIdGenerator.VALUE_PREFIX_PARAMETER, value="APP_"), 
		@Parameter(name=CustomApplicationIdGenerator.NUMBER_FORMAT_PARAMETER, value="%05d")} )
private String appId;
private LocalDate dob=LocalDate.now();
@NotNull
private int balance;
public Application(@NotNull int balance) {
	super();
	this.balance = balance;
}


}
