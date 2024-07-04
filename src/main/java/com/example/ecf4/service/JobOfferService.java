package com.example.ecf4.service;

import com.example.ecf4.repository.JobOfferRepository;
import org.springframework.stereotype.Service;

@Service
public class JobOfferService
{
	private final JobOfferRepository repository;

	public JobOfferService(JobOfferRepository jobOfferRepository)
	{
		this.repository = jobOfferRepository;
	}
}
