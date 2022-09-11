package lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

  public static void main(String[] args) {

    HashMap<String, Integer> marselResult = new HashMap<>();
    marselResult.put("Math", 3);
    marselResult.put("Eng", 2);
    Student marsel = new Student("Марсель", "A", 1, marselResult);

    HashMap<String, Integer> annaResult = new HashMap<>();
    annaResult.put("Math", 4);
    annaResult.put("Eng", 5);
    Student anna = new Student("Анна", "B", 2, annaResult);

    List<Student> students = new ArrayList<>();
    students.add(marsel);
    students.add(anna);

    checkAndDeleteStudent(students);
    printStudents(students, 3);
  }

  private static void checkAndDeleteStudent(List<Student> students) {
    AtomicReference<Short> score = new AtomicReference<>((short) 0);
    List<Student> badStudents = students.stream().filter(s -> {
      for (Map.Entry<String, Integer> resultsSet : s.getSubjectResults().entrySet()) {
        score.updateAndGet(v -> (short) (v + resultsSet.getValue()));
      }

      if (score.get() / (short) students.size() >= 3) {
        s.setCourse(s.getCourse() + 1);
        return false;
      }
      return true;
    }).toList();

    students.removeAll(badStudents);
  }

  private static void printStudents(List<Student> students, int course) {
    students.forEach(s -> {
      if (s.getCourse() == course) {
        System.out.println(s.getName());
      }
    });
  }
}
