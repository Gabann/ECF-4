package com.example.ecf4.controller;

import com.example.ecf4.model.JobOffer;
import com.example.ecf4.service.JobOfferService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/jobOffer")
public class JobOfferController
{
	JobOfferService jobOfferService;

	public JobOfferController(JobOfferService jobOfferService)
	{
		this.jobOfferService = jobOfferService;
	}

	@GetMapping("/all")
	String getAll(Model model)
	{
		model.addAttribute("jobOffers", jobOfferService.getAll());
		return "jobOfferList";
	}

	@GetMapping("/add")
	String addJobOffer(Model model)
	{
		model.addAttribute("jobOffer", new JobOffer());
		return "addJobOffer";
	}

	@PostMapping("/add")
	String addJobOffer(@ModelAttribute JobOffer jobOffer)
	{
		jobOfferService.save(jobOffer);
		return "redirect:/jobOffer/all";
	}

	@PostMapping("/delete/{id}")
	String deleteJobOffer(@PathVariable Long id)
	{
		jobOfferService.delete(id);
		return "redirect:/jobOffer/all";
	}
}
