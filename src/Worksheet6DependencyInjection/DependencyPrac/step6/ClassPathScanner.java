package DependencyPrac.step6;

import java.io.File;
import java.net.URL;
import java.util.*;

public class ClassPathScanner {

    public static Set<Class<?>> getAllClassesInPackage(String packageName) throws Exception{

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace(".","/");
        Enumeration<URL> resources = (Enumeration<URL>) classLoader.resources(path);
        List<File> dirs = new ArrayList<>();
        while(resources.hasMoreElements()){
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        Set<Class<?>> classes = new HashSet<>();
        for(File directory : dirs){
            classes.addAll(findClasses(directory , packageName));
        }
        return classes;
    }

    private static List<Class<?>> findClasses(File directory , String packageName) throws Exception{
        List<Class<?>> classes = new ArrayList<>();
        if(!directory.exists()){
            return classes;
        }
        File[] files = directory.listFiles();
        for(File file : files){
            if(file.isDirectory()){
                classes.addAll(findClasses(file,packageName +  "." + file.getName()));
            } else if( file.getName().endsWith(".class")){
                classes.add(Class.forName(packageName+ "." + file.getName().substring(0,file.getName().length()-6)));
            }
        }
        return classes;
    }
}
