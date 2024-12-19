/**
 */
package qcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcm.Questionnaire#getTitle <em>Title</em>}</li>
 *   <li>{@link qcm.Questionnaire#isShuffleQuestions <em>Shuffle Questions</em>}</li>
 *   <li>{@link qcm.Questionnaire#isAllowBack <em>Allow Back</em>}</li>
 *   <li>{@link qcm.Questionnaire#getQuestions <em>Questions</em>}</li>
 *   <li>{@link qcm.Questionnaire#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see qcm.QcmPackage#getQuestionnaire()
 * @model
 * @generated
 */
public interface Questionnaire extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see qcm.QcmPackage#getQuestionnaire_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link qcm.Questionnaire#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Shuffle Questions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shuffle Questions</em>' attribute.
	 * @see #setShuffleQuestions(boolean)
	 * @see qcm.QcmPackage#getQuestionnaire_ShuffleQuestions()
	 * @model required="true"
	 * @generated
	 */
	boolean isShuffleQuestions();

	/**
	 * Sets the value of the '{@link qcm.Questionnaire#isShuffleQuestions <em>Shuffle Questions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shuffle Questions</em>' attribute.
	 * @see #isShuffleQuestions()
	 * @generated
	 */
	void setShuffleQuestions(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Back</em>' attribute.
	 * @see #setAllowBack(boolean)
	 * @see qcm.QcmPackage#getQuestionnaire_AllowBack()
	 * @model required="true"
	 * @generated
	 */
	boolean isAllowBack();

	/**
	 * Sets the value of the '{@link qcm.Questionnaire#isAllowBack <em>Allow Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Back</em>' attribute.
	 * @see #isAllowBack()
	 * @generated
	 */
	void setAllowBack(boolean value);

	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link qcm.Question}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see qcm.QcmPackage#getQuestionnaire_Questions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getQuestions();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link qcm.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see qcm.QcmPackage#getQuestionnaire_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

} // Questionnaire
