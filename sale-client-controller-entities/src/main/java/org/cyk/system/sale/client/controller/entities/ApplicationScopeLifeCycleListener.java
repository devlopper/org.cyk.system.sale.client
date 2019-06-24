package org.cyk.system.sale.client.controller.entities;
import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.client.controller.AbstractApplicationScopeLifeCycleListenerEntities;
import org.cyk.utility.client.controller.component.menu.MenuBuilderMapGetter;

@ApplicationScoped
public class ApplicationScopeLifeCycleListener extends AbstractApplicationScopeLifeCycleListenerEntities implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public void __initialize__(Object object) {
		super.__initialize__(object);
		__setQualifierClassTo__(org.cyk.system.sale.server.annotation.System.class, MenuBuilderMapGetter.class);
	}
	
	@Override
	public void __destroy__(Object object) {}
	
}