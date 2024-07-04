package com.example.ecf4.service;

import com.example.ecf4.model.Candidate;
import com.example.ecf4.model.JobInterview;
import com.example.ecf4.model.JobOffer;
import com.example.ecf4.repository.JobInterviewRepository;
import com.example.ecf4.repository.JobOfferRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JobInterviewService
{
	private final JobInterviewRepository repository;
	private final JobOfferRepository jobOfferRepository;

	@Autowired
	private RestTemplate restTemplate;

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
			Candidate candidate = jobInterview.getCandidate();
			jobOffer.setActive(false);
			repository.save(jobInterview);
			jobOfferRepository.save(jobOffer);

			Map<String, Object> requestBody = new HashMap<>();
			requestBody.put("firstName", candidate.getFirstName());
			requestBody.put("lastName", candidate.getLastName());
			requestBody.put("email", candidate.getEmail());
			requestBody.put("phone", candidate.getPhone());
			requestBody.put("address", candidate.getAddress());
			//TODO: add the functionality to set the department and position instead of hardcoding them
			Map<String, Object> department = new HashMap<>();
			department.put("id", 1);
			requestBody.put("department", department);
			Map<String, Object> position = new HashMap<>();
			position.put("id", 1);
			requestBody.put("position", position);

			HttpEntity<Map<String, Object>> request = new HttpEntity<>(requestBody);
			String url = "http://localhost:8080/ECF_4_Rest_war_exploded/api/employee/save";

			restTemplate.postForEntity(url, request, JobInterview.class);
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

	public JobInterview getById(Long id)
	{
		return repository.findById(id).orElse(null);
	}
}
