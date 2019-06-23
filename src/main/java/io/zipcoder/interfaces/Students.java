package io.zipcoder.interfaces;


    public class Students extends People<Student> {
        private static final Students INSTANCE  = new Students();
        private Students() {
            Student student1 = new Student(1,"Student1",2);
            super.add(student1);
            Student student2 = new Student(2,"Student2",9);
            super.add(student2);
            Student student3 = new Student(3,"Student3",8);
            super.add(student3);
            Student student4 = new Student(4,"Student4",6);
            super.add(student4);

        }
        public static Students getInstance() {
            //if(INSTANCE == null) {
            //  INSTANCE = new Students();
            //}
            return INSTANCE;
        }

        @Override
        public Student[] toArray() {
            return personList.toArray(new Student[]{});
        }

    }



