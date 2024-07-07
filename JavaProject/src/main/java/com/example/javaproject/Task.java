package com.example.javaproject;

public class Task {
    private static int idCounter = 0;
    private int id;
    private String title;
    private String description;
    private String assignee;
    private String status;

    public Task(String title, String description, String assignee, String status) {
        this.id = ++idCounter;
        this.title = title;
        this.description = description;
        this.assignee = assignee;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getStatus() {
        return status;
    }
}
