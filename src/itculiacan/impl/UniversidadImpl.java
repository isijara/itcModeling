/**
 */
package itculiacan.impl;

import itculiacan.Alumno;
import itculiacan.Aula;
import itculiacan.Generacion;
import itculiacan.Grupo;
import itculiacan.ItculiacanPackage;
import itculiacan.Materia;
import itculiacan.PlanEstudio;
import itculiacan.Profesor;
import itculiacan.Universidad;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Universidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link itculiacan.impl.UniversidadImpl#getRefProfesor <em>Ref Profesor</em>}</li>
 *   <li>{@link itculiacan.impl.UniversidadImpl#getRefAulas <em>Ref Aulas</em>}</li>
 *   <li>{@link itculiacan.impl.UniversidadImpl#getRefPlanEstudio <em>Ref Plan Estudio</em>}</li>
 *   <li>{@link itculiacan.impl.UniversidadImpl#getRefAlumno <em>Ref Alumno</em>}</li>
 *   <li>{@link itculiacan.impl.UniversidadImpl#getRefGeneracion <em>Ref Generacion</em>}</li>
 *   <li>{@link itculiacan.impl.UniversidadImpl#getRefMateria <em>Ref Materia</em>}</li>
 *   <li>{@link itculiacan.impl.UniversidadImpl#getRefGrupo <em>Ref Grupo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UniversidadImpl extends CDOObjectImpl implements Universidad {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversidadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItculiacanPackage.Literals.UNIVERSIDAD;
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
	@SuppressWarnings("unchecked")
	public EList<Profesor> getRefProfesor() {
		return (EList<Profesor>)eGet(ItculiacanPackage.Literals.UNIVERSIDAD__REF_PROFESOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Aula> getRefAulas() {
		return (EList<Aula>)eGet(ItculiacanPackage.Literals.UNIVERSIDAD__REF_AULAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PlanEstudio> getRefPlanEstudio() {
		return (EList<PlanEstudio>)eGet(ItculiacanPackage.Literals.UNIVERSIDAD__REF_PLAN_ESTUDIO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Alumno> getRefAlumno() {
		return (EList<Alumno>)eGet(ItculiacanPackage.Literals.UNIVERSIDAD__REF_ALUMNO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Generacion> getRefGeneracion() {
		return (EList<Generacion>)eGet(ItculiacanPackage.Literals.UNIVERSIDAD__REF_GENERACION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Materia> getRefMateria() {
		return (EList<Materia>)eGet(ItculiacanPackage.Literals.UNIVERSIDAD__REF_MATERIA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Grupo> getRefGrupo() {
		return (EList<Grupo>)eGet(ItculiacanPackage.Literals.UNIVERSIDAD__REF_GRUPO, true);
	}

} //UniversidadImpl
