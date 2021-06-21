package com.eurowings.codingtask;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.eurowings.codingtask.dto.ResponseDto;
import com.eurowings.codingtask.service.SubscriptionDetailsService;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class DetailServiceTest {
	@Autowired
	SubscriptionDetailsService detailService;
	
	@Test
	@DisplayName("test to get user subscription details")
	void testSubscriptionDetails() {
		ResponseDto responseDto = detailService.getSubscriptionDetails(2L);
		assertEquals(responseDto.getStatus(), "success");
		assertThat(responseDto.getData().getDataItems().size() > 0);
	}
}
