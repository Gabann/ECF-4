package com.example.ecf4.service;

import com.example.ecf4.model.JobInterview;
import com.example.ecf4.repository.JobInterviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobInterviewService
{
	private final JobInterviewRepository repository;

	public JobInterviewService(JobInterviewRepository jobInterviewRepository)
	{
		this.repository = jobInterviewRepository;
	}

	public List<JobInterview> getAll()
	{
		return repository.findAll();
	}

	public void save(JobInterview jobInterview)
	{
		repository.save(jobInterview);
	}

	public void delete(Long id)
	{
		repository.deleteById(id);
	}
}
