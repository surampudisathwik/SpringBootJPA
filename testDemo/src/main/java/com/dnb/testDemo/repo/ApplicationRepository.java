package com.dnb.testDemo.repo;

import org.springframework.data.repository.CrudRepository;

import com.dnb.testDemo.dto.Application;

public interface ApplicationRepository extends CrudRepository<Application, String>{

}
