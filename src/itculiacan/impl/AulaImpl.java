/**
 */
package itculiacan.impl;

import itculiacan.Aula;
import itculiacan.Grupo;
import itculiacan.ItculiacanPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link itculiacan.impl.AulaImpl#getClave <em>Clave</em>}</li>
 *   <li>{@link itculiacan.impl.AulaImpl#getCapacidad <em>Capacidad</em>}</li>
 *   <li>{@link itculiacan.impl.AulaImpl#getGrupos <em>Grupos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AulaImpl extends CDOObjectImpl implements Aula {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItculiacanPackage.Literals.AULA;
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
		return (Integer)eGet(ItculiacanPackage.Literals.AULA__CLAVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClave(int newClave) {
		eSet(ItculiacanPackage.Literals.AULA__CLAVE, newClave);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacidad() {
		return (Integer)eGet(ItculiacanPackage.Literals.AULA__CAPACIDAD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacidad(int newCapacidad) {
		eSet(ItculiacanPackage.Literals.AULA__CAPACIDAD, newCapacidad);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Grupo> getGrupos() {
		return (EList<Grupo>)eGet(ItculiacanPackage.Literals.AULA__GRUPOS, true);
	}

} //AulaImpl
