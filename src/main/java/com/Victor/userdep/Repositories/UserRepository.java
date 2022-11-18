package com.Victor.userdep.Repositories;

import com.Victor.userdep.Entites.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}

