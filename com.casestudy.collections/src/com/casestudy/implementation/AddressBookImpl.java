package com.casestudy.implementation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.casestudy.exceptions.DuplicateAddressException;
import com.casestudy.exceptions.NoAddressException;

public class AddressBookImpl implements IAdressBook {
	
	private Set<SingleAddress> addressBook;
	
	public AddressBookImpl(){
		
		addressBook = new HashSet<SingleAddress>();
	}

	public boolean addAddressEntry(SingleAddress address)
			throws DuplicateAddressException, NullPointerException {
		final String METHOD_NAME = "addAddressEntry";
		System.out.println("Method Invoked : " + METHOD_NAME + ": \n" +address);
		boolean addEntryFlag = false;
		
		if(address == null){
			throw new NullPointerException("Null Entry is not allowed !");
		}
		if(!addressBook.add(address)){
			throw new DuplicateAddressException("Address is already existed,No duplicate entry!");
		}
		else{
			addEntryFlag = true;
		}
				
		 
		return addEntryFlag;
	}

	public boolean removeAddressEntry(String firstName)
			throws NoAddressException, NullPointerException {
		final String METHOD_NAME = "removeAddressEntry";
		System.out.println("Method Invoked : " + METHOD_NAME + ": \n" + firstName);
		boolean removeEntryFlag = false;
		if(firstName == null){
			throw new NullPointerException();
		}
		else if(addressBook.isEmpty()){
			throw new NoAddressException("No Entries in AddressBook");
		}else{
		
		Iterator<SingleAddress> itr = addressBook.iterator();
		while(itr.hasNext()){
			
			SingleAddress fs = itr.next();
			
			if((fs.getFirstName()).equals(firstName)){
				
				//itr.remove();
				addressBook.remove(fs);  
				removeEntryFlag = true;
			}
		}
		}
		
		
		return removeEntryFlag;
	}

	public Set<SingleAddress> addressList() throws NoAddressException {
		final String METHOD_NAME = "addressList";
		System.out.println("Method Invoked :" + METHOD_NAME);
	    if(addressBook.isEmpty()){
	    	throw new NoAddressException("No Address Entries Found");
	    }else{
		return this.addressBook;
	    }
	}

}
