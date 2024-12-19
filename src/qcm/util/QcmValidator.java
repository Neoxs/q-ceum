/**
 */
package qcm.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import qcm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see qcm.QcmPackage
 * @generated
 */
public class QcmValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QcmValidator INSTANCE = new QcmValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "qcm";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Difficulty Level' of 'Question'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION__VALID_DIFFICULTY_LEVEL = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Text Not Empty' of 'Question'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION__TEXT_NOT_EMPTY = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Correct Answer' of 'Single Choice Question'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SINGLE_CHOICE_QUESTION__ONE_CORRECT_ANSWER = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'At Least One Correct Answer' of 'Multiple Choice Question'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLE_CHOICE_QUESTION__AT_LEAST_ONE_CORRECT_ANSWER = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Answer Text Not Empty' of 'Answer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANSWER__ANSWER_TEXT_NOT_EMPTY = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Tag Name Not Empty' of 'Tag'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TAG__TAG_NAME_NOT_EMPTY = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QcmValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return QcmPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case QcmPackage.QUESTIONNAIRE:
				return validateQuestionnaire((Questionnaire)value, diagnostics, context);
			case QcmPackage.QUESTION:
				return validateQuestion((Question)value, diagnostics, context);
			case QcmPackage.SINGLE_CHOICE_QUESTION:
				return validateSingleChoiceQuestion((SingleChoiceQuestion)value, diagnostics, context);
			case QcmPackage.MULTIPLE_CHOICE_QUESTION:
				return validateMultipleChoiceQuestion((MultipleChoiceQuestion)value, diagnostics, context);
			case QcmPackage.ANSWER:
				return validateAnswer((Answer)value, diagnostics, context);
			case QcmPackage.TAG:
				return validateTag((Tag)value, diagnostics, context);
			case QcmPackage.DIFFICULTY_LEVEL:
				return validateDifficultyLevel((DifficultyLevel)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaire(Questionnaire questionnaire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaire, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion(Question question, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(question, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(question, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestion_textNotEmpty(question, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestion_validDifficultyLevel(question, diagnostics, context);
		return result;
	}

	/**
	 * Validates the textNotEmpty constraint of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion_textNotEmpty(Question question, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return question.textNotEmpty(diagnostics, context);
	}

	/**
	 * Validates the validDifficultyLevel constraint of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion_validDifficultyLevel(Question question, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return question.validDifficultyLevel(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleChoiceQuestion(SingleChoiceQuestion singleChoiceQuestion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(singleChoiceQuestion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(singleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(singleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(singleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(singleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(singleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestion_textNotEmpty(singleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestion_validDifficultyLevel(singleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleChoiceQuestion_oneCorrectAnswer(singleChoiceQuestion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the oneCorrectAnswer constraint of '<em>Single Choice Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleChoiceQuestion_oneCorrectAnswer(SingleChoiceQuestion singleChoiceQuestion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return singleChoiceQuestion.oneCorrectAnswer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestion(MultipleChoiceQuestion multipleChoiceQuestion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multipleChoiceQuestion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multipleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multipleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multipleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multipleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multipleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multipleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multipleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multipleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestion_textNotEmpty(multipleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestion_validDifficultyLevel(multipleChoiceQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoiceQuestion_atLeastOneCorrectAnswer(multipleChoiceQuestion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the atLeastOneCorrectAnswer constraint of '<em>Multiple Choice Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestion_atLeastOneCorrectAnswer(MultipleChoiceQuestion multipleChoiceQuestion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multipleChoiceQuestion.atLeastOneCorrectAnswer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnswer(Answer answer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(answer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(answer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnswer_answerTextNotEmpty(answer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the answerTextNotEmpty constraint of '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnswer_answerTextNotEmpty(Answer answer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return answer.answerTextNotEmpty(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTag(Tag tag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tag, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validateTag_tagNameNotEmpty(tag, diagnostics, context);
		return result;
	}

	/**
	 * Validates the tagNameNotEmpty constraint of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTag_tagNameNotEmpty(Tag tag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tag.tagNameNotEmpty(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDifficultyLevel(DifficultyLevel difficultyLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //QcmValidator
