package com.dnb.testDemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnb.testDemo.dto.Application;
import com.dnb.testDemo.repo.ApplicationRepository;
@Service
public class ApplicationServiceImpl implements ApplicationService {
	@Autowired
	ApplicationRepository applicationRepository;
	@Override
	public Application createApplication(Application application) {
		// TODO Auto-generated method stub
		return applicationRepository.save(application);
	}

	@Override
	public Optional<Application> getApplicationByID(String appId) {
		// TODO Auto-generated method stub
		return applicationRepository.findById(appId);
			
	}

	@Override
	public boolean deleteApplicationById(String appID) {
		// TODO Auto-generated method stub
		if(applicationRepository.existsById(appID))
		{
			applicationRepository.deleteById(appID);
			return true;
		}
			else return false;
	}

	@Override
	public Iterable<Application> getAllApplication() {
		// TODO Auto-generated method stub
		return applicationRepository.findAll();
	}


}
