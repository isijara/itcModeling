/**
 */
package itculiacan.impl;

import itculiacan.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ItculiacanFactoryImpl extends EFactoryImpl implements ItculiacanFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ItculiacanFactory init() {
		try {
			ItculiacanFactory theItculiacanFactory = (ItculiacanFactory)EPackage.Registry.INSTANCE.getEFactory(ItculiacanPackage.eNS_URI);
			if (theItculiacanFactory != null) {
				return theItculiacanFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ItculiacanFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItculiacanFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ItculiacanPackage.ALUMNO: return (EObject)createAlumno();
			case ItculiacanPackage.GENERACION: return (EObject)createGeneracion();
			case ItculiacanPackage.GRUPO: return (EObject)createGrupo();
			case ItculiacanPackage.AULA: return (EObject)createAula();
			case ItculiacanPackage.MATERIA: return (EObject)createMateria();
			case ItculiacanPackage.PROFESOR: return (EObject)createProfesor();
			case ItculiacanPackage.PLAN_ESTUDIO: return (EObject)createPlanEstudio();
			case ItculiacanPackage.UNIVERSIDAD: return (EObject)createUniversidad();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ItculiacanPackage.NOMBRAMIENTO:
				return createNombramientoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ItculiacanPackage.NOMBRAMIENTO:
				return convertNombramientoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alumno createAlumno() {
		AlumnoImpl alumno = new AlumnoImpl();
		return alumno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generacion createGeneracion() {
		GeneracionImpl generacion = new GeneracionImpl();
		return generacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grupo createGrupo() {
		GrupoImpl grupo = new GrupoImpl();
		return grupo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aula createAula() {
		AulaImpl aula = new AulaImpl();
		return aula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Materia createMateria() {
		MateriaImpl materia = new MateriaImpl();
		return materia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profesor createProfesor() {
		ProfesorImpl profesor = new ProfesorImpl();
		return profesor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanEstudio createPlanEstudio() {
		PlanEstudioImpl planEstudio = new PlanEstudioImpl();
		return planEstudio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Universidad createUniversidad() {
		UniversidadImpl universidad = new UniversidadImpl();
		return universidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nombramiento createNombramientoFromString(EDataType eDataType, String initialValue) {
		Nombramiento result = Nombramiento.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNombramientoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItculiacanPackage getItculiacanPackage() {
		return (ItculiacanPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ItculiacanPackage getPackage() {
		return ItculiacanPackage.eINSTANCE;
	}

} //ItculiacanFactoryImpl
