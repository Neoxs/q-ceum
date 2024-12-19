/**
 */
package qcm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcm.Question#getText <em>Text</em>}</li>
 *   <li>{@link qcm.Question#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link qcm.Question#getAnswers <em>Answers</em>}</li>
 *   <li>{@link qcm.Question#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see qcm.QcmPackage#getQuestion()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='textNotEmpty'"
 * @generated
 */
public interface Question extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see qcm.QcmPackage#getQuestion_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link qcm.Question#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Difficulty</b></em>' attribute.
	 * The literals are from the enumeration {@link qcm.DifficultyLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty</em>' attribute.
	 * @see qcm.DifficultyLevel
	 * @see #setDifficulty(DifficultyLevel)
	 * @see qcm.QcmPackage#getQuestion_Difficulty()
	 * @model required="true"
	 * @generated
	 */
	DifficultyLevel getDifficulty();

	/**
	 * Sets the value of the '{@link qcm.Question#getDifficulty <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' attribute.
	 * @see qcm.DifficultyLevel
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(DifficultyLevel value);

	/**
	 * Returns the value of the '<em><b>Answers</b></em>' containment reference list.
	 * The list contents are of type {@link qcm.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answers</em>' containment reference list.
	 * @see qcm.QcmPackage#getQuestion_Answers()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Answer> getAnswers();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link qcm.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see qcm.QcmPackage#getQuestion_Tags()
	 * @model
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \tdifficulty = DifficultyLevel::LEVEL_1 or\n    \tdifficulty = DifficultyLevel::LEVEL_2 or\n    \tdifficulty = DifficultyLevel::LEVEL_3 or\n    \tdifficulty = DifficultyLevel::LEVEL_4 or\n    \tdifficulty = DifficultyLevel::LEVEL_5'"
	 * @generated
	 */
	boolean validDifficultyLevel(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t        text.size() &gt; 0'"
	 * @generated
	 */
	boolean textNotEmpty(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Question
