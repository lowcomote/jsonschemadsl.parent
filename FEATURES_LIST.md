# Features list

In the following table we show the list of the keywords defined in the Metaschema Draft 07.
We support all the keywords except one ("pattern") in the JSON Schema Editor, as shown in the column JSON Schema Editor.
In the column Language Editor Generation we show which keywords are supported for language generation. Of course, currently our tool is a prototype (work in progress).
We have started the implementation from the keywords that we saw as the kernel of the Metaschema language (e.g., "type", "properties", "definitions")
In the Comments column, we provide some info about how we are going to implement the generation. 

In conclusion we can edit and validate every JSON Schema, but we can automatically generate a language only for JSON Schema that don't use
the keywords with N in the column Language Editor Generation, or that are not needed as stated in the column of Comments

|Keyword               |JSON Schema Editor   |Language Editor Generation| Comment|
|----------------------|---------------------|--------------------------|--------
|"$id"                 |Y                    |N                         | |
|"$schema"             |Y                    |N                         |It will be converted as an annotation|
|"$ref" (json pointer) |Y                    |Y                         ||
|"$ref"   ($id)        |Y                    |N                         ||
|"$comment             |Y                    |N                         |It will be converted as an annotation|
|"title"               |Y                    |N                         |It will be converted as an annotation|
|"description"         |Y                    |N                         |It will be converted as an annotation|
|"default"             |Y                    |N                         ||
|"readOnly"            |Y                    |N                         ||
|"writeOnly"           |Y                    |N                         ||
|"examples"            |Y                    |N                         ||
|"multipleOf"          |Y                    |N                         |Generate an OCL constraint (like "minimum")|
|"maximum"             |Y                    |N                         |Generate an OCL constraint (like "minimum")|
|"exclusiveMaximum"    |Y                    |N                         |Generate an OCL constraint (like "minimum")|
|"minimum":            |Y                    |Y                         | |
|"exclusiveMinimum"    |Y                    |N                         |Generate an OCL constraint (like "minimum")|
|"maxLength"           |Y                    |N                         |Generate an OCL constraint (like "minimum")|
|"minLength"           |Y                    |N                         |Generate an OCL constraint (like "minimum")|
|"pattern"             |N                    |N                         |Create an EOperation that check if it is a regex|
|"additionalItems"     |Y                    |N                         ||
|"items" (List)        |Y                    |Y                         ||
|"items" (Tuple        |Y                    |N                         ||
|"maxItems"            |Y                    |N                         |Generate an OCL constraint (like "minimum")|
|"minItems"            |Y                    |N                         |Generate an OCL constraint (like "minimum")|
|"uniqueItems"         |Y                    |N                         ||
|"contains"            |Y                    |N                         ||
|"maxProperties"       |Y                    |N                         |Generate an OCL constraint (like "minimum")|
|"minProperties"       |Y                    |N                         |Generate an OCL constraint (like "minimum")|
|"required"(properties)|Y                    |Y                         ||
|"required"(patt.prop.)|Y                    |N                         ||
|"required"(add. prop.)|Y                    |N                         ||
|"additionalProperties"|Y                    |Y                         | |
|"definitions"         |Y                    |Y                         | |
|"properties"          |Y                    |Y                         | |
|"patternProperties"   |Y                    |Y                         | |
|"dependencies"        |Y                    |N                         ||
|"propertyNames"       |Y                    |N                         ||
|"const"               |Y                    |N                         ||
|"enum"                |Y                    |N                         ||
|"type"="integer"      |Y                    |Y                         ||
|"type"="number"       |Y                    |Y                         ||
|"type"="boolean"      |Y                    |Y                         ||
|"type"="string"       |Y                    |Y                         ||
|"type"="object"       |Y                    |Y                         ||
|"type"="array"        |Y                    |Y                         ||
|"type"="null"         |Y                    |N                         ||
|"type" not present    |Y                    |N                         | the case wher type is not specified |
|"type"(array of types)|Y                    |N                         | e.g., "type":["integer", string]|
|"format"              |Y                    |N                         ||
|"contentMediaType"    |Y                    |N                         ||
|"contentEncoding"     |Y                    |N                         ||
|"if"                  |Y                    |N                         ||
|"then"                |Y                    |N                         ||
|"else"                |Y                    |N                         ||
|"allOf"               |Y                    |N                         ||
|"anyOf"               |Y                    |N                         ||
|"oneOf"               |Y                    |N                         ||
|"not"                 |Y                    |N                         ||

Legend:  
Y -> Supported  
N -> Not Supported  
