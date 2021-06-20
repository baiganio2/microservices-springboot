package com.eurowings.codingtask.service;

import com.eurowings.codingtask.dto.ResponseDto;
import com.eurowings.codingtask.dto.SubscriptionDto;

public interface SubscriptionService {

	ResponseDto updateSubscriptionStatus(SubscriptionDto subscriptionDto);

	ResponseDto getSubscriptionPermission(Long userId);

}
