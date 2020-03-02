Java Nested Interface
An interface i.e. declared within another interface or class is known as nested interface. The nested interfaces are used to group related interfaces so that they can be easy to maintain. The nested interface must be referred by the outer interface or class. It can't be accessed directly.

Points to remember for nested interfaces
Nested interface must be public if it is declared inside the interface but it can have any access modifier if declared within the class.
Nested interfaces are declared static implicitely.
Syntax of nested interface which is declared within the interface
interface interface_name{  
 	...  
 	interface nested_interface_name{  
  	...  
 	}  
}   
Syntax of nested interface which is declared within the class
class class_name{  
	 ...  
	 interface nested_interface_name{  
	  ...  
	 }  
}  