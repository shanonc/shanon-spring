package us.codecraft.ioc.beans.factory;

public interface BeanFactory {

    Object getBean(String name)throws Exception;
}
