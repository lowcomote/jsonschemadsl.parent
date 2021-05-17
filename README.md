# JSON Schema DSL

JSON Schema DSL aims at bridging [JSON Schema](https://json-schema.org/) to Model Driven Engineering Technical Space.

## Introduction

JSON Schema DSL is for language engineers, tools providers, and domain experts, used to work with JSON and JSON Schema, 
who want to improve editing and validation introducing Low Code capabilities, but a the same time keeping the approach transparent to JSONware users by
preserving the native JSON concrete syntax, and by this, compatibility with existing JSON-based tools.

JSON Schema DSL is an editor for both JSON Schemas and its instances,
that leverages the benefits of the state of the art of MDE practices, without any impact on the JSON textual syntax. 

Unlike existing [JSON Schema implementations](https://json-schema.org/implementations.html), 
our project offers the possibility to easily create custom Graphical User Interfaces and make them available in the web with technologies like Sirius Web; it helps
to show differences across different versions of the same JSON Schema (with EMF compare), identifying (non) breaking changes; it can better deal with co-evolution, being possible to create automatic transformation 
to make JSON of old JSON Schema versions, conforming to new JSON Schema versions.  
 

## Installation

Follow installation guide in  [JSchema DSL Installation](tutorials/JSchemaDSLInstallationTutorial.pdf)


## JSON Schema DSL Examples.
Once you have complete the installation, you can open it and start working.

In the folder /samples/shipyardSchemas,  different versions of the [Shipyard](https://github.com/keptn/spec/blob/master/shipyard.md) JSON Schema can be found.
As a practice, a new simple project can be created for each version in the installed Eclipse .  Create a new file inside it, with the same name and extension (.jschema). You will asked 
if you want to convert your project in an Xtext project. Click Yes.

![Convert To Xtext Question](tutorials/img/convertXtextPropject.PNG)  

Copy the content of the file you chose in the newly created file. You will see the keyword highlighted, the in line validation errors and warnings. 
Open the Eclipse problems view to see the details of both error and warnings.  In the figure below you can see the example shipyardV1.jschema with an error (not gently reported) 
due to the "$ref" keywords have a wrong JSON Pointer, and two warnings. 

![ShipyardV1](tutorials/img/shipyardV1.PNG) 


Repeating the steps for shipyadV4.jschema you will see that everything is correct, with no errors or warnings.

![ShipyardV4](tutorials/img/shipyardV4.PNG) 


In this last case, when you saved the file, a folder model has been created with the genertated artifacts (shipyardV4.jsongrammar, shipyardV4.xmi, shipyardV4Opt.ecore). 
To see them, maybe the folder model has to be refreshed. Under the root project folder, a fourth artifact (shipyardV4Opt.ocl) has been created. Maybe the project folder need to be refreshed to see it.
If you open the ocl file, it will report error, because the generated ecore metamodel has not been registered.  
To do this, switch to the ATL perspective, then right click on the generated ecore metamodel and select "Register Metamodel". If you had already opened the ocl file, you have to close and open it again.
Maybe it takes some time to synch. But it does not matter, because it will be registered by the language that is going to be generated, as described in the next step.


Try to create a new project from scratch, to test the content assist (CTRL+space). To test code completion, remind that every keyword start with double quotes ("). 

## Language generation

Once as a Language Engineer, you fixed all the errors, and you are satisfied with the generated ecore metamodel, you can generate the editor for the language defined by the .jschema artifact.
To achieve this, follow the steps described in [Language Editor generator](tutorials/LanguageEditorGeneration.pdf).

Once generated the the language, and launched the runtime as explained in the Language Editior Generation tutorial, you can create your instances conforming to the .jschema.
Create a new sample project in the runtime Eclipse, create in it a new file with the extension of the language (e.g., .shipyardV4), answer Yes when asked if you want to convert it to an Xtext project,
open the file, and you have available the content assist and the validation for the generated language.
If you created the editor for shipyardV4, you can try two samples available in the folder /samples/shipyardSchemas/shipyardV4/instanceExamples.
The [Language Editor generator](tutorials/LanguageEditorGeneration.pdf) tutorial, also explain how to open an instance with the Reflective Editor, and see an instance as a model.


