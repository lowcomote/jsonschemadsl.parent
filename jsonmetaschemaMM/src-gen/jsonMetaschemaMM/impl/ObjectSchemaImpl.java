/**
 */
package jsonMetaschemaMM.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import jsonMetaschemaMM.AdditionalItemsSchemaDefinition;
import jsonMetaschemaMM.AdditionalPropertiesSchemaDefinition;
import jsonMetaschemaMM.AllOfSchemaDefinition;
import jsonMetaschemaMM.AnyOfSchemaDefinition;
import jsonMetaschemaMM.ContainsSchemaDefinition;
import jsonMetaschemaMM.DefinitionsSchemaDefinition;
import jsonMetaschemaMM.DependenciesSchemaDefinition;
import jsonMetaschemaMM.ElseSchemaDefinition;
import jsonMetaschemaMM.IfSchemaDefinition;
import jsonMetaschemaMM.ItemsSchemaDefinition;
import jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.KeywordDefinition;
import jsonMetaschemaMM.NotSchemaDefinition;
import jsonMetaschemaMM.ObjectSchema;
import jsonMetaschemaMM.OneOfSchemaDefinition;
import jsonMetaschemaMM.PatternPropertiesSchemaDefinition;
import jsonMetaschemaMM.PropertiesSchemaDefinition;
import jsonMetaschemaMM.PropertyNamesSchemaDefinition;
import jsonMetaschemaMM.Schema;
import jsonMetaschemaMM.SchemaObjectAdditionalProperties;
import jsonMetaschemaMM.ThenSchemaDefinition;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getKeywordDefinition <em>Keyword Definition</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getAdditionalItems <em>Additional Items</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getItems <em>Items</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getAdditionalProperties <em>Additional Properties</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getPatternProperties <em>Pattern Properties</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getPropertyNames <em>Property Names</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getIf <em>If</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getThen <em>Then</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getElse <em>Else</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getAllOf <em>All Of</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getAnyOf <em>Any Of</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getOneOf <em>One Of</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getNot <em>Not</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getSchemaObjectAdditionalProperties <em>Schema Object Additional Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectSchemaImpl extends SchemaImpl implements ObjectSchema {
	/**
	 * The cached value of the '{@link #getKeywordDefinition() <em>Keyword Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywordDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<KeywordDefinition> keywordDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeywordDefinition> getKeywordDefinition() {
		if (keywordDefinition == null) {
			keywordDefinition = new EObjectContainmentEList<KeywordDefinition>(KeywordDefinition.class, this, JsonMetaschemaMMPackage.OBJECT_SCHEMA__KEYWORD_DEFINITION);
		}
		return keywordDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalItemsSchemaDefinition getAdditionalItems() {
		return (AdditionalItemsSchemaDefinition) getKeywordDefinition().stream().filter(kd -> kd instanceof AdditionalItemsSchemaDefinition).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemsSchemaDefinition getItems() {
		return (ItemsSchemaDefinition) getKeywordDefinition().stream().filter(kd -> kd instanceof ItemsSchemaDefinition).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalPropertiesSchemaDefinition getAdditionalProperties() {
		return (AdditionalPropertiesSchemaDefinition) getKeywordDefinition().stream().filter(kd -> kd instanceof AdditionalPropertiesSchemaDefinition).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainsSchemaDefinition getContains() {
		return (ContainsSchemaDefinition) getKeywordDefinition().stream().filter(kd -> kd instanceof ContainsSchemaDefinition).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertiesSchemaDefinition getProperties() {
		return (PropertiesSchemaDefinition) getKeywordDefinition().stream().filter(kd -> kd instanceof PropertiesSchemaDefinition).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionsSchemaDefinition getDefinitions() {
		return (DefinitionsSchemaDefinition) getKeywordDefinition().stream().filter(kd -> kd instanceof DefinitionsSchemaDefinition).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatternPropertiesSchemaDefinition getPatternProperties() {
		return (PatternPropertiesSchemaDefinition) getKeywordDefinition().stream().filter(kd -> kd instanceof PatternPropertiesSchemaDefinition).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependenciesSchemaDefinition getDependencies() {
		return (DependenciesSchemaDefinition) getKeywordDefinition().stream().filter(kd -> kd instanceof DependenciesSchemaDefinition).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyNamesSchemaDefinition getPropertyNames() {
		return (PropertyNamesSchemaDefinition) getKeywordDefinition().stream().filter(kd -> kd instanceof PropertyNamesSchemaDefinition).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfSchemaDefinition getIf() {
		return (IfSchemaDefinition) getKeywordDefinition().stream().filter(kd -> kd instanceof IfSchemaDefinition).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThenSchemaDefinition getThen() {
		return (ThenSchemaDefinition) getKeywordDefinition().stream().filter(kd -> kd instanceof ThenSchemaDefinition).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElseSchemaDefinition getElse() {
		return (ElseSchemaDefinition) getKeywordDefinition().stream().filter(kd -> kd instanceof ElseSchemaDefinition).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllOfSchemaDefinition getAllOf() {
		return (AllOfSchemaDefinition) getKeywordDefinition().stream().filter(kd -> kd instanceof AllOfSchemaDefinition).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnyOfSchemaDefinition getAnyOf() {
		return (AnyOfSchemaDefinition) getKeywordDefinition().stream().filter(kd -> kd instanceof AnyOfSchemaDefinition).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OneOfSchemaDefinition getOneOf() {
		return (OneOfSchemaDefinition) getKeywordDefinition().stream().filter(kd -> kd instanceof OneOfSchemaDefinition).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotSchemaDefinition getNot() {
		return (NotSchemaDefinition) getKeywordDefinition().stream().filter(kd -> kd instanceof NotSchemaDefinition).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetNot() {
		// TODO: implement this method to return whether the 'Not' reference is set
		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
		return getNot()!=null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SchemaObjectAdditionalProperties> getSchemaObjectAdditionalProperties() {
		return new org.eclipse.emf.common.util.BasicEList<SchemaObjectAdditionalProperties>((Collection<? extends SchemaObjectAdditionalProperties>) getKeywordDefinition().stream().filter(kd -> kd instanceof SchemaObjectAdditionalProperties).collect(java.util.stream.Collectors.toList()))  ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema findSchemaByKey(final String key) {
		return getSchemaObjectAdditionalProperties().stream().filter(s -> key.equals(s.getKey())).findFirst().map(SchemaObjectAdditionalProperties::getAdditionalProperties).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema findSchemaByJsonPointer(final EList<String> jsonPointer, final int currentIndex) {
		Schema schema = null;
		if(currentIndex==jsonPointer.size()) {
			schema=this;
		}else if(0 <= currentIndex && currentIndex < jsonPointer.size()) {
			String currentToken = jsonPointer.get(currentIndex);
			Integer nextIndex= currentIndex +1;
			Schema nextSchema = null;
			if("additionalItems".equals(currentToken)) {
				nextSchema = getAdditionalItems().getAdditionalItems();
			}else if ("items".equals(currentToken)) {
				if(getItems().getAnyOf() instanceof jsonMetaschemaMM.ItemsAnyOf1) {
					nextSchema= ((jsonMetaschemaMM.ItemsAnyOf1)getItems().getAnyOf()).getAnyOf1();
				}else { // getItems().getAnyOf() instanceof jsonMetaschemaMM.ItemsAnyOf2
					nextSchema = ((jsonMetaschemaMM.ItemsAnyOf2)getItems().getAnyOf()).getAnyOf2().findSchemaByIndex(Integer.parseInt(jsonPointer.get(nextIndex)));
					nextIndex++;
				}
			}else if ("additionalProperties".equals(currentToken)) {
				nextSchema = getAdditionalProperties().getAdditionalProperties();
			}else if ("contains".equals(currentToken)) {
				nextSchema = getContains().getContains();
			}else if ("definitions".equals(currentToken)) {
				if(nextIndex <jsonPointer.size()) {
					nextSchema = getDefinitions().findSchemaByKey("\""+jsonPointer.get(nextIndex)+"\"");
					nextIndex++;
				}
			}else if ("properties".equals(currentToken)) {
				if(nextIndex <jsonPointer.size()) {
					nextSchema = getProperties().findSchemaByKey("\""+jsonPointer.get(nextIndex)+"\"");
					nextIndex++;
				}
			}else if ("patternProperties".equals(currentToken)) {
				if(nextIndex <jsonPointer.size()) {
					nextSchema = getPatternProperties().findSchemaByKey("\""+jsonPointer.get(nextIndex)+"\"");
					nextIndex++;
				}
			}else if ("dependencies".equals(currentToken)) {
				if(nextIndex <jsonPointer.size()) {
					nextSchema = getDependencies().findSchemaByKey("\""+jsonPointer.get(nextIndex)+"\"");
					nextIndex++;
				}
			}else if ("propertyNames".equals(currentToken)) {
				nextSchema = getPropertyNames().getPropertyNames();
			}else if ("if".equals(currentToken)) {
				nextSchema = getIf().getIf();
			}else if ("then".equals(currentToken)) {
				nextSchema = getThen().getThen();
			}else if ("else".equals(currentToken)) {
				nextSchema = getElse().getElse();
			}else if ("allOf".equals(currentToken)) {
				nextSchema = getAllOf().getAllOf().findSchemaByIndex(Integer.parseInt(jsonPointer.get(nextIndex)));
				nextIndex++;
			}else if ("anyOf".equals(currentToken)) {
				nextSchema = getAnyOf().getAnyOf().findSchemaByIndex(Integer.parseInt(jsonPointer.get(nextIndex)));
				nextIndex++;
			}else if ("oneOf".equals(currentToken)) {
				nextSchema = getOneOf().getOneOf().findSchemaByIndex(Integer.parseInt(jsonPointer.get(nextIndex)));
				nextIndex++;
			}else if ("not".equals(currentToken)) {
				nextSchema = getNot().getNot();
			}else {
				nextSchema = findSchemaByKey(currentToken);
			}
											
			if(nextSchema!=null) {
				schema = nextSchema.findSchemaByJsonPointer(jsonPointer, nextIndex);
			}
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__KEYWORD_DEFINITION:
				return ((InternalEList<?>)getKeywordDefinition()).basicRemove(otherEnd, msgs);
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
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__KEYWORD_DEFINITION:
				return getKeywordDefinition();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__ADDITIONAL_ITEMS:
				return getAdditionalItems();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__ITEMS:
				return getItems();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__ADDITIONAL_PROPERTIES:
				return getAdditionalProperties();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__CONTAINS:
				return getContains();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__PROPERTIES:
				return getProperties();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__DEFINITIONS:
				return getDefinitions();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__PATTERN_PROPERTIES:
				return getPatternProperties();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__DEPENDENCIES:
				return getDependencies();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__PROPERTY_NAMES:
				return getPropertyNames();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__IF:
				return getIf();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__THEN:
				return getThen();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__ELSE:
				return getElse();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__ALL_OF:
				return getAllOf();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__ANY_OF:
				return getAnyOf();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__ONE_OF:
				return getOneOf();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__NOT:
				return getNot();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__SCHEMA_OBJECT_ADDITIONAL_PROPERTIES:
				return getSchemaObjectAdditionalProperties();
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
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__KEYWORD_DEFINITION:
				getKeywordDefinition().clear();
				getKeywordDefinition().addAll((Collection<? extends KeywordDefinition>)newValue);
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
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__KEYWORD_DEFINITION:
				getKeywordDefinition().clear();
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
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__KEYWORD_DEFINITION:
				return keywordDefinition != null && !keywordDefinition.isEmpty();
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__ADDITIONAL_ITEMS:
				return getAdditionalItems() != null;
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__ITEMS:
				return getItems() != null;
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__ADDITIONAL_PROPERTIES:
				return getAdditionalProperties() != null;
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__CONTAINS:
				return getContains() != null;
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__PROPERTIES:
				return getProperties() != null;
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__DEFINITIONS:
				return getDefinitions() != null;
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__PATTERN_PROPERTIES:
				return getPatternProperties() != null;
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__DEPENDENCIES:
				return getDependencies() != null;
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__PROPERTY_NAMES:
				return getPropertyNames() != null;
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__IF:
				return getIf() != null;
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__THEN:
				return getThen() != null;
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__ELSE:
				return getElse() != null;
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__ALL_OF:
				return getAllOf() != null;
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__ANY_OF:
				return getAnyOf() != null;
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__ONE_OF:
				return getOneOf() != null;
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__NOT:
				return getNot() != null;
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__SCHEMA_OBJECT_ADDITIONAL_PROPERTIES:
				return !getSchemaObjectAdditionalProperties().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA___FIND_SCHEMA_BY_KEY__STRING:
				return findSchemaByKey((String)arguments.get(0));
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA___FIND_SCHEMA_BY_JSON_POINTER__ELIST_INT:
				return findSchemaByJsonPointer((EList<String>)arguments.get(0), (Integer)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ObjectSchemaImpl
