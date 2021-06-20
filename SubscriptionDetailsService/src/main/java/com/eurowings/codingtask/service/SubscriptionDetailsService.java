package com.eurowings.codingtask.service;

import com.eurowings.codingtask.dto.ResponseDto;

public interface SubscriptionDetailsService {

	ResponseDto getSubscriptionDetails(Long userId);

}
