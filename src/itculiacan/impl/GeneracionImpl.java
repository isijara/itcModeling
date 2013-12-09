/**
 */
package itculiacan.impl;

import itculiacan.Alumno;
import itculiacan.Generacion;
import itculiacan.ItculiacanPackage;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link itculiacan.impl.GeneracionImpl#getFechaInicio <em>Fecha Inicio</em>}</li>
 *   <li>{@link itculiacan.impl.GeneracionImpl#getFechaFin <em>Fecha Fin</em>}</li>
 *   <li>{@link itculiacan.impl.GeneracionImpl#getAlumnos <em>Alumnos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneracionImpl extends CDOObjectImpl implements Generacion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneracionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItculiacanPackage.Literals.GENERACION;
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
	public Date getFechaInicio() {
		return (Date)eGet(ItculiacanPackage.Literals.GENERACION__FECHA_INICIO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaInicio(Date newFechaInicio) {
		eSet(ItculiacanPackage.Literals.GENERACION__FECHA_INICIO, newFechaInicio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFechaFin() {
		return (Date)eGet(ItculiacanPackage.Literals.GENERACION__FECHA_FIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaFin(Date newFechaFin) {
		eSet(ItculiacanPackage.Literals.GENERACION__FECHA_FIN, newFechaFin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Alumno> getAlumnos() {
		return (EList<Alumno>)eGet(ItculiacanPackage.Literals.GENERACION__ALUMNOS, true);
	}

} //GeneracionImpl
