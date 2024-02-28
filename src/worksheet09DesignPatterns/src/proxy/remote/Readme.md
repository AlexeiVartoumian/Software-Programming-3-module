
So it seems obvious now but I could not understand why I could not get the remote proxy
pattern to work. This is because I did not pay attention to the problem statement where I have 
two Jvms. one is a remote server that lives somewhere out there dishing pizzas. 
the other JVM is the Pizzaman owner who cares for reports of all his pizza servers.

As I understand the remote Proxy pattern is used to handle situation statements like : 
-I want to use my Local machine to access all the distributed reports
-I want to use financial services available to Head office at the convenience of local office
-I have some local representation of an object that represents another object that exists remotely 
i.e a distributed system!


this excercise required us to us RMI (remote method Invocation) to represent Pizzaman needing his
ditributed reports. Realising this all that had to be done was have a Server Bound to a registry
that can be looked up and the callee using a proxy of the same interface type to engage with and 
then generate the report.

It also helps if the server is running!