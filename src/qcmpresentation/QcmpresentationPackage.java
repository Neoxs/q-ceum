/**
 */
package qcmpresentation;

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
 * @see qcmpresentation.QcmpresentationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface QcmpresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qcmpresentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/qcmpresentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qcmpresentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QcmpresentationPackage eINSTANCE = qcmpresentation.impl.QcmpresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link qcmpresentation.impl.QuestionnairePresentationImpl <em>Questionnaire Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcmpresentation.impl.QuestionnairePresentationImpl
	 * @see qcmpresentation.impl.QcmpresentationPackageImpl#getQuestionnairePresentation()
	 * @generated
	 */
	int QUESTIONNAIRE_PRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_PRESENTATION__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Show Progress Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_PRESENTATION__SHOW_PROGRESS_BAR = 1;

	/**
	 * The feature id for the '<em><b>Enable Back Navigation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_PRESENTATION__ENABLE_BACK_NAVIGATION = 2;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_PRESENTATION__PAGES = 3;

	/**
	 * The feature id for the '<em><b>Result Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_PRESENTATION__RESULT_PAGE = 4;

	/**
	 * The number of structural features of the '<em>Questionnaire Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_PRESENTATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Questionnaire Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_PRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qcmpresentation.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcmpresentation.impl.PageImpl
	 * @see qcmpresentation.impl.QcmpresentationPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CSS_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Header Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___HEADER_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link qcmpresentation.impl.QuestionPageImpl <em>Question Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcmpresentation.impl.QuestionPageImpl
	 * @see qcmpresentation.impl.QcmpresentationPackageImpl#getQuestionPage()
	 * @generated
	 */
	int QUESTION_PAGE = 2;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE__HEADER = PAGE__HEADER;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE__CSS_CLASS = PAGE__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE__QUESTION_TEXT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Difficulty Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE__DIFFICULTY_DISPLAY = PAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE__OPTIONS = PAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multiple Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE__MULTIPLE_CHOICE = PAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Question Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Header Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE___HEADER_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = PAGE___HEADER_NOT_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Minimum Two Options</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE___MINIMUM_TWO_OPTIONS__DIAGNOSTICCHAIN_MAP = PAGE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Correct Input Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE___CORRECT_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = PAGE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Correct Answer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE___HAS_CORRECT_ANSWER__DIAGNOSTICCHAIN_MAP = PAGE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Question Text Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE___QUESTION_TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = PAGE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Question Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link qcmpresentation.impl.AnswerOptionImpl <em>Answer Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcmpresentation.impl.AnswerOptionImpl
	 * @see qcmpresentation.impl.QcmpresentationPackageImpl#getAnswerOption()
	 * @generated
	 */
	int ANSWER_OPTION = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPTION__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Correct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPTION__CORRECT = 1;

	/**
	 * The feature id for the '<em><b>Input Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPTION__INPUT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Answer Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPTION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Answer Text Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPTION___ANSWER_TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Answer Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link qcmpresentation.impl.ResultPageImpl <em>Result Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcmpresentation.impl.ResultPageImpl
	 * @see qcmpresentation.impl.QcmpresentationPackageImpl#getResultPage()
	 * @generated
	 */
	int RESULT_PAGE = 4;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PAGE__HEADER = PAGE__HEADER;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PAGE__CSS_CLASS = PAGE__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Show Detailed Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PAGE__SHOW_DETAILED_FEEDBACK = PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Show Correct Answers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PAGE__SHOW_CORRECT_ANSWERS = PAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Score Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PAGE__SCORE_DISPLAY = PAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Result Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Header Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PAGE___HEADER_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = PAGE___HEADER_NOT_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Result Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qcmpresentation.InputType <em>Input Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcmpresentation.InputType
	 * @see qcmpresentation.impl.QcmpresentationPackageImpl#getInputType()
	 * @generated
	 */
	int INPUT_TYPE = 5;

	/**
	 * The meta object id for the '{@link qcmpresentation.ScoreDisplayType <em>Score Display Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcmpresentation.ScoreDisplayType
	 * @see qcmpresentation.impl.QcmpresentationPackageImpl#getScoreDisplayType()
	 * @generated
	 */
	int SCORE_DISPLAY_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link qcmpresentation.QuestionnairePresentation <em>Questionnaire Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire Presentation</em>'.
	 * @see qcmpresentation.QuestionnairePresentation
	 * @generated
	 */
	EClass getQuestionnairePresentation();

	/**
	 * Returns the meta object for the attribute '{@link qcmpresentation.QuestionnairePresentation#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see qcmpresentation.QuestionnairePresentation#getTitle()
	 * @see #getQuestionnairePresentation()
	 * @generated
	 */
	EAttribute getQuestionnairePresentation_Title();

	/**
	 * Returns the meta object for the attribute '{@link qcmpresentation.QuestionnairePresentation#isShowProgressBar <em>Show Progress Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Progress Bar</em>'.
	 * @see qcmpresentation.QuestionnairePresentation#isShowProgressBar()
	 * @see #getQuestionnairePresentation()
	 * @generated
	 */
	EAttribute getQuestionnairePresentation_ShowProgressBar();

	/**
	 * Returns the meta object for the attribute '{@link qcmpresentation.QuestionnairePresentation#isEnableBackNavigation <em>Enable Back Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Back Navigation</em>'.
	 * @see qcmpresentation.QuestionnairePresentation#isEnableBackNavigation()
	 * @see #getQuestionnairePresentation()
	 * @generated
	 */
	EAttribute getQuestionnairePresentation_EnableBackNavigation();

	/**
	 * Returns the meta object for the containment reference list '{@link qcmpresentation.QuestionnairePresentation#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see qcmpresentation.QuestionnairePresentation#getPages()
	 * @see #getQuestionnairePresentation()
	 * @generated
	 */
	EReference getQuestionnairePresentation_Pages();

	/**
	 * Returns the meta object for the containment reference '{@link qcmpresentation.QuestionnairePresentation#getResultPage <em>Result Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Page</em>'.
	 * @see qcmpresentation.QuestionnairePresentation#getResultPage()
	 * @see #getQuestionnairePresentation()
	 * @generated
	 */
	EReference getQuestionnairePresentation_ResultPage();

	/**
	 * Returns the meta object for class '{@link qcmpresentation.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see qcmpresentation.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link qcmpresentation.Page#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see qcmpresentation.Page#getHeader()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Header();

	/**
	 * Returns the meta object for the attribute '{@link qcmpresentation.Page#getCssClass <em>Css Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Css Class</em>'.
	 * @see qcmpresentation.Page#getCssClass()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_CssClass();

	/**
	 * Returns the meta object for the '{@link qcmpresentation.Page#headerNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Header Not Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Header Not Empty</em>' operation.
	 * @see qcmpresentation.Page#headerNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPage__HeaderNotEmpty__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qcmpresentation.QuestionPage <em>Question Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Page</em>'.
	 * @see qcmpresentation.QuestionPage
	 * @generated
	 */
	EClass getQuestionPage();

	/**
	 * Returns the meta object for the attribute '{@link qcmpresentation.QuestionPage#getQuestionText <em>Question Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question Text</em>'.
	 * @see qcmpresentation.QuestionPage#getQuestionText()
	 * @see #getQuestionPage()
	 * @generated
	 */
	EAttribute getQuestionPage_QuestionText();

	/**
	 * Returns the meta object for the attribute '{@link qcmpresentation.QuestionPage#getDifficultyDisplay <em>Difficulty Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty Display</em>'.
	 * @see qcmpresentation.QuestionPage#getDifficultyDisplay()
	 * @see #getQuestionPage()
	 * @generated
	 */
	EAttribute getQuestionPage_DifficultyDisplay();

	/**
	 * Returns the meta object for the containment reference list '{@link qcmpresentation.QuestionPage#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see qcmpresentation.QuestionPage#getOptions()
	 * @see #getQuestionPage()
	 * @generated
	 */
	EReference getQuestionPage_Options();

	/**
	 * Returns the meta object for the attribute '{@link qcmpresentation.QuestionPage#isMultipleChoice <em>Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Choice</em>'.
	 * @see qcmpresentation.QuestionPage#isMultipleChoice()
	 * @see #getQuestionPage()
	 * @generated
	 */
	EAttribute getQuestionPage_MultipleChoice();

	/**
	 * Returns the meta object for the '{@link qcmpresentation.QuestionPage#minimumTwoOptions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Minimum Two Options</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Minimum Two Options</em>' operation.
	 * @see qcmpresentation.QuestionPage#minimumTwoOptions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getQuestionPage__MinimumTwoOptions__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link qcmpresentation.QuestionPage#correctInputType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Correct Input Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Correct Input Type</em>' operation.
	 * @see qcmpresentation.QuestionPage#correctInputType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getQuestionPage__CorrectInputType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link qcmpresentation.QuestionPage#hasCorrectAnswer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Correct Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Correct Answer</em>' operation.
	 * @see qcmpresentation.QuestionPage#hasCorrectAnswer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getQuestionPage__HasCorrectAnswer__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link qcmpresentation.QuestionPage#questionTextNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Question Text Not Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Question Text Not Empty</em>' operation.
	 * @see qcmpresentation.QuestionPage#questionTextNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getQuestionPage__QuestionTextNotEmpty__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qcmpresentation.AnswerOption <em>Answer Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer Option</em>'.
	 * @see qcmpresentation.AnswerOption
	 * @generated
	 */
	EClass getAnswerOption();

	/**
	 * Returns the meta object for the attribute '{@link qcmpresentation.AnswerOption#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see qcmpresentation.AnswerOption#getText()
	 * @see #getAnswerOption()
	 * @generated
	 */
	EAttribute getAnswerOption_Text();

	/**
	 * Returns the meta object for the attribute '{@link qcmpresentation.AnswerOption#isCorrect <em>Correct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correct</em>'.
	 * @see qcmpresentation.AnswerOption#isCorrect()
	 * @see #getAnswerOption()
	 * @generated
	 */
	EAttribute getAnswerOption_Correct();

	/**
	 * Returns the meta object for the attribute '{@link qcmpresentation.AnswerOption#getInputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Type</em>'.
	 * @see qcmpresentation.AnswerOption#getInputType()
	 * @see #getAnswerOption()
	 * @generated
	 */
	EAttribute getAnswerOption_InputType();

	/**
	 * Returns the meta object for the '{@link qcmpresentation.AnswerOption#answerTextNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Answer Text Not Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Answer Text Not Empty</em>' operation.
	 * @see qcmpresentation.AnswerOption#answerTextNotEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAnswerOption__AnswerTextNotEmpty__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qcmpresentation.ResultPage <em>Result Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Page</em>'.
	 * @see qcmpresentation.ResultPage
	 * @generated
	 */
	EClass getResultPage();

	/**
	 * Returns the meta object for the attribute '{@link qcmpresentation.ResultPage#isShowDetailedFeedback <em>Show Detailed Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Detailed Feedback</em>'.
	 * @see qcmpresentation.ResultPage#isShowDetailedFeedback()
	 * @see #getResultPage()
	 * @generated
	 */
	EAttribute getResultPage_ShowDetailedFeedback();

	/**
	 * Returns the meta object for the attribute '{@link qcmpresentation.ResultPage#isShowCorrectAnswers <em>Show Correct Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Correct Answers</em>'.
	 * @see qcmpresentation.ResultPage#isShowCorrectAnswers()
	 * @see #getResultPage()
	 * @generated
	 */
	EAttribute getResultPage_ShowCorrectAnswers();

	/**
	 * Returns the meta object for the attribute '{@link qcmpresentation.ResultPage#getScoreDisplay <em>Score Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score Display</em>'.
	 * @see qcmpresentation.ResultPage#getScoreDisplay()
	 * @see #getResultPage()
	 * @generated
	 */
	EAttribute getResultPage_ScoreDisplay();

	/**
	 * Returns the meta object for enum '{@link qcmpresentation.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Input Type</em>'.
	 * @see qcmpresentation.InputType
	 * @generated
	 */
	EEnum getInputType();

	/**
	 * Returns the meta object for enum '{@link qcmpresentation.ScoreDisplayType <em>Score Display Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Score Display Type</em>'.
	 * @see qcmpresentation.ScoreDisplayType
	 * @generated
	 */
	EEnum getScoreDisplayType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QcmpresentationFactory getQcmpresentationFactory();

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
		 * The meta object literal for the '{@link qcmpresentation.impl.QuestionnairePresentationImpl <em>Questionnaire Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcmpresentation.impl.QuestionnairePresentationImpl
		 * @see qcmpresentation.impl.QcmpresentationPackageImpl#getQuestionnairePresentation()
		 * @generated
		 */
		EClass QUESTIONNAIRE_PRESENTATION = eINSTANCE.getQuestionnairePresentation();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE_PRESENTATION__TITLE = eINSTANCE.getQuestionnairePresentation_Title();

		/**
		 * The meta object literal for the '<em><b>Show Progress Bar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE_PRESENTATION__SHOW_PROGRESS_BAR = eINSTANCE.getQuestionnairePresentation_ShowProgressBar();

		/**
		 * The meta object literal for the '<em><b>Enable Back Navigation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE_PRESENTATION__ENABLE_BACK_NAVIGATION = eINSTANCE.getQuestionnairePresentation_EnableBackNavigation();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE_PRESENTATION__PAGES = eINSTANCE.getQuestionnairePresentation_Pages();

		/**
		 * The meta object literal for the '<em><b>Result Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE_PRESENTATION__RESULT_PAGE = eINSTANCE.getQuestionnairePresentation_ResultPage();

		/**
		 * The meta object literal for the '{@link qcmpresentation.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcmpresentation.impl.PageImpl
		 * @see qcmpresentation.impl.QcmpresentationPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__HEADER = eINSTANCE.getPage_Header();

		/**
		 * The meta object literal for the '<em><b>Css Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__CSS_CLASS = eINSTANCE.getPage_CssClass();

		/**
		 * The meta object literal for the '<em><b>Header Not Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___HEADER_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPage__HeaderNotEmpty__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link qcmpresentation.impl.QuestionPageImpl <em>Question Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcmpresentation.impl.QuestionPageImpl
		 * @see qcmpresentation.impl.QcmpresentationPackageImpl#getQuestionPage()
		 * @generated
		 */
		EClass QUESTION_PAGE = eINSTANCE.getQuestionPage();

		/**
		 * The meta object literal for the '<em><b>Question Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_PAGE__QUESTION_TEXT = eINSTANCE.getQuestionPage_QuestionText();

		/**
		 * The meta object literal for the '<em><b>Difficulty Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_PAGE__DIFFICULTY_DISPLAY = eINSTANCE.getQuestionPage_DifficultyDisplay();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_PAGE__OPTIONS = eINSTANCE.getQuestionPage_Options();

		/**
		 * The meta object literal for the '<em><b>Multiple Choice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_PAGE__MULTIPLE_CHOICE = eINSTANCE.getQuestionPage_MultipleChoice();

		/**
		 * The meta object literal for the '<em><b>Minimum Two Options</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUESTION_PAGE___MINIMUM_TWO_OPTIONS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getQuestionPage__MinimumTwoOptions__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Correct Input Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUESTION_PAGE___CORRECT_INPUT_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getQuestionPage__CorrectInputType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has Correct Answer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUESTION_PAGE___HAS_CORRECT_ANSWER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getQuestionPage__HasCorrectAnswer__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Question Text Not Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUESTION_PAGE___QUESTION_TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getQuestionPage__QuestionTextNotEmpty__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link qcmpresentation.impl.AnswerOptionImpl <em>Answer Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcmpresentation.impl.AnswerOptionImpl
		 * @see qcmpresentation.impl.QcmpresentationPackageImpl#getAnswerOption()
		 * @generated
		 */
		EClass ANSWER_OPTION = eINSTANCE.getAnswerOption();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER_OPTION__TEXT = eINSTANCE.getAnswerOption_Text();

		/**
		 * The meta object literal for the '<em><b>Correct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER_OPTION__CORRECT = eINSTANCE.getAnswerOption_Correct();

		/**
		 * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER_OPTION__INPUT_TYPE = eINSTANCE.getAnswerOption_InputType();

		/**
		 * The meta object literal for the '<em><b>Answer Text Not Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANSWER_OPTION___ANSWER_TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAnswerOption__AnswerTextNotEmpty__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link qcmpresentation.impl.ResultPageImpl <em>Result Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcmpresentation.impl.ResultPageImpl
		 * @see qcmpresentation.impl.QcmpresentationPackageImpl#getResultPage()
		 * @generated
		 */
		EClass RESULT_PAGE = eINSTANCE.getResultPage();

		/**
		 * The meta object literal for the '<em><b>Show Detailed Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_PAGE__SHOW_DETAILED_FEEDBACK = eINSTANCE.getResultPage_ShowDetailedFeedback();

		/**
		 * The meta object literal for the '<em><b>Show Correct Answers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_PAGE__SHOW_CORRECT_ANSWERS = eINSTANCE.getResultPage_ShowCorrectAnswers();

		/**
		 * The meta object literal for the '<em><b>Score Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_PAGE__SCORE_DISPLAY = eINSTANCE.getResultPage_ScoreDisplay();

		/**
		 * The meta object literal for the '{@link qcmpresentation.InputType <em>Input Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcmpresentation.InputType
		 * @see qcmpresentation.impl.QcmpresentationPackageImpl#getInputType()
		 * @generated
		 */
		EEnum INPUT_TYPE = eINSTANCE.getInputType();

		/**
		 * The meta object literal for the '{@link qcmpresentation.ScoreDisplayType <em>Score Display Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcmpresentation.ScoreDisplayType
		 * @see qcmpresentation.impl.QcmpresentationPackageImpl#getScoreDisplayType()
		 * @generated
		 */
		EEnum SCORE_DISPLAY_TYPE = eINSTANCE.getScoreDisplayType();

	}

} //QcmpresentationPackage
