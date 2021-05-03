package jsonschemadsl2ecore.trafo.opt.utils;

import java.io.IOException;
import java.net.URL;

import jku.se.atl.transformation.utils.ATLExecutorEMFTVM;
import jku.se.atl.transformation.utils.ATLExecutorEMFTVM.ModelKind;
import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsongrammar.JsongrammarPackage;
import jsonschemadsl2ecore.trafo.opt.Activator;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.ecore.EcorePackage;

public class JsonSchemaToEcoreUtils {
	
	public static String JSON_SCHEMA_META_MODEL = "JSchemaMM";
	public static String IN_JSON_SCHEMA_MODEL = "jschema";	
	public static String ECORE_META_MODEL = "Ecore";
	public static String OUT_ECORE_MM = "ecoreM";
	public static String JSON_GRAMMAR_META_MODEL = "JsonGrammarMM";
	public static String OUT_JSON_GRAMMAR = "jsonGrammar";
	
	public static String MODULE_FOLDER = "src/jsonschemadsl2ecore/trafo/opt/files";
	public static String MODULE_JSON_SCHEMA_TO_ECORE_MM = "JsonSchema2EcoreOpt";
	
	public static void performTrafoEMFTVMJsonSchemaToEcore(String jsonSchemaModelUri, String ecoreModelUri, 
			String grammarModelUri, String traceUri) throws IOException {
		ATLExecutorEMFTVM exec = createEMFTVMJsonSchemaToEcoreM(jsonSchemaModelUri, ecoreModelUri, grammarModelUri);
		exec.loadTraceModel(traceUri);
		URL trafosFolder = FileLocator.toFileURL(Activator.getDefault().getBundle().getResource(MODULE_FOLDER));
		exec.runModule(trafosFolder.toString(), MODULE_JSON_SCHEMA_TO_ECORE_MM);
	}
	
	private static ATLExecutorEMFTVM createEMFTVMJsonSchemaToEcoreM(String jsonSchemaModelUri, 
			String ecoreModelUri, String grammarModelUri) throws IOException {
		ATLExecutorEMFTVM exec = new ATLExecutorEMFTVM();
		exec.loadMetaModels(JSON_SCHEMA_META_MODEL, JsonMetaschemaMMPackage.eINSTANCE.getNsURI());
		exec.loadMetaModels(ECORE_META_MODEL, EcorePackage.eINSTANCE.getNsURI());
		exec.loadMetaModels(JSON_GRAMMAR_META_MODEL, JsongrammarPackage.eINSTANCE.getNsURI());
		
		exec.loadModels(IN_JSON_SCHEMA_MODEL, jsonSchemaModelUri, ModelKind.IN);
		exec.loadModels(OUT_ECORE_MM, ecoreModelUri, ModelKind.INOUT);
		exec.loadModels(OUT_JSON_GRAMMAR, grammarModelUri, ModelKind.INOUT);	
		return exec;
	}
}
