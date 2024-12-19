/**
 */
package qcmpresentation;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcmpresentation.Page#getHeader <em>Header</em>}</li>
 *   <li>{@link qcmpresentation.Page#getCssClass <em>Css Class</em>}</li>
 * </ul>
 *
 * @see qcmpresentation.QcmpresentationPackage#getPage()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='headerNotEmpty'"
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see qcmpresentation.QcmpresentationPackage#getPage_Header()
	 * @model
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link qcmpresentation.Page#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

	/**
	 * Returns the value of the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Css Class</em>' attribute.
	 * @see #setCssClass(String)
	 * @see qcmpresentation.QcmpresentationPackage#getPage_CssClass()
	 * @model
	 * @generated
	 */
	String getCssClass();

	/**
	 * Sets the value of the '{@link qcmpresentation.Page#getCssClass <em>Css Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Css Class</em>' attribute.
	 * @see #getCssClass()
	 * @generated
	 */
	void setCssClass(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='header.size() &gt; 0'"
	 * @generated
	 */
	boolean headerNotEmpty(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Page
