package com.eurowings.codingtask.service;

import com.eurowings.codingtask.dto.ResponseDto;
import com.eurowings.codingtask.dto.SubscriptionDto;
import com.eurowings.codingtask.dto.UserDto;

public interface UserService {

	ResponseDto saveUserDetails(UserDto userDto);

	ResponseDto updateSubscriptionStatus(SubscriptionDto subscriptionDto);

	ResponseDto getSubscriptionDetails(Long userId);

}
