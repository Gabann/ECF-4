package com.example.ecf4.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "candidate")
public class Candidate
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	String firstName;
	String lastName;
	String email;
	String phone;
	String address;
}
