package com.nam;

public class ClassCAst {

	
		    public static void main(String args[])
		    {
		    
		    Object ob=new Integer(10);//upcast fine

		    // ClassCastException occurs
		    if (ob instanceof String)
		    System.out.println("The value is "+(String)ob);
		    System.out.println("passed downcast line");

		            
		    }
		}

