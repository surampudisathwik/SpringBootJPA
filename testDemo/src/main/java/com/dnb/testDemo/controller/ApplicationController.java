package com.dnb.testDemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnb.testDemo.dto.Application;
import com.dnb.testDemo.exceptions.IdNotFoundException;
import com.dnb.testDemo.service.ApplicationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/application")
public class ApplicationController {
@Autowired
ApplicationService applicationService;
@PostMapping("/create")
public ResponseEntity<?> createAcc(@Valid @RequestBody Application application)
{
	return ResponseEntity.ok(applicationService.createApplication(application));
}

@DeleteMapping("/{appId}")
public ResponseEntity<?> deleteApplicationByID
	(@PathVariable("appId") String appId) {
		return ResponseEntity.ok(applicationService.deleteApplicationById(appId));
}

@GetMapping("/{appId}")
public ResponseEntity<?> getById
(@PathVariable("appId") String appId) throws IdNotFoundException{
	Optional<Application> optional=applicationService.getApplicationByID(appId);
	if(optional.isPresent()) return ResponseEntity.ok(optional);
	else
		throw new IdNotFoundException("Id is not at all valid");
}
}
