package com.example.ecf4.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "job_interview")
public class JobInterview
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	LocalDate interviewDate;

	@OneToOne(orphanRemoval = true)
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;

	@ManyToOne
	@JoinColumn(name = "job_offer_id")
	private JobOffer jobOffer;

}
