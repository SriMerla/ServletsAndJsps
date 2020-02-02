package com.casestudy.implementation;

import java.util.Set;

import com.casestudy.exceptions.DuplicateAddressException;
import com.casestudy.exceptions.NoAddressException;

public interface IAdressBook {
	
	public abstract boolean addAddressEntry(final SingleAddress address)throws DuplicateAddressException, NullPointerException;
	
	
	public abstract boolean removeAddressEntry(final String firstName)throws NoAddressException, NullPointerException;
	
	
	public Set<SingleAddress> addressList()throws NoAddressException;
		
	
}
