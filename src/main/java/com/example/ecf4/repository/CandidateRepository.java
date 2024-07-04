package com.example.ecf4.repository;

import com.example.ecf4.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long>
{
}
