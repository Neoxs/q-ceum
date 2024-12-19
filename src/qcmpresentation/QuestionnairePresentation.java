/**
 */
package qcmpresentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcmpresentation.QuestionnairePresentation#getTitle <em>Title</em>}</li>
 *   <li>{@link qcmpresentation.QuestionnairePresentation#isShowProgressBar <em>Show Progress Bar</em>}</li>
 *   <li>{@link qcmpresentation.QuestionnairePresentation#isEnableBackNavigation <em>Enable Back Navigation</em>}</li>
 *   <li>{@link qcmpresentation.QuestionnairePresentation#getPages <em>Pages</em>}</li>
 *   <li>{@link qcmpresentation.QuestionnairePresentation#getResultPage <em>Result Page</em>}</li>
 * </ul>
 *
 * @see qcmpresentation.QcmpresentationPackage#getQuestionnairePresentation()
 * @model
 * @generated
 */
public interface QuestionnairePresentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see qcmpresentation.QcmpresentationPackage#getQuestionnairePresentation_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link qcmpresentation.QuestionnairePresentation#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Show Progress Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Progress Bar</em>' attribute.
	 * @see #setShowProgressBar(boolean)
	 * @see qcmpresentation.QcmpresentationPackage#getQuestionnairePresentation_ShowProgressBar()
	 * @model required="true"
	 * @generated
	 */
	boolean isShowProgressBar();

	/**
	 * Sets the value of the '{@link qcmpresentation.QuestionnairePresentation#isShowProgressBar <em>Show Progress Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Progress Bar</em>' attribute.
	 * @see #isShowProgressBar()
	 * @generated
	 */
	void setShowProgressBar(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Back Navigation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Back Navigation</em>' attribute.
	 * @see #setEnableBackNavigation(boolean)
	 * @see qcmpresentation.QcmpresentationPackage#getQuestionnairePresentation_EnableBackNavigation()
	 * @model required="true"
	 * @generated
	 */
	boolean isEnableBackNavigation();

	/**
	 * Sets the value of the '{@link qcmpresentation.QuestionnairePresentation#isEnableBackNavigation <em>Enable Back Navigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Back Navigation</em>' attribute.
	 * @see #isEnableBackNavigation()
	 * @generated
	 */
	void setEnableBackNavigation(boolean value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link qcmpresentation.QuestionPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see qcmpresentation.QcmpresentationPackage#getQuestionnairePresentation_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionPage> getPages();

	/**
	 * Returns the value of the '<em><b>Result Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Page</em>' containment reference.
	 * @see #setResultPage(ResultPage)
	 * @see qcmpresentation.QcmpresentationPackage#getQuestionnairePresentation_ResultPage()
	 * @model containment="true"
	 * @generated
	 */
	ResultPage getResultPage();

	/**
	 * Sets the value of the '{@link qcmpresentation.QuestionnairePresentation#getResultPage <em>Result Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Page</em>' containment reference.
	 * @see #getResultPage()
	 * @generated
	 */
	void setResultPage(ResultPage value);

} // QuestionnairePresentation
