package lesson6;

import java.util.HashMap;

public class Student {

  private String name;
  private String group;
  private int course;
  private HashMap<String, Integer> subjectResults;

  public Student(String name, String group, int course, HashMap<String, Integer> subjectResults) {
    this.name = name;
    this.group = group;
    this.course = course;
    this.subjectResults = subjectResults;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    this.course = course;
  }

  public HashMap<String, Integer> getSubjectResults() {
    return subjectResults;
  }

  public void setSubjectResults(HashMap<String, Integer> subjectResults) {
    this.subjectResults = subjectResults;
  }
}
