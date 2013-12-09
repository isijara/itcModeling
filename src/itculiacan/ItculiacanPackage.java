/**
 */
package itculiacan;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see itculiacan.ItculiacanFactory
 * @model kind="package"
 * @generated
 */
public interface ItculiacanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "itculiacan";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://itculiacan/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "itculiacan";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ItculiacanPackage eINSTANCE = itculiacan.impl.ItculiacanPackageImpl.init();

	/**
	 * The meta object id for the '{@link itculiacan.impl.AlumnoImpl <em>Alumno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see itculiacan.impl.AlumnoImpl
	 * @see itculiacan.impl.ItculiacanPackageImpl#getAlumno()
	 * @generated
	 */
	int ALUMNO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUMNO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Numero Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUMNO__NUMERO_CONTROL = 1;

	/**
	 * The feature id for the '<em><b>Generacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUMNO__GENERACION = 2;

	/**
	 * The feature id for the '<em><b>Cursa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUMNO__CURSA = 3;

	/**
	 * The feature id for the '<em><b>Grupos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUMNO__GRUPOS = 4;

	/**
	 * The number of structural features of the '<em>Alumno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUMNO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Alumno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUMNO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link itculiacan.impl.GeneracionImpl <em>Generacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see itculiacan.impl.GeneracionImpl
	 * @see itculiacan.impl.ItculiacanPackageImpl#getGeneracion()
	 * @generated
	 */
	int GENERACION = 1;

	/**
	 * The feature id for the '<em><b>Fecha Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERACION__FECHA_INICIO = 0;

	/**
	 * The feature id for the '<em><b>Fecha Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERACION__FECHA_FIN = 1;

	/**
	 * The feature id for the '<em><b>Alumnos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERACION__ALUMNOS = 2;

	/**
	 * The number of structural features of the '<em>Generacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERACION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Generacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link itculiacan.impl.GrupoImpl <em>Grupo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see itculiacan.impl.GrupoImpl
	 * @see itculiacan.impl.ItculiacanPackageImpl#getGrupo()
	 * @generated
	 */
	int GRUPO = 2;

	/**
	 * The feature id for the '<em><b>Clave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO__CLAVE = 0;

	/**
	 * The feature id for the '<em><b>Aula</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO__AULA = 1;

	/**
	 * The feature id for the '<em><b>Materia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO__MATERIA = 2;

	/**
	 * The feature id for the '<em><b>Profesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO__PROFESOR = 3;

	/**
	 * The feature id for the '<em><b>Alumnos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO__ALUMNOS = 4;

	/**
	 * The number of structural features of the '<em>Grupo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Grupo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link itculiacan.impl.AulaImpl <em>Aula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see itculiacan.impl.AulaImpl
	 * @see itculiacan.impl.ItculiacanPackageImpl#getAula()
	 * @generated
	 */
	int AULA = 3;

	/**
	 * The feature id for the '<em><b>Clave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AULA__CLAVE = 0;

	/**
	 * The feature id for the '<em><b>Capacidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AULA__CAPACIDAD = 1;

	/**
	 * The feature id for the '<em><b>Grupos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AULA__GRUPOS = 2;

	/**
	 * The number of structural features of the '<em>Aula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AULA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Aula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AULA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link itculiacan.impl.MateriaImpl <em>Materia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see itculiacan.impl.MateriaImpl
	 * @see itculiacan.impl.ItculiacanPackageImpl#getMateria()
	 * @generated
	 */
	int MATERIA = 4;

	/**
	 * The feature id for the '<em><b>Clave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIA__CLAVE = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIA__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Grupos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIA__GRUPOS = 2;

	/**
	 * The feature id for the '<em><b>Planes Estudio</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIA__PLANES_ESTUDIO = 3;

	/**
	 * The number of structural features of the '<em>Materia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Materia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link itculiacan.impl.ProfesorImpl <em>Profesor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see itculiacan.impl.ProfesorImpl
	 * @see itculiacan.impl.ItculiacanPackageImpl#getProfesor()
	 * @generated
	 */
	int PROFESOR = 5;

	/**
	 * The feature id for the '<em><b>Clave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESOR__CLAVE = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESOR__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Numero Materias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESOR__NUMERO_MATERIAS = 2;

	/**
	 * The feature id for the '<em><b>Grupos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESOR__GRUPOS = 3;

	/**
	 * The feature id for the '<em><b>Nombramiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESOR__NOMBRAMIENTO = 4;

	/**
	 * The number of structural features of the '<em>Profesor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Profesor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link itculiacan.impl.PlanEstudioImpl <em>Plan Estudio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see itculiacan.impl.PlanEstudioImpl
	 * @see itculiacan.impl.ItculiacanPackageImpl#getPlanEstudio()
	 * @generated
	 */
	int PLAN_ESTUDIO = 6;

	/**
	 * The feature id for the '<em><b>Clave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ESTUDIO__CLAVE = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ESTUDIO__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Alumnos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ESTUDIO__ALUMNOS = 2;

	/**
	 * The feature id for the '<em><b>Materias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ESTUDIO__MATERIAS = 3;

	/**
	 * The number of structural features of the '<em>Plan Estudio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ESTUDIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Plan Estudio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ESTUDIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link itculiacan.impl.UniversidadImpl <em>Universidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see itculiacan.impl.UniversidadImpl
	 * @see itculiacan.impl.ItculiacanPackageImpl#getUniversidad()
	 * @generated
	 */
	int UNIVERSIDAD = 7;

	/**
	 * The feature id for the '<em><b>Ref Profesor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSIDAD__REF_PROFESOR = 0;

	/**
	 * The feature id for the '<em><b>Ref Aulas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSIDAD__REF_AULAS = 1;

	/**
	 * The feature id for the '<em><b>Ref Plan Estudio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSIDAD__REF_PLAN_ESTUDIO = 2;

	/**
	 * The feature id for the '<em><b>Ref Alumno</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSIDAD__REF_ALUMNO = 3;

	/**
	 * The feature id for the '<em><b>Ref Generacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSIDAD__REF_GENERACION = 4;

	/**
	 * The feature id for the '<em><b>Ref Materia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSIDAD__REF_MATERIA = 5;

	/**
	 * The feature id for the '<em><b>Ref Grupo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSIDAD__REF_GRUPO = 6;

	/**
	 * The number of structural features of the '<em>Universidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSIDAD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Universidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSIDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link itculiacan.Nombramiento <em>Nombramiento</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see itculiacan.Nombramiento
	 * @see itculiacan.impl.ItculiacanPackageImpl#getNombramiento()
	 * @generated
	 */
	int NOMBRAMIENTO = 8;


	/**
	 * Returns the meta object for class '{@link itculiacan.Alumno <em>Alumno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alumno</em>'.
	 * @see itculiacan.Alumno
	 * @generated
	 */
	EClass getAlumno();

	/**
	 * Returns the meta object for the attribute '{@link itculiacan.Alumno#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see itculiacan.Alumno#getNombre()
	 * @see #getAlumno()
	 * @generated
	 */
	EAttribute getAlumno_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link itculiacan.Alumno#getNumeroControl <em>Numero Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Control</em>'.
	 * @see itculiacan.Alumno#getNumeroControl()
	 * @see #getAlumno()
	 * @generated
	 */
	EAttribute getAlumno_NumeroControl();

	/**
	 * Returns the meta object for the reference '{@link itculiacan.Alumno#getGeneracion <em>Generacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generacion</em>'.
	 * @see itculiacan.Alumno#getGeneracion()
	 * @see #getAlumno()
	 * @generated
	 */
	EReference getAlumno_Generacion();

	/**
	 * Returns the meta object for the reference '{@link itculiacan.Alumno#getCursa <em>Cursa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cursa</em>'.
	 * @see itculiacan.Alumno#getCursa()
	 * @see #getAlumno()
	 * @generated
	 */
	EReference getAlumno_Cursa();

	/**
	 * Returns the meta object for the reference list '{@link itculiacan.Alumno#getGrupos <em>Grupos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grupos</em>'.
	 * @see itculiacan.Alumno#getGrupos()
	 * @see #getAlumno()
	 * @generated
	 */
	EReference getAlumno_Grupos();

	/**
	 * Returns the meta object for class '{@link itculiacan.Generacion <em>Generacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generacion</em>'.
	 * @see itculiacan.Generacion
	 * @generated
	 */
	EClass getGeneracion();

	/**
	 * Returns the meta object for the attribute '{@link itculiacan.Generacion#getFechaInicio <em>Fecha Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Inicio</em>'.
	 * @see itculiacan.Generacion#getFechaInicio()
	 * @see #getGeneracion()
	 * @generated
	 */
	EAttribute getGeneracion_FechaInicio();

	/**
	 * Returns the meta object for the attribute '{@link itculiacan.Generacion#getFechaFin <em>Fecha Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Fin</em>'.
	 * @see itculiacan.Generacion#getFechaFin()
	 * @see #getGeneracion()
	 * @generated
	 */
	EAttribute getGeneracion_FechaFin();

	/**
	 * Returns the meta object for the reference list '{@link itculiacan.Generacion#getAlumnos <em>Alumnos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alumnos</em>'.
	 * @see itculiacan.Generacion#getAlumnos()
	 * @see #getGeneracion()
	 * @generated
	 */
	EReference getGeneracion_Alumnos();

	/**
	 * Returns the meta object for class '{@link itculiacan.Grupo <em>Grupo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grupo</em>'.
	 * @see itculiacan.Grupo
	 * @generated
	 */
	EClass getGrupo();

	/**
	 * Returns the meta object for the attribute '{@link itculiacan.Grupo#getClave <em>Clave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clave</em>'.
	 * @see itculiacan.Grupo#getClave()
	 * @see #getGrupo()
	 * @generated
	 */
	EAttribute getGrupo_Clave();

	/**
	 * Returns the meta object for the reference '{@link itculiacan.Grupo#getAula <em>Aula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aula</em>'.
	 * @see itculiacan.Grupo#getAula()
	 * @see #getGrupo()
	 * @generated
	 */
	EReference getGrupo_Aula();

	/**
	 * Returns the meta object for the reference '{@link itculiacan.Grupo#getMateria <em>Materia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Materia</em>'.
	 * @see itculiacan.Grupo#getMateria()
	 * @see #getGrupo()
	 * @generated
	 */
	EReference getGrupo_Materia();

	/**
	 * Returns the meta object for the reference '{@link itculiacan.Grupo#getProfesor <em>Profesor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Profesor</em>'.
	 * @see itculiacan.Grupo#getProfesor()
	 * @see #getGrupo()
	 * @generated
	 */
	EReference getGrupo_Profesor();

	/**
	 * Returns the meta object for the reference list '{@link itculiacan.Grupo#getAlumnos <em>Alumnos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alumnos</em>'.
	 * @see itculiacan.Grupo#getAlumnos()
	 * @see #getGrupo()
	 * @generated
	 */
	EReference getGrupo_Alumnos();

	/**
	 * Returns the meta object for class '{@link itculiacan.Aula <em>Aula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aula</em>'.
	 * @see itculiacan.Aula
	 * @generated
	 */
	EClass getAula();

	/**
	 * Returns the meta object for the attribute '{@link itculiacan.Aula#getClave <em>Clave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clave</em>'.
	 * @see itculiacan.Aula#getClave()
	 * @see #getAula()
	 * @generated
	 */
	EAttribute getAula_Clave();

	/**
	 * Returns the meta object for the attribute '{@link itculiacan.Aula#getCapacidad <em>Capacidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacidad</em>'.
	 * @see itculiacan.Aula#getCapacidad()
	 * @see #getAula()
	 * @generated
	 */
	EAttribute getAula_Capacidad();

	/**
	 * Returns the meta object for the reference list '{@link itculiacan.Aula#getGrupos <em>Grupos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grupos</em>'.
	 * @see itculiacan.Aula#getGrupos()
	 * @see #getAula()
	 * @generated
	 */
	EReference getAula_Grupos();

	/**
	 * Returns the meta object for class '{@link itculiacan.Materia <em>Materia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Materia</em>'.
	 * @see itculiacan.Materia
	 * @generated
	 */
	EClass getMateria();

	/**
	 * Returns the meta object for the attribute '{@link itculiacan.Materia#getClave <em>Clave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clave</em>'.
	 * @see itculiacan.Materia#getClave()
	 * @see #getMateria()
	 * @generated
	 */
	EAttribute getMateria_Clave();

	/**
	 * Returns the meta object for the attribute '{@link itculiacan.Materia#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see itculiacan.Materia#getNombre()
	 * @see #getMateria()
	 * @generated
	 */
	EAttribute getMateria_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link itculiacan.Materia#getGrupos <em>Grupos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grupos</em>'.
	 * @see itculiacan.Materia#getGrupos()
	 * @see #getMateria()
	 * @generated
	 */
	EReference getMateria_Grupos();

	/**
	 * Returns the meta object for the reference list '{@link itculiacan.Materia#getPlanesEstudio <em>Planes Estudio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Planes Estudio</em>'.
	 * @see itculiacan.Materia#getPlanesEstudio()
	 * @see #getMateria()
	 * @generated
	 */
	EReference getMateria_PlanesEstudio();

	/**
	 * Returns the meta object for class '{@link itculiacan.Profesor <em>Profesor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profesor</em>'.
	 * @see itculiacan.Profesor
	 * @generated
	 */
	EClass getProfesor();

	/**
	 * Returns the meta object for the attribute '{@link itculiacan.Profesor#getClave <em>Clave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clave</em>'.
	 * @see itculiacan.Profesor#getClave()
	 * @see #getProfesor()
	 * @generated
	 */
	EAttribute getProfesor_Clave();

	/**
	 * Returns the meta object for the attribute '{@link itculiacan.Profesor#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see itculiacan.Profesor#getNombre()
	 * @see #getProfesor()
	 * @generated
	 */
	EAttribute getProfesor_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link itculiacan.Profesor#getNumeroMaterias <em>Numero Materias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Materias</em>'.
	 * @see itculiacan.Profesor#getNumeroMaterias()
	 * @see #getProfesor()
	 * @generated
	 */
	EAttribute getProfesor_NumeroMaterias();

	/**
	 * Returns the meta object for the reference list '{@link itculiacan.Profesor#getGrupos <em>Grupos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grupos</em>'.
	 * @see itculiacan.Profesor#getGrupos()
	 * @see #getProfesor()
	 * @generated
	 */
	EReference getProfesor_Grupos();

	/**
	 * Returns the meta object for the attribute '{@link itculiacan.Profesor#getNombramiento <em>Nombramiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombramiento</em>'.
	 * @see itculiacan.Profesor#getNombramiento()
	 * @see #getProfesor()
	 * @generated
	 */
	EAttribute getProfesor_Nombramiento();

	/**
	 * Returns the meta object for class '{@link itculiacan.PlanEstudio <em>Plan Estudio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Estudio</em>'.
	 * @see itculiacan.PlanEstudio
	 * @generated
	 */
	EClass getPlanEstudio();

	/**
	 * Returns the meta object for the attribute '{@link itculiacan.PlanEstudio#getClave <em>Clave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clave</em>'.
	 * @see itculiacan.PlanEstudio#getClave()
	 * @see #getPlanEstudio()
	 * @generated
	 */
	EAttribute getPlanEstudio_Clave();

	/**
	 * Returns the meta object for the attribute '{@link itculiacan.PlanEstudio#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see itculiacan.PlanEstudio#getNombre()
	 * @see #getPlanEstudio()
	 * @generated
	 */
	EAttribute getPlanEstudio_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link itculiacan.PlanEstudio#getAlumnos <em>Alumnos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alumnos</em>'.
	 * @see itculiacan.PlanEstudio#getAlumnos()
	 * @see #getPlanEstudio()
	 * @generated
	 */
	EReference getPlanEstudio_Alumnos();

	/**
	 * Returns the meta object for the reference list '{@link itculiacan.PlanEstudio#getMaterias <em>Materias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Materias</em>'.
	 * @see itculiacan.PlanEstudio#getMaterias()
	 * @see #getPlanEstudio()
	 * @generated
	 */
	EReference getPlanEstudio_Materias();

	/**
	 * Returns the meta object for class '{@link itculiacan.Universidad <em>Universidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universidad</em>'.
	 * @see itculiacan.Universidad
	 * @generated
	 */
	EClass getUniversidad();

	/**
	 * Returns the meta object for the containment reference list '{@link itculiacan.Universidad#getRefProfesor <em>Ref Profesor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Profesor</em>'.
	 * @see itculiacan.Universidad#getRefProfesor()
	 * @see #getUniversidad()
	 * @generated
	 */
	EReference getUniversidad_RefProfesor();

	/**
	 * Returns the meta object for the containment reference list '{@link itculiacan.Universidad#getRefAulas <em>Ref Aulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Aulas</em>'.
	 * @see itculiacan.Universidad#getRefAulas()
	 * @see #getUniversidad()
	 * @generated
	 */
	EReference getUniversidad_RefAulas();

	/**
	 * Returns the meta object for the containment reference list '{@link itculiacan.Universidad#getRefPlanEstudio <em>Ref Plan Estudio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Plan Estudio</em>'.
	 * @see itculiacan.Universidad#getRefPlanEstudio()
	 * @see #getUniversidad()
	 * @generated
	 */
	EReference getUniversidad_RefPlanEstudio();

	/**
	 * Returns the meta object for the containment reference list '{@link itculiacan.Universidad#getRefAlumno <em>Ref Alumno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Alumno</em>'.
	 * @see itculiacan.Universidad#getRefAlumno()
	 * @see #getUniversidad()
	 * @generated
	 */
	EReference getUniversidad_RefAlumno();

	/**
	 * Returns the meta object for the containment reference list '{@link itculiacan.Universidad#getRefGeneracion <em>Ref Generacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Generacion</em>'.
	 * @see itculiacan.Universidad#getRefGeneracion()
	 * @see #getUniversidad()
	 * @generated
	 */
	EReference getUniversidad_RefGeneracion();

	/**
	 * Returns the meta object for the containment reference list '{@link itculiacan.Universidad#getRefMateria <em>Ref Materia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Materia</em>'.
	 * @see itculiacan.Universidad#getRefMateria()
	 * @see #getUniversidad()
	 * @generated
	 */
	EReference getUniversidad_RefMateria();

	/**
	 * Returns the meta object for the containment reference list '{@link itculiacan.Universidad#getRefGrupo <em>Ref Grupo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Grupo</em>'.
	 * @see itculiacan.Universidad#getRefGrupo()
	 * @see #getUniversidad()
	 * @generated
	 */
	EReference getUniversidad_RefGrupo();

	/**
	 * Returns the meta object for enum '{@link itculiacan.Nombramiento <em>Nombramiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nombramiento</em>'.
	 * @see itculiacan.Nombramiento
	 * @generated
	 */
	EEnum getNombramiento();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ItculiacanFactory getItculiacanFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link itculiacan.impl.AlumnoImpl <em>Alumno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see itculiacan.impl.AlumnoImpl
		 * @see itculiacan.impl.ItculiacanPackageImpl#getAlumno()
		 * @generated
		 */
		EClass ALUMNO = eINSTANCE.getAlumno();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUMNO__NOMBRE = eINSTANCE.getAlumno_Nombre();

		/**
		 * The meta object literal for the '<em><b>Numero Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUMNO__NUMERO_CONTROL = eINSTANCE.getAlumno_NumeroControl();

		/**
		 * The meta object literal for the '<em><b>Generacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALUMNO__GENERACION = eINSTANCE.getAlumno_Generacion();

		/**
		 * The meta object literal for the '<em><b>Cursa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALUMNO__CURSA = eINSTANCE.getAlumno_Cursa();

		/**
		 * The meta object literal for the '<em><b>Grupos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALUMNO__GRUPOS = eINSTANCE.getAlumno_Grupos();

		/**
		 * The meta object literal for the '{@link itculiacan.impl.GeneracionImpl <em>Generacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see itculiacan.impl.GeneracionImpl
		 * @see itculiacan.impl.ItculiacanPackageImpl#getGeneracion()
		 * @generated
		 */
		EClass GENERACION = eINSTANCE.getGeneracion();

		/**
		 * The meta object literal for the '<em><b>Fecha Inicio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERACION__FECHA_INICIO = eINSTANCE.getGeneracion_FechaInicio();

		/**
		 * The meta object literal for the '<em><b>Fecha Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERACION__FECHA_FIN = eINSTANCE.getGeneracion_FechaFin();

		/**
		 * The meta object literal for the '<em><b>Alumnos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERACION__ALUMNOS = eINSTANCE.getGeneracion_Alumnos();

		/**
		 * The meta object literal for the '{@link itculiacan.impl.GrupoImpl <em>Grupo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see itculiacan.impl.GrupoImpl
		 * @see itculiacan.impl.ItculiacanPackageImpl#getGrupo()
		 * @generated
		 */
		EClass GRUPO = eINSTANCE.getGrupo();

		/**
		 * The meta object literal for the '<em><b>Clave</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRUPO__CLAVE = eINSTANCE.getGrupo_Clave();

		/**
		 * The meta object literal for the '<em><b>Aula</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRUPO__AULA = eINSTANCE.getGrupo_Aula();

		/**
		 * The meta object literal for the '<em><b>Materia</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRUPO__MATERIA = eINSTANCE.getGrupo_Materia();

		/**
		 * The meta object literal for the '<em><b>Profesor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRUPO__PROFESOR = eINSTANCE.getGrupo_Profesor();

		/**
		 * The meta object literal for the '<em><b>Alumnos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRUPO__ALUMNOS = eINSTANCE.getGrupo_Alumnos();

		/**
		 * The meta object literal for the '{@link itculiacan.impl.AulaImpl <em>Aula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see itculiacan.impl.AulaImpl
		 * @see itculiacan.impl.ItculiacanPackageImpl#getAula()
		 * @generated
		 */
		EClass AULA = eINSTANCE.getAula();

		/**
		 * The meta object literal for the '<em><b>Clave</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AULA__CLAVE = eINSTANCE.getAula_Clave();

		/**
		 * The meta object literal for the '<em><b>Capacidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AULA__CAPACIDAD = eINSTANCE.getAula_Capacidad();

		/**
		 * The meta object literal for the '<em><b>Grupos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AULA__GRUPOS = eINSTANCE.getAula_Grupos();

		/**
		 * The meta object literal for the '{@link itculiacan.impl.MateriaImpl <em>Materia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see itculiacan.impl.MateriaImpl
		 * @see itculiacan.impl.ItculiacanPackageImpl#getMateria()
		 * @generated
		 */
		EClass MATERIA = eINSTANCE.getMateria();

		/**
		 * The meta object literal for the '<em><b>Clave</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIA__CLAVE = eINSTANCE.getMateria_Clave();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIA__NOMBRE = eINSTANCE.getMateria_Nombre();

		/**
		 * The meta object literal for the '<em><b>Grupos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIA__GRUPOS = eINSTANCE.getMateria_Grupos();

		/**
		 * The meta object literal for the '<em><b>Planes Estudio</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIA__PLANES_ESTUDIO = eINSTANCE.getMateria_PlanesEstudio();

		/**
		 * The meta object literal for the '{@link itculiacan.impl.ProfesorImpl <em>Profesor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see itculiacan.impl.ProfesorImpl
		 * @see itculiacan.impl.ItculiacanPackageImpl#getProfesor()
		 * @generated
		 */
		EClass PROFESOR = eINSTANCE.getProfesor();

		/**
		 * The meta object literal for the '<em><b>Clave</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESOR__CLAVE = eINSTANCE.getProfesor_Clave();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESOR__NOMBRE = eINSTANCE.getProfesor_Nombre();

		/**
		 * The meta object literal for the '<em><b>Numero Materias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESOR__NUMERO_MATERIAS = eINSTANCE.getProfesor_NumeroMaterias();

		/**
		 * The meta object literal for the '<em><b>Grupos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESOR__GRUPOS = eINSTANCE.getProfesor_Grupos();

		/**
		 * The meta object literal for the '<em><b>Nombramiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESOR__NOMBRAMIENTO = eINSTANCE.getProfesor_Nombramiento();

		/**
		 * The meta object literal for the '{@link itculiacan.impl.PlanEstudioImpl <em>Plan Estudio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see itculiacan.impl.PlanEstudioImpl
		 * @see itculiacan.impl.ItculiacanPackageImpl#getPlanEstudio()
		 * @generated
		 */
		EClass PLAN_ESTUDIO = eINSTANCE.getPlanEstudio();

		/**
		 * The meta object literal for the '<em><b>Clave</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_ESTUDIO__CLAVE = eINSTANCE.getPlanEstudio_Clave();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_ESTUDIO__NOMBRE = eINSTANCE.getPlanEstudio_Nombre();

		/**
		 * The meta object literal for the '<em><b>Alumnos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_ESTUDIO__ALUMNOS = eINSTANCE.getPlanEstudio_Alumnos();

		/**
		 * The meta object literal for the '<em><b>Materias</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_ESTUDIO__MATERIAS = eINSTANCE.getPlanEstudio_Materias();

		/**
		 * The meta object literal for the '{@link itculiacan.impl.UniversidadImpl <em>Universidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see itculiacan.impl.UniversidadImpl
		 * @see itculiacan.impl.ItculiacanPackageImpl#getUniversidad()
		 * @generated
		 */
		EClass UNIVERSIDAD = eINSTANCE.getUniversidad();

		/**
		 * The meta object literal for the '<em><b>Ref Profesor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSIDAD__REF_PROFESOR = eINSTANCE.getUniversidad_RefProfesor();

		/**
		 * The meta object literal for the '<em><b>Ref Aulas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSIDAD__REF_AULAS = eINSTANCE.getUniversidad_RefAulas();

		/**
		 * The meta object literal for the '<em><b>Ref Plan Estudio</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSIDAD__REF_PLAN_ESTUDIO = eINSTANCE.getUniversidad_RefPlanEstudio();

		/**
		 * The meta object literal for the '<em><b>Ref Alumno</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSIDAD__REF_ALUMNO = eINSTANCE.getUniversidad_RefAlumno();

		/**
		 * The meta object literal for the '<em><b>Ref Generacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSIDAD__REF_GENERACION = eINSTANCE.getUniversidad_RefGeneracion();

		/**
		 * The meta object literal for the '<em><b>Ref Materia</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSIDAD__REF_MATERIA = eINSTANCE.getUniversidad_RefMateria();

		/**
		 * The meta object literal for the '<em><b>Ref Grupo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSIDAD__REF_GRUPO = eINSTANCE.getUniversidad_RefGrupo();

		/**
		 * The meta object literal for the '{@link itculiacan.Nombramiento <em>Nombramiento</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see itculiacan.Nombramiento
		 * @see itculiacan.impl.ItculiacanPackageImpl#getNombramiento()
		 * @generated
		 */
		EEnum NOMBRAMIENTO = eINSTANCE.getNombramiento();

	}

} //ItculiacanPackage
