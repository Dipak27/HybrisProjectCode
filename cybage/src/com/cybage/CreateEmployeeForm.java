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
package com.cybage;

/**
 *
 */
public class CreateEmployeeForm
{
	String fname;

	String laname;

	int eid;

	boolean is_Manager;

	String manager;

	String empPassword;

	String project;

	public CreateEmployeeForm()
	{
		// YTODO Auto-generated constructor stub
	}



	/**
	 * @return the eid
	 */
	public int getEid()
	{
		return eid;
	}



	/**
	 * @param eid
	 *           the eid to set
	 */
	public void setEid(final int eid)
	{
		this.eid = eid;
	}



	/**
	 * @return the empPassword
	 */
	public String getEmpPassword()
	{
		return empPassword;
	}


	/**
	 * @param empPassword
	 *           the empPassword to set
	 */
	public void setEmpPassword(final String empPassword)
	{
		this.empPassword = empPassword;
	}


	/**
	 * @return the project
	 */
	public String getProject()
	{
		return project;
	}

	/**
	 * @param project
	 *           the project to set
	 */
	public void setProject(final String project)
	{
		this.project = project;
	}



	/**
	 * @return the manager
	 */
	public String getManager()
	{
		return manager;
	}

	/**
	 * @param manager
	 *           the manager to set
	 */
	public void setManager(final String manager)
	{
		this.manager = manager;
	}

	/**
	 * @return the fname
	 */
	public String getFname()
	{
		return fname;
	}

	/**
	 * @param fname
	 *           the fname to set
	 */
	public void setFname(final String fname)
	{
		this.fname = fname;
	}

	/**
	 * @return the laname
	 */
	public String getLaname()
	{
		return laname;
	}

	/**
	 * @param laname
	 *           the laname to set
	 */
	public void setLaname(final String laname)
	{
		this.laname = laname;
	}

	/**
	 * @return the is_Manager
	 */
	public boolean isIs_Manager()
	{
		return is_Manager;
	}

	/**
	 * @param is_Manager
	 *           the is_Manager to set
	 */
	public void setIs_Manager(final boolean is_Manager)
	{
		this.is_Manager = is_Manager;
	}

}
