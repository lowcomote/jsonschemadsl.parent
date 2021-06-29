# Features list

In the following table we show the list of the keywords defined in the Metaschema Draft 07.
We support all the keywords in the JSON Schema Editor, as shown in the column JSON Schema Editor.
In the column Language Editor Generation we show which keywords are supported to generate a language so far. Of course this is a work in progress.
We have limited the implementation only to the keywords used in the "Shipyard" JSON Schema (our case study).
In the column of Comments, we explain which keywords are not needed, because they are just annotations with no influence on the language as stated in
JSON  Schema specifications. We also explain which ones are easy, because similar to the already implemented "minimum" keyword.

In conclusion we can edit and validate every JSON Schema, but we can automatically generate a language only for JSON Schema that don't use
the keywords with N in the column Language Editor Generation, or that are not needed as stated in the column of Comments

The are two keywords, "type" and "items", that support two different structure. Only one of the two structures for "type" and one of the 
two structures for "items" are supported. Because of this, in the column Language Editor Generation they are marked with P (Partial).

|Keyword               |JSON Schema Editor   |Language Editor Generation| Comment|
|----------------------|---------------------|--------------------------|--------
|"$id"                 |Y                    |N                         |Not needed to generate the language. It is an annotation|
|"$schema"             |Y                    |N                         |Not needed to generate the language. It is an annotation|
|"$ref"                |Y                    |Y                         ||
|"$comment             |Y                    |N                         |Not needed to generate the language. It is an annotation|
|"title"               |Y                    |N                         |Not needed to generate the language. It is an annotation|
|"description"         |Y                    |N                         |Not needed to generate the language. It is an annotation|
|"default"             |Y                    |N                         |Not needed to generate the language. It is an annotation|
|"readOnly"            |Y                    |N                         ||
|"writeOnly"           |Y                    |N                         ||
|"examples"            |Y                    |N                         |Not needed to generate the language. It is an annotation|
|"multipleOf"          |Y                    |N                         |Easy to solve with OCL as done for "minimum"|
|"maximum"             |Y                    |N                         |Easy to solve with OCL as done for "minimum"|
|"exclusiveMaximum"    |Y                    |N                         |Easy to solve with OCL as done for "minimum"|
|"minimum":            |Y                    |Y                         | |
|"exclusiveMinimum"    |Y                    |N                         |Easy to solve with OCL as done for "minimum"|
|"maxLength"           |Y                    |N                         |Easy to solve with OCL as done for "minimum"|
|"minLength"           |Y                    |N                         |Easy to solve with OCL as done for "minimum"|
|"pattern"             |N                    |N                         |Solvable with an Eoperation that check if it is a regex|
|"additionalItems"     |Y                    |N                         ||
|"items"               |Y                    |P  Schema Array Not. Supp.||
|"maxItems"            |Y                    |N                         |Easy to solve with OCL as done for "minimum"|
|"minItems"            |Y                    |N                         |Easy to solve with OCL as done for "minimum"|
|"uniqueItems"         |Y                    |N                         ||
|"contains"            |Y                    |N                         ||
|"maxProperties"       |Y                    |N                         |Easy to solve with OCL as done for "minimum"|
|"minProperties"       |Y                    |N                         |Easy to solve with OCL as done for "minimum"|
|"required"            |Y                    |P (Only for "properties") ||
|"additionalProperties"|Y                    |Y                         | |
|"definitions"         |Y                    |Y                         | |
|"properties"          |Y                    |Y                         | |
|"patternProperties"   |Y                    |Y                         | |
|"dependencies"        |Y                    |N                         ||
|"propertyNames"       |Y                    |N                         ||
|"const"               |Y                    |N                         ||
|"enum"                |Y                    |N                         ||
|"type"                |Y                    |P Array of types Not Supp.| e.g., "type":["integer", string]|
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
