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
	Boolean accepted = null;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	//TODO: fix cascade type, when set to all we get "detached entity passed to persist" error but when not set we can't delete user or
	// job offer without deleting the interview first
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "job_offer_id")
	private JobOffer jobOffer;
}
