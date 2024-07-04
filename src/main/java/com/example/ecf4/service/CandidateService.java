package com.example.ecf4.service;

import com.example.ecf4.model.Candidate;
import com.example.ecf4.repository.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService
{
	private final CandidateRepository repository;

	public CandidateService(CandidateRepository candidateRepository)
	{
		this.repository = candidateRepository;
	}

	public Candidate getById(Long id)
	{
		return repository.findById(id).orElse(null);
	}

	public List<Candidate> getAll()
	{
		return repository.findAll();
	}

	public void save(Candidate candidate)
	{
		repository.save(candidate);
	}

	public void delete(Long id)
	{
		repository.deleteById(id);
	}
}
