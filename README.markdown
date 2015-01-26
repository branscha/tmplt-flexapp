# Flex Web Application
## Description

A basic Flex client application and a BlazeDS server, ready to run in JBoss.
The client has a button that connects to the server using a RemoteObject.

## Features

* FlexMojos based.
* Apache Flex 4.11 for the Client.
* Adobe BlazeDS for the server.

## Notes

Not all maven artifacts are available in the public Maven repositories, you have to create some of these yourself. It is not possible to publish them because of copyright constraints.

* Adobe BlazeDS can be constructed from the BlazeDS binary that you can download from Adobe. In the near future Apache will provide a BlazeDS version as well.
* You have to "Mavenize" the Apache Flex 4.11 SDK using the tools provided on the Apache Flex website.

## Deploy Notes
### JBoss
JBoss will automatically use the war name (flexapp) as the application context name.
The Flex client expects this and the client will find the server.
If you wan to use another context name you have to change the 'contextRoot' setting in the client POM.

### Tomcat
Tomcat will not create a context name, the application expects "flexapp"  out of the box.
You have two options
* Change the 'contextRoot' parameter in the client POM according to the effective Tomcat context.
* Change the Tomcat context for this war to 'flexapp' explicitly.

## Links

* Startup information: ["http://localhost:8080/flexapp/flexapp.html"](http://localhost:8080/flexapp/flexapp.html)

## Conclusion

Flex & BlazeDS & ActionScript are an amazing framework, very pleasant to work with.
Popularity has diminished a bit since Adobe decided not to support it anymore and to open source it.
On the Internet you can find a lot of Blogposts in the period 2006-2009, but after that its popularity seems to have faded.
Apache seems to embrace Flex and seems to be willing to support it, which is a good sign.
The biggest contender is HTML5 and JavaScript, but at this point in time Flex is much more fun to work with.
