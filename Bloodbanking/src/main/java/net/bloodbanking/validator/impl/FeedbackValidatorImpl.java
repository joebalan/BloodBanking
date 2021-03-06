package net.bloodbanking.validator.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import net.bloodbanking.dto.FeedbackDTO;
import net.bloodbanking.dto.FeedbackDTO.validateProcessFeedback;
import net.bloodbanking.exception.ApplicationException;
import net.bloodbanking.exception.ApplicationMessage;
import net.bloodbanking.validator.BaseValidator;
import net.bloodbanking.validator.FeedbackValidator;

@Component("feedbackValidator")
public class FeedbackValidatorImpl extends BaseValidator<FeedbackDTO> implements FeedbackValidator {
	
	@Override
	public void validateProcessFeedback(FeedbackDTO feedbackDTO) throws ApplicationException {
		List<ApplicationMessage> messages = new ArrayList<ApplicationMessage>();
		validateDTOGroups(feedbackDTO, false, validateProcessFeedback.class);
		throwExceptionOnValidation(messages);
	}
}