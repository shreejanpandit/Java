User-defined Custom Exception in Java
Java provides us facility to create our own exceptions which are basically derived classes of Exception. For example MyException in below code extends the Exception class We pass the string to the constructor of the super class- Exception which is obtained using “getMessage()” function on the object created.

Syntax:
class custom_expetion_name Extends Exception
{
	// Statement
}