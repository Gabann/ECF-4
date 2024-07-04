package com.example.ecf4.controller;

import com.example.ecf4.model.JobInterview;
import com.example.ecf4.service.CandidateService;
import com.example.ecf4.service.JobInterviewService;
import com.example.ecf4.service.JobOfferService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/jobInterview")
public class JobInterviewController
{
	JobInterviewService jobInterviewService;
	CandidateService candidateService;
	JobOfferService jobOfferService;

	public JobInterviewController(JobInterviewService jobInterviewService, CandidateService candidateService,
	                              JobOfferService jobOfferService)
	{
		this.jobInterviewService = jobInterviewService;
		this.candidateService = candidateService;
		this.jobOfferService = jobOfferService;
	}


	@GetMapping("/all")
	String getAll(Model model)
	{
		model.addAttribute("jobInterviews", jobInterviewService.getAll());
		return "jobInterviewList";
	}

	@GetMapping("{id}")
	String getById(@PathVariable Long id, Model model)
	{
		model.addAttribute("jobInterview", jobInterviewService.getById(id));
		return "jobInterviewDetails";
	}

	@GetMapping("/add")
	String addJobInterview(Model model)
	{
		model.addAttribute("candidates", candidateService.getAll());
		model.addAttribute("jobOffers", jobOfferService.getActive());
		model.addAttribute("jobInterview", new JobInterview());
		return "addJobInterview";
	}

	@PostMapping("/add")
	String addJobInterview(@ModelAttribute JobInterview jobInterview)
	{
		jobInterviewService.save(jobInterview);
		return "redirect:/jobInterview/all";
	}

	@PostMapping("/delete/{id}")
	String deleteJobInterview(@PathVariable Long id)
	{
		jobInterviewService.delete(id);
		return "redirect:/jobInterview/all";
	}

	@PostMapping("/accept/{id}")
	String confirmJobInterview(@PathVariable Long id)
	{
		jobInterviewService.accept(id);
		return "redirect:/jobInterview/all";
	}

	@PostMapping("/reject/{id}")
	String rejectJobInterview(@PathVariable Long id)
	{
		jobInterviewService.reject(id);
		return "redirect:/jobInterview/all";
	}

	@GetMapping("/edit/{id}")
	String editJobInterview(@PathVariable Long id, Model model)
	{
		model.addAttribute("candidates", candidateService.getAll());
		model.addAttribute("jobOffers", jobOfferService.getActive());
		model.addAttribute("jobInterview", jobInterviewService.getById(id));
		return "editJobInterview";
	}

	@PostMapping("/edit")
	String editJobInterview(@ModelAttribute JobInterview jobInterview)
	{
		jobInterviewService.save(jobInterview);
		return "redirect:/jobInterview/all";
	}
}
