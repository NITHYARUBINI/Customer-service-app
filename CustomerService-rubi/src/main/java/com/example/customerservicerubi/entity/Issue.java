package com.example.customerservicerubi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Issue {

    @Id
    private Integer issueId;
    private String issueType;
    private LocalDate IssueDate;

    private String issueStatus;
    private String issueDescription;
    private String solution;


    public Issue() {
    }

    public Issue(Integer issueId, String issueType, LocalDate issueDate, String issueStatus, String issueDescription, String solution) {
        this.issueId = issueId;
        this.issueType = issueType;
        IssueDate = issueDate;
        this.issueStatus = issueStatus;
        this.issueDescription = issueDescription;
        this.solution = solution;
    }

    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public LocalDate getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        IssueDate = issueDate;
    }

    public String getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(String issueStatus) {
        this.issueStatus = issueStatus;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}
