package com.dnb.testDemo.service;

import java.util.Optional;

import com.dnb.testDemo.dto.Application;

public interface ApplicationService {
	 public Application createApplication(Application application);
	 Optional<Application> getApplicationByID(String appId);
	 public boolean deleteApplicationById(String appID);
	 public Iterable<Application> getAllApplication();
}
