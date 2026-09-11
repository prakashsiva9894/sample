package com.example.moonloom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.moonloom.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {}
