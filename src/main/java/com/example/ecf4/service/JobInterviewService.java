package com.example.ecf4.service;

import com.example.ecf4.repository.JobInterviewRepository;
import org.springframework.stereotype.Service;

@Service
public class JobInterviewService
{
	private final JobInterviewRepository repository;

	public JobInterviewService(JobInterviewRepository jobInterviewRepository)
	{
		this.repository = jobInterviewRepository;
	}
}
