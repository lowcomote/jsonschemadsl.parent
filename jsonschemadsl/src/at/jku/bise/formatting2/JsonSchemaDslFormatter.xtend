/*
 * generated by Xtext 2.23.0
 */
package at.jku.bise.formatting2

import at.jku.bise.services.JsonSchemaDslGrammarAccess
import com.google.inject.Inject
import jsonMetaschemaMM.JsonSchema
import jsonMetaschemaMM.ObjectSchema
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class JsonSchemaDslFormatter extends AbstractFormatter2 {
	
	@Inject extension JsonSchemaDslGrammarAccess

	def dispatch void format(JsonSchema jsonSchema, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		jsonSchema.schema.format
	}

	def dispatch void format(ObjectSchema objectSchema, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (keywordDefinition : objectSchema.keywordDefinition) {
			keywordDefinition.format
		}
	}
	
	// TODO: implement for EnumSchemaDefinition, AnyOfSchemaDefinition, ItemsSchemaDefinition, DefaultSchemaDefinition, ThenSchemaDefinition, MinLengthSchemaDefinition, DefinitionsSchemaDefinition, MinItemsSchemaDefinition, OneOfSchemaDefinition, MaxPropertiesSchemaDefinition, MaxItemsSchemaDefinition, TypeSchemaDefinition, AdditionalPropertiesSchemaDefinition, ElseSchemaDefinition, ConstSchemaDefinition, DependenciesSchemaDefinition, RequiredSchemaDefinition, MinPropertiesSchemaDefinition, PatternPropertiesSchemaDefinition, AdditionalItemsSchemaDefinition, KeyValuePair, ExamplesSchemaDefinition, IfSchemaDefinition, AllOfSchemaDefinition, ContainsSchemaDefinition, NotSchemaDefinition, MaxLengthSchemaDefinition, PropertiesSchemaDefinition, PropertyNamesSchemaDefinition, JsonDocument, ObjectValue, ArrayValue, SchemaArray, KeySchemaPair, DependenciesAnyOf, KeyStringArrayPair
}
