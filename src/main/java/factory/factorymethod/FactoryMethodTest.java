
package factory.factorymethod;

import factory.ICourse;

public class FactoryMethodTest {
    public static void main(String[] args){

        ICourseFactory factory = new JavaCourseFactory();
        ICourse javaCourse= factory.createCourse();
        javaCourse.record();
    }
}
