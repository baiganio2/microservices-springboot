package com.eurowings.codingtask.repository;

import java.util.Optional;
import java.util.function.IntPredicate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eurowings.codingtask.entity.Users;
@Repository
public interface UserRepository extends CrudRepository<Users, Long>{
	public Optional<Users> findById(Long userId);

	public Optional<Users> findByUserName(String userName);

}