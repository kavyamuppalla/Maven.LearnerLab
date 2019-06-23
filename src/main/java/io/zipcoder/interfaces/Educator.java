package io.zipcoder.interfaces;

public enum Educator implements Teacher{

   KRIS, DOLIO, WILHEM;

   private final Instructor instructor;
   private double timeWorked;

   Educator() {
       this.instructor = new Instructor(this.ordinal() + 1, this.name());
       Instructors.getInstance().add(this.instructor);
       this.timeWorked = 0d;
   }

   public void teach(Learner learner, double numberOfHours) {
       instructor.teach(learner, numberOfHours);
       timeWorked += numberOfHours;
   }

   public void lecture(Learner[] learners, double numberOfHours) {
       instructor.lecture(learners, numberOfHours);
       timeWorked += numberOfHours;
   }
}
