import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanHelloWord =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHelloWord.getMessage());
        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getName());
        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat1.getName());
        System.out.println(bean == beanHelloWord);
        System.out.println(beanCat == beanCat1);
    }
}