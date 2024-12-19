/**
 */
package qcm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Choice Question</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qcm.QcmPackage#getSingleChoiceQuestion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneCorrectAnswer'"
 * @generated
 */
public interface SingleChoiceQuestion extends Question {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.answers-&gt;select(a | a.isCorrect)-&gt;size() = 1'"
	 * @generated
	 */
	boolean oneCorrectAnswer(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SingleChoiceQuestion
