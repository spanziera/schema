////////////////////////////////////////////////////////////////////////
//
// Composite.java
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

package com.altova.text.edi;

import java.io.IOException;
import com.altova.text.ITextNode;
import com.altova.text.Generator;

public class Composite extends StructureItem {
	public Composite (String name, Particle[] children) {
		super (name, ITextNode.Composite, children);
	}

	public boolean read (Parser.Context context) {
		context.getScanner().moveToNextSignificantChar();
		if (context.getScanner().isAtAnySeparator() &&
			!context.getScanner().isAtSeparator(ServiceChars.ComponentSeparator))
				return false;


		context.mParser.resetComponentDataElementPos(); // reset composite data element pos to 0
				
		Generator generator = context.getGenerator();
		generator.enterElement (context.getParticle().getName(), mNodeClass);
		if (!readChildren (context, ServiceChars.ComponentSeparator))
		{
			generator.leaveElement (context.getParticle().getName());
			return false;
		}
		generator.leaveElement (context.getParticle().getName());
		return true;
	}

	public void write (Writer writer, ITextNode node, Particle particle)  throws IOException {
		writeChildren (writer, node, ServiceChars.ComponentSeparator);
	}
}
