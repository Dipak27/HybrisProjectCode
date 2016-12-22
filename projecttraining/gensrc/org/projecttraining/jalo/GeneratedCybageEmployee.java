/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 22, 2016 9:35:11 AM                     ---
 * ----------------------------------------------------------------
 */
package org.projecttraining.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.projecttraining.constants.ProjecttrainingConstants;
import org.projecttraining.jalo.CybageEmployee;
import org.projecttraining.jalo.CybageProject;

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
	/** Qualifier of the <code>CybageEmployee.empId</code> attribute **/
	public static final String EMPID = "empId";
	/** Qualifier of the <code>CybageEmployee.empPassword</code> attribute **/
	public static final String EMPPASSWORD = "empPassword";
	/** Qualifier of the <code>CybageEmployee.projectId</code> attribute **/
	public static final String PROJECTID = "projectId";
	/** Relation ordering override parameter constants for EmployeeToProject from ((projecttraining))*/
	protected static String EMPLOYEETOPROJECT_SRC_ORDERED = "relation.EmployeeToProject.source.ordered";
	protected static String EMPLOYEETOPROJECT_TGT_ORDERED = "relation.EmployeeToProject.target.ordered";
	/** Relation disable markmodifed parameter constants for EmployeeToProject from ((projecttraining))*/
	protected static String EMPLOYEETOPROJECT_MARKMODIFIED = "relation.EmployeeToProject.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Customer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MANAGERS, AttributeMode.INITIAL);
		tmp.put(ISMANAGER, AttributeMode.INITIAL);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(EMPID, AttributeMode.INITIAL);
		tmp.put(EMPPASSWORD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.empId</code> attribute.
	 * @return the empId
	 */
	public Integer getEmpId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, EMPID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.empId</code> attribute.
	 * @return the empId
	 */
	public Integer getEmpId()
	{
		return getEmpId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.empId</code> attribute. 
	 * @return the empId
	 */
	public int getEmpIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getEmpId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.empId</code> attribute. 
	 * @return the empId
	 */
	public int getEmpIdAsPrimitive()
	{
		return getEmpIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.empId</code> attribute. 
	 * @param value the empId
	 */
	public void setEmpId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, EMPID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.empId</code> attribute. 
	 * @param value the empId
	 */
	public void setEmpId(final Integer value)
	{
		setEmpId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.empId</code> attribute. 
	 * @param value the empId
	 */
	public void setEmpId(final SessionContext ctx, final int value)
	{
		setEmpId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.empId</code> attribute. 
	 * @param value the empId
	 */
	public void setEmpId(final int value)
	{
		setEmpId( getSession().getSessionContext(), value );
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
	 * @return the isManager
	 */
	public Boolean isIsManager(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISMANAGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.isManager</code> attribute.
	 * @return the isManager
	 */
	public Boolean isIsManager()
	{
		return isIsManager( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.isManager</code> attribute. 
	 * @return the isManager
	 */
	public boolean isIsManagerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsManager( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.isManager</code> attribute. 
	 * @return the isManager
	 */
	public boolean isIsManagerAsPrimitive()
	{
		return isIsManagerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.isManager</code> attribute. 
	 * @param value the isManager
	 */
	public void setIsManager(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISMANAGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.isManager</code> attribute. 
	 * @param value the isManager
	 */
	public void setIsManager(final Boolean value)
	{
		setIsManager( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.isManager</code> attribute. 
	 * @param value the isManager
	 */
	public void setIsManager(final SessionContext ctx, final boolean value)
	{
		setIsManager( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.isManager</code> attribute. 
	 * @param value the isManager
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
	 * @return the managers
	 */
	public List<CybageEmployee> getManagers(final SessionContext ctx)
	{
		List<CybageEmployee> coll = (List<CybageEmployee>)getProperty( ctx, MANAGERS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.managers</code> attribute.
	 * @return the managers
	 */
	public List<CybageEmployee> getManagers()
	{
		return getManagers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.managers</code> attribute. 
	 * @param value the managers
	 */
	public void setManagers(final SessionContext ctx, final List<CybageEmployee> value)
	{
		setProperty(ctx, MANAGERS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.managers</code> attribute. 
	 * @param value the managers
	 */
	public void setManagers(final List<CybageEmployee> value)
	{
		setManagers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.projectId</code> attribute.
	 * @return the projectId
	 */
	public Collection<CybageProject> getProjectId(final SessionContext ctx)
	{
		final List<CybageProject> items = getLinkedItems( 
			ctx,
			true,
			ProjecttrainingConstants.Relations.EMPLOYEETOPROJECT,
			"CybageProject",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageEmployee.projectId</code> attribute.
	 * @return the projectId
	 */
	public Collection<CybageProject> getProjectId()
	{
		return getProjectId( getSession().getSessionContext() );
	}
	
	public long getProjectIdCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			ProjecttrainingConstants.Relations.EMPLOYEETOPROJECT,
			"CybageProject",
			null
		);
	}
	
	public long getProjectIdCount()
	{
		return getProjectIdCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.projectId</code> attribute. 
	 * @param value the projectId
	 */
	public void setProjectId(final SessionContext ctx, final Collection<CybageProject> value)
	{
		setLinkedItems( 
			ctx,
			true,
			ProjecttrainingConstants.Relations.EMPLOYEETOPROJECT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEETOPROJECT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageEmployee.projectId</code> attribute. 
	 * @param value the projectId
	 */
	public void setProjectId(final Collection<CybageProject> value)
	{
		setProjectId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to projectId. 
	 * @param value the item to add to projectId
	 */
	public void addToProjectId(final SessionContext ctx, final CybageProject value)
	{
		addLinkedItems( 
			ctx,
			true,
			ProjecttrainingConstants.Relations.EMPLOYEETOPROJECT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEETOPROJECT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to projectId. 
	 * @param value the item to add to projectId
	 */
	public void addToProjectId(final CybageProject value)
	{
		addToProjectId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from projectId. 
	 * @param value the item to remove from projectId
	 */
	public void removeFromProjectId(final SessionContext ctx, final CybageProject value)
	{
		removeLinkedItems( 
			ctx,
			true,
			ProjecttrainingConstants.Relations.EMPLOYEETOPROJECT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEETOPROJECT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from projectId. 
	 * @param value the item to remove from projectId
	 */
	public void removeFromProjectId(final CybageProject value)
	{
		removeFromProjectId( getSession().getSessionContext(), value );
	}
	
}
