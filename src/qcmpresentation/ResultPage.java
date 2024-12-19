/**
 */
package qcmpresentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcmpresentation.ResultPage#isShowDetailedFeedback <em>Show Detailed Feedback</em>}</li>
 *   <li>{@link qcmpresentation.ResultPage#isShowCorrectAnswers <em>Show Correct Answers</em>}</li>
 *   <li>{@link qcmpresentation.ResultPage#getScoreDisplay <em>Score Display</em>}</li>
 * </ul>
 *
 * @see qcmpresentation.QcmpresentationPackage#getResultPage()
 * @model
 * @generated
 */
public interface ResultPage extends Page {
	/**
	 * Returns the value of the '<em><b>Show Detailed Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Detailed Feedback</em>' attribute.
	 * @see #setShowDetailedFeedback(boolean)
	 * @see qcmpresentation.QcmpresentationPackage#getResultPage_ShowDetailedFeedback()
	 * @model required="true"
	 * @generated
	 */
	boolean isShowDetailedFeedback();

	/**
	 * Sets the value of the '{@link qcmpresentation.ResultPage#isShowDetailedFeedback <em>Show Detailed Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Detailed Feedback</em>' attribute.
	 * @see #isShowDetailedFeedback()
	 * @generated
	 */
	void setShowDetailedFeedback(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Correct Answers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Correct Answers</em>' attribute.
	 * @see #setShowCorrectAnswers(boolean)
	 * @see qcmpresentation.QcmpresentationPackage#getResultPage_ShowCorrectAnswers()
	 * @model required="true"
	 * @generated
	 */
	boolean isShowCorrectAnswers();

	/**
	 * Sets the value of the '{@link qcmpresentation.ResultPage#isShowCorrectAnswers <em>Show Correct Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Correct Answers</em>' attribute.
	 * @see #isShowCorrectAnswers()
	 * @generated
	 */
	void setShowCorrectAnswers(boolean value);

	/**
	 * Returns the value of the '<em><b>Score Display</b></em>' attribute.
	 * The literals are from the enumeration {@link qcmpresentation.ScoreDisplayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score Display</em>' attribute.
	 * @see qcmpresentation.ScoreDisplayType
	 * @see #setScoreDisplay(ScoreDisplayType)
	 * @see qcmpresentation.QcmpresentationPackage#getResultPage_ScoreDisplay()
	 * @model
	 * @generated
	 */
	ScoreDisplayType getScoreDisplay();

	/**
	 * Sets the value of the '{@link qcmpresentation.ResultPage#getScoreDisplay <em>Score Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score Display</em>' attribute.
	 * @see qcmpresentation.ScoreDisplayType
	 * @see #getScoreDisplay()
	 * @generated
	 */
	void setScoreDisplay(ScoreDisplayType value);

} // ResultPage
