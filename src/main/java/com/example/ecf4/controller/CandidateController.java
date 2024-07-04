package com.example.ecf4.controller;

import com.example.ecf4.model.Candidate;
import com.example.ecf4.service.CandidateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/candidate")
public class CandidateController
{
	CandidateService candidateService;

	public CandidateController(CandidateService candidateService)
	{
		this.candidateService = candidateService;
	}

	@GetMapping("/all")
	String getAll(Model model)
	{
		model.addAttribute("candidates", candidateService.getAll());
		return "candidateList";
	}

	@GetMapping("{id}")
	public String getById(@PathVariable Long id, Model model)
	{
		model.addAttribute("candidate", candidateService.getById(id));
		return "candidateDetails";
	}

	@GetMapping("/add")
	String addCandidate(Model model)
	{
		model.addAttribute("candidate", new Candidate());
		return "addCandidate";
	}

	@PostMapping("/add")
	String addCandidate(@ModelAttribute Candidate candidate)
	{
		candidateService.save(candidate);
		return "redirect:/candidate/all";
	}

	@PostMapping("/delete/{id}")
	String deleteCandidate(@PathVariable Long id)
	{
		candidateService.delete(id);
		return "redirect:/candidate/all";
	}

	@GetMapping("/edit/{id}")
	String editCandidate(@PathVariable Long id, Model model)
	{
		model.addAttribute("candidate", candidateService.getById(id));
		return "editCandidate";
	}

	@PostMapping("/edit")
	String editCandidate(@ModelAttribute Candidate candidate)
	{
		candidateService.save(candidate);
		return "redirect:/candidate/all";
	}
}
