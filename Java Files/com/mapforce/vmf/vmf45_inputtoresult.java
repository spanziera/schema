/**
 * vmf/vmf45_inputtoresult.java
 *
 * This file was generated by MapForce 2016r2.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */
package com.mapforce.vmf;
import com.altova.mapforce.*;
import com.altova.types.*;
import com.altova.xml.*;
import java.util.*;

public class vmf45_inputtoresult extends com.altova.TraceProvider 
{

	
	static class Main implements IEnumerable
	{
		java.lang.String var1_input;
	
		public Main(java.lang.String var1_input)
		{
			this.var1_input = var1_input;
		}

		public IEnumerator enumerator() {return new MFEmptySequence().enumerator();}
				
	}





	public static IEnumerable create(java.lang.String var1_input)
	{
		if (hash == null) init();
		Object o = hash.get(var1_input);
		if (o != null)
			return new MFSingletonSequence(o);
		else
			return new MFSingletonSequence(com.altova.CoreTypes.box("Fuel oil"));

	}
	
	private static java.util.HashMap hash = null;

	private synchronized static void init()
	{
		hash = new java.util.HashMap();
		hash.put(com.altova.CoreTypes.box("1"), com.altova.CoreTypes.box("Fuel oil no 1"));
		hash.put(com.altova.CoreTypes.box("2"), com.altova.CoreTypes.box("Fuel oil no 2"));
		hash.put(com.altova.CoreTypes.box("4"), com.altova.CoreTypes.box("Fuel oil no 4"));
		hash.put(com.altova.CoreTypes.box("5"), com.altova.CoreTypes.box("Fuel oil no 5 and no 6"));
		hash.put(com.altova.CoreTypes.box("6"), com.altova.CoreTypes.box("Fuel oil no 5 and no 6"));
	}

	public static java.lang.String eval(java.lang.String var1_input) throws java.lang.Exception
	{

		com.altova.mapforce.IEnumerator e = create(var1_input).enumerator();
		if (e.moveNext())
		{
			java.lang.String result = ((java.lang.String)e.current());
			e.close();
			return result;
		}
		e.close();
		throw new com.altova.AltovaException("Expected a function result.");		
	
	}

}