/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 21, 2016 1:35:11 PM                     ---
 * ----------------------------------------------------------------
 */
package com.cybage.jalo;

import com.cybage.constants.CybageConstants;
import com.cybage.jalo.CybageEmployee;
import com.cybage.jalo.CybageProject;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.user.Customer CybageEmployee}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCybageEmployee extends Customer
{
	/** Qualifier of the <code>CybageEmployee.managers</code> attribute **/
	public static final String MANAGERS = "managers";
	/** Qualifier of the <code>CybageEmployee.isManager</code> attribute **/
	public static final String ISMANAGER = "isManager";
	/** Qualifier of the <code>CybageEmployee.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>CybageEmployee.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>CybageEmployee.cybempId</code> attribute **/
	public static final String CYBEMPID = "cybempId";
	/** Qualifier of the <code>CybageEmployee.empPassword</code> attribute **/
	public static final String EMPPASSWORD = "empPassword";
	/** Qualifier of the <code>CybageEmployee.projectManagers</code> attribute **/
	public static final String PROJECTMANAGERS = "projectManagers";
	/** Relation ordering override parameter constants for Employee2Project from ((cybage))*/
	protected static String EMPLOYEE2PROJECT_SRC_ORDERED = "relation.Employee2Project.source.ordered";
	protected static String EMPLOYEE2PROJECT_TGT_ORDERED = "relation.Employee2Project.target.ordered";
	/** Relation disable markmodifed parameter constants for Employee2Project from ((cybage))*/
	protected static String EMPLOYEE2PROJECT_MARKMODIFIED = "relation.Employee2Project.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Customer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MANAGERS, AttributeMode.INITIAL);
		tmp.put(ISMANAGER, AttributeMode.INITIAL);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(CYBEMPID, AttributeMode.INITIAL);
		tmp.put(EMPPASSWORD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.cybempId</code> attribute.
	 * @return the cybempId
	 */
	public Integer getCybempId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CYBEMPID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.cybempId</code> attribute.
	 * @return the cybempId
	 */
	public Integer getCybempId()
	{
		return getCybempId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.cybempId</code> attribute. 
	 * @return the cybempId
	 */
	public int getCybempIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCybempId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.cybempId</code> attribute. 
	 * @return the cybempId
	 */
	public int getCybempIdAsPrimitive()
	{
		return getCybempIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.cybempId</code> attribute. 
	 * @param value the cybempId
	 */
	public void setCybempId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CYBEMPID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.cybempId</code> attribute. 
	 * @param value the cybempId
	 */
	public void setCybempId(final Integer value)
	{
		setCybempId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.cybempId</code> attribute. 
	 * @param value the cybempId
	 */
	public void setCybempId(final SessionContext ctx, final int value)
	{
		setCybempId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.cybempId</code> attribute. 
	 * @param value the cybempId
	 */
	public void setCybempId(final int value)
	{
		setCybempId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.empPassword</code> attribute.
	 * @return the empPassword
	 */
	public String getEmpPassword(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMPPASSWORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.empPassword</code> attribute.
	 * @return the empPassword
	 */
	public String getEmpPassword()
	{
		return getEmpPassword( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.empPassword</code> attribute. 
	 * @param value the empPassword
	 */
	public void setEmpPassword(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMPPASSWORD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.empPassword</code> attribute. 
	 * @param value the empPassword
	 */
	public void setEmpPassword(final String value)
	{
		setEmpPassword( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.isManager</code> attribute.
	 * @return the isManager - If Manager, Show list of Employee
	 */
	public Boolean isIsManager(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISMANAGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.isManager</code> attribute.
	 * @return the isManager - If Manager, Show list of Employee
	 */
	public Boolean isIsManager()
	{
		return isIsManager( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.isManager</code> attribute. 
	 * @return the isManager - If Manager, Show list of Employee
	 */
	public boolean isIsManagerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsManager( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.isManager</code> attribute. 
	 * @return the isManager - If Manager, Show list of Employee
	 */
	public boolean isIsManagerAsPrimitive()
	{
		return isIsManagerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.isManager</code> attribute. 
	 * @param value the isManager - If Manager, Show list of Employee
	 */
	public void setIsManager(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISMANAGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.isManager</code> attribute. 
	 * @param value the isManager - If Manager, Show list of Employee
	 */
	public void setIsManager(final Boolean value)
	{
		setIsManager( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.isManager</code> attribute. 
	 * @param value the isManager - If Manager, Show list of Employee
	 */
	public void setIsManager(final SessionContext ctx, final boolean value)
	{
		setIsManager( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.isManager</code> attribute. 
	 * @param value the isManager - If Manager, Show list of Employee
	 */
	public void setIsManager(final boolean value)
	{
		setIsManager( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.managers</code> attribute.
	 * @return the managers - Manager is CybageEmployee Type
	 */
	public List<CybageEmployee> getManagers(final SessionContext ctx)
	{
		List<CybageEmployee> coll = (List<CybageEmployee>)getProperty( ctx, MANAGERS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.managers</code> attribute.
	 * @return the managers - Manager is CybageEmployee Type
	 */
	public List<CybageEmployee> getManagers()
	{
		return getManagers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.managers</code> attribute. 
	 * @param value the managers - Manager is CybageEmployee Type
	 */
	public void setManagers(final SessionContext ctx, final List<CybageEmployee> value)
	{
		setProperty(ctx, MANAGERS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.managers</code> attribute. 
	 * @param value the managers - Manager is CybageEmployee Type
	 */
	public void setManagers(final List<CybageEmployee> value)
	{
		setManagers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.projectManagers</code> attribute.
	 * @return the projectManagers
	 */
	public Collection<CybageProject> getProjectManagers(final SessionContext ctx)
	{
		final List<CybageProject> items = getLinkedItems( 
			ctx,
			true,
			CybageConstants.Relations.EMPLOYEE2PROJECT,
			"CybageProject",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.projectManagers</code> attribute.
	 * @return the projectManagers
	 */
	public Collection<CybageProject> getProjectManagers()
	{
		return getProjectManagers( getSession().getSessionContext() );
	}
	
	public long getProjectManagersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			CybageConstants.Relations.EMPLOYEE2PROJECT,
			"CybageProject",
			null
		);
	}
	
	public long getProjectManagersCount()
	{
		return getProjectManagersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.projectManagers</code> attribute. 
	 * @param value the projectManagers
	 */
	public void setProjectManagers(final SessionContext ctx, final Collection<CybageProject> value)
	{
		setLinkedItems( 
			ctx,
			true,
			CybageConstants.Relations.EMPLOYEE2PROJECT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEE2PROJECT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.projectManagers</code> attribute. 
	 * @param value the projectManagers
	 */
	public void setProjectManagers(final Collection<CybageProject> value)
	{
		setProjectManagers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to projectManagers. 
	 * @param value the item to add to projectManagers
	 */
	public void addToProjectManagers(final SessionContext ctx, final CybageProject value)
	{
		addLinkedItems( 
			ctx,
			true,
			CybageConstants.Relations.EMPLOYEE2PROJECT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEE2PROJECT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to projectManagers. 
	 * @param value the item to add to projectManagers
	 */
	public void addToProjectManagers(final CybageProject value)
	{
		addToProjectManagers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from projectManagers. 
	 * @param value the item to remove from projectManagers
	 */
	public void removeFromProjectManagers(final SessionContext ctx, final CybageProject value)
	{
		removeLinkedItems( 
			ctx,
			true,
			CybageConstants.Relations.EMPLOYEE2PROJECT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEE2PROJECT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from projectManagers. 
	 * @param value the item to remove from projectManagers
	 */
	public void removeFromProjectManagers(final CybageProject value)
	{
		removeFromProjectManagers( getSession().getSessionContext(), value );
	}
	
}
