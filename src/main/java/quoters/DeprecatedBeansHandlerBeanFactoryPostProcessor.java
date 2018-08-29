package quoters;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author Evgeny Borisov
 */
public class DeprecatedBeansHandlerBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    @SneakyThrows
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] names = beanFactory.getBeanDefinitionNames();
        for (String name : names) {
            Class<?> beanClass = beanFactory.getType(name);
            if (beanClass.isAnnotationPresent(DeprecatedClass.class)) {
                DeprecatedClass annotation = beanClass.getAnnotation(DeprecatedClass.class);
                Class alternative = annotation.alternative();
                beanFactory.getBeanDefinition(name).setBeanClassName(alternative.getName());
            }
        }
    }
}











