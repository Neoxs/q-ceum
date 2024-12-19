/**
 */
package qcmpresentation;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcmpresentation.QuestionPage#getQuestionText <em>Question Text</em>}</li>
 *   <li>{@link qcmpresentation.QuestionPage#getDifficultyDisplay <em>Difficulty Display</em>}</li>
 *   <li>{@link qcmpresentation.QuestionPage#getOptions <em>Options</em>}</li>
 *   <li>{@link qcmpresentation.QuestionPage#isMultipleChoice <em>Multiple Choice</em>}</li>
 * </ul>
 *
 * @see qcmpresentation.QcmpresentationPackage#getQuestionPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='questionTextNotEmpty'"
 * @generated
 */
public interface QuestionPage extends Page {
	/**
	 * Returns the value of the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Text</em>' attribute.
	 * @see #setQuestionText(String)
	 * @see qcmpresentation.QcmpresentationPackage#getQuestionPage_QuestionText()
	 * @model
	 * @generated
	 */
	String getQuestionText();

	/**
	 * Sets the value of the '{@link qcmpresentation.QuestionPage#getQuestionText <em>Question Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Text</em>' attribute.
	 * @see #getQuestionText()
	 * @generated
	 */
	void setQuestionText(String value);

	/**
	 * Returns the value of the '<em><b>Difficulty Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty Display</em>' attribute.
	 * @see #setDifficultyDisplay(String)
	 * @see qcmpresentation.QcmpresentationPackage#getQuestionPage_DifficultyDisplay()
	 * @model
	 * @generated
	 */
	String getDifficultyDisplay();

	/**
	 * Sets the value of the '{@link qcmpresentation.QuestionPage#getDifficultyDisplay <em>Difficulty Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty Display</em>' attribute.
	 * @see #getDifficultyDisplay()
	 * @generated
	 */
	void setDifficultyDisplay(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link qcmpresentation.AnswerOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see qcmpresentation.QcmpresentationPackage#getQuestionPage_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnswerOption> getOptions();

	/**
	 * Returns the value of the '<em><b>Multiple Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Choice</em>' attribute.
	 * @see #setMultipleChoice(boolean)
	 * @see qcmpresentation.QcmpresentationPackage#getQuestionPage_MultipleChoice()
	 * @model required="true"
	 * @generated
	 */
	boolean isMultipleChoice();

	/**
	 * Sets the value of the '{@link qcmpresentation.QuestionPage#isMultipleChoice <em>Multiple Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Choice</em>' attribute.
	 * @see #isMultipleChoice()
	 * @generated
	 */
	void setMultipleChoice(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='options-&gt;size() &gt;= 2'"
	 * @generated
	 */
	boolean minimumTwoOptions(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif multipleChoice then\n        \t\toptions-&gt;forAll(o | o.inputType = InputType::CHECKBOX)\n    \t\telse\n        \t\toptions-&gt;forAll(o | o.inputType = InputType::RADIO)\n    \t\tendif'"
	 * @generated
	 */
	boolean correctInputType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='options-&gt;exists(o | o.correct)'"
	 * @generated
	 */
	boolean hasCorrectAnswer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='questionText.size() &gt; 0'"
	 * @generated
	 */
	boolean questionTextNotEmpty(DiagnosticChain diagnostics, Map<Object, Object> context);

} // QuestionPage
