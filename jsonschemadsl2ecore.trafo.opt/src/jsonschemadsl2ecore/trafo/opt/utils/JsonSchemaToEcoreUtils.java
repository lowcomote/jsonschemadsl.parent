package jsonschemadsl2ecore.trafo.opt.utils;

import java.io.IOException;
import java.net.URL;

import jku.se.atl.transformation.utils.ATLExecutorEMFTVM;
import jku.se.atl.transformation.utils.ATLExecutorEMFTVM.ModelKind;
import jsonMM.JsonMMPackage;
import jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsongrammarmm.jsongrammar.JsongrammarPackage;
import jsonschemadsl2ecore.trafo.opt.Activator;
import relatedSchemas.RelatedSchemasPackage;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.ecore.EcorePackage;
import org.osgi.framework.Bundle;

public class JsonSchemaToEcoreUtils {
	
	public static String JSON_SCHEMA_META_MODEL = "JSchemaMM";
	public static String JSON_META_MODEL = "JsonMM";
	public static String IN_JSON_SCHEMA_MODEL = "jschema";	
	public static String ECORE_META_MODEL = "Ecore";
	public static String OUT_ECORE_MM = "ecoreM";
	public static String JSON_GRAMMAR_META_MODEL = "JsonGrammarMM";
	public static String RELATED_SCHEMAS_META_MODEL = "RelatedSchemasMM";
	public static String OUT_JSON_GRAMMAR = "jsonGrammar";
	public static String OUT_RELATED_SCHEMAS = "relatedSchemas";
	
//	public static String MODULE_FOLDER = "src/jsonschemadsl2ecore/trafo/opt/files";
	public static String MODULE_FOLDER = "jsonschemadsl2ecore/trafo/opt/files";
	public static String MODULE_JSON_SCHEMA_TO_ECORE_MM = "JsonSchema2EcoreOpt";
	
	public static void performTrafoEMFTVMJsonSchemaToEcore(String jsonSchemaModelUri, String ecoreModelUri, 
			String grammarModelUri, String relatedSchemasModelUri, String traceUri) throws IOException {
		ATLExecutorEMFTVM exec = createEMFTVMJsonSchemaToEcoreM(jsonSchemaModelUri, ecoreModelUri, grammarModelUri, relatedSchemasModelUri);
		exec.loadTraceModel(traceUri);
//		URL trafosFolder = FileLocator.toFileURL(Activator.getDefault().getBundle().getResource(MODULE_FOLDER));
//		exec.runModule(trafosFolder.toString(), MODULE_JSON_SCHEMA_TO_ECORE_MM);
		
		
		Activator activator = Activator.getDefault();
		Bundle bundle = activator.getBundle();
		URL url= bundle.getResource(MODULE_FOLDER);
		String moduleUri = url.toString();
//		String moduleUri = Activator.getDefault().getBundle().getResource(MODULE_FOLDER).toString();
		exec.runModule(moduleUri, MODULE_JSON_SCHEMA_TO_ECORE_MM);
	}
	
	private static ATLExecutorEMFTVM createEMFTVMJsonSchemaToEcoreM(String jsonSchemaModelUri, 
			String ecoreModelUri, String grammarModelUri, String relatedSchemasModelUri) throws IOException {
		ATLExecutorEMFTVM exec = new ATLExecutorEMFTVM();
		exec.loadMetaModels(JSON_SCHEMA_META_MODEL, JsonMetaschemaMMPackage.eINSTANCE.getNsURI());
		exec.loadMetaModels(JSON_META_MODEL, JsonMMPackage.eINSTANCE.getNsURI());
		exec.loadMetaModels(ECORE_META_MODEL, EcorePackage.eINSTANCE.getNsURI());
		exec.loadMetaModels(JSON_GRAMMAR_META_MODEL, JsongrammarPackage.eINSTANCE.getNsURI());
		exec.loadMetaModels(RELATED_SCHEMAS_META_MODEL, RelatedSchemasPackage.eINSTANCE.getNsURI());
		
		exec.loadModels(IN_JSON_SCHEMA_MODEL, jsonSchemaModelUri, ModelKind.IN);
		exec.loadModels(OUT_ECORE_MM, ecoreModelUri, ModelKind.INOUT);
		exec.loadModels(OUT_JSON_GRAMMAR, grammarModelUri, ModelKind.INOUT);
		exec.loadModels(OUT_RELATED_SCHEMAS, relatedSchemasModelUri, ModelKind.INOUT);	
		return exec;
	}
}
