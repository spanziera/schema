////////////////////////////////////////////////////////////////////////
//
// EDIFactDataCompletion.java
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

import com.altova.text.*;

public class EDIFactDataCompletion extends DataCompletion {
		private EDIFactSettings mSettings = null;
		

		public EDIFactDataCompletion(TextDocument document, EDIFactSettings settings, String structurename) {
			super(document, structurename);
			mSettings = settings;
		}

		public void completeData(ITextNode dataroot, Particle rootParticle) {
			completeMandatory(dataroot, rootParticle);
			completeEnvelope(dataroot);
		}
		
		protected void completeEnvelope (ITextNode envelope) {
			if (!envelope.getName().equals("Envelope"))
				throw new com.altova.AltovaException("completeEnvelope: root node is not an envelope");

			makeSureExists(envelope, "Interchange");

			TextNodeList interchanges = envelope.getChildren().filterByName("Interchange");
			for (int i=0; i< interchanges.size(); ++i)
				completeInterchange(interchanges.getAt(i));
		}

		protected void completeInterchange(ITextNode interchange) {
			
			ITextNode unb = interchange.getChildren().getFirstNodeByName("UNB");
			ITextNode unz = interchange.getChildren().getLastNodeByName("UNZ");
			if (unb == null && unz == null)
				makeSureExists(interchange, "Group");
			else
			{
				unb = makeSureExists(interchange, "UNB");
				makeSureExists(interchange, "Group");
				unz = makeSureExists(interchange, "UNZ");
			}
			
			ITextNodeList groups = interchange.getChildren().filterByName("Group");
			for (int i=0; i< groups.size(); ++i)
				completeGroup(groups.getAt(i));
			
			
			
			if (unb == null && unz == null)
				return;
			
			completeInterchangeHeader(unb);
			completeInterchangeTrailer(unz);
		}

		protected void completeInterchangeHeader(ITextNode unb) {
			ITextNode s001  = makeSureExists(unb, "S001");
			ITextNode s002  = makeSureExists(unb, "S002");
			ITextNode s003  = makeSureExists(unb, "S003");
			ITextNode s004  = makeSureExists(unb, "S004");
//			ITextNode f0020 = makeSureExists(unb, "F0020");

			completeS001(s001);
			completeS002(s002);
			completeS003(s003);
			completeS004(s004);
		}

		protected void completeInterchangeTrailer(ITextNode unz) {
			ITextNode f0036 = makeSureExists(unz, "F0036");
			ITextNode f0020 = makeSureExists(unz, "F0020");

			conservativeSetValue(f0036, GetNumberOfFunctionGroupsOrMessages(unz.getParent()));
			ITextNode unb = unz.getParent().getChildren().getFirstNodeByName("UNB");
			ITextNodeList unbChildren = unb.getChildren().filterByName("F0020");
			String ctrlRef = unbChildren.size() > 0 ? unbChildren.getAt(unbChildren.size()-1).getValue() : new String();
			conservativeSetValue(f0020, ctrlRef);
		}

		protected void completeGroup(ITextNode group) {
			if (hasKid(group, "UNG")) {
				makeSureExists(group, "UNE");
			}
			else if (hasKid(group, "UNE")) {
				makeSureExists(group, "UNG");
			}

			for( String sMessageType : m_Document.getMessageTypes()) {
				ITextNodeList messages  = group.getChildren().filterByName("Message_" + sMessageType);
				for(int i=0; i< messages.size(); ++i) {
					completeMandatory(messages.getAt(i), m_Document.getMessage(sMessageType).getRootParticle());
					completeMessage(sMessageType, messages.getAt(i));
				}
			}
			ITextNodeList messages  = group.getChildren().filterByName("Message");
			for(int i=0; i< messages.size(); ++i)
				completeMessage(mSettings.getMessageType(), messages.getAt(i));

			completeGroupHeader( group.getChildren().getLastNodeByName("UNG"));
			completeGroupTrailer( group.getChildren().getLastNodeByName("UNE"));
		}

		protected void completeGroupHeader(ITextNode ung) {
			if (ung == null)
				return;

			/*ITextNode s006 = */makeSureExists(ung, "S006");
			/*ITextNode s007 = */makeSureExists(ung, "S007");
			ITextNode s004 = makeSureExists(ung, "S004");
			ITextNode f0048 = makeSureExists(ung, "F0048");
			ITextNode f0051 = makeSureExists(ung, "F0051");
			/*ITextNode s008 = */makeSureExists(ung, "S008");
			/*ITextNode f0058 = */makeSureExists(ung, "F0058");
			
			completeS004(s004);
			
			ITextNode une_f0048 =  ung.getParent().getChildren().getFirstNodeByName("UNE").getChildren().getFirstNodeByName("F0048");
			if (une_f0048 != null)
				conservativeSetValue(f0048, une_f0048.getValue());
				
			
			conservativeSetValue(f0051, mSettings.getControllingAgency().substring(0,2));
		}

