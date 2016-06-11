////////////////////////////////////////////////////////////////////////
//
// Splitter.java
//
// This file was generated by MapForce 2016r2.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the MapForce Documentation for further details.
// http://www.altova.com/mapforce
//
////////////////////////////////////////////////////////////////////////

package com.altova.text.flex;

public abstract class Splitter
{
	public static final char CR = '\r';
	public static final char LF = '\n';
	
	public abstract Range split(Range r);
	public abstract void appendDelimiter(Appender output);
	public void prepareUpper(StringBuffer buffer, int lineEnd) { }
	public void prepareLower(StringBuffer buffer, int lineEnd) { }
}
