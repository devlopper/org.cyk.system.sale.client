package org.cyk.system.sale.client.controller.entities;

import org.cyk.utility.client.controller.data.DataIdentifiedByString;

public interface Product extends DataIdentifiedByString {

	@Override Product setIdentifier(String identifier);
	
	/**/
	
}
