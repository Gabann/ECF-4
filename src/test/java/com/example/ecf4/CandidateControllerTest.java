package com.example.ecf4;

import com.example.ecf4.controller.CandidateController;
import com.example.ecf4.model.Candidate;
import com.example.ecf4.service.CandidateService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CandidateControllerTest
{
	@Mock
	private CandidateService candidateService;

	@Mock
	private Model model;

	@InjectMocks
	private CandidateController candidateController;

	@Test
	void testGetById()
	{
		Long testId = 1L;
		Candidate testCandidate = new Candidate();
		testCandidate.setId(testId);
		testCandidate.setFirstName("First name");
		testCandidate.setLastName("Last name");

		when(candidateService.getById(testId)).thenReturn(testCandidate);

		String viewName = candidateController.getById(testId, model);

		verify(candidateService).getById(testId);
		verify(model).addAttribute("candidate", testCandidate);
		assertEquals("candidateDetails", viewName);
	}
}
