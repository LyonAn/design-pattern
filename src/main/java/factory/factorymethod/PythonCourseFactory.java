
package factory.factorymethod;

import factory.ICourse;
import factory.JavaCourse;
import factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory{
    public ICourse createCourse() {
        return new PythonCourse();
    }
}
