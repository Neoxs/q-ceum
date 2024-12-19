/**
 */
package qcm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see qcm.QcmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface QcmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qcm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/qcm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qcm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QcmPackage eINSTANCE = qcm.impl.QcmPackageImpl.init();

	/**
	 * The meta object id for the '{@link qcm.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.QuestionnaireImpl
	 * @see qcm.impl.QcmPackageImpl#getQuestionnaire()
	 * @generated
	 */
	int QUESTIONNAIRE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Shuffle Questions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__SHUFFLE_QUESTIONS = 1;

	/**
	 * The feature id for the '<em><b>Allow Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__ALLOW_BACK = 2;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__QUESTIONS = 3;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__TAGS = 4;

	/**
	 * The number of structural features of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qcm.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.QuestionImpl
	 * @see qcm.impl.QcmPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__DIFFICULTY = 1;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ANSWERS = 2;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TAGS = 3;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Valid Difficulty Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION___VALID_DIFFICULTY_LEVEL__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Text Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION___TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link qcm.impl.SingleChoiceQuestionImpl <em>Single Choice Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.SingleChoiceQuestionImpl
	 * @see qcm.impl.QcmPackageImpl#getSingleChoiceQuestion()
	 * @generated
	 */
	int SINGLE_CHOICE_QUESTION = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_QUESTION__TEXT = QUESTION__TEXT;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_QUESTION__DIFFICULTY = QUESTION__DIFFICULTY;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_QUESTION__ANSWERS = QUESTION__ANSWERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_QUESTION__TAGS = QUESTION__TAGS;

	/**
	 * The number of structural features of the '<em>Single Choice Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Valid Difficulty Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_QUESTION___VALID_DIFFICULTY_LEVEL__DIAGNOSTICCHAIN_MAP = QUESTION___VALID_DIFFICULTY_LEVEL__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Text Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_QUESTION___TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = QUESTION___TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>One Correct Answer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_QUESTION___ONE_CORRECT_ANSWER__DIAGNOSTICCHAIN_MAP = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Choice Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qcm.impl.MultipleChoiceQuestionImpl <em>Multiple Choice Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.MultipleChoiceQuestionImpl
	 * @see qcm.impl.QcmPackageImpl#getMultipleChoiceQuestion()
	 * @generated
	 */
	int MULTIPLE_CHOICE_QUESTION = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_QUESTION__TEXT = QUESTION__TEXT;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_QUESTION__DIFFICULTY = QUESTION__DIFFICULTY;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_QUESTION__ANSWERS = QUESTION__ANSWERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_QUESTION__TAGS = QUESTION__TAGS;

	/**
	 * The number of structural features of the '<em>Multiple Choice Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Valid Difficulty Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_QUESTION___VALID_DIFFICULTY_LEVEL__DIAGNOSTICCHAIN_MAP = QUESTION___VALID_DIFFICULTY_LEVEL__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Text Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_QUESTION___TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = QUESTION___TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>At Least One Correct Answer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_QUESTION___AT_LEAST_ONE_CORRECT_ANSWER__DIAGNOSTICCHAIN_MAP = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiple Choice Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qcm.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.AnswerImpl
	 * @see qcm.impl.QcmPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Is Correct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__IS_CORRECT = 1;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Answer Text Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER___ANSWER_TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link qcm.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.TagImpl
	 * @see qcm.impl.QcmPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__PARENT = 1;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Tag Name Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___TAG_NAME_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link qcm.DifficultyLevel <em>Difficulty Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.DifficultyLevel
	 * @see qcm.impl.QcmPackageImpl#getDifficultyLevel()
	 * @generated
	 */
	int DIFFICULTY_LEVEL = 6;


	/**
	 * Returns the meta object for class '{@link qcm.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire</em>'.
	 * @see qcm.Questionnaire
	 * @generated
	 */
	EClass getQuestionnaire();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Questionnaire#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see qcm.Questionnaire#getTitle()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_Title();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Questionnaire#isShuffleQuestions <em>Shuffle Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shuffle Questions</em>'.
	 * @see qcm.Questionnaire#isShuffleQuestions()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_ShuffleQuestions();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Questionnaire#isAllowBack <em>Allow Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Back</em>'.
	 * @see qcm.Questionnaire#isAllowBack()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_AllowBack();

	/**
	 * Returns the meta object for the containment reference list '{@link qcm.Questionnaire#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see qcm.Questionnaire#getQuestions()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Questions();

	/**
	 * Returns the meta object for the containment reference list '{@link qcm.Questionnaire#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see qcm.Questionnaire#getTags()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Tags();

	/**
	 * Returns the meta object for class '{@link qcm.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see qcm.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Question#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see qcm.Question#getText()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Text();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Question#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty</em>'.
	 * @see qcm.Question#getDifficulty()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Difficulty();

	/**
	 * Returns the meta object for the containment reference list '{@link qcm.Question#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see qcm.Question#getAnswers()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Answers();

	/**
	 * Returns the meta object for the reference list '{@link qcm.Question#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see qcm.Question#getTags()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Tags();

	/**
	 * Returns the meta object for the '{@link qcm.Question#validDifficultyLevel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Difficulty Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Difficulty Level</em>' operation.
	 * @see qcm.Question#validDifficultyLevel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getQuestion__ValidDifficultyLevel__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link qcm.Question#textNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Text Not Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Text Not Empty</em>' operation.
	 * @see qcm.Question#textNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getQuestion__TextNotEmpty__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qcm.SingleChoiceQuestion <em>Single Choice Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Choice Question</em>'.
	 * @see qcm.SingleChoiceQuestion
	 * @generated
	 */
	EClass getSingleChoiceQuestion();

	/**
	 * Returns the meta object for the '{@link qcm.SingleChoiceQuestion#oneCorrectAnswer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>One Correct Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>One Correct Answer</em>' operation.
	 * @see qcm.SingleChoiceQuestion#oneCorrectAnswer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSingleChoiceQuestion__OneCorrectAnswer__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qcm.MultipleChoiceQuestion <em>Multiple Choice Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Choice Question</em>'.
	 * @see qcm.MultipleChoiceQuestion
	 * @generated
	 */
	EClass getMultipleChoiceQuestion();

	/**
	 * Returns the meta object for the '{@link qcm.MultipleChoiceQuestion#atLeastOneCorrectAnswer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>At Least One Correct Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>At Least One Correct Answer</em>' operation.
	 * @see qcm.MultipleChoiceQuestion#atLeastOneCorrectAnswer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMultipleChoiceQuestion__AtLeastOneCorrectAnswer__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qcm.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see qcm.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Answer#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see qcm.Answer#getText()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Text();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Answer#isIsCorrect <em>Is Correct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Correct</em>'.
	 * @see qcm.Answer#isIsCorrect()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_IsCorrect();

	/**
	 * Returns the meta object for the '{@link qcm.Answer#answerTextNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Answer Text Not Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Answer Text Not Empty</em>' operation.
	 * @see qcm.Answer#answerTextNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAnswer__AnswerTextNotEmpty__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qcm.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see qcm.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qcm.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for the reference '{@link qcm.Tag#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see qcm.Tag#getParent()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_Parent();

	/**
	 * Returns the meta object for the '{@link qcm.Tag#tagNameNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Tag Name Not Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Name Not Empty</em>' operation.
	 * @see qcm.Tag#tagNameNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTag__TagNameNotEmpty__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link qcm.DifficultyLevel <em>Difficulty Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Difficulty Level</em>'.
	 * @see qcm.DifficultyLevel
	 * @generated
	 */
	EEnum getDifficultyLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QcmFactory getQcmFactory();

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
		 * The meta object literal for the '{@link qcm.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.QuestionnaireImpl
		 * @see qcm.impl.QcmPackageImpl#getQuestionnaire()
		 * @generated
		 */
		EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__TITLE = eINSTANCE.getQuestionnaire_Title();

		/**
		 * The meta object literal for the '<em><b>Shuffle Questions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__SHUFFLE_QUESTIONS = eINSTANCE.getQuestionnaire_ShuffleQuestions();

		/**
		 * The meta object literal for the '<em><b>Allow Back</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__ALLOW_BACK = eINSTANCE.getQuestionnaire_AllowBack();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__QUESTIONS = eINSTANCE.getQuestionnaire_Questions();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__TAGS = eINSTANCE.getQuestionnaire_Tags();

		/**
		 * The meta object literal for the '{@link qcm.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.QuestionImpl
		 * @see qcm.impl.QcmPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__TEXT = eINSTANCE.getQuestion_Text();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__DIFFICULTY = eINSTANCE.getQuestion_Difficulty();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__ANSWERS = eINSTANCE.getQuestion_Answers();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__TAGS = eINSTANCE.getQuestion_Tags();

		/**
		 * The meta object literal for the '<em><b>Valid Difficulty Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUESTION___VALID_DIFFICULTY_LEVEL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getQuestion__ValidDifficultyLevel__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Text Not Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUESTION___TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getQuestion__TextNotEmpty__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link qcm.impl.SingleChoiceQuestionImpl <em>Single Choice Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.SingleChoiceQuestionImpl
		 * @see qcm.impl.QcmPackageImpl#getSingleChoiceQuestion()
		 * @generated
		 */
		EClass SINGLE_CHOICE_QUESTION = eINSTANCE.getSingleChoiceQuestion();

		/**
		 * The meta object literal for the '<em><b>One Correct Answer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_CHOICE_QUESTION___ONE_CORRECT_ANSWER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSingleChoiceQuestion__OneCorrectAnswer__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link qcm.impl.MultipleChoiceQuestionImpl <em>Multiple Choice Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.MultipleChoiceQuestionImpl
		 * @see qcm.impl.QcmPackageImpl#getMultipleChoiceQuestion()
		 * @generated
		 */
		EClass MULTIPLE_CHOICE_QUESTION = eINSTANCE.getMultipleChoiceQuestion();

		/**
		 * The meta object literal for the '<em><b>At Least One Correct Answer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTIPLE_CHOICE_QUESTION___AT_LEAST_ONE_CORRECT_ANSWER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMultipleChoiceQuestion__AtLeastOneCorrectAnswer__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link qcm.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.AnswerImpl
		 * @see qcm.impl.QcmPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__TEXT = eINSTANCE.getAnswer_Text();

		/**
		 * The meta object literal for the '<em><b>Is Correct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__IS_CORRECT = eINSTANCE.getAnswer_IsCorrect();

		/**
		 * The meta object literal for the '<em><b>Answer Text Not Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANSWER___ANSWER_TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAnswer__AnswerTextNotEmpty__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link qcm.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.TagImpl
		 * @see qcm.impl.QcmPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__PARENT = eINSTANCE.getTag_Parent();

		/**
		 * The meta object literal for the '<em><b>Tag Name Not Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TAG___TAG_NAME_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTag__TagNameNotEmpty__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link qcm.DifficultyLevel <em>Difficulty Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.DifficultyLevel
		 * @see qcm.impl.QcmPackageImpl#getDifficultyLevel()
		 * @generated
		 */
		EEnum DIFFICULTY_LEVEL = eINSTANCE.getDifficultyLevel();

	}

} //QcmPackage
