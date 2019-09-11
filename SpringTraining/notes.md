* Transaction, Security, Object Pooling
* EJB

```java
class Account {
	accountNumber, balance;
	void withdraw(amount) {
	}
	void deposit(amount) {
	}
	void transferFund(to, amount) {
	}
}

interface AccountRemote {
}
interface AccountHome {
}
class Account implements XYZ {
	//no constructor
	//no static methods
	//no final variables
}
//ejb-jar.xml
//package all these into a jar
//drop the jar inside EJB container
//configure what services the jar needs



```
* Dependency Injection
* Light weight container or POJO framework

* Spring boot is a very light weight abstraction of Spring framework
* Understand it from Microservices context
* 2.x (Spring 5.x)
















