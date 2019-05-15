package org.cyk.system.sale.client.controller.entities;

import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractDataIdentifiedByStringImpl;

public class ProductImpl extends AbstractDataIdentifiedByStringImpl implements Product,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public Product setIdentifier(String identifier) {
		return (Product) super.setIdentifier(identifier);
	}
	
}
