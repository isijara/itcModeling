/**
 */
package itculiacan.impl;

import itculiacan.Alumno;
import itculiacan.Generacion;
import itculiacan.Grupo;
import itculiacan.ItculiacanPackage;
import itculiacan.PlanEstudio;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alumno</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link itculiacan.impl.AlumnoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link itculiacan.impl.AlumnoImpl#getNumeroControl <em>Numero Control</em>}</li>
 *   <li>{@link itculiacan.impl.AlumnoImpl#getGeneracion <em>Generacion</em>}</li>
 *   <li>{@link itculiacan.impl.AlumnoImpl#getCursa <em>Cursa</em>}</li>
 *   <li>{@link itculiacan.impl.AlumnoImpl#getGrupos <em>Grupos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlumnoImpl extends CDOObjectImpl implements Alumno {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlumnoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItculiacanPackage.Literals.ALUMNO;
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
	public String getNombre() {
		return (String)eGet(ItculiacanPackage.Literals.ALUMNO__NOMBRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		eSet(ItculiacanPackage.Literals.ALUMNO__NOMBRE, newNombre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumeroControl() {
		return (Integer)eGet(ItculiacanPackage.Literals.ALUMNO__NUMERO_CONTROL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroControl(int newNumeroControl) {
		eSet(ItculiacanPackage.Literals.ALUMNO__NUMERO_CONTROL, newNumeroControl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generacion getGeneracion() {
		return (Generacion)eGet(ItculiacanPackage.Literals.ALUMNO__GENERACION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneracion(Generacion newGeneracion) {
		eSet(ItculiacanPackage.Literals.ALUMNO__GENERACION, newGeneracion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanEstudio getCursa() {
		return (PlanEstudio)eGet(ItculiacanPackage.Literals.ALUMNO__CURSA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursa(PlanEstudio newCursa) {
		eSet(ItculiacanPackage.Literals.ALUMNO__CURSA, newCursa);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Grupo> getGrupos() {
		return (EList<Grupo>)eGet(ItculiacanPackage.Literals.ALUMNO__GRUPOS, true);
	}

} //AlumnoImpl
