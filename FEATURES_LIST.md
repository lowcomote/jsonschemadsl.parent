# Features list

In the following table we show the list of the keywords defined in the Metaschema Draft 07.
We support all the keywords in the JSON Schema Editor, as shown in the column JSON Schema Editor.
In the column Language Editor Generation we show which keywords are supported to generate a language so far. Of course this is a work in progress.
We have started the implementation from a subset of keywords that allow to define a minimal structure (e.g., "type", "properties", "definitions",...).
In the column of Comments, we explain which keywords are not needed, because they are just annotations with no influence on the language as stated in
JSON  Schema specifications. We also explain which ones are easy, because similar to the already implemented "minimum" keyword.

In conclusion we can edit and validate every JSON Schema, but we can automatically generate a language only for JSON Schema that don't use
the keywords with N in the column Language Editor Generation, or that are not needed as stated in the column of Comments

The are two keywords, "type" and "items", that support two different structure. Only one of the two structures for "type" and one of the 
two structures for "items" are supported. Because of this, in the column Language Editor Generation they are marked with P (Partial).

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
|"type"                |Y                    |Y                         | e.g., "type":"object", "type":"array", .... |
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
