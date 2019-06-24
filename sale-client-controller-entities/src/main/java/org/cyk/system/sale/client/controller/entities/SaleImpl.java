package org.cyk.system.sale.client.controller.entities;

import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractDataIdentifiedByStringImpl;

public class SaleImpl extends AbstractDataIdentifiedByStringImpl implements Sale,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public Sale setIdentifier(String identifier) {
		return (Sale) super.setIdentifier(identifier);
	}
	
}
