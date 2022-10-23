package org.tnsindia.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Documented;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface custom
{
	String print() default "Tejal";
	int speed()default 40;
	float salary() default 45000.80f;
}

class CustomAnnotationClass
{
	@custom(print="Hello Guys!",speed=30,salary=89000.10f)
	public  void display()
	{
		System.out.println("Hurrah! Its sumday and its funnnnn day");
	}
}

public class CustomAnnotationDemo {

	public static void main(String[] args) throws NoSuchMethodException, Exception {
		
		CustomAnnotationClass c=new CustomAnnotationClass();
        c.display();
        Method m=c.getClass().getMethod("display");
        custom obj=m.getAnnotation(custom.class);
        System.out.println(obj.print());
        System.out.println(obj.speed());
        System.out.println(obj.salary());
	}

}
