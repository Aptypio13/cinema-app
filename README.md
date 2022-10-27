# 🎥 Cinema 🎥
Application implementing the work of the site for the purchase of tickets to the cinema <br />

## Functionality:
>- _User **registration** and **authentication**_.
>- _Possibility to be in the role of **admin / user**_
>- _**Admin functions** :_
>- - _**add new** cinema halls_
>- - _**add new** movies_
>- - _**create / change / delete /** movie sessions_
>- - _**find users by-email**_
>- _**User** functions:_
>- - _**see** list of the cinema halls_
>- - _**see** list of the movies_
>- - _**choose available** movie sessions with date_ 
>- - _**bye tickets in the shopping cart**_
>- - _**see** list of the orders_

## List of Technologies:

>_**Java11**_
>
>_**Maven**_
>
> _**Spring:**_
>
>_**Spring MVC**_
>
>_**Spring WEB**_
>
>_**Spring Security**_
>
>_**Spring Data**_
>
>_**Hibernate**_
>
>_**MySQL**_
>
>_**Tomcat (9.0.50)**_

## Structure:
This project has **N-tier architecture**. It consists of:_

**Controller layer** - accept http requests from client and display information at web page.

**Service layer** - all business-logic is located here.

**DAO layer** - all interaction with DataBase is located here

## How can I use it ?
>- _Step 1_ - **Fork this repository**
>- _Step 2_ - **Open IntelliJ IDEA and write `git clone <SSH link>` in console**
>- _Step 3_ - **Configure resources of you DB --> "db.properties" file**
>```properties
>db.driver=YOUR_DRIVER
>db.url=YOUR_URL
>db.user=YOUR_USERNAME
>db.password=YOUR_PASSWORD
>```
>For example:
>```properties
>db.driver=com.mysql.cj.jdbc.Driver
>db.url=jdbc:mysql://localhost:3306/cinema?serverTimeZone=UTC
>db.user=root
>db.password=1234
>```
>- _Step 4_ - **Install Tomcat. (you can install it [here](https://tomcat.apache.org/download-90.cgi)) .**
>- _Step 5_ - **Add Tomcat server in configurations**
>- _Final Step_ - **Run project**
___