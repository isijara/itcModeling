/**
 */
package itculiacan.impl;

import itculiacan.Alumno;
import itculiacan.Aula;
import itculiacan.Grupo;
import itculiacan.ItculiacanPackage;
import itculiacan.Materia;
import itculiacan.Profesor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grupo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link itculiacan.impl.GrupoImpl#getClave <em>Clave</em>}</li>
 *   <li>{@link itculiacan.impl.GrupoImpl#getAula <em>Aula</em>}</li>
 *   <li>{@link itculiacan.impl.GrupoImpl#getMateria <em>Materia</em>}</li>
 *   <li>{@link itculiacan.impl.GrupoImpl#getProfesor <em>Profesor</em>}</li>
 *   <li>{@link itculiacan.impl.GrupoImpl#getAlumnos <em>Alumnos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GrupoImpl extends CDOObjectImpl implements Grupo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrupoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItculiacanPackage.Literals.GRUPO;
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
		return (Integer)eGet(ItculiacanPackage.Literals.GRUPO__CLAVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClave(int newClave) {
		eSet(ItculiacanPackage.Literals.GRUPO__CLAVE, newClave);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aula getAula() {
		return (Aula)eGet(ItculiacanPackage.Literals.GRUPO__AULA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAula(Aula newAula) {
		eSet(ItculiacanPackage.Literals.GRUPO__AULA, newAula);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Materia getMateria() {
		return (Materia)eGet(ItculiacanPackage.Literals.GRUPO__MATERIA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMateria(Materia newMateria) {
		eSet(ItculiacanPackage.Literals.GRUPO__MATERIA, newMateria);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profesor getProfesor() {
		return (Profesor)eGet(ItculiacanPackage.Literals.GRUPO__PROFESOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfesor(Profesor newProfesor) {
		eSet(ItculiacanPackage.Literals.GRUPO__PROFESOR, newProfesor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Alumno> getAlumnos() {
		return (EList<Alumno>)eGet(ItculiacanPackage.Literals.GRUPO__ALUMNOS, true);
	}

} //GrupoImpl
