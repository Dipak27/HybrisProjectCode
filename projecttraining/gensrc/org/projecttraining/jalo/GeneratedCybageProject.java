/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 22, 2016 9:35:11 AM                     ---
 * ----------------------------------------------------------------
 */
package org.projecttraining.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.projecttraining.constants.ProjecttrainingConstants;
import org.projecttraining.jalo.CybageEmployee;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CybageProject}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCybageProject extends GenericItem
{
	/** Qualifier of the <code>CybageProject.projectName</code> attribute **/
	public static final String PROJECTNAME = "projectName";
	/** Qualifier of the <code>CybageProject.projectId</code> attribute **/
	public static final String PROJECTID = "projectId";
	/** Qualifier of the <code>CybageProject.clientName</code> attribute **/
	public static final String CLIENTNAME = "clientName";
	/** Qualifier of the <code>CybageProject.projectDuration</code> attribute **/
	public static final String PROJECTDURATION = "projectDuration";
	/** Qualifier of the <code>CybageProject.projectDomain</code> attribute **/
	public static final String PROJECTDOMAIN = "projectDomain";
	/** Qualifier of the <code>CybageProject.empId</code> attribute **/
	public static final String EMPID = "empId";
	/** Relation ordering override parameter constants for EmployeeToProject from ((projecttraining))*/
	protected static String EMPLOYEETOPROJECT_SRC_ORDERED = "relation.EmployeeToProject.source.ordered";
	protected static String EMPLOYEETOPROJECT_TGT_ORDERED = "relation.EmployeeToProject.target.ordered";
	/** Relation disable markmodifed parameter constants for EmployeeToProject from ((projecttraining))*/
	protected static String EMPLOYEETOPROJECT_MARKMODIFIED = "relation.EmployeeToProject.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PROJECTNAME, AttributeMode.INITIAL);
		tmp.put(PROJECTID, AttributeMode.INITIAL);
		tmp.put(CLIENTNAME, AttributeMode.INITIAL);
		tmp.put(PROJECTDURATION, AttributeMode.INITIAL);
		tmp.put(PROJECTDOMAIN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.clientName</code> attribute.
	 * @return the clientName
	 */
	public String getClientName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLIENTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.clientName</code> attribute.
	 * @return the clientName
	 */
	public String getClientName()
	{
		return getClientName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.clientName</code> attribute. 
	 * @param value the clientName
	 */
	public void setClientName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLIENTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.clientName</code> attribute. 
	 * @param value the clientName
	 */
	public void setClientName(final String value)
	{
		setClientName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.empId</code> attribute.
	 * @return the empId
	 */
	public Collection<CybageEmployee> getEmpId(final SessionContext ctx)
	{
		final List<CybageEmployee> items = getLinkedItems( 
			ctx,
			false,
			ProjecttrainingConstants.Relations.EMPLOYEETOPROJECT,
			"CybageEmployee",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.empId</code> attribute.
	 * @return the empId
	 */
	public Collection<CybageEmployee> getEmpId()
	{
		return getEmpId( getSession().getSessionContext() );
	}
	
	public long getEmpIdCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			ProjecttrainingConstants.Relations.EMPLOYEETOPROJECT,
			"CybageEmployee",
			null
		);
	}
	
	public long getEmpIdCount()
	{
		return getEmpIdCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.empId</code> attribute. 
	 * @param value the empId
	 */
	public void setEmpId(final SessionContext ctx, final Collection<CybageEmployee> value)
	{
		setLinkedItems( 
			ctx,
			false,
			ProjecttrainingConstants.Relations.EMPLOYEETOPROJECT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEETOPROJECT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.empId</code> attribute. 
	 * @param value the empId
	 */
	public void setEmpId(final Collection<CybageEmployee> value)
	{
		setEmpId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to empId. 
	 * @param value the item to add to empId
	 */
	public void addToEmpId(final SessionContext ctx, final CybageEmployee value)
	{
		addLinkedItems( 
			ctx,
			false,
			ProjecttrainingConstants.Relations.EMPLOYEETOPROJECT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEETOPROJECT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to empId. 
	 * @param value the item to add to empId
	 */
	public void addToEmpId(final CybageEmployee value)
	{
		addToEmpId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from empId. 
	 * @param value the item to remove from empId
	 */
	public void removeFromEmpId(final SessionContext ctx, final CybageEmployee value)
	{
		removeLinkedItems( 
			ctx,
			false,
			ProjecttrainingConstants.Relations.EMPLOYEETOPROJECT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEETOPROJECT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from empId. 
	 * @param value the item to remove from empId
	 */
	public void removeFromEmpId(final CybageEmployee value)
	{
		removeFromEmpId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.projectDomain</code> attribute.
	 * @return the projectDomain
	 */
	public String getProjectDomain(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PROJECTDOMAIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.projectDomain</code> attribute.
	 * @return the projectDomain
	 */
	public String getProjectDomain()
	{
		return getProjectDomain( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.projectDomain</code> attribute. 
	 * @param value the projectDomain
	 */
	public void setProjectDomain(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PROJECTDOMAIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.projectDomain</code> attribute. 
	 * @param value the projectDomain
	 */
	public void setProjectDomain(final String value)
	{
		setProjectDomain( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.projectDuration</code> attribute.
	 * @return the projectDuration
	 */
	public Integer getProjectDuration(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PROJECTDURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.projectDuration</code> attribute.
	 * @return the projectDuration
	 */
	public Integer getProjectDuration()
	{
		return getProjectDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.projectDuration</code> attribute. 
	 * @return the projectDuration
	 */
	public int getProjectDurationAsPrimitive(final SessionContext ctx)
	{
		Integer value = getProjectDuration( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.projectDuration</code> attribute. 
	 * @return the projectDuration
	 */
	public int getProjectDurationAsPrimitive()
	{
		return getProjectDurationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.projectDuration</code> attribute. 
	 * @param value the projectDuration
	 */
	public void setProjectDuration(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PROJECTDURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.projectDuration</code> attribute. 
	 * @param value the projectDuration
	 */
	public void setProjectDuration(final Integer value)
	{
		setProjectDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.projectDuration</code> attribute. 
	 * @param value the projectDuration
	 */
	public void setProjectDuration(final SessionContext ctx, final int value)
	{
		setProjectDuration( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.projectDuration</code> attribute. 
	 * @param value the projectDuration
	 */
	public void setProjectDuration(final int value)
	{
		setProjectDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.projectId</code> attribute.
	 * @return the projectId
	 */
	public Integer getProjectId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PROJECTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.projectId</code> attribute.
	 * @return the projectId
	 */
	public Integer getProjectId()
	{
		return getProjectId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.projectId</code> attribute. 
	 * @return the projectId
	 */
	public int getProjectIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getProjectId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.projectId</code> attribute. 
	 * @return the projectId
	 */
	public int getProjectIdAsPrimitive()
	{
		return getProjectIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.projectId</code> attribute. 
	 * @param value the projectId
	 */
	public void setProjectId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PROJECTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.projectId</code> attribute. 
	 * @param value the projectId
	 */
	public void setProjectId(final Integer value)
	{
		setProjectId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.projectId</code> attribute. 
	 * @param value the projectId
	 */
	public void setProjectId(final SessionContext ctx, final int value)
	{
		setProjectId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.projectId</code> attribute. 
	 * @param value the projectId
	 */
	public void setProjectId(final int value)
	{
		setProjectId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.projectName</code> attribute.
	 * @return the projectName
	 */
	public String getProjectName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PROJECTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.projectName</code> attribute.
	 * @return the projectName
	 */
	public String getProjectName()
	{
		return getProjectName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.projectName</code> attribute. 
	 * @param value the projectName
	 */
	public void setProjectName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PROJECTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.projectName</code> attribute. 
	 * @param value the projectName
	 */
	public void setProjectName(final String value)
	{
		setProjectName( getSession().getSessionContext(), value );
	}
	
}
