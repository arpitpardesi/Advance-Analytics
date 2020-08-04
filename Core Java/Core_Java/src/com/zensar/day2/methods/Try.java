package com.zensar.day2.methods;

class Game
{
 	public void type()
 	{  
 		System.out.println("Indoor & outdoor"); 
 	}
}
class Cricket extends Game
{
 	public void type()
 	{  
 		System.out.println("outdoor game"); 
	}

 	public static void main(String[] args)
 	{
   		Game gm = new Game();
   		Cricket ck = new Cricket();
   		gm.type();
   		ck.type();
   		gm = ck;	//gm refers to Cricket object
   		gm.type();	//calls Cricket's version of type
 	}
}
