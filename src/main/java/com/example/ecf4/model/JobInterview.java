package com.example.ecf4.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "job_interview")
public class JobInterview
{
	LocalDate interviewDate;
	String interviewAddress;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "job_offer_id")
	private JobOffer jobOffer;
}
