/**
 */
package itculiacan.impl;

import itculiacan.Grupo;
import itculiacan.ItculiacanPackage;
import itculiacan.Nombramiento;
import itculiacan.Profesor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profesor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link itculiacan.impl.ProfesorImpl#getClave <em>Clave</em>}</li>
 *   <li>{@link itculiacan.impl.ProfesorImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link itculiacan.impl.ProfesorImpl#getNumeroMaterias <em>Numero Materias</em>}</li>
 *   <li>{@link itculiacan.impl.ProfesorImpl#getGrupos <em>Grupos</em>}</li>
 *   <li>{@link itculiacan.impl.ProfesorImpl#getNombramiento <em>Nombramiento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfesorImpl extends CDOObjectImpl implements Profesor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfesorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItculiacanPackage.Literals.PROFESOR;
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
		return (Integer)eGet(ItculiacanPackage.Literals.PROFESOR__CLAVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClave(int newClave) {
		eSet(ItculiacanPackage.Literals.PROFESOR__CLAVE, newClave);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return (String)eGet(ItculiacanPackage.Literals.PROFESOR__NOMBRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		eSet(ItculiacanPackage.Literals.PROFESOR__NOMBRE, newNombre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumeroMaterias() {
		return (Integer)eGet(ItculiacanPackage.Literals.PROFESOR__NUMERO_MATERIAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroMaterias(int newNumeroMaterias) {
		eSet(ItculiacanPackage.Literals.PROFESOR__NUMERO_MATERIAS, newNumeroMaterias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Grupo> getGrupos() {
		return (EList<Grupo>)eGet(ItculiacanPackage.Literals.PROFESOR__GRUPOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nombramiento getNombramiento() {
		return (Nombramiento)eGet(ItculiacanPackage.Literals.PROFESOR__NOMBRAMIENTO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombramiento(Nombramiento newNombramiento) {
		eSet(ItculiacanPackage.Literals.PROFESOR__NOMBRAMIENTO, newNombramiento);
	}

} //ProfesorImpl
