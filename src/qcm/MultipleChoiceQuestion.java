/**
 */
package qcm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Choice Question</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qcm.QcmPackage#getMultipleChoiceQuestion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='atLeastOneCorrectAnswer'"
 * @generated
 */
public interface MultipleChoiceQuestion extends Question {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.answers-&gt;select(a | a.isCorrect)-&gt;size() &gt;= 1'"
	 * @generated
	 */
	boolean atLeastOneCorrectAnswer(DiagnosticChain diagnostics, Map<Object, Object> context);

} // MultipleChoiceQuestion
