/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package org.projecttraining;

/**
 *
 */
public class CreateProjectForm
{
	private int projectId;
	private String projectName;
	private String clientName;
	private String projectDuration;
	private String projectDomain;

	/**
	 * @return the projectId
	 */
	public int getProjectId()
	{
		return projectId;
	}

	/**
	 *
	 */
	public CreateProjectForm()
	{
		super();
	}

	/**
	 * @param projectId
	 *           the projectId to set
	 */
	public void setProjectId(final int projectId)
	{
		this.projectId = projectId;
	}

	/**
	 * @return the projectName
	 */
	public String getProjectName()
	{
		return projectName;
	}

	/**
	 * @param projectName
	 *           the projectName to set
	 */
	public void setProjectName(final String projectName)
	{
		this.projectName = projectName;
	}

	/**
	 * @return the clientName
	 */
	public String getClientName()
	{
		return clientName;
	}

	/**
	 * @param clientName
	 *           the clientName to set
	 */
	public void setClientName(final String clientName)
	{
		this.clientName = clientName;
	}

	/**
	 * @return the projectDuration
	 */
	public String getProjectDuration()
	{
		return projectDuration;
	}

	/**
	 * @param projectDuration
	 *           the projectDuration to set
	 */
	public void setProjectDuration(final String projectDuration)
	{
		this.projectDuration = projectDuration;
	}

	/**
	 * @return the projectDomain
	 */
	public String getProjectDomain()
	{
		return projectDomain;
	}

	/**
	 * @param projectDomain
	 *           the projectDomain to set
	 */
	public void setProjectDomain(final String projectDomain)
	{
		this.projectDomain = projectDomain;
	}


}
