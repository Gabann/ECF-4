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

	public List<JobOffer> getActive()
	{
		return repository.findAll()
				.stream()
				.filter(JobOffer::getActive)
				.toList();
	}

	public void save(JobOffer jobOffer)
	{
		repository.save(jobOffer);
	}

	public void delete(Long id)
	{
		repository.deleteById(id);
	}

	public JobOffer getById(Long id)
	{
		return repository.findById(id).orElse(null);
	}
}
