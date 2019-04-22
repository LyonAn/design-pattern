
package factory.abstractfactory;

import factory.ICourse;

public interface ICourseFactory {

    ICourse createCourse();

    INote createNode();

    IVideo createVideo();
}
