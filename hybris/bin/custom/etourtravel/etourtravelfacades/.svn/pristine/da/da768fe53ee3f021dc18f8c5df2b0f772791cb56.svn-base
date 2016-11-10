/**
 *
 */
package com.etourtravelb2b.facades.populators;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;


/**
 * @author GJANNU
 *
 */
public class Etourtravelb2bCustomerAttributesPopulator extends CustomerPopulator
{
	@Override
	public void populate(final CustomerModel source, final CustomerData target)
	{
		super.populate(source, target);
		target.setContactNumber(source.getContactNumber());
		target.setCurrentLocation(source.getCurrentLocation());


		System.out.println("After seting source to target in contact number :" + target.getContactNumber());
		System.out.println("After seting source to target in current Location :" + target.getCurrentLocation());



	}
}
