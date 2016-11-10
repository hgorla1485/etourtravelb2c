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
 * Generated class for type {@link com.etourtravelb2b.core.jalo.NotifyComingSoon NotifyComingSoon}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedNotifyComingSoon extends GenericItem
{
	/** Qualifier of the <code>NotifyComingSoon.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>NotifyComingSoon.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>NotifyComingSoon.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>NotifyComingSoon.productCode</code> attribute **/
	public static final String PRODUCTCODE = "productCode";
	/** Qualifier of the <code>NotifyComingSoon.productName</code> attribute **/
	public static final String PRODUCTNAME = "productName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(PRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(PRODUCTNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NotifyComingSoon.email</code> attribute.
	 * @return the email - Customer Email to Notify product
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NotifyComingSoon.email</code> attribute.
	 * @return the email - Customer Email to Notify product
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NotifyComingSoon.email</code> attribute. 
	 * @param value the email - Customer Email to Notify product
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NotifyComingSoon.email</code> attribute. 
	 * @param value the email - Customer Email to Notify product
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NotifyComingSoon.firstName</code> attribute.
	 * @return the firstName - Customer FirstName to Notify product
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NotifyComingSoon.firstName</code> attribute.
	 * @return the firstName - Customer FirstName to Notify product
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NotifyComingSoon.firstName</code> attribute. 
	 * @param value the firstName - Customer FirstName to Notify product
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NotifyComingSoon.firstName</code> attribute. 
	 * @param value the firstName - Customer FirstName to Notify product
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NotifyComingSoon.lastName</code> attribute.
	 * @return the lastName - Customer LastName to Notify product
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NotifyComingSoon.lastName</code> attribute.
	 * @return the lastName - Customer LastName to Notify product
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NotifyComingSoon.lastName</code> attribute. 
	 * @param value the lastName - Customer LastName to Notify product
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NotifyComingSoon.lastName</code> attribute. 
	 * @param value the lastName - Customer LastName to Notify product
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NotifyComingSoon.productCode</code> attribute.
	 * @return the productCode - Notify product Code
	 */
	public String getProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NotifyComingSoon.productCode</code> attribute.
	 * @return the productCode - Notify product Code
	 */
	public String getProductCode()
	{
		return getProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NotifyComingSoon.productCode</code> attribute. 
	 * @param value the productCode - Notify product Code
	 */
	public void setProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NotifyComingSoon.productCode</code> attribute. 
	 * @param value the productCode - Notify product Code
	 */
	public void setProductCode(final String value)
	{
		setProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NotifyComingSoon.productName</code> attribute.
	 * @return the productName - Notify product Name
	 */
	public String getProductName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NotifyComingSoon.productName</code> attribute.
	 * @return the productName - Notify product Name
	 */
	public String getProductName()
	{
		return getProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NotifyComingSoon.productName</code> attribute. 
	 * @param value the productName - Notify product Name
	 */
	public void setProductName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NotifyComingSoon.productName</code> attribute. 
	 * @param value the productName - Notify product Name
	 */
	public void setProductName(final String value)
	{
		setProductName( getSession().getSessionContext(), value );
	}
	
}
