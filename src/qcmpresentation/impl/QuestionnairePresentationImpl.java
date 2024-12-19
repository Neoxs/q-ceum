/**
 */
package qcmpresentation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qcmpresentation.QcmpresentationPackage;
import qcmpresentation.QuestionPage;
import qcmpresentation.QuestionnairePresentation;
import qcmpresentation.ResultPage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qcmpresentation.impl.QuestionnairePresentationImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link qcmpresentation.impl.QuestionnairePresentationImpl#isShowProgressBar <em>Show Progress Bar</em>}</li>
 *   <li>{@link qcmpresentation.impl.QuestionnairePresentationImpl#isEnableBackNavigation <em>Enable Back Navigation</em>}</li>
 *   <li>{@link qcmpresentation.impl.QuestionnairePresentationImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link qcmpresentation.impl.QuestionnairePresentationImpl#getResultPage <em>Result Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnairePresentationImpl extends MinimalEObjectImpl.Container implements QuestionnairePresentation {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowProgressBar() <em>Show Progress Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowProgressBar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_PROGRESS_BAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowProgressBar() <em>Show Progress Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowProgressBar()
	 * @generated
	 * @ordered
	 */
	protected boolean showProgressBar = SHOW_PROGRESS_BAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableBackNavigation() <em>Enable Back Navigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableBackNavigation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_BACK_NAVIGATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableBackNavigation() <em>Enable Back Navigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableBackNavigation()
	 * @generated
	 * @ordered
	 */
	protected boolean enableBackNavigation = ENABLE_BACK_NAVIGATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionPage> pages;

	/**
	 * The cached value of the '{@link #getResultPage() <em>Result Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultPage()
	 * @generated
	 * @ordered
	 */
	protected ResultPage resultPage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnairePresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QcmpresentationPackage.Literals.QUESTIONNAIRE_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowProgressBar() {
		return showProgressBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowProgressBar(boolean newShowProgressBar) {
		boolean oldShowProgressBar = showProgressBar;
		showProgressBar = newShowProgressBar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__SHOW_PROGRESS_BAR, oldShowProgressBar, showProgressBar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableBackNavigation() {
		return enableBackNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableBackNavigation(boolean newEnableBackNavigation) {
		boolean oldEnableBackNavigation = enableBackNavigation;
		enableBackNavigation = newEnableBackNavigation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__ENABLE_BACK_NAVIGATION, oldEnableBackNavigation, enableBackNavigation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuestionPage> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<QuestionPage>(QuestionPage.class, this, QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultPage getResultPage() {
		return resultPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultPage(ResultPage newResultPage, NotificationChain msgs) {
		ResultPage oldResultPage = resultPage;
		resultPage = newResultPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__RESULT_PAGE, oldResultPage, newResultPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultPage(ResultPage newResultPage) {
		if (newResultPage != resultPage) {
			NotificationChain msgs = null;
			if (resultPage != null)
				msgs = ((InternalEObject)resultPage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__RESULT_PAGE, null, msgs);
			if (newResultPage != null)
				msgs = ((InternalEObject)newResultPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__RESULT_PAGE, null, msgs);
			msgs = basicSetResultPage(newResultPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__RESULT_PAGE, newResultPage, newResultPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__RESULT_PAGE:
				return basicSetResultPage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__TITLE:
				return getTitle();
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__SHOW_PROGRESS_BAR:
				return isShowProgressBar();
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__ENABLE_BACK_NAVIGATION:
				return isEnableBackNavigation();
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__PAGES:
				return getPages();
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__RESULT_PAGE:
				return getResultPage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__TITLE:
				setTitle((String)newValue);
				return;
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__SHOW_PROGRESS_BAR:
				setShowProgressBar((Boolean)newValue);
				return;
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__ENABLE_BACK_NAVIGATION:
				setEnableBackNavigation((Boolean)newValue);
				return;
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends QuestionPage>)newValue);
				return;
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__RESULT_PAGE:
				setResultPage((ResultPage)newValue);
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
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__SHOW_PROGRESS_BAR:
				setShowProgressBar(SHOW_PROGRESS_BAR_EDEFAULT);
				return;
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__ENABLE_BACK_NAVIGATION:
				setEnableBackNavigation(ENABLE_BACK_NAVIGATION_EDEFAULT);
				return;
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__PAGES:
				getPages().clear();
				return;
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__RESULT_PAGE:
				setResultPage((ResultPage)null);
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
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__SHOW_PROGRESS_BAR:
				return showProgressBar != SHOW_PROGRESS_BAR_EDEFAULT;
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__ENABLE_BACK_NAVIGATION:
				return enableBackNavigation != ENABLE_BACK_NAVIGATION_EDEFAULT;
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__PAGES:
				return pages != null && !pages.isEmpty();
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION__RESULT_PAGE:
				return resultPage != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", showProgressBar: ");
		result.append(showProgressBar);
		result.append(", enableBackNavigation: ");
		result.append(enableBackNavigation);
		result.append(')');
		return result.toString();
	}

} //QuestionnairePresentationImpl
