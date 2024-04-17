[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-7f7980b617ed060a017424585567c406b6ee15c891e84e1186181d67ecf80aa0.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=14766957)
# Worksheet on Design Patterns (Part III)

## Behavioural Design Patterns

Part III of the continuing series of exercises on Design Patterns

In these exercises we will be examining the following design patterns:

1. Chain of Responsibility 
2. Command
5. Mediator 
6. State
9. Template method 

---

1. This question concerns the *Chain of Responsibility* design pattern.

	Your company has won a contract to provide an analytical application to a health company. 
	The application should tell the user about a particular health problem, its history, its treatment,
	medicines, interview of the person suffering from it, etc.; basically everything that is required to know
	about it. 
	For this, your company receives a huge amount of data. 
	The data could be in any format, it could text files, doc files, excels, audio, images, videos, 
	anything that you can think of would be there.

	Your task is to save this data in the company’s database. 
	Users will provide the data in any format and you should provide them a single interface to 
	upload the data into the database. 
	The user is not interested, not even aware, to know that how you are saving 
	the different unstructured data? 
	The problem here is that you need to develop different handlers to save the various formats of data. 
	For example, a text file save handler does not know how to save an mp3 file.

	To solve this problem you can use the Chain of Responsibility design pattern. 
	You can create different objects which process different formats of data and chain them together. 
	When a request comes to a single object, it will check whether it can process and handle the specific 
	file format. 
	If it can, it will process it; otherwise, it will forward it to the next object chained to it. 
	This design pattern also decouples the user from the object that is serving the request; 
	the user is not aware which object is actually serving its request.
	
	To implement the Chain of Responsibility pattern to solve the above problem, 
	you will create an interface, `Handler`.
	```java
	public interface Handler {
		public void setHandler(Handler handler);
		public void process(File file);
		public String getHandlerName();
	}
	```
	The above interface contains two main methods, the `setHandler` and the `process` methods. 
	
	`setHandler` is used to set the next handler in the chain, whereas; the `process` method is 
	used to process the request, only if the handler is able process the request. 
	Optionally, we have the `getHandlerName` method which is used to return the handler’s name. 
	The handlers are designed to process files which contain data. 
	The concrete handler checks if it’s able to handle the file by checking the file type, 
	otherwise it forwards to the next handler in the chain.
	
	The `File` class looks like this:
	```java
	public class File {
		private final String fileName;
		private final String fileType;
		private final String filePath;
	
		public File(String fileName, String fileType, String filePath){
			this.fileName = fileName;
			this.fileType = fileType;
			this.filePath = filePath;
		}
	
		public String getFileName() {
			return fileName;
		}
	
		public String getFileType() {
			return fileType;
		}
	
		public String getFilePath() {
			return filePath;
		}
	}
	```
	The `File` class creates simple file objects which contain the file name, file type, and the file path. 
	The file type would be used by the handler to check if the file can be handled by them or not. 
	If a handler can, it will process and save it, or it will forward it to the next handler in the chain.
	
	Your solution should satisfy the tests specified in the `TestChainofResponsibility` class 
	from the repository.
	The program should produce the following output:
	```
	Text Handler forwards request to Doc Handler
	Doc Handler forwards request to Excel Handler
	Excel Handler forwards request to Audio Handler
	Process and saving audio file... by Audio Handler
	
	Text Handler forwards request to Doc Handler
	Doc Handler forwards request to Excel Handler
	Excel Handler forwards request to Audio Handler
	Audio Handler forwards request to Video Handler
	Process and saving video file... by Video Handler
	
	Text Handler forwards request to Doc Handler
	Process and saving doc file... by Doc Handler
	
	Text Handler forwards request to Doc Handler
	Doc Handler forwards request to Excel Handler
	Excel Handler forwards request to Audio Handler
	Audio Handler forwards request to Video Handler
	Video Handler forwards request to Image Handler
	File not supported
	```
