/**
 */
package itculiacan.impl;

import itculiacan.Alumno;
import itculiacan.ItculiacanPackage;
import itculiacan.Materia;
import itculiacan.PlanEstudio;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Estudio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link itculiacan.impl.PlanEstudioImpl#getClave <em>Clave</em>}</li>
 *   <li>{@link itculiacan.impl.PlanEstudioImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link itculiacan.impl.PlanEstudioImpl#getAlumnos <em>Alumnos</em>}</li>
 *   <li>{@link itculiacan.impl.PlanEstudioImpl#getMaterias <em>Materias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanEstudioImpl extends CDOObjectImpl implements PlanEstudio {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanEstudioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItculiacanPackage.Literals.PLAN_ESTUDIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClave() {
		return (Integer)eGet(ItculiacanPackage.Literals.PLAN_ESTUDIO__CLAVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClave(int newClave) {
		eSet(ItculiacanPackage.Literals.PLAN_ESTUDIO__CLAVE, newClave);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return (String)eGet(ItculiacanPackage.Literals.PLAN_ESTUDIO__NOMBRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		eSet(ItculiacanPackage.Literals.PLAN_ESTUDIO__NOMBRE, newNombre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Alumno> getAlumnos() {
		return (EList<Alumno>)eGet(ItculiacanPackage.Literals.PLAN_ESTUDIO__ALUMNOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Materia> getMaterias() {
		return (EList<Materia>)eGet(ItculiacanPackage.Literals.PLAN_ESTUDIO__MATERIAS, true);
	}

} //PlanEstudioImpl
