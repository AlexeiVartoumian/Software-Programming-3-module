package DependencyPrac;

import DependencyPrac.step1.ServiceA;
import DependencyPrac.step1.ServiceB;
import DependencyPrac.step2.ServeAImple;
import DependencyPrac.step2.ServeBImple;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {

        //step0 : thightly coupled serviceA directly calling service B
        //System.out.println(ServiceA.jobA());

        // the first step shows that the two classes
        // are tightly coupled

        //1 parametarize the  instance of service b on service A

        ServiceB serviceB = new ServiceB();
        ServiceA serviceA = new ServiceA(serviceB);
        System.out.println(serviceA.jobA());

        // step2: separate services according to interfaces
        // which is good for basic imples but the more complex
        // the project the harder the network of services
        // to maintain through main class plus what if a cyclic
        //dependency occurs? proxy design can help but  you could
        //just have setters on both classes  where each object is created
        // then the setter is applied although this could be error-prone.

        //Step 3: Reflection! see static method on Main
        Set<Class<?>> serviceClasses = new HashSet<>();
        serviceClasses.add(ServeAImple.class);
        serviceClasses.add(ServeBImple.class);

        ServiceA serviceA1 = createServiceA(serviceClasses);

        //step 4: this is where Spring framework comes in have
        // an application context i.e a container that handles these things basically
        // all of step 3 thats been put insde a container


        //step5 -> the above jsut creates things in as a whole.
        // if we wanted to pick and choose how the object is created i.e which fields we want
        // then annotations can be used. Also what if we wanted to add more fields?


        //step6 the next step is to do the above but search through
        // all the files with class path and not specify in the code all the classes in a set.

        //further to this created annotations to filter by services otherwise going to add every class
        // when the constxt is created
    }
    //pass in a bunch of classes of the same type set is good here for unique instances
    public static ServiceA createServiceA(Set<Class<?>> serviceClasses) throws Exception{
        //fire up instances on the fly with reflection
        Set<Object> serviceInstances = new HashSet<>();
        for(Class<?> serviceClass : serviceClasses){
            Constructor<?> constructor = serviceClass.getConstructor();
            constructor.setAccessible(true);
            serviceInstances.add(constructor.newInstance());
        }
        //mix and match the services
        for(Object serviceInstance : serviceInstances){
            for(Field field : serviceInstance.getClass().getDeclaredFields()){
                Class<?> fieldType = field.getType();
                field.setAccessible(true);
                for(Object match : serviceInstances){
                    if(fieldType.isInstance(match)){
                        field.set(serviceInstance,match);
                    }
                }
            }
        }
        for(Object service: serviceInstances){
            if(service instanceof  ServiceA){
                return(ServiceA) service;
            }
        }
        return null;

    }
}
