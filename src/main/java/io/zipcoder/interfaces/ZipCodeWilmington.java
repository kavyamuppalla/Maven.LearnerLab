package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private Students students;
    private Instructors instructors;
    private static ZipCodeWilmington INSTANCE;
    private ZipCodeWilmington() {
        this.students = Students.getInstance();
        this.instructors = Instructors.getInstance();
    }
    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(),numberOfHours);
    }
    public void hostLecture(long id, double numberOfHours) {
        Teacher teacher = instructors.findById(id);
        teacher.lecture(students.toArray(),numberOfHours);

    }
   public Map getStudyMap() {
        Map<Student,Double> studentmap = new HashMap<Student, Double>();
        for(Student student : students.toArray())
        studentmap.put(student, student.getTotalStudyTime());
        return studentmap;
   }
   public static ZipCodeWilmington getInstance(){
        if(INSTANCE == null) {
            INSTANCE = new ZipCodeWilmington();
        }
        return INSTANCE;
   }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
