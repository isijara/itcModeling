/**
 */
package itculiacan.impl;

import itculiacan.Grupo;
import itculiacan.ItculiacanPackage;
import itculiacan.Materia;
import itculiacan.PlanEstudio;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Materia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link itculiacan.impl.MateriaImpl#getClave <em>Clave</em>}</li>
 *   <li>{@link itculiacan.impl.MateriaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link itculiacan.impl.MateriaImpl#getGrupos <em>Grupos</em>}</li>
 *   <li>{@link itculiacan.impl.MateriaImpl#getPlanesEstudio <em>Planes Estudio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MateriaImpl extends CDOObjectImpl implements Materia {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MateriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItculiacanPackage.Literals.MATERIA;
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
		return (Integer)eGet(ItculiacanPackage.Literals.MATERIA__CLAVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClave(int newClave) {
		eSet(ItculiacanPackage.Literals.MATERIA__CLAVE, newClave);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return (String)eGet(ItculiacanPackage.Literals.MATERIA__NOMBRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		eSet(ItculiacanPackage.Literals.MATERIA__NOMBRE, newNombre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Grupo> getGrupos() {
		return (EList<Grupo>)eGet(ItculiacanPackage.Literals.MATERIA__GRUPOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PlanEstudio> getPlanesEstudio() {
		return (EList<PlanEstudio>)eGet(ItculiacanPackage.Literals.MATERIA__PLANES_ESTUDIO, true);
	}

} //MateriaImpl
