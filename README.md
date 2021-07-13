 JSON Schema DSL


JSON Schema DSL is a model-driven language engineering approach for JSON Schema that aims at bridging [JSON Schema](https://json-schema.org/) and Ecore (see Eclipse Modeling Framework [EMF](https://www.eclipse.org/modeling/emf/). 
The approach is published at [MODELS 2021](https://conf.researchr.org/home/models-2021) [1]


[1] A. Colantoni, A. Garmendia, L. Berardinelli, and M. Wimmer, “Leveraging Model-Driven Technologies for JSON Artefacts: The Shipyard Case Study,” New York, NY, USA, 2021. doi: XYZ.


## Introduction


With JSON's increasing adoption, the need for structural constraints and validation capabilities led to JSON Schema, a dedicated meta-language to specify languages which are in turn used to validate JSON documents. 
The standardisation process of JSON Schema as well as the implementation of adequate tool support (e.g., validators and editors) are work in progress. 
The periodic issuing of newer JSON Schema drafts makes tool development challenging. Nevertheless, many JSON Schemas as language definitions exist, but JSON documents are still mostly edited in basic text-based editors.   


In order to tackle this challenge, we investigate in this paper how Model-Driven Engineering (MDE) methods for language engineering can help in this area. 
Instead of re-inventing the wheel of building up particular technologies directly for JSON, we investigate how the existing MDE infrastructures may be utilized for JSON. 
In particular, we present a bridge between the JSONware and modelware, chosing EMF as the reference target technical space, to exchange languages and documents. 


Based on this bridge, our approach helps 
- language engineers in defining new domain-specific languages (DSL) as schemas and, then, JSON Schema as meta-language (i.e., playing the same role of Ecore in EMF),
- domain experts in editing (i.e., modeling) and validating schema instances conforming to a given schema,
- tool providers in generating tool support like editors and validators for any JSON documents (i.e., metaschema drafts, schemas, and schema instances)


The approach is transparent to JSON users: it preservs the native JSON concrete syntax and, as a result, compatibility of resulting JSON artifacts (i.e., JSON models) with existing JSON-based and MDE-agnostic tools.


We evaluate our approach with Shipyard, a JSON Schema-based language for workflow specification for Keptn, an open source tool for DevOps automation of cloud-native applications.




## Installation


The latest version of the installation guide is available [here](tutorials/JSchemaDSLInstallationTutorial.pdf)




## Examples.
This section introduces a list of working examples. The list is continuously updated.


### Hello World examples. 
Trivial examples are available. Their are listed, together with their rationaleL in the following folders:
- [samples/schemavalidationtest](samples/schemavalidationtest/) have been used to [TODO]
- [samples/schemavalidationtest](samples/schemavalidationtest/) have been used to [TODO]
- ...


Such trivial examples will help you to understand the overall approach and its steps, as documented in [1]


### Shipyard DSL.
Shipyard, a JSON Schema-based language for workflow specification for [Keptn](https://keptn.sh/), an open source tool for DevOps automation  of  cloud-native  applications.  The  results  of  the  casestudy  show  that  proper  editors  as  well  as  language  evolutionsupport  from  MDE  can  be  reused  and  at  the  same  time,  thesurface  syntax  of  JSON  is  maintained. See [1] for further details.


Shipyard DSL versions are collected in [samples/shipyardSchemas/](samples/shipyardSchemas/) as collected from the Shipyard official [Keptn repository](https://github.com/keptn/spec/blob/master/shipyard.md)
The Shipyard DSL is defined by schema document, which, in turn, conforms to a given metaschema or JSON Schema Draft. We currently support [JSON Schema Draft 7](https://json-schema.org/).
In the following, we explain the approach steps applied to the Shipyard DSL.
The following steps (1-10) are expected to be performance by a Language Engineer, i.e., an user that, given a schema (.json), is able to create a language specification based on Eclipse EMF/Xtext.


#### Steps 1-6


1. Choose a Shipyard version among the ones made available (e.g., shipyardV1.json );
2. Create a Simple Project; 
3. Create a new file within the newly created Project with .jschema file extension (e.g. shipyardV1.jschema). 
4. You will be asked whether you want to convert your project in an Xtext project. Click Yes.


[Convert To Xtext Question](tutorials/img/convertXtextPropject.PNG)  


5. Copy the content Shipyard version chosen at step 1  in the newly created file. You will see the keywords highlighted, the in line validation errors and warnings. 
6. Open the  Problems view to see the details of both error and warnings.  In the figure below, you can see the example shipyardV1.jschema with an error due to mistyped "$ref"  value (it has to be a correct [JSON Pointer](https://datatracker.ietf.org/doc/html/rfc6901) string) , and two warnings. 


![ShipyardV1](tutorials/img/shipyardV1.PNG) 


We invite the reader to repeat steps 1. to 6. choosing the *shipyardV4.json* at step 1. 
At the end of step 6, everything will be correct, with no errors or warnings.


![ShipyardV4](tutorials/img/shipyardV4.PNG) 


*(after choosing shipyardV4.json at step 1)*

7. Save the shipyardV4.jschema. 
9. A folder /model will be created including the following artifacts: shipyardV4.jsongrammar, shipyardV4.xmi, shipyardV4Opt.ecore. If you do not see the /model folder or it is empty, please refresh the /model or the whole peoject folder. 

10. Under the root project folder, a fourth artifact (shipyardV4Opt.ocl) is created. Refresh the project folder if the OCL artifact does not appear. Open the ocl file. Fix the reported error by registering the ecore metamodel generated from the shipyardV4.jschema artifact. For registering the generated metamodel, switch to the ATL perspective, then right click on the generated ecore metamodel and select "Register Metamodel". If you had already opened the ocl file, you have to close and open it again.  Wait a while for the synchrnizaation process to be completed. 


(TODO: what is the meaning?)
Try to create a new project from scratch, to test the content assist (CTRL+space). To test code completion, remind that every keyword start with double quotes ("). 



## Tool support : DSL editor generation.

TODO: Once completed steps 1-10, the EMF/Xtext-based editor for the DSL defined by the .jschema artifact can be generated.

#### Steps 11-TODO
Split the following text in steps as did for steps 1-10

- Generated  the language, and launched the runtime as explained in the [Language Editior Generation tutorial](TODO),
you can create your instances conforming to the .jschema.
Create a new sample project in the runtime Eclipse, create in it a new file with the extension of the language (e.g., .shipyardV4), answer Yes when asked if you want to convert it to an Xtext project,
open the file, and you have available the content assist and the validation for the generated language.
If you created the editor for shipyardV4, you can try two samples available in the folder /samples/shipyardSchemas/shipyardV4/instanceExamples.
The [Language Editor generator](tutorials/LanguageEditorGeneration.pdf) tutorial, also explain how to open an instance with the Reflective Editor, and see an instance as a model.


