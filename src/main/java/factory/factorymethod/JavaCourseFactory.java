
package factory.factorymethod;

import factory.ICourse;
import factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{
    public ICourse createCourse() {
        return new JavaCourse();
    }
}
