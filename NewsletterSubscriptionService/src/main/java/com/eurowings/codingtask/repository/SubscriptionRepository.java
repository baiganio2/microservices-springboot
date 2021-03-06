package com.eurowings.codingtask.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eurowings.codingtask.entity.Subscriptions;

@Repository
public interface SubscriptionRepository extends CrudRepository<Subscriptions, Long>{

	public Optional<Subscriptions> findByUserId(Long userId);

}
