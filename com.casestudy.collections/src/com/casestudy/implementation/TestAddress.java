package com.casestudy.implementation;

import com.casestudy.exceptions.DuplicateAddressException;
import com.casestudy.exceptions.NoAddressException;

public class TestAddress {

	public static void main(String[] args) {
	    
	  AddressBookImpl impl = new AddressBookImpl();
	  SingleAddress firstAddr = new SingleAddress("Sri", "Merla", "Mirada", "Columbus", "OH", "US", 43032);
	  SingleAddress secondAddr = new SingleAddress("Satish", "Kakara", "LewisCenter", "Columbus", "OH", "US", 43035);
	 // SingleAddress thirdAddr = new SingleAddress("Sri", "Merla", "Mirada", "Columbus", "OH", "US", 43032);
	  SingleAddress fourthAddr = new SingleAddress("Teja", "Merla", "Nallavari", "Kakinada", "AP", "IN", 533003);
	  SingleAddress fifthAddr = new SingleAddress("Deepu", "Merla", "Street", "Dusseldorf", "DU", "GER", 60043);
	  SingleAddress sixthAddr = new SingleAddress("Name", "last", "add", "sfsgsdf", "sf", "sgf", 65887);

	  try {
		impl.addAddressEntry(firstAddr);
		impl.addAddressEntry(secondAddr);
		//impl.addAddressEntry(thirdAddr);
		impl.addAddressEntry(fourthAddr);
		impl.addAddressEntry(fifthAddr);
		impl.addAddressEntry(sixthAddr);
	} catch (NullPointerException e) {
		
		e.printStackTrace();
	} catch (DuplicateAddressException e) {
		
		System.err.print("Duplicate Entry Is Not Allowed");
		
	}
	  
	  try {
		
		System.out.println(impl.addressList());
	} catch (NoAddressException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	  try {
		impl.removeAddressEntry("Name");
	} catch (NullPointerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NoAddressException e) {
		System.err.println("No such entry in the address book");
	}
	  
	  try {
			
			System.out.println(impl.addressList());
		} catch (NoAddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
	
}
