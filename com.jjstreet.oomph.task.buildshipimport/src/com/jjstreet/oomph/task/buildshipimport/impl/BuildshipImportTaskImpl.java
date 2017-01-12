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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.buildship.core.util.progress.AsyncHandler;
import org.eclipse.buildship.core.workspace.SynchronizeGradleProjectJob;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;

import com.gradleware.tooling.toolingclient.GradleDistribution;
import com.gradleware.tooling.toolingmodel.repository.FixedRequestAttributes;
import com.jjstreet.oomph.task.buildshipimport.BuildshipImportPackage;
import com.jjstreet.oomph.task.buildshipimport.BuildshipImportTask;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buildship Import Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.jjstreet.oomph.task.buildshipimport.impl.BuildshipImportTaskImpl#getProjectRootDirectory <em>Project Root Directory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildshipImportTaskImpl extends SetupTaskImpl implements BuildshipImportTask
{
  /**
   * The default value of the '{@link #getProjectRootDirectory() <em>Project Root Directory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectRootDirectory()
   * @generated
   * @ordered
   */
  protected static final URI PROJECT_ROOT_DIRECTORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProjectRootDirectory() <em>Project Root Directory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectRootDirectory()
   * @generated
   * @ordered
   */
  protected URI projectRootDirectory = PROJECT_ROOT_DIRECTORY_EDEFAULT;

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

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public URI getProjectRootDirectory()
  {
    return projectRootDirectory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProjectRootDirectory(URI newProjectRootDirectory)
  {
    URI oldProjectRootDirectory = projectRootDirectory;
    projectRootDirectory = newProjectRootDirectory;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, BuildshipImportPackage.BUILDSHIP_IMPORT_TASK__PROJECT_ROOT_DIRECTORY, oldProjectRootDirectory,
          projectRootDirectory));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case BuildshipImportPackage.BUILDSHIP_IMPORT_TASK__PROJECT_ROOT_DIRECTORY:
      return getProjectRootDirectory();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case BuildshipImportPackage.BUILDSHIP_IMPORT_TASK__PROJECT_ROOT_DIRECTORY:
      setProjectRootDirectory((URI)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case BuildshipImportPackage.BUILDSHIP_IMPORT_TASK__PROJECT_ROOT_DIRECTORY:
      setProjectRootDirectory(PROJECT_ROOT_DIRECTORY_EDEFAULT);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case BuildshipImportPackage.BUILDSHIP_IMPORT_TASK__PROJECT_ROOT_DIRECTORY:
      return PROJECT_ROOT_DIRECTORY_EDEFAULT == null ? projectRootDirectory != null : !PROJECT_ROOT_DIRECTORY_EDEFAULT.equals(projectRootDirectory);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
    {
      return super.toString();
    }

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (ProjectRootDirectory: ");
    result.append(projectRootDirectory);
    result.append(')');
    return result.toString();
  }

  @Override
  public int getPriority()
  {
    return PRIORITY;
  }

  @Override
  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    File projectRoot = asFile(getProjectRootDirectory());
    if (projectRoot == null)
    {
      context.log("Project root not set");
      return true;
    }
    return false;
  }

  @Override
  public void perform(final SetupTaskContext context) throws Exception
  {
    final File projectDir = asFile(getProjectRootDirectory());
    if (projectDir == null)
    {
      throw new NullPointerException("Project root directory not set");
    }

    final File gradleUserHome = null;
    final GradleDistribution gradleDistribution = GradleDistribution.fromBuild();
    final File javaHome = null;
    final List<String> jvmArguments = Collections.emptyList();
    final List<String> arguments = Collections.emptyList();

    FixedRequestAttributes requestAttributes = new FixedRequestAttributes(projectDir, gradleUserHome, gradleDistribution, javaHome, jvmArguments, arguments);

    // Working sets are handled by Oomph
    List<String> workingSets = Collections.emptyList();

    final CountDownLatch latch = new CountDownLatch(1);
    AsyncHandler initializer = AsyncHandler.NO_OP;

    context.log("Importing projects from " + projectDir);

    SynchronizeGradleProjectJob synchronizeJob = new SynchronizeGradleProjectJob(requestAttributes, workingSets, initializer);
    synchronizeJob.addJobChangeListener(new JobChangeAdapter()
    {

      /*
       * (non-Javadoc)
       * @see org.eclipse.core.runtime.jobs.JobChangeAdapter#done(org.eclipse.core.runtime.jobs.IJobChangeEvent)
       */
      @Override
      public void done(IJobChangeEvent event)
      {
        try
        {
          if (event.getResult().isOK())
          {
            context.log("Import completed successfully.");
          }
          else
          {
            throw new RuntimeException("Buildship import failed for " + projectDir);
          }
        }
        finally
        {
          latch.countDown();
        }
      }
    });

    synchronizeJob.schedule();
  }

  private File asFile(URI uri)
  {
    File result = null;

    if (uri == null || "".equals(uri.toString()))
    {
      return result;
    }

    if (uri.scheme() == null)
    {
      result = new File(uri.path());
    }

    if (uri.isFile())
    {
      result = new File(uri.toFileString());
    }

    try
    {
      return result.getCanonicalFile();
    }
    catch (IOException e)
    {
      return result.getAbsoluteFile();
    }
  }

} // BuildshipImportTaskImpl