2. This question concerns the *Command* design pattern.

	You are required to create an application to execute different types of jobs. 
	A job can be anything in a system, for example, sending emails, SMS, logging, or performing some 
	IO functions. 
	The Command pattern will help to decouple the invoker from a receiver and helps to execute any type 
	of job without knowing its implementation. 
	We’ll make this example more interesting by creating threads which will help to execute 
	these jobs concurrently. 
	As these jobs are independent of each other, so the sequence of execution of these jobs 
	is not really important. 
	We will create a thread pool to limit the number of threads to execute jobs. 
	A command object will encapsulate jobs and will hand it over to a thread 
	from the pool that will execute the job.
	
	The command object will be referenced by a common interface and will contain a method that will 
	be used to execute the requests. 
	The concrete command classes will override that method and will provide their own 
	specific implementation to execute the request.
	```java
	public interface Job {
		public void run();
	}
	```
	The `Job` interface is the command interface, contains a single method run, 
	which is executed by a thread. 
	Our command’s `execute` method is the `run` method which will be used to execute by a thread to 
	get the work done. 
	There would be different types of job that can be executed. 
	The following is one of the concrete classes whose instances will be executed by 
	the different command objects:
	```java
	public class Email {
		public void sendEmail(){
			System.out.println("Sending email.......");
		}
	}
	```
	The implementation classes of the `Job` interface hold a reference to their respective classes that 
	will be used to carry out the task. 
	Each of the classes overrides the `run` method and this details the work requested. 
	For example, the `SmsJob` class is used to send sms, its `run` method calls the `sendSms` method of an 
	`Sms` object to carry out the work.
	
	You can set different objects one by one to the same command object.
	
	On the worksheet repository is the `ThreadPool` class used to create a pool of threads and allow a thread to 
	fetch and execute the job from the job queue. The class is used to create *n* threads (worker threads). 
	Each worker thread will wait for a job in a queue and then execute the job and will go back to waiting
	state. The class contains a job queue; when a new job will be added into the queue, 
	a worker thread from the pool will execute the job.
	
	Your solution should satisfy the tests specified in the `TestCommandPattern` class from the repository:
	The code should result in (something like) the following output:
	```
	Job ID: 9 executing email jobs.
	Sending email.......
	Job ID: 12 executing logging jobs.
	Job ID: 17 executing email jobs.
	Sending email.......
	Job ID: 13 executing email jobs.
	Sending email.......
	Job ID: 10 executing sms jobs.
	Sending SMS...
	Job ID: 11 executing fileIO jobs.
	Executing File IO operations...
	Job ID: 18 executing sms jobs.
	Sending SMS...
	Logging...
	Job ID: 16 executing logging jobs.
	Logging...
	Job ID: 15 executing fileIO jobs.
	Executing File IO operations...
	Job ID: 14 executing sms jobs.
	Sending SMS...
	Job ID: 12 executing fileIO jobs.
	Executing File IO operations...
	Job ID: 10 executing logging jobs.
	Logging...
	Job ID: 18 executing email jobs.
	Sending email.......
	Job ID: 16 executing sms jobs.
	Sending SMS...
	Job ID: 14 executing fileIO jobs.
	Executing File IO operations...
	Job ID: 9 executing logging jobs.
	Logging...
	Job ID: 17 executing email jobs.
	Sending email.......
	Job ID: 13 executing sms jobs.
	Sending SMS...
	Job ID: 15 executing fileIO jobs.
	Executing File IO operations...
	Job ID: 11 executing logging jobs.
	Logging...
	
	```
	Due to the nature of concurrency the output may differ on subsequent executions.	
	
