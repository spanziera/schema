/**
 * vmf/vmf6_inputtoresult.java
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
import com.altova.text.tablelike.*;
import com.altova.text.*;
import com.altova.text.edi.*;
import java.util.*;

public class vmf6_inputtoresult extends com.altova.TraceProvider 
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
			return new MFEmptySequence();

	}
	
	private static java.util.HashMap hash = null;

	private synchronized static void init()
	{
		hash = new java.util.HashMap();
		hash.put(com.altova.CoreTypes.box("Add Heat Recovery"), com.altova.CoreTypes.box("Add energy recovery"));
		hash.put(com.altova.CoreTypes.box("Boiler decentralization"), com.altova.CoreTypes.box("Decentralize boiler"));
		hash.put(com.altova.CoreTypes.box("Boiler Room Insulation"), com.altova.CoreTypes.box("Insulate boiler room"));
		hash.put(com.altova.CoreTypes.box("Convert Gas-Fired Unit to Boiler Loop"), com.altova.CoreTypes.box("Convert gas-fired unit to boiler loop"));
		hash.put(com.altova.CoreTypes.box("Heating - Cleaning and Repair"), com.altova.CoreTypes.box("Clean and/or repair"));
		hash.put(com.altova.CoreTypes.box("Heating - Operating Protocols, Calibration, and/or Sequencing"), com.altova.CoreTypes.box("Upgrade operating protocols, calibration, and/or sequencing"));
		hash.put(com.altova.CoreTypes.box("Replace Boiler or Furnace"), com.altova.CoreTypes.box("Replace boiler"));
		hash.put(com.altova.CoreTypes.box("Replace Burner"), com.altova.CoreTypes.box("Replace burner"));
		hash.put(com.altova.CoreTypes.box("Chiller plant pumping, piping, and controls retrofits and replacements"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("Install VSD on Electric Centrifugal Chillers"), com.altova.CoreTypes.box("Install VSD on electric centrifugal chillers"));
		hash.put(com.altova.CoreTypes.box("Replace Chiller"), com.altova.CoreTypes.box("Replace chiller"));
		hash.put(com.altova.CoreTypes.box("Add or Upgrade BAS/EMS/EMCS"), com.altova.CoreTypes.box("Add or upgrade BAS/EMS/EMCS"));
		hash.put(com.altova.CoreTypes.box("Add or Upgrade Controls"), com.altova.CoreTypes.box("Add or upgrade controls"));
		hash.put(com.altova.CoreTypes.box("Controls - Uncategorized"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("Cooling - Operating Protocols, Calibration, and/or Sequencing "), com.altova.CoreTypes.box("Upgrade operating protocols, calibration, and/or sequencing"));
		hash.put(com.altova.CoreTypes.box("Distribution - Operating Protocols, Calibration, and/or Sequencing"), com.altova.CoreTypes.box("Upgrade operating protocols, calibration, and/or sequencing"));
		hash.put(com.altova.CoreTypes.box("Domestic Hot Water - Operating Protocols, Calibration, and/or Sequencing"), com.altova.CoreTypes.box("Upgrade operating protocols, calibration, and/or sequencing"));
		hash.put(com.altova.CoreTypes.box("Motors - Add Drive Controls"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("Pneumatic to DDC Convert"), com.altova.CoreTypes.box("Convert pneumatic controls to DDC"));
		hash.put(com.altova.CoreTypes.box("Process/Plug Equipment - Operating Protocols, Calibration, and/or Sequencing"), com.altova.CoreTypes.box("Upgrade operating protocols, calibration, and/or sequencing"));
		hash.put(com.altova.CoreTypes.box("System - Operating Protocols, Calibration, and/or Sequencing "), com.altova.CoreTypes.box("Upgrade operating protocols, calibration, and/or sequencing"));
		hash.put(com.altova.CoreTypes.box("Ventilation - Operating Protocols, Calibration, and/or Sequencing "), com.altova.CoreTypes.box("Upgrade operating protocols, calibration, and/or sequencing"));
		hash.put(com.altova.CoreTypes.box("Add Duct Insulation"), com.altova.CoreTypes.box("Add duct insulation"));
		hash.put(com.altova.CoreTypes.box("Add or replace Cooling Tower"), com.altova.CoreTypes.box("Add or replace cooling tower"));
		hash.put(com.altova.CoreTypes.box("Convert CV System to VAV System"), com.altova.CoreTypes.box("Convert CV system to VAV system"));
		hash.put(com.altova.CoreTypes.box("Cooling - Heat Recovery"), com.altova.CoreTypes.box("Add energy recovery"));
		hash.put(com.altova.CoreTypes.box("Cooling - Uncategorized"), com.altova.CoreTypes.box("Other cooling"));
		hash.put(com.altova.CoreTypes.box("Distribution - Balancing"), com.altova.CoreTypes.box("Balance ventilation/distribution system"));
		hash.put(com.altova.CoreTypes.box("Distribution - Improve Fans"), com.altova.CoreTypes.box("Improve distribution fans"));
		hash.put(com.altova.CoreTypes.box("Duct Insulation"), com.altova.CoreTypes.box("Add duct insulation"));
		hash.put(com.altova.CoreTypes.box("Duct Sealing"), com.altova.CoreTypes.box("Repair leaks / seal ducts"));
		hash.put(com.altova.CoreTypes.box("Economizer Cycle"), com.altova.CoreTypes.box("Add or repair economizer"));
		hash.put(com.altova.CoreTypes.box("HVAC - Distribution - Uncategorized"), com.altova.CoreTypes.box("Other distribution"));
		hash.put(com.altova.CoreTypes.box("HVAC - System - Cleaning and/or Repair "), com.altova.CoreTypes.box("Clean and/or repair"));
		hash.put(com.altova.CoreTypes.box("HVAC - System - Training and/or Documentation"), com.altova.CoreTypes.box("Implement training and/or documentation"));
		hash.put(com.altova.CoreTypes.box("HVAC damper and controller repair or replacement"), com.altova.CoreTypes.box("Repair or replace HVAC damper and controller"));
		hash.put(com.altova.CoreTypes.box("Repair Leaks / Seal Ducts"), com.altova.CoreTypes.box("Repair leaks / seal ducts"));
		hash.put(com.altova.CoreTypes.box("Replace Package Units"), com.altova.CoreTypes.box("Replace package units"));
		hash.put(com.altova.CoreTypes.box("Replace Packaged Terminal Units"), com.altova.CoreTypes.box("Replace packaged terminal units"));
		hash.put(com.altova.CoreTypes.box("Replace/Modify AHU"), com.altova.CoreTypes.box("Replace or modify AHU"));
		hash.put(com.altova.CoreTypes.box("Ventilation - Balancing"), com.altova.CoreTypes.box("Balance ventilation/distribution system"));
		hash.put(com.altova.CoreTypes.box("Ventilation - Cleaning and Repair"), com.altova.CoreTypes.box("Clean and/or repair"));
		hash.put(com.altova.CoreTypes.box("Ventilation - Uncategorized"), com.altova.CoreTypes.box("Other ventilation"));
		hash.put(com.altova.CoreTypes.box("Ventilation - Upgrade Fans"), com.altova.CoreTypes.box("Improve ventilation fans"));
		hash.put(com.altova.CoreTypes.box("Add daylight dimming"), com.altova.CoreTypes.box("Add daylight controls"));
		hash.put(com.altova.CoreTypes.box("Add occupancy sensors"), com.altova.CoreTypes.box("Add occupancy sensors"));
		hash.put(com.altova.CoreTypes.box("Fiber optic lighting technologies"), com.altova.CoreTypes.box("Retrofit with fiber optic lighting technologies"));
		hash.put(com.altova.CoreTypes.box("Light Emitting Diode technologies"), com.altova.CoreTypes.box("Retrofit with light emitting diode technologies"));
		hash.put(com.altova.CoreTypes.box("Lighting - Cleaning and/or Repair"), com.altova.CoreTypes.box("Clean and/or repair"));
		hash.put(com.altova.CoreTypes.box("Lighting - Operation Protocols, Calibration, and/or Sequencing"), com.altova.CoreTypes.box("Upgrade operating protocols, calibration, and/or sequencing"));
		hash.put(com.altova.CoreTypes.box("Retrofit with CFLs"), com.altova.CoreTypes.box("Retrofit with CFLs"));
		hash.put(com.altova.CoreTypes.box("Retrofit with T-5"), com.altova.CoreTypes.box("Retrofit with T-5"));
		hash.put(com.altova.CoreTypes.box("Retrofit with T-8"), com.altova.CoreTypes.box("Retrofit with T-8"));
		hash.put(com.altova.CoreTypes.box("Retrofit/Replace"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("Spectrally enhanced lighting"), com.altova.CoreTypes.box("Install spectrally enhanced lighting"));
		hash.put(com.altova.CoreTypes.box("Add Attic/Knee Wall Insulation"), com.altova.CoreTypes.box("Add attic/knee wall insulation"));
		hash.put(com.altova.CoreTypes.box("Add Shading Devices"), com.altova.CoreTypes.box("Add shading devices"));
		hash.put(com.altova.CoreTypes.box("Add Window Films"), com.altova.CoreTypes.box("Add window films"));
		hash.put(com.altova.CoreTypes.box("Air Sealing"), com.altova.CoreTypes.box("Air seal envelope"));
		hash.put(com.altova.CoreTypes.box("Cool/Green Roof Installed"), com.altova.CoreTypes.box("Install cool/green roof"));
		hash.put(com.altova.CoreTypes.box("Envelope - Cleaning and/or Repair"), com.altova.CoreTypes.box("Clean and/or repair"));
		hash.put(com.altova.CoreTypes.box("Increase Ceiling Insulation"), com.altova.CoreTypes.box("Increase ceiling insulation"));
		hash.put(com.altova.CoreTypes.box("Increase Floor Insulation"), com.altova.CoreTypes.box("Increase floor insulation"));
		hash.put(com.altova.CoreTypes.box("Increase Roof Insulation"), com.altova.CoreTypes.box("Increase roof insulation"));
		hash.put(com.altova.CoreTypes.box("Increase Wall Insulation"), com.altova.CoreTypes.box("Increase wall insulation"));
		hash.put(com.altova.CoreTypes.box("Insulate Attic Hatch / Stair Box"), com.altova.CoreTypes.box("Insulate attic hatch / stair box"));
		hash.put(com.altova.CoreTypes.box("Insulate Foundation"), com.altova.CoreTypes.box("Insulate foundation"));
		hash.put(com.altova.CoreTypes.box("Insulate Thermal Bypass"), com.altova.CoreTypes.box("Insulate thermal bypasses"));
		hash.put(com.altova.CoreTypes.box("Insulation or Replacement of Solar Screens"), com.altova.CoreTypes.box("Install or replace solar screens"));
		hash.put(com.altova.CoreTypes.box("Replace Glazing"), com.altova.CoreTypes.box("Replace glazing"));
		hash.put(com.altova.CoreTypes.box("Window replacement"), com.altova.CoreTypes.box("Replace windows"));
		hash.put(com.altova.CoreTypes.box("Add Recirculating Pumps"), com.altova.CoreTypes.box("Add recirculating pumps"));
		hash.put(com.altova.CoreTypes.box("Convert System from Steam to hot Water"), com.altova.CoreTypes.box("Convert system from steam to hot water"));
		hash.put(com.altova.CoreTypes.box("Distribution - Add Pipe Insulation"), com.altova.CoreTypes.box("Add pipe insulation"));
		hash.put(com.altova.CoreTypes.box("Domestic Hot Water - Add Pipe Insulation"), com.altova.CoreTypes.box("Add pipe insulation"));
		hash.put(com.altova.CoreTypes.box("Domestic Hot Water - Heat Recovery"), com.altova.CoreTypes.box("Add energy recovery"));
		hash.put(com.altova.CoreTypes.box("Domestic Hot Water - Replace or Upgrade Heater"), com.altova.CoreTypes.box("Replace or upgrade water heater"));
		hash.put(com.altova.CoreTypes.box("Install Low-Flow Fixtures"), com.altova.CoreTypes.box("Install low-flow plumbing equipment"));
		hash.put(com.altova.CoreTypes.box("Repair or replacement of existing condensate return systems and installation of new condensate return systems"), com.altova.CoreTypes.box("Repair or replace existing condensate return systems or install new condensate return systems"));
		hash.put(com.altova.CoreTypes.box("Separate DHW from Heating"), com.altova.CoreTypes.box("Separate DHW from heating"));
		hash.put(com.altova.CoreTypes.box("Solar Hot Water"), com.altova.CoreTypes.box("Install solar hot water system"));
		hash.put(com.altova.CoreTypes.box("Steam trap repair and replacement"), com.altova.CoreTypes.box("Repair and/or replace steam traps"));
		hash.put(com.altova.CoreTypes.box("Motors - Replace with higher efficiency"), com.altova.CoreTypes.box("Replace with higher efficiency"));
		hash.put(com.altova.CoreTypes.box("Motors - Replace with VSD"), com.altova.CoreTypes.box("Add VSD motor controller"));
		hash.put(com.altova.CoreTypes.box("Replacement of ice/refrigeration equipment with high efficiency units"), com.altova.CoreTypes.box("Replace ice/refrigeration equipment with high efficiency units"));
		hash.put(com.altova.CoreTypes.box("CHP/Cogeneration systems installation"), com.altova.CoreTypes.box("Install CHP/cogeneration systems"));
		hash.put(com.altova.CoreTypes.box("Fuel cells installation"), com.altova.CoreTypes.box("Install fuel cells"));
		hash.put(com.altova.CoreTypes.box("Microturbines installation"), com.altova.CoreTypes.box("Install microturbines"));
		hash.put(com.altova.CoreTypes.box("Landfill gas, wastewater treatment plant digester gas, and coalbed methane power plant installation"), com.altova.CoreTypes.box("Install landfill gas, wastewater treatment plant digester gas, or coal bed methane power plant"));
		hash.put(com.altova.CoreTypes.box("Passive solar heating installation"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("Photovoltaic system installation"), com.altova.CoreTypes.box("Install photovoltaic system"));
		hash.put(com.altova.CoreTypes.box("Replacement of AC and heating units with ground coupled heat pump systems"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("Solar hot water system installation"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("Solar ventilation preheating system installation"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("Wind energy system installation"), com.altova.CoreTypes.box("Install wind energy system"));
		hash.put(com.altova.CoreTypes.box("Wood waste, other organic waste stream heating or power plant installation"), com.altova.CoreTypes.box("Install wood waste or other organic waste stream heating or power plant"));
		hash.put(com.altova.CoreTypes.box("Gas distribution systems installation"), com.altova.CoreTypes.box("Install gas distribution systems"));
		hash.put(com.altova.CoreTypes.box("Power factor correction"), com.altova.CoreTypes.box("Implement power factor corrections"));
		hash.put(com.altova.CoreTypes.box("Power quality upgrades"), com.altova.CoreTypes.box("Implement power quality upgrades"));
		hash.put(com.altova.CoreTypes.box("Transformers installation"), com.altova.CoreTypes.box("Upgrade transformers"));
		hash.put(com.altova.CoreTypes.box("Low-flow faucets and showerheads"), com.altova.CoreTypes.box("Install low-flow faucets and showerheads"));
		hash.put(com.altova.CoreTypes.box("Low-flow plumbing equipment"), com.altova.CoreTypes.box("Install low-flow plumbing equipment"));
		hash.put(com.altova.CoreTypes.box("On-site sewer treatment systems"), com.altova.CoreTypes.box("Install on-site sewer treatment systems"));
		hash.put(com.altova.CoreTypes.box("Water efficient irrigation"), com.altova.CoreTypes.box("Implement water efficient irrigation"));
		hash.put(com.altova.CoreTypes.box("Gas cooling"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("Thermal energy storage"), com.altova.CoreTypes.box("Install thermal energy storage"));
		hash.put(com.altova.CoreTypes.box("Change to more favorable rate schedule"), com.altova.CoreTypes.box("Change to more favorable rate schedule"));
		hash.put(com.altova.CoreTypes.box("Energy service billing and meter auditing recommendations"), com.altova.CoreTypes.box("Energy service billing and meter auditing recommendations"));
		hash.put(com.altova.CoreTypes.box("Lower energy cost supplier(s) (where applicable)"), com.altova.CoreTypes.box("Change to lower energy cost supplier(s)"));
		hash.put(com.altova.CoreTypes.box("Data Center - Uncategorized"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("Industrial process improvement"), com.altova.CoreTypes.box("Implement industrial process improvements"));
		hash.put(com.altova.CoreTypes.box("Production and/or manufacturing improvements"), com.altova.CoreTypes.box("Implement production and/or manufacturing improvements"));
		hash.put(com.altova.CoreTypes.box("Recycling and other waste stream reductions"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("De-lamp vending machines"), com.altova.CoreTypes.box("De-lamp vending machines"));
		hash.put(com.altova.CoreTypes.box("Plug timers"), com.altova.CoreTypes.box("Install plug load controls"));
		hash.put(com.altova.CoreTypes.box("Process/Plug Equipment - Cleaning and/or Repair"), com.altova.CoreTypes.box("Clean and/or repair"));
		hash.put(com.altova.CoreTypes.box("Process/Plug Equipment - Replace with Energy Star Rated"), com.altova.CoreTypes.box("Replace with ENERGY STAR rated"));
		hash.put(com.altova.CoreTypes.box("Replace air-cooled ice/refrigeration equipment"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("Replace refrigerators"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("Addition or Annex"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("Cleaning and/or Repair - Uncategorized"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("Fuel Conversion"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("Training and/or Documentation - Uncategorized"), com.altova.CoreTypes.box("Other"));
		hash.put(com.altova.CoreTypes.box("Unknown"), com.altova.CoreTypes.box("Other"));
	}

	public static com.altova.mapforce.IEnumerable eval(java.lang.String var1_input) throws java.lang.Exception
	{

		return create(var1_input);
	
	}

}
