
package factory.simplefactory;

import factory.ICourse;
import factory.JavaCourse;
import factory.PythonCourse;

public class SimpleFactoryTest {

    public static void main(String[] args){
        CourseFactory factory = new CourseFactory();

        ICourse javaCourse = factory.createCourse(JavaCourse.class);

        ICourse pythonCourse = factory.createCourse(PythonCourse.class);

        javaCourse.record();

        pythonCourse.record();
    }
}
