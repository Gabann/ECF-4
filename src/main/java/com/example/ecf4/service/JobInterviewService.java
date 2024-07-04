package com.example.ecf4.service;

import com.example.ecf4.model.JobInterview;
import com.example.ecf4.model.JobOffer;
import com.example.ecf4.repository.JobInterviewRepository;
import com.example.ecf4.repository.JobOfferRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobInterviewService
{
	private final JobInterviewRepository repository;
	private final JobOfferRepository jobOfferRepository;

	public JobInterviewService(JobInterviewRepository jobInterviewRepository, JobOfferRepository jobOfferRepository)
	{
		this.repository = jobInterviewRepository;
		this.jobOfferRepository = jobOfferRepository;
	}

	public List<JobInterview> getAll()
	{
		return repository.findAll();
	}

	@Transactional
	public void save(JobInterview jobInterview)
	{
		repository.save(jobInterview);
	}

	public void delete(Long id)
	{
		repository.deleteById(id);
	}

	public List<JobInterview> getNorAcceptedNorUnaccepted()
	{
		return repository.findAll()
				.stream()
				.filter(jobInterview -> jobInterview.getAccepted() == null)
				.toList();
	}

	public void accept(Long id)
	{
		repository.findById(id).ifPresent(jobInterview ->
		{
			jobInterview.setAccepted(true);
			JobOffer jobOffer = jobInterview.getJobOffer();
			jobOffer.setActive(false);
			repository.save(jobInterview);
			jobOfferRepository.save(jobOffer);
		});
	}

	public void reject(Long id)
	{
		repository.findById(id).ifPresent(jobInterview ->
		{
			jobInterview.setAccepted(false);
			repository.save(jobInterview);
		});
	}
}
