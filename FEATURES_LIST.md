# Features list

In the following table we show the list of the keywords defined in the Metaschema Draft 07.
We support all the keywords for the JSON Schema Editor.
In the column Language Editor Generation we show which keywords are supported for language generation. Of course, currently our tool is a prototype (work in progress).
In the Comments column, we provide some information about how keywords are mapped. 

In conclusion we can edit and validate every JSON Schema, but we can automatically generate a language only for JSON Schema that don't use
the keywords with N in the column Language Editor Generation, or that are not needed as stated in the column of Comments

|Keyword               |JSON Schema Editor   |Language Editor Generation| Comment|
|----------------------|---------------------|--------------------------|--------
|"$id"                 |Y                    |Y                         |Ecore annotation|
|"$schema"             |Y                    |Y                         |Ecore annotation|
|"$ref" (json pointer) |Y                    |Y                         |URI validation not available yet| 
|"$ref"   ($id)        |Y                    |N                         ||
|"$comment             |Y                    |Y                         |Ecore annotation|
|"title"               |Y                    |Y                         |Ecore annotation|
|"description"         |Y                    |Y                         |Ecore annotation|
|"default"             |Y                    |Y                         |Ecore annotation|
|"readOnly"            |Y                    |Y                         |Ecore annotation|
|"writeOnly"           |Y                    |Y                         |Ecore annotation|
|"examples"            |Y                    |Y                         |Ecore annotation|
|"multipleOf"          |Y                    |Y                         |OCL constraint|
|"maximum"             |Y                    |Y                         |OCL constraint|
|"exclusiveMaximum"    |Y                    |Y                         |OCL constraint|
|"minimum":            |Y                    |Y                         |OCL constraint|
|"exclusiveMinimum"    |Y                    |Y                         |OCL constraint|
|"maxLength"           |Y                    |Y                         |OCL constraint|
|"minLength"           |Y                    |Y                         |OCL constraint|
|"pattern"             |Y                    |Y                         |EOperation that check if it is a regex|
|"additionalItems"     |Y                    |Y                         ||
|"items" (List)        |Y                    |Y                         ||
|"items" (Tuple)       |Y                    |Y                         ||
|"maxItems"            |Y                    |Y                         |Ecore upper bound and OCL constraint|
|"minItems"            |Y                    |Y                         |Ecore lower bound and OCL constraint|
|"uniqueItems"         |Y                    |N                         ||
|"contains"            |Y                    |N                         ||
|"maxProperties"       |Y                    |Y                         |Ecore upper bound and OCL constraint|
|"minProperties"       |Y                    |Y                         |Ecore lower bound and OCL constraint|
|"required"(properties)|Y                    |Y                         ||
|"required"(patt.prop.)|Y                    |Y                         ||
|"required"(add. prop.)|Y                    |Y                         ||
|"additionalProperties"|Y                    |Y                         | |
|"definitions"         |Y                    |Y                         | |
|"properties"          |Y                    |Y                         | |
|"patternProperties"   |Y                    |Y                         | |
|"dependencies"        |Y                    |Y                         ||
|"propertyNames"       |Y                    |N                         ||
|"const"               |Y                    |Y                         | XText validator|
|"enum"                |Y                    |Y                         | XText validator|
|"type"="integer"      |Y                    |Y                         ||
|"type"="number"       |Y                    |Y                         ||
|"type"="boolean"      |Y                    |Y                         ||
|"type"="string"       |Y                    |Y                         ||
|"type"="object"       |Y                    |Y                         ||
|"type"="array"        |Y                    |Y                         ||
|"type"="null"         |Y                    |Y                         ||
|"type" not present    |Y                    |Y                         | the case wher type is not specified |
|"type"(array of types)|Y                    |Y                         | e.g., "type":["integer", string]|
|"format"              |Y                    |N                         ||
|"contentMediaType"    |Y                    |N                         ||
|"contentEncoding"     |Y                    |N                         ||
|"if"                  |Y                    |Y                         |Sub grammars + XText validator|
|"then"                |Y                    |Y                         |Sub grammars + XText validator|
|"else"                |Y                    |Y                         |Sub grammars + XText validator|
|"allOf"               |Y                    |Y                         |Sub grammars + XText validator|
|"anyOf"               |Y                    |Y                         |Sub grammars + XText validator|
|"oneOf"               |Y                    |Y                         |Sub grammars + XText validator|
|"not"                 |Y                    |Y                         |Sub grammars + XText validator|

Legend:  
Y -> Supported  
N -> Not Supported  