3. This question concerns the *Mediator* design pattern.
	
	A major electronic company has asked you to develop a piece of software to operate its new fully automatic washing machine. 
	The company has provided you with the hardware specification and the working knowledge of the machine. 
	In the specification, they have provided you the different washing programs the machine supports. 
	They want to produce a fully automatic washing machine that will require almost zero human intervention. 
	The user should only need to connect the machine with a tap to supply water, load the clothes to wash, 
	set the type of clothes in the machine like cotton, silk, or denims etc, provide detergent and 
	softener to their respective trays, and press the start button.

	The machine should be smart enough to fill the water in the drum, as much as required. 
	It should adjust the wash temperature by itself by turning the heater on, according to the type of clothes in it. 
	It should start the motor and spin the drum as much required, rinse according to the clothes needs, 
	use soil removal if required, and softener too.

	As an object oriented developer, you started analysing and classifying objects, classes, and their relationships. 
	Let’s check some of the important classes and parts of the system. 
	
	First of all, a `Machine` class, which has a drum. So a `Drum` class, but also a heater, a sensor to check the temperature, a motor. 
	Additionally, the machine also has a valve to control the water supply, a soil removal, detergent, 
	and a softener.
	
	These classes have a very complex relationship with each other, and the relationship also varies. 
	Please note that currently we are talking only about the high level abstraction of the machine. 
	If we try to design it without keeping much of OOP principles and patterns in mind, then the initial design would be very tightly coupled and hard to maintain. 
	This is because the above classes should contact with each other to get the job done. 
	
	For example, the `Machine` class should ask the `Valve` class to open the valve, or the `Motor` 
	should spin the `Drum` at certain rpm according to the wash program set (which is set by the type of clothes in the machine). 
	Some type of clothes require softener or soil removal, while others don’t, or the temperature should be set according to the type of clothes.
	
	If we allow classes to contact each other directly, that is, by providing a reference, the design will become very tightly coupled and hard to maintain. 
	It would become very difficult to change one class without affecting the other. 
	Even worse, the relationship between the classes varies, according to the different wash programs, like different temperature for different type of clothes; so these classes won’t able to be reused.
	To support all the wash programs we need to put control statements like *if-else* in the code which would make the code even more complex and difficult to maintain.
	
	To decouple these objects from each other we need a mediator, which will contact the object on behalf 
	of the other object, hence providing loose coupling between them. 
	The object only needs to know about the mediator, and perform operations on it. 
	The mediator will perform operations on the required underlying object in order to get the work done.
	
	You will see how the Mediator design pattern will make the washing machine design better:
	+ Reusable, 
	+ Maintainable, and 
	+ Loosely coupled.
	
	The `MachineMediator` is an interface which acts as a generic mediator:

	```java
	public interface MachineMediator {	
		public void start();
		public void wash();
		public void open();
		public void closed();
		public void on();
		public void off();
		public boolean checkTemperature(int temp);
	}
	```	
	
	The `Colleague` interface has one method to set the mediator for the concrete colleague’s class:
	
	```java
	public interface Colleague {	
		public void setMediator(MachineMediator mediator);
	}
	```
	
	The `Button` class is a colleague class which holds a reference to a mediator:
	
	```java
	public class Button implements Colleague {	
		private MachineMediator mediator;
	
		@Override
	    public void setMediator(MachineMediator mediator){
			this.mediator = mediator;
		}
	
		public void press(){
			System.out.println("Button pressed.");
			mediator.start();
		}
	}	
	```
	
	The user presses the button which calls the `press` method of this class which in turn, 
	calls the `start` method of the concrete mediator class. 
	This `start` method of the mediator calls the `start` method of the machine class on behalf of the 
	`Button` class.
	
	As stated by the company, the washing machine has a set of wash programs and the software should support all these programs. 
	The following mediator is set as a washing program for cottons, so parameters such as temperature, drum spinning speed, level of soil removal, etc., are set accordingly. 
	We can have different mediators for different washing programs without changing the existing colleague classes and thus providing loose coupling and reusability. 
	All these *colleague* classes can be reused with the other washing machine programs. 
	(See `CottonMediator` from the repository.)
	
	To see the advantages and power of the Mediator design pattern, let’s take another mediator that is used as a washing program for denim jeans. 
	Now we just need to create a new mediator and set the rules in it to wash denims: 
	
	+ rules like temperature, 
	+ the speed at which drum will spin, 
	+ whether softener is required or not, 
	+ the level of the soil removal, 
	+ etc. 
	
	We don’t need to change anything in the existing structure. 
	No conditional statements like *if-else* are required, something that would otherwise increase the complexity. 
	(See the `DenimMediator` class on the repository.)
	
	Now we test these mediators using the `TestMediator` class (from the repository) and it should produce the following output:
	
	```
	Setting up for COTTON program
	Button pressed.
	Valve is opened...
	Filling water...
	Valve is closed...
	Heater is on...
	Temperature reached 40 C
	Temperature is set to 40
	Heater is off...
	Start motor...
	Rotating drum at 700 rpm.
	Adding detergent
	Setting Soil Removal to low
	Adding softener
	
	**********************************************************
	
	Setting up for DENIM program
	Button pressed.
	Valve is opened...
	Filling water...
	Valve is closed...
	Heater is on...
	Temperature reached 30 C
	Temperature is set to 30
	Heater is off...
	Start motor...
	Rotating drum at 1400 rpm.
	Adding detergent
	Setting Soil Removal to medium
	No softener is required	
	```

6. This question concerns the *State* design pattern.

    To illustrate this design pattern you will help a company which wishes to build a robot for cooking. 
	The company wants a simple robot that can simply *walk* and *cook*. 
	A user can operate a robot using a set of commands via remote control. 
	Currently, a robot can do three things, it can 
	
	1. walk, 
	2. cook, or 
	3. can be switched off.
	
	The company has set protocols to define the functionality of the robot. 
	If a robot is in an **on** state you can command it to walk. 
	If asked to cook, the state would change to **cook** or if set to **off**, it will be switched off.
	
	Similarly, when in **cook** state it can walk or cook, but cannot be switched off. 
	Finally, when in the **off** state it will automatically turn on and walk when the user commands 
	it to walk but cannot cook in the **off** state.
	
	This might look like an easy implementation: a robot class with a set of methods:

	+ `walk`, 
	+ `cook`, 
	+ `off` 
	
	and states: 

	+ `on`, 
	+ `cook`, and 
	+ `off`. 
	
	We can use *if-else* branches, or *switches*, to implement the protocols set by the company. 
	Too many of these statements will create a maintenance nightmare as complexity might 
	increase in the future.
	
	You might think that we can implement this without issues using *if-else* statements, 
	but as a change comes the code would become more complex. 
	The requirement clearly shows that the behaviour of an object is truly based on the state of that object. 
	
	To achieve this you can use the *State* design pattern which encapsulates the states of the 
	object, by using another individual class and keeps the context class independent of any state change.
	
	The following is the interface which contains the behaviour of a robot:

	```java
	public interface RoboticState {
		public void walk();
		public void cook();
		public void off();
	}
	```

	The following class is a concrete class implements the interface. 
	The class contains the set of all possible states a robot can be in (`Robot` on the repository).
	The class initialises all the states and sets the current state as `on`.
	
	Now, we will see all the concrete states of a robot. 
	A robot will be in one of these states at any time:

	+ `RoboticOn`
	+ `RoboticCook`
	+ `RoboticOff`

	We can test the code using the `TestStatePattern` class in the worksheet repository.
	Running the test class should result to the following output:

	```
	Walking...
	Cooking...
	Walking...
	Robot is switched off
	Walking...
	Robot is switched off
	Cannot cook at Off state.
	```

