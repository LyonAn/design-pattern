/**
 * 简单工厂，通过类名反射创建实例
 * 违背了开闭原则
 */
package factory.simplefactory;

import factory.ICourse;

public class CourseFactory {

    public ICourse createCourse(Class clazz){
        try {
            if(null != clazz){
                return (ICourse) clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;

    }
}
