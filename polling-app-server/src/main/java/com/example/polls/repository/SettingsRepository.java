package com.example.polls.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.polls.model.settings;

@Repository
public interface SettingsRepository  extends JpaRepository<settings,Long>{
    
}
