package Exam1Take1TookTooLong.Q1DepdencyInjection;


public class UserInfo {

    private Database dataBase;

    public UserInfo(Database dataBase){
        this.dataBase = dataBase;
    }
    public String render(){
        String FirstName = this.dataBase.FirstName.get(0);
        String SecondName = this.dataBase.SecondName.get(0);

        return FirstName + SecondName;
    }
}
/*
Dependency Injection can be described as a unit of functionality or service that is required by another unit of functionality or service.
For example, suppose we provide There exists a class of that delivers information of users of a given application. It does so from a database with the a method render.
A tightly coupled class will have a hardcoded instance of database and use it directly. The problem with this is they are tightly coupled meaning everything must be changed if a a new feature or implementation is required. below is the tightly coupled example.

public class UserInfo {

    private Database dataBase; // hardcoded

    public UserInfo(Database dataBase){
        this.dataBase = dataBase;
    }
    public String render(){
        String FirstName = this.dataBase.FirstName.get(0);
        String SecondName = this.dataBase.SecondName.get(0);

        return FirstName + SecondName;
    }
}

This will work for Database queries on String userNames but what if we now require User Images and they are stored in a special type of database.
We will now have to either change the database variable above  or add another database variable and change the render method or add another variable.
Dependency Injection can solve this "what if" scenario by injection the dependency.
here the userinfo class depends on the database class.
It doesnt care what type of database it is so long as it gets the information it needs.
To illustrate the point being made a basic implementation of Dependency Injection would be to paramaterize the Database , decoupling the Class UserInfo from a hardcoded instance of database.

public class UserInfoDI {

        public UserInfo(){
        }
        public Object render(SomeDatabase database){
            return database.stuff.get(0);
        }
}
 */

