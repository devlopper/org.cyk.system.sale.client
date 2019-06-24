package org.cyk.system.sale.client.controller.impl;

import java.io.Serializable;
import java.security.Principal;

import org.cyk.system.sale.client.controller.entities.Sale;
import org.cyk.utility.client.controller.component.menu.AbstractMenuBuilderMapGetterImpl;
import org.cyk.utility.client.controller.component.menu.MenuBuilder;
import org.cyk.utility.client.controller.component.menu.MenuItemBuilder;
import org.cyk.utility.client.controller.icon.Icon;


@org.cyk.system.sale.server.annotation.System
public class MenuBuilderMapGetterImpl extends AbstractMenuBuilderMapGetterImpl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected void ____executePrincipalIsNotNull____(MenuBuilder sessionMenuBuilder, Object request, Principal principal) throws Exception {
		
	}

	@Override
	protected void ____executePrincipalIsNull____(MenuBuilder sessionMenuBuilder, Object request) throws Exception {
		if(sessionMenuBuilder == null) {
			/*menuBuilder.addItems(
					__inject__(MenuItemBuilder.class).setCommandableName("Compte utilisateur").setCommandableIcon(Icon.USER).addChild(
							__inject__(MenuItemBuilder.class).setCommandableName("Se connecter").setCommandableNavigationIdentifier("loginView")
							,__inject__(MenuItemBuilder.class).setCommandableName("Déverouiller mon compte")
							,__inject__(MenuItemBuilder.class).setCommandableName("Reinitialiser mon mot de passe")
					)
				);	*/
		}//else {
		sessionMenuBuilder.addItems(
					__inject__(MenuItemBuilder.class).setCommandableName("Paramétrage").setCommandableIcon(Icon.GEARS).addChild(
							__inject__(MenuItemBuilder.class).setCommandableName("Gestion des profiles").addEntitiesList(Sale.class)
					)
					
				);	
		//}
	}

	

}
