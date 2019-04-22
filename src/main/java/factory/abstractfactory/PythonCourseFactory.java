
package factory.abstractfactory;

import factory.ICourse;
import factory.JavaCourse;
import factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    public ICourse createCourse() {
        return new PythonCourse();
    }

    public INote createNode() {
        return null;
    }

    public IVideo createVideo() {
        return null;
    }
}
