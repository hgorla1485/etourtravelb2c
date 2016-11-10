/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Oct 6, 2016 6:13:02 PM                      ---
 * ----------------------------------------------------------------
 */
package com.etourtravelb2b.core.jalo;

import com.etourtravelb2b.core.constants.Etourtravelb2bCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.etourtravelb2b.core.jalo.ComingSoonNotiFyCustomer ComingSoonNotiFyCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedComingSoonNotiFyCustomer extends GenericItem
{
	/** Qualifier of the <code>ComingSoonNotiFyCustomer.notifyFirstName</code> attribute **/
	public static final String NOTIFYFIRSTNAME = "notifyFirstName";
	/** Qualifier of the <code>ComingSoonNotiFyCustomer.notifyLastName</code> attribute **/
	public static final String NOTIFYLASTNAME = "notifyLastName";
	/** Qualifier of the <code>ComingSoonNotiFyCustomer.notifyEmail</code> attribute **/
	public static final String NOTIFYEMAIL = "notifyEmail";
	/** Qualifier of the <code>ComingSoonNotiFyCustomer.notifyProductCode</code> attribute **/
	public static final String NOTIFYPRODUCTCODE = "notifyProductCode";
	/** Qualifier of the <code>ComingSoonNotiFyCustomer.notifyProductName</code> attribute **/
	public static final String NOTIFYPRODUCTNAME = "notifyProductName";
	/** Qualifier of the <code>ComingSoonNotiFyCustomer.isExportedCustomer</code> attribute **/
	public static final String ISEXPORTEDCUSTOMER = "isExportedCustomer";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NOTIFYFIRSTNAME, AttributeMode.INITIAL);
		tmp.put(NOTIFYLASTNAME, AttributeMode.INITIAL);
		tmp.put(NOTIFYEMAIL, AttributeMode.INITIAL);
		tmp.put(NOTIFYPRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(NOTIFYPRODUCTNAME, AttributeMode.INITIAL);
		tmp.put(ISEXPORTEDCUSTOMER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonNotiFyCustomer.isExportedCustomer</code> attribute.
	 * @return the isExportedCustomer - Export Customer details
	 */
	public Boolean isIsExportedCustomer(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISEXPORTEDCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonNotiFyCustomer.isExportedCustomer</code> attribute.
	 * @return the isExportedCustomer - Export Customer details
	 */
	public Boolean isIsExportedCustomer()
	{
		return isIsExportedCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonNotiFyCustomer.isExportedCustomer</code> attribute. 
	 * @return the isExportedCustomer - Export Customer details
	 */
	public boolean isIsExportedCustomerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsExportedCustomer( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonNotiFyCustomer.isExportedCustomer</code> attribute. 
	 * @return the isExportedCustomer - Export Customer details
	 */
	public boolean isIsExportedCustomerAsPrimitive()
	{
		return isIsExportedCustomerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonNotiFyCustomer.isExportedCustomer</code> attribute. 
	 * @param value the isExportedCustomer - Export Customer details
	 */
	public void setIsExportedCustomer(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISEXPORTEDCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonNotiFyCustomer.isExportedCustomer</code> attribute. 
	 * @param value the isExportedCustomer - Export Customer details
	 */
	public void setIsExportedCustomer(final Boolean value)
	{
		setIsExportedCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonNotiFyCustomer.isExportedCustomer</code> attribute. 
	 * @param value the isExportedCustomer - Export Customer details
	 */
	public void setIsExportedCustomer(final SessionContext ctx, final boolean value)
	{
		setIsExportedCustomer( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonNotiFyCustomer.isExportedCustomer</code> attribute. 
	 * @param value the isExportedCustomer - Export Customer details
	 */
	public void setIsExportedCustomer(final boolean value)
	{
		setIsExportedCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonNotiFyCustomer.notifyEmail</code> attribute.
	 * @return the notifyEmail - Customer Email for coming soon Products
	 */
	public String getNotifyEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTIFYEMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonNotiFyCustomer.notifyEmail</code> attribute.
	 * @return the notifyEmail - Customer Email for coming soon Products
	 */
	public String getNotifyEmail()
	{
		return getNotifyEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonNotiFyCustomer.notifyEmail</code> attribute. 
	 * @param value the notifyEmail - Customer Email for coming soon Products
	 */
	public void setNotifyEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTIFYEMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonNotiFyCustomer.notifyEmail</code> attribute. 
	 * @param value the notifyEmail - Customer Email for coming soon Products
	 */
	public void setNotifyEmail(final String value)
	{
		setNotifyEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonNotiFyCustomer.notifyFirstName</code> attribute.
	 * @return the notifyFirstName - First name of Customer for coming soon Products
	 */
	public String getNotifyFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTIFYFIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonNotiFyCustomer.notifyFirstName</code> attribute.
	 * @return the notifyFirstName - First name of Customer for coming soon Products
	 */
	public String getNotifyFirstName()
	{
		return getNotifyFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonNotiFyCustomer.notifyFirstName</code> attribute. 
	 * @param value the notifyFirstName - First name of Customer for coming soon Products
	 */
	public void setNotifyFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTIFYFIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonNotiFyCustomer.notifyFirstName</code> attribute. 
	 * @param value the notifyFirstName - First name of Customer for coming soon Products
	 */
	public void setNotifyFirstName(final String value)
	{
		setNotifyFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonNotiFyCustomer.notifyLastName</code> attribute.
	 * @return the notifyLastName - Last name of Customer for coming soon Products
	 */
	public String getNotifyLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTIFYLASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonNotiFyCustomer.notifyLastName</code> attribute.
	 * @return the notifyLastName - Last name of Customer for coming soon Products
	 */
	public String getNotifyLastName()
	{
		return getNotifyLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonNotiFyCustomer.notifyLastName</code> attribute. 
	 * @param value the notifyLastName - Last name of Customer for coming soon Products
	 */
	public void setNotifyLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTIFYLASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonNotiFyCustomer.notifyLastName</code> attribute. 
	 * @param value the notifyLastName - Last name of Customer for coming soon Products
	 */
	public void setNotifyLastName(final String value)
	{
		setNotifyLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonNotiFyCustomer.notifyProductCode</code> attribute.
	 * @return the notifyProductCode - Product code to notify customer
	 */
	public String getNotifyProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTIFYPRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonNotiFyCustomer.notifyProductCode</code> attribute.
	 * @return the notifyProductCode - Product code to notify customer
	 */
	public String getNotifyProductCode()
	{
		return getNotifyProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonNotiFyCustomer.notifyProductCode</code> attribute. 
	 * @param value the notifyProductCode - Product code to notify customer
	 */
	public void setNotifyProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTIFYPRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonNotiFyCustomer.notifyProductCode</code> attribute. 
	 * @param value the notifyProductCode - Product code to notify customer
	 */
	public void setNotifyProductCode(final String value)
	{
		setNotifyProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonNotiFyCustomer.notifyProductName</code> attribute.
	 * @return the notifyProductName - Product name to notify customer
	 */
	public String getNotifyProductName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTIFYPRODUCTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonNotiFyCustomer.notifyProductName</code> attribute.
	 * @return the notifyProductName - Product name to notify customer
	 */
	public String getNotifyProductName()
	{
		return getNotifyProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonNotiFyCustomer.notifyProductName</code> attribute. 
	 * @param value the notifyProductName - Product name to notify customer
	 */
	public void setNotifyProductName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTIFYPRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonNotiFyCustomer.notifyProductName</code> attribute. 
	 * @param value the notifyProductName - Product name to notify customer
	 */
	public void setNotifyProductName(final String value)
	{
		setNotifyProductName( getSession().getSessionContext(), value );
	}
	
}