		protected void completeGroupTrailer(ITextNode une) {
			if (une == null)
				return;

			ITextNode f0060 = makeSureExists(une, "F0060");
			ITextNode f0048 = makeSureExists(une, "F0048");

			int nMsg = une.getParent().getChildren().filterByName("Message").size();
			for( String sMessageType : m_Document.getMessageTypes()) {
				ITextNodeList messages  = une.getParent().getChildren().filterByName("Message_" + sMessageType);
				nMsg += messages.size();
			}
			conservativeSetValue(f0060, nMsg);
			ITextNode ung_f0048 = une.getParent().getChildren().getFirstNodeByName("UNG").getChildren().getFirstNodeByName("F0048");
			if (ung_f0048 != null)
				conservativeSetValue(f0048, ung_f0048.getValue());
		}

		protected void completeMessage(String sMessageType, ITextNode message) {
			ITextNode unh = makeSureExists(message, "UNH");
			ITextNode unt = makeSureExists(message, "UNT");

			completeMessageHeader(sMessageType, unh);
			completeMessageTrailer(unt);
		}

		protected void completeMessageHeader(String sMessageType, ITextNode unh) {
			ITextNode f0062 = makeSureExists(unh, "F0062");
			ITextNode s009 = makeSureExists(unh, "S009");

			String referenceNumber = unh.getParent().getChildren().getFirstNodeByName("UNT").getValue();
			if (referenceNumber.length() == 0)
				referenceNumber = "0";

			conservativeSetValue(f0062, referenceNumber);
			completeS009 (sMessageType, s009);
		}

		protected void completeMessageTrailer(ITextNode unt) {
			ITextNode f0074 = makeSureExists(unt, "F0074");
			ITextNode f0062 = makeSureExists(unt, "F0062");

			conservativeSetValue(f0074, getSegmentChildrenCount(unt.getParent()));
			conservativeSetValue(f0062, unt.getParent().getChildren().getFirstNodeByName("UNH").getChildren().getFirstNodeByName("F0062").getValue());
		}

		protected void completeS001(ITextNode s001) {
			ITextNode f0001 = makeSureExists(s001, "F0001");
			ITextNode f0002 = makeSureExists(s001, "F0002");

			conservativeSetValue(f0001, mSettings.getControllingAgency() + mSettings.getSyntaxLevel());
			conservativeSetValue(f0002, mSettings.getSyntaxVersionNumber());
		}

		protected void completeS002(ITextNode s002) {
			ITextNode f0004 = makeSureExists(s002, "F0004");
			conservativeSetValue(f0004, "Sender");
		}
		
		protected void completeS003(ITextNode s003) {
			ITextNode f0010 = makeSureExists(s003, "F0010");
			conservativeSetValue(f0010, "Recipient");
		}
		
		protected void completeS004(ITextNode s004) {
			ITextNode f0017 = makeSureExists(s004, "F0017");
			ITextNode f0019 = makeSureExists(s004, "F0019");

			conservativeSetValue(f0017, getCurrentDateAsEDIString(mSettings.getSyntaxVersionNumber()));
			conservativeSetValue(f0019, getCurrentTimeAsEDIString());
		}

		protected void completeS009(String sMessageType, ITextNode s009) {
			ITextNode f0065 = makeSureExists(s009, "F0065");
			ITextNode f0052 = makeSureExists(s009, "F0052");
			ITextNode f0054 = makeSureExists(s009, "F0054");
			ITextNode f0051 = makeSureExists(s009, "F0051");
			
			conservativeSetValue(f0065, sMessageType);
			conservativeSetValue(f0051, mSettings.getControllingAgency().substring(0, 2));
			conservativeSetValue(f0052, mSettings.getVersion());
			conservativeSetValue(f0054, mSettings.getRelease());
		}

		long GetNumberOfFunctionGroupsOrMessages(ITextNode node) {
			int nUNH =0;
			int nUNT =0;
			int nUNG =0;
			int nUNE =0;

			ITextNodeList groups = node.getChildren().filterByName("Group");
			for (int i=0; i< groups.size(); ++i) 	{
				nUNG += groups.getAt(i).getChildren().filterByName("UNG").size();
				nUNE += groups.getAt(i).getChildren().filterByName("UNE").size();

				for( String sMessageType : m_Document.getMessageTypes()) {
					ITextNodeList messages  = groups.getAt(i).getChildren().filterByName("Message_" + sMessageType);
					for(int j=0; j< messages.size(); ++j) {
						nUNH += messages.getAt(j).getChildren().filterByName("UNH").size();
						nUNT += messages.getAt(j).getChildren().filterByName("UNT").size();
					}
				}
				ITextNodeList messages = groups.getAt(i).getChildren().filterByName("Message");
				for (int j=0; j< messages.size(); ++j) {
					nUNH += messages.getAt(j).getChildren().filterByName("UNH").size();
					nUNT += messages.getAt(j).getChildren().filterByName("UNT").size();
				}
			}
			
			if (nUNH != nUNT)
				throw new com.altova.AltovaException("Message header-trailer mismatch");
			if (nUNG != nUNE)
				throw new com.altova.AltovaException("Group header-trailer mismatch");

			return nUNG == 0 ? nUNH : nUNG;
		}
}
