package com.example.ecf4.service;

import com.example.ecf4.model.JobOffer;
import com.example.ecf4.repository.JobOfferRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobOfferService
{
	private final JobOfferRepository repository;

	public JobOfferService(JobOfferRepository jobOfferRepository)
	{
		this.repository = jobOfferRepository;
	}

	public List<JobOffer> getAll()
	{
		return repository.findAll();
	}

	public void save(JobOffer jobOffer)
	{
		repository.save(jobOffer);
	}

	public void delete(Long id)
	{
		repository.deleteById(id);
	}
}
