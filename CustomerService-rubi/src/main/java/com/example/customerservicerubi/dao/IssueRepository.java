package com.example.customerservicerubi.dao;

import com.example.customerservicerubi.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Integer> {
}
