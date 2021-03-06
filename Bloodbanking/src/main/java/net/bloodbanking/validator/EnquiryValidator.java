package net.bloodbanking.validator;

import net.bloodbanking.dto.EnquiryFormDTO;
import net.bloodbanking.exception.ApplicationException;

public interface EnquiryValidator extends Validator<EnquiryFormDTO> {

	void validateProcessEnquiry(EnquiryFormDTO enquiryFormDTO) throws ApplicationException;
	
}
