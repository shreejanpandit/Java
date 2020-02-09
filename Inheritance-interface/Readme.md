Inheritance in Interface
An interface contains variables and methods like a class but the methods in an interface are abstract by default unlike a class. Multiple inheritance by interface occurs if a class implements multiple interfaces or also if an interface itself extends multiple interfaces.

Extends, the inheritance in interfae

Syntax:
interface interface_name1()
{
	//body
}

interface interface_name2()
{
	//body
}

class class_name1 implements interface_name1, interface_name2
{
	//body
}

public class class_name
{
	
}