package com.malin.rengwuxianrxjava.data;

import java.util.ArrayList;

/**
 * @description 获取学生集合
 * @author malin.myemail@gmail.com
 * @since 15-11-10.
 */
public class DataFactory {


    public static ArrayList<Student> getData() {

        ArrayList<Student> students = new ArrayList<Student>();

        ArrayList<Course> courses = null;
        Student student = null;
        Course course = null;
        for (int i = 0; i < 3; i++) {

            courses = new ArrayList<Course>();

            student = new Student();
            student.id = i;
            student.name = "学生" + i;

            for (int j = 0; j < 2; j++) {
                course = new Course();
                course.id = j;
                course.name = student.name+"的"+"课程" + j;
                courses.add(course);
            }

            student.courses = courses;
            students.add(student);


        }
        return students;
    }
}
