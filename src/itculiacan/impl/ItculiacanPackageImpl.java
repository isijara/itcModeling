/**
 */
package itculiacan.impl;

import itculiacan.Alumno;
import itculiacan.Aula;
import itculiacan.Generacion;
import itculiacan.Grupo;
import itculiacan.ItculiacanFactory;
import itculiacan.ItculiacanPackage;
import itculiacan.Materia;
import itculiacan.Nombramiento;
import itculiacan.PlanEstudio;
import itculiacan.Profesor;
import itculiacan.Universidad;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ItculiacanPackageImpl extends EPackageImpl implements ItculiacanPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alumnoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grupoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materiaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profesorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planEstudioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universidadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nombramientoEEnum = null;

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
	 * @see itculiacan.ItculiacanPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ItculiacanPackageImpl() {
		super(eNS_URI, ItculiacanFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ItculiacanPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ItculiacanPackage init() {
		if (isInited) return (ItculiacanPackage)EPackage.Registry.INSTANCE.getEPackage(ItculiacanPackage.eNS_URI);

		// Obtain or create and register package
		ItculiacanPackageImpl theItculiacanPackage = (ItculiacanPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ItculiacanPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ItculiacanPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theItculiacanPackage.createPackageContents();

		// Initialize created meta-data
		theItculiacanPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theItculiacanPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ItculiacanPackage.eNS_URI, theItculiacanPackage);
		return theItculiacanPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlumno() {
		return alumnoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlumno_Nombre() {
		return (EAttribute)alumnoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlumno_NumeroControl() {
		return (EAttribute)alumnoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlumno_Generacion() {
		return (EReference)alumnoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlumno_Cursa() {
		return (EReference)alumnoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlumno_Grupos() {
		return (EReference)alumnoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneracion() {
		return generacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneracion_FechaInicio() {
		return (EAttribute)generacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneracion_FechaFin() {
		return (EAttribute)generacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneracion_Alumnos() {
		return (EReference)generacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrupo() {
		return grupoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrupo_Clave() {
		return (EAttribute)grupoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrupo_Aula() {
		return (EReference)grupoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrupo_Materia() {
		return (EReference)grupoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrupo_Profesor() {
		return (EReference)grupoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrupo_Alumnos() {
		return (EReference)grupoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAula() {
		return aulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAula_Clave() {
		return (EAttribute)aulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAula_Capacidad() {
		return (EAttribute)aulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAula_Grupos() {
		return (EReference)aulaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMateria() {
		return materiaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMateria_Clave() {
		return (EAttribute)materiaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMateria_Nombre() {
		return (EAttribute)materiaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMateria_Grupos() {
		return (EReference)materiaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMateria_PlanesEstudio() {
		return (EReference)materiaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfesor() {
		return profesorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfesor_Clave() {
		return (EAttribute)profesorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfesor_Nombre() {
		return (EAttribute)profesorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfesor_NumeroMaterias() {
		return (EAttribute)profesorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfesor_Grupos() {
		return (EReference)profesorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfesor_Nombramiento() {
		return (EAttribute)profesorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanEstudio() {
		return planEstudioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanEstudio_Clave() {
		return (EAttribute)planEstudioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanEstudio_Nombre() {
		return (EAttribute)planEstudioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanEstudio_Alumnos() {
		return (EReference)planEstudioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanEstudio_Materias() {
		return (EReference)planEstudioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversidad() {
		return universidadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversidad_RefProfesor() {
		return (EReference)universidadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversidad_RefAulas() {
		return (EReference)universidadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversidad_RefPlanEstudio() {
		return (EReference)universidadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversidad_RefAlumno() {
		return (EReference)universidadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversidad_RefGeneracion() {
		return (EReference)universidadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversidad_RefMateria() {
		return (EReference)universidadEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversidad_RefGrupo() {
		return (EReference)universidadEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNombramiento() {
		return nombramientoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItculiacanFactory getItculiacanFactory() {
		return (ItculiacanFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		alumnoEClass = createEClass(ALUMNO);
		createEAttribute(alumnoEClass, ALUMNO__NOMBRE);
		createEAttribute(alumnoEClass, ALUMNO__NUMERO_CONTROL);
		createEReference(alumnoEClass, ALUMNO__GENERACION);
		createEReference(alumnoEClass, ALUMNO__CURSA);
		createEReference(alumnoEClass, ALUMNO__GRUPOS);

		generacionEClass = createEClass(GENERACION);
		createEAttribute(generacionEClass, GENERACION__FECHA_INICIO);
		createEAttribute(generacionEClass, GENERACION__FECHA_FIN);
		createEReference(generacionEClass, GENERACION__ALUMNOS);

		grupoEClass = createEClass(GRUPO);
		createEAttribute(grupoEClass, GRUPO__CLAVE);
		createEReference(grupoEClass, GRUPO__AULA);
		createEReference(grupoEClass, GRUPO__MATERIA);
		createEReference(grupoEClass, GRUPO__PROFESOR);
		createEReference(grupoEClass, GRUPO__ALUMNOS);

		aulaEClass = createEClass(AULA);
		createEAttribute(aulaEClass, AULA__CLAVE);
		createEAttribute(aulaEClass, AULA__CAPACIDAD);
		createEReference(aulaEClass, AULA__GRUPOS);

		materiaEClass = createEClass(MATERIA);
		createEAttribute(materiaEClass, MATERIA__CLAVE);
		createEAttribute(materiaEClass, MATERIA__NOMBRE);
		createEReference(materiaEClass, MATERIA__GRUPOS);
		createEReference(materiaEClass, MATERIA__PLANES_ESTUDIO);

		profesorEClass = createEClass(PROFESOR);
		createEAttribute(profesorEClass, PROFESOR__CLAVE);
		createEAttribute(profesorEClass, PROFESOR__NOMBRE);
		createEAttribute(profesorEClass, PROFESOR__NUMERO_MATERIAS);
		createEReference(profesorEClass, PROFESOR__GRUPOS);
		createEAttribute(profesorEClass, PROFESOR__NOMBRAMIENTO);

		planEstudioEClass = createEClass(PLAN_ESTUDIO);
		createEAttribute(planEstudioEClass, PLAN_ESTUDIO__CLAVE);
		createEAttribute(planEstudioEClass, PLAN_ESTUDIO__NOMBRE);
		createEReference(planEstudioEClass, PLAN_ESTUDIO__ALUMNOS);
		createEReference(planEstudioEClass, PLAN_ESTUDIO__MATERIAS);

		universidadEClass = createEClass(UNIVERSIDAD);
		createEReference(universidadEClass, UNIVERSIDAD__REF_PROFESOR);
		createEReference(universidadEClass, UNIVERSIDAD__REF_AULAS);
		createEReference(universidadEClass, UNIVERSIDAD__REF_PLAN_ESTUDIO);
		createEReference(universidadEClass, UNIVERSIDAD__REF_ALUMNO);
		createEReference(universidadEClass, UNIVERSIDAD__REF_GENERACION);
		createEReference(universidadEClass, UNIVERSIDAD__REF_MATERIA);
		createEReference(universidadEClass, UNIVERSIDAD__REF_GRUPO);

		// Create enums
		nombramientoEEnum = createEEnum(NOMBRAMIENTO);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(alumnoEClass, Alumno.class, "Alumno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlumno_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Alumno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlumno_NumeroControl(), ecorePackage.getEInt(), "numeroControl", null, 0, 1, Alumno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlumno_Generacion(), this.getGeneracion(), this.getGeneracion_Alumnos(), "generacion", null, 1, 1, Alumno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlumno_Cursa(), this.getPlanEstudio(), this.getPlanEstudio_Alumnos(), "cursa", null, 1, 1, Alumno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlumno_Grupos(), this.getGrupo(), this.getGrupo_Alumnos(), "grupos", null, 1, -1, Alumno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generacionEClass, Generacion.class, "Generacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneracion_FechaInicio(), ecorePackage.getEDate(), "fechaInicio", null, 0, 1, Generacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneracion_FechaFin(), ecorePackage.getEDate(), "fechaFin", null, 0, 1, Generacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneracion_Alumnos(), this.getAlumno(), this.getAlumno_Generacion(), "alumnos", null, 1, -1, Generacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grupoEClass, Grupo.class, "Grupo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrupo_Clave(), ecorePackage.getEInt(), "clave", null, 0, 1, Grupo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrupo_Aula(), this.getAula(), this.getAula_Grupos(), "aula", null, 1, 1, Grupo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrupo_Materia(), this.getMateria(), this.getMateria_Grupos(), "materia", null, 1, 1, Grupo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrupo_Profesor(), this.getProfesor(), this.getProfesor_Grupos(), "profesor", null, 1, 1, Grupo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrupo_Alumnos(), this.getAlumno(), this.getAlumno_Grupos(), "alumnos", null, 1, -1, Grupo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aulaEClass, Aula.class, "Aula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAula_Clave(), ecorePackage.getEInt(), "clave", null, 0, 1, Aula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAula_Capacidad(), ecorePackage.getEInt(), "capacidad", null, 0, 1, Aula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAula_Grupos(), this.getGrupo(), this.getGrupo_Aula(), "grupos", null, 1, -1, Aula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(materiaEClass, Materia.class, "Materia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMateria_Clave(), ecorePackage.getEInt(), "clave", null, 0, 1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMateria_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMateria_Grupos(), this.getGrupo(), this.getGrupo_Materia(), "grupos", null, 1, -1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMateria_PlanesEstudio(), this.getPlanEstudio(), this.getPlanEstudio_Materias(), "planesEstudio", null, 1, -1, Materia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(profesorEClass, Profesor.class, "Profesor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProfesor_Clave(), ecorePackage.getEInt(), "clave", null, 0, 1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfesor_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfesor_NumeroMaterias(), ecorePackage.getEInt(), "numeroMaterias", null, 0, 1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProfesor_Grupos(), this.getGrupo(), this.getGrupo_Profesor(), "grupos", null, 1, -1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfesor_Nombramiento(), this.getNombramiento(), "nombramiento", null, 0, 1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planEstudioEClass, PlanEstudio.class, "PlanEstudio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlanEstudio_Clave(), ecorePackage.getEInt(), "clave", null, 0, 1, PlanEstudio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanEstudio_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, PlanEstudio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanEstudio_Alumnos(), this.getAlumno(), this.getAlumno_Cursa(), "alumnos", null, 1, -1, PlanEstudio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanEstudio_Materias(), this.getMateria(), this.getMateria_PlanesEstudio(), "materias", null, 1, -1, PlanEstudio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(universidadEClass, Universidad.class, "Universidad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniversidad_RefProfesor(), this.getProfesor(), null, "refProfesor", null, 1, -1, Universidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversidad_RefAulas(), this.getAula(), null, "refAulas", null, 1, -1, Universidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversidad_RefPlanEstudio(), this.getPlanEstudio(), null, "refPlanEstudio", null, 1, -1, Universidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversidad_RefAlumno(), this.getAlumno(), null, "refAlumno", null, 1, -1, Universidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversidad_RefGeneracion(), this.getGeneracion(), null, "refGeneracion", null, 1, -1, Universidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversidad_RefMateria(), this.getMateria(), null, "refMateria", null, 1, -1, Universidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversidad_RefGrupo(), this.getGrupo(), null, "refGrupo", null, 1, -1, Universidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nombramientoEEnum, Nombramiento.class, "Nombramiento");
		addEEnumLiteral(nombramientoEEnum, Nombramiento.MEDIO_TIEMPO);
		addEEnumLiteral(nombramientoEEnum, Nombramiento.TIEMPO_COMPLETO);

		// Create resource
		createResource(eNS_URI);
	}

} //ItculiacanPackageImpl
