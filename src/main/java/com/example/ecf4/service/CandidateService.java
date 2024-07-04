package com.example.ecf4.service;

import com.example.ecf4.repository.CandidateRepository;
import org.springframework.stereotype.Service;

@Service
public class CandidateService
{
	private final CandidateRepository repository;

	public CandidateService(CandidateRepository candidateRepository)
	{
		this.repository = candidateRepository;
	}
}
