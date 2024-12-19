/**
 */
package qcmpresentation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qcmpresentation.QcmpresentationPackage;
import qcmpresentation.ResultPage;
import qcmpresentation.ScoreDisplayType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qcmpresentation.impl.ResultPageImpl#isShowDetailedFeedback <em>Show Detailed Feedback</em>}</li>
 *   <li>{@link qcmpresentation.impl.ResultPageImpl#isShowCorrectAnswers <em>Show Correct Answers</em>}</li>
 *   <li>{@link qcmpresentation.impl.ResultPageImpl#getScoreDisplay <em>Score Display</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultPageImpl extends PageImpl implements ResultPage {
	/**
	 * The default value of the '{@link #isShowDetailedFeedback() <em>Show Detailed Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowDetailedFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_DETAILED_FEEDBACK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowDetailedFeedback() <em>Show Detailed Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowDetailedFeedback()
	 * @generated
	 * @ordered
	 */
	protected boolean showDetailedFeedback = SHOW_DETAILED_FEEDBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowCorrectAnswers() <em>Show Correct Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowCorrectAnswers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_CORRECT_ANSWERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowCorrectAnswers() <em>Show Correct Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowCorrectAnswers()
	 * @generated
	 * @ordered
	 */
	protected boolean showCorrectAnswers = SHOW_CORRECT_ANSWERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getScoreDisplay() <em>Score Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoreDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final ScoreDisplayType SCORE_DISPLAY_EDEFAULT = ScoreDisplayType.PERCENTAGE;

	/**
	 * The cached value of the '{@link #getScoreDisplay() <em>Score Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoreDisplay()
	 * @generated
	 * @ordered
	 */
	protected ScoreDisplayType scoreDisplay = SCORE_DISPLAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QcmpresentationPackage.Literals.RESULT_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowDetailedFeedback() {
		return showDetailedFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowDetailedFeedback(boolean newShowDetailedFeedback) {
		boolean oldShowDetailedFeedback = showDetailedFeedback;
		showDetailedFeedback = newShowDetailedFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmpresentationPackage.RESULT_PAGE__SHOW_DETAILED_FEEDBACK, oldShowDetailedFeedback, showDetailedFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowCorrectAnswers() {
		return showCorrectAnswers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowCorrectAnswers(boolean newShowCorrectAnswers) {
		boolean oldShowCorrectAnswers = showCorrectAnswers;
		showCorrectAnswers = newShowCorrectAnswers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmpresentationPackage.RESULT_PAGE__SHOW_CORRECT_ANSWERS, oldShowCorrectAnswers, showCorrectAnswers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScoreDisplayType getScoreDisplay() {
		return scoreDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScoreDisplay(ScoreDisplayType newScoreDisplay) {
		ScoreDisplayType oldScoreDisplay = scoreDisplay;
		scoreDisplay = newScoreDisplay == null ? SCORE_DISPLAY_EDEFAULT : newScoreDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmpresentationPackage.RESULT_PAGE__SCORE_DISPLAY, oldScoreDisplay, scoreDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QcmpresentationPackage.RESULT_PAGE__SHOW_DETAILED_FEEDBACK:
				return isShowDetailedFeedback();
			case QcmpresentationPackage.RESULT_PAGE__SHOW_CORRECT_ANSWERS:
				return isShowCorrectAnswers();
			case QcmpresentationPackage.RESULT_PAGE__SCORE_DISPLAY:
				return getScoreDisplay();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QcmpresentationPackage.RESULT_PAGE__SHOW_DETAILED_FEEDBACK:
				setShowDetailedFeedback((Boolean)newValue);
				return;
			case QcmpresentationPackage.RESULT_PAGE__SHOW_CORRECT_ANSWERS:
				setShowCorrectAnswers((Boolean)newValue);
				return;
			case QcmpresentationPackage.RESULT_PAGE__SCORE_DISPLAY:
				setScoreDisplay((ScoreDisplayType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QcmpresentationPackage.RESULT_PAGE__SHOW_DETAILED_FEEDBACK:
				setShowDetailedFeedback(SHOW_DETAILED_FEEDBACK_EDEFAULT);
				return;
			case QcmpresentationPackage.RESULT_PAGE__SHOW_CORRECT_ANSWERS:
				setShowCorrectAnswers(SHOW_CORRECT_ANSWERS_EDEFAULT);
				return;
			case QcmpresentationPackage.RESULT_PAGE__SCORE_DISPLAY:
				setScoreDisplay(SCORE_DISPLAY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QcmpresentationPackage.RESULT_PAGE__SHOW_DETAILED_FEEDBACK:
				return showDetailedFeedback != SHOW_DETAILED_FEEDBACK_EDEFAULT;
			case QcmpresentationPackage.RESULT_PAGE__SHOW_CORRECT_ANSWERS:
				return showCorrectAnswers != SHOW_CORRECT_ANSWERS_EDEFAULT;
			case QcmpresentationPackage.RESULT_PAGE__SCORE_DISPLAY:
				return scoreDisplay != SCORE_DISPLAY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (showDetailedFeedback: ");
		result.append(showDetailedFeedback);
		result.append(", showCorrectAnswers: ");
		result.append(showCorrectAnswers);
		result.append(", scoreDisplay: ");
		result.append(scoreDisplay);
		result.append(')');
		return result.toString();
	}

} //ResultPageImpl