10. This question concerns the *Template* design pattern and, as the name suggests, 
	it provides a template or a structure of an algorithm which is used by users. 
	A user provides its own implementation without changing the algorithm’s structure.

	There will be many instances when you are required to connect to a relation database using a 
	Java application? 
	There are some important steps which are required to connect and insert data into the database. 
	First, we need a driver according to the database we want to connect with. 
	Then, we pass some credentials to the database, then, we prepare a statement, 
	set data into the insert statement and insert it using the insert command. 
	Later, we close all the connections, and optionally destroy all the connection objects.

	You need to write all these steps regardless of any vendor’s relational database. 
	Consider a problem where you need to insert some data into the different databases. 
	You need to fetch some data from a `CSV` file and have to insert it into a MySQL database. 
	Some data comes from a text file and which should be insert into an Oracle database. 
	The only difference is the driver and the data, the rest of the steps should be the same, 
	as `JDBC` provides a common set of interfaces to communicate to any vendor’s specific relation database.

	We can create a template, which will perform some steps for the client, 
	and we will leave some steps to let the client to implement them in its own specific way. 
	Optionally, a client can override the default behaviour of some already defined steps.

	Below we can see the connection template class used to provide a template for clients to connect 
	and communicate with the various databases (see the abstract class `ConnectionTemplate` in the worksheet repository).

	The `abstract class` provides steps to connect, communicate and later to close the connections. 
	All these steps are required to get the work done. 
	The class provides default implementation to some common steps and leaves the specific steps 
	as abstract which force the client to provide an implementation to them.

	The `setDBDriver` method should be implemented by the user to provide database specific drivers. 
	The credentials could be different for different databases; therefore, `setCredentials` 
	is also left as abstract to let the user implement it.
	
	Similarly, connecting to the database using the `JDBC API` and preparing a statement is common. 
	Data would be specific so the user will provide it, and the rest of other steps, like running an 
	insert statement, closing connections, and destroying objects, are similar to any database, 
	therefore their implementations are kept common inside the template.
	
	The key method of the above class is the `run` method which is used to run these steps in order. 
	The method is set as `final` because the steps should be kept safe and should not be change by any user.

	The two classes below extend the template class and provide specific implementations to some methods:

	```java
	public class MySqLCSVCon extends ConnectionTemplate {
	
		@Override
		public void setDBDriver() {}
	
		@Override
		public void setCredentials() {}
	
		@Override
		public void setData() {}
	}
	```

	The above class is used to connect to a MySQL database and provides data by reading a `CSV` file.
	
	```java
	public class OracleTxtCon extends ConnectionTemplate {
	
		@Override
		public void setDBDriver() {}
	
		@Override
		public void setCredentials() {}
	
		@Override
		public void setData() {}
	}
	```

	The above class is used to connect to an Oracle database and provides data by reading a text file.
	
	Now, let’s test the code using the class `TestTemplatePattern`.
	Running the class should result in the following output:

	```
	For MYSQL....
	Setting MySQL DB drivers...
	Setting credentials for MySQL DB...
	Setting connection...
	Preparing insert statement...
	Setting up data from csv file....
	Inserting data...
	Closing connections...
	Destroying connection objects...
	
	For Oracle...
	Setting Oracle DB drivers...
	Setting credentials for Oracle DB...
	Setting connection...
	Preparing insert statement...
	Setting up data from txt file....
	Inserting data...
	Closing connections...
	Destroying connection objects...	
	```

	The above output clearly shows how the template pattern works to connect and communicate 
	with the different databases, using a similar set of steps. 
	The pattern keeps the common code under one class and promotes code reusability. 
	It sets a framework and controls it for the users and allows the users to extends the template 
	to provide their specific implementation to some of the steps.
