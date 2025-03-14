package com.ltp.gradesubmission;

import java.util.UUID;

public class Grade {
  private String id;
  private String name;
  private String subject;
  private String grade;

  public Grade(String name, String subject, String grade) {
    this.id = UUID.randomUUID().toString();
    this.name = name;
    this.subject = subject;
    this.grade = grade;
  }


  public String getSubject() {
    return subject;
  }

  public String getId() {
    return id;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }
}
