/*
 * Copyright (c) 2014 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package com.jjstreet.oomph.task.buildshipimport.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.ecore.EClass;

import com.jjstreet.oomph.task.buildshipimport.BuildshipImportPackage;
import com.jjstreet.oomph.task.buildshipimport.BuildshipImportTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buildship Import Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BuildshipImportTaskImpl extends SetupTaskImpl implements BuildshipImportTask
{
  private static final int PRIORITY = PRIORITY_DEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuildshipImportTaskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BuildshipImportPackage.Literals.BUILDSHIP_IMPORT_TASK;
  }

  @Override
  public int getPriority()
  {
    return PRIORITY;
  }

  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    // TODO Implement BuildshipImportTaskImpl.isNeeded()
    return true;
  }

  public void perform(SetupTaskContext context) throws Exception
  {
    // TODO Implement BuildshipImportTaskImpl.perform()
    context.log("Implement BuildshipImportTaskImpl.perform()");
  }

  @Override
  public void dispose()
  {
    // TODO Implement BuildshipImportTaskImpl.perform() or remove this override if not needed
  }

} // BuildshipImportTaskImpl
