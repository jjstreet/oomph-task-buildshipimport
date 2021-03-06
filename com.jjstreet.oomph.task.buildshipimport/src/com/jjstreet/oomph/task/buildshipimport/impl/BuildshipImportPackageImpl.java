/**
 */
package com.jjstreet.oomph.task.buildshipimport.impl;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.jjstreet.oomph.task.buildshipimport.BuildshipImportFactory;
import com.jjstreet.oomph.task.buildshipimport.BuildshipImportPackage;
import com.jjstreet.oomph.task.buildshipimport.BuildshipImportTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuildshipImportPackageImpl extends EPackageImpl implements BuildshipImportPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buildshipImportTaskEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.jjstreet.oomph.task.buildshipimport.BuildshipImportPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BuildshipImportPackageImpl()
  {
    super(eNS_URI, BuildshipImportFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link BuildshipImportPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BuildshipImportPackage init()
  {
    if (isInited)
    {
      return (BuildshipImportPackage)EPackage.Registry.INSTANCE.getEPackage(BuildshipImportPackage.eNS_URI);
    }

    // Obtain or create and register package
    BuildshipImportPackageImpl theBuildshipImportPackage = (BuildshipImportPackageImpl)(EPackage.Registry.INSTANCE
        .get(eNS_URI) instanceof BuildshipImportPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BuildshipImportPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SetupPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theBuildshipImportPackage.createPackageContents();

    // Initialize created meta-data
    theBuildshipImportPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBuildshipImportPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BuildshipImportPackage.eNS_URI, theBuildshipImportPackage);
    return theBuildshipImportPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBuildshipImportTask()
  {
    return buildshipImportTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBuildshipImportTask_ProjectRootDirectory()
  {
    return (EAttribute)buildshipImportTaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BuildshipImportFactory getBuildshipImportFactory()
  {
    return (BuildshipImportFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated)
    {
      return;
    }
    isCreated = true;

    // Create classes and their features
    buildshipImportTaskEClass = createEClass(BUILDSHIP_IMPORT_TASK);
    createEAttribute(buildshipImportTaskEClass, BUILDSHIP_IMPORT_TASK__PROJECT_ROOT_DIRECTORY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized)
    {
      return;
    }
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    SetupPackage theSetupPackage = (SetupPackage)EPackage.Registry.INSTANCE.getEPackage(SetupPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    buildshipImportTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());

    // Initialize classes and features; add operations and parameters
    initEClass(buildshipImportTaskEClass, BuildshipImportTask.class, "BuildshipImportTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuildshipImportTask_ProjectRootDirectory(), ecorePackage.getEString(), "ProjectRootDirectory", null, 1, 1, BuildshipImportTask.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(
        "https://raw.githubusercontent.com/jjstreet/oomph-task-buildshipimport/master/com.jjstreet.oomph.task.buildshipimport/model/BuildshipImport.ecore");

    // Create annotations
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // http://www.eclipse.org/oomph/setup/Enablement
    createEnablementAnnotations();
    // http://www.eclipse.org/oomph/setup/ValidTriggers
    createValidTriggersAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";
    addAnnotation(this, source, new String[] { "schemaLocation",
        "https://raw.githubusercontent.com/jjstreet/oomph-task-buildshipimport/master/com.jjstreet.oomph.task.buildshipimport/model/BuildshipImport.ecore" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/Enablement</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEnablementAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/Enablement";
    addAnnotation(buildshipImportTaskEClass, source,
        new String[] { "variableName", "p2.buildship.import", "repository",
            "https://raw.githubusercontent.com/jjstreet/oomph-task-buildshipimport-update-site/master", "installableUnits",
            "com.jjstreet.oomph.task.buildshipimport.feature.group" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/ValidTriggers</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createValidTriggersAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/ValidTriggers";
    addAnnotation(buildshipImportTaskEClass, source, new String[] { "triggers", "STARTUP MANUAL" });
  }

} // BuildshipImportPackageImpl
