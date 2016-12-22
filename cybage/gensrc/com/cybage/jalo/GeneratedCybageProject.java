/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 21, 2016 1:35:11 PM                     ---
 * ----------------------------------------------------------------
 */
package com.cybage.jalo;

import com.cybage.constants.CybageConstants;
import com.cybage.jalo.CybageEmployee;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	/** Qualifier of the <code>CybageProject.cybempId</code> attribute **/
	public static final String CYBEMPID = "cybempId";
	/** Relation ordering override parameter constants for Employee2Project from ((cybage))*/
	protected static String EMPLOYEE2PROJECT_SRC_ORDERED = "relation.Employee2Project.source.ordered";
	protected static String EMPLOYEE2PROJECT_TGT_ORDERED = "relation.Employee2Project.target.ordered";
	/** Relation disable markmodifed parameter constants for Employee2Project from ((cybage))*/
	protected static String EMPLOYEE2PROJECT_MARKMODIFIED = "relation.Employee2Project.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PROJECTNAME, AttributeMode.INITIAL);
		tmp.put(PROJECTID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.cybempId</code> attribute.
	 * @return the cybempId
	 */
	public Collection<CybageEmployee> getCybempId(final SessionContext ctx)
	{
		final List<CybageEmployee> items = getLinkedItems( 
			ctx,
			false,
			CybageConstants.Relations.EMPLOYEE2PROJECT,
			"CybageEmployee",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CybageProject.cybempId</code> attribute.
	 * @return the cybempId
	 */
	public Collection<CybageEmployee> getCybempId()
	{
		return getCybempId( getSession().getSessionContext() );
	}
	
	public long getCybempIdCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			CybageConstants.Relations.EMPLOYEE2PROJECT,
			"CybageEmployee",
			null
		);
	}
	
	public long getCybempIdCount()
	{
		return getCybempIdCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.cybempId</code> attribute. 
	 * @param value the cybempId
	 */
	public void setCybempId(final SessionContext ctx, final Collection<CybageEmployee> value)
	{
		setLinkedItems( 
			ctx,
			false,
			CybageConstants.Relations.EMPLOYEE2PROJECT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEE2PROJECT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CybageProject.cybempId</code> attribute. 
	 * @param value the cybempId
	 */
	public void setCybempId(final Collection<CybageEmployee> value)
	{
		setCybempId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cybempId. 
	 * @param value the item to add to cybempId
	 */
	public void addToCybempId(final SessionContext ctx, final CybageEmployee value)
	{
		addLinkedItems( 
			ctx,
			false,
			CybageConstants.Relations.EMPLOYEE2PROJECT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEE2PROJECT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cybempId. 
	 * @param value the item to add to cybempId
	 */
	public void addToCybempId(final CybageEmployee value)
	{
		addToCybempId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cybempId. 
	 * @param value the item to remove from cybempId
	 */
	public void removeFromCybempId(final SessionContext ctx, final CybageEmployee value)
	{
		removeLinkedItems( 
			ctx,
			false,
			CybageConstants.Relations.EMPLOYEE2PROJECT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEE2PROJECT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cybempId. 
	 * @param value the item to remove from cybempId
	 */
	public void removeFromCybempId(final CybageEmployee value)
	{
		removeFromCybempId( getSession().getSessionContext(), value );
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
