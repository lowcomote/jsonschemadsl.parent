<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="JsonSchema2Ecore"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="rootEPackage"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="Sequence"/>
		<constant value="QJ.first():J"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="9:43-9:55"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchJsonSchemaToEPackage():V"/>
		<constant value="A.__matchObjectSchemaToEClass():V"/>
		<constant value="__exec__"/>
		<constant value="JsonSchemaToEPackage"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyJsonSchemaToEPackage(NTransientLink;):V"/>
		<constant value="ObjectSchemaToEClass"/>
		<constant value="A.__applyObjectSchemaToEClass(NTransientLink;):V"/>
		<constant value="__matchJsonSchemaToEPackage"/>
		<constant value="JsonSchema"/>
		<constant value="MM"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="jsonSchema"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="ePackage"/>
		<constant value="EPackage"/>
		<constant value="MM1"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="17:3-19:4"/>
		<constant value="__applyJsonSchemaToEPackage"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="test1"/>
		<constant value="18:12-18:19"/>
		<constant value="18:4-18:19"/>
		<constant value="21:4-21:14"/>
		<constant value="21:31-21:39"/>
		<constant value="21:4-21:40"/>
		<constant value="20:3-22:4"/>
		<constant value="link"/>
		<constant value="__matchObjectSchemaToEClass"/>
		<constant value="ObjectSchema"/>
		<constant value="objectSchema"/>
		<constant value="eClass"/>
		<constant value="EClass"/>
		<constant value="33:3-33:22"/>
		<constant value="__applyObjectSchemaToEClass"/>
		<constant value="eClassifiers"/>
		<constant value="35:3-35:13"/>
		<constant value="35:3-35:26"/>
		<constant value="35:42-35:48"/>
		<constant value="35:3-35:49"/>
		<constant value="34:2-36:3"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<field name="5" type="4"/>
	<operation name="6">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="10"/>
			<pcall arg="11"/>
			<dup/>
			<push arg="12"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="13"/>
			<pcall arg="11"/>
			<pcall arg="14"/>
			<set arg="3"/>
			<getasm/>
			<push arg="15"/>
			<push arg="9"/>
			<new/>
			<call arg="16"/>
			<set arg="5"/>
			<getasm/>
			<push arg="17"/>
			<push arg="9"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="18"/>
			<getasm/>
			<pcall arg="19"/>
		</code>
		<linenumbertable>
			<lne id="20" begin="17" end="20"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="21" begin="0" end="30"/>
		</localvariabletable>
	</operation>
	<operation name="22">
		<context type="7"/>
		<parameters>
			<parameter name="23" type="4"/>
		</parameters>
		<code>
			<load arg="23"/>
			<getasm/>
			<get arg="3"/>
			<call arg="24"/>
			<if arg="25"/>
			<getasm/>
			<get arg="1"/>
			<load arg="23"/>
			<call arg="26"/>
			<dup/>
			<call arg="27"/>
			<if arg="28"/>
			<load arg="23"/>
			<call arg="29"/>
			<goto arg="30"/>
			<pop/>
			<load arg="23"/>
			<goto arg="31"/>
			<push arg="15"/>
			<push arg="9"/>
			<new/>
			<load arg="23"/>
			<iterate/>
			<store arg="32"/>
			<getasm/>
			<load arg="32"/>
			<call arg="33"/>
			<call arg="34"/>
			<enditerate/>
			<call arg="35"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="36" begin="23" end="27"/>
			<lve slot="0" name="21" begin="0" end="29"/>
			<lve slot="1" name="37" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="38">
		<context type="7"/>
		<parameters>
			<parameter name="23" type="4"/>
			<parameter name="32" type="39"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="23"/>
			<call arg="26"/>
			<load arg="23"/>
			<load arg="32"/>
			<call arg="40"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="21" begin="0" end="6"/>
			<lve slot="1" name="37" begin="0" end="6"/>
			<lve slot="2" name="41" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="42">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="43"/>
			<getasm/>
			<pcall arg="44"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="21" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="45">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="46"/>
			<call arg="47"/>
			<iterate/>
			<store arg="23"/>
			<getasm/>
			<load arg="23"/>
			<pcall arg="48"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="49"/>
			<call arg="47"/>
			<iterate/>
			<store arg="23"/>
			<getasm/>
			<load arg="23"/>
			<pcall arg="50"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="36" begin="5" end="8"/>
			<lve slot="1" name="36" begin="15" end="18"/>
			<lve slot="0" name="21" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="51">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<push arg="52"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="23"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="46"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="58"/>
			<load arg="23"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<push arg="61"/>
			<push arg="62"/>
			<new/>
			<pcall arg="63"/>
			<pusht/>
			<pcall arg="64"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="65" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="58" begin="6" end="26"/>
			<lve slot="0" name="21" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="66">
		<context type="7"/>
		<parameters>
			<parameter name="23" type="67"/>
		</parameters>
		<code>
			<load arg="23"/>
			<push arg="58"/>
			<call arg="68"/>
			<store arg="32"/>
			<load arg="23"/>
			<push arg="60"/>
			<call arg="69"/>
			<store arg="70"/>
			<load arg="70"/>
			<dup/>
			<getasm/>
			<push arg="71"/>
			<call arg="33"/>
			<set arg="41"/>
			<pop/>
			<getasm/>
			<load arg="70"/>
			<set arg="5"/>
		</code>
		<linenumbertable>
			<lne id="72" begin="11" end="11"/>
			<lne id="73" begin="9" end="13"/>
			<lne id="65" begin="8" end="14"/>
			<lne id="74" begin="15" end="15"/>
			<lne id="75" begin="16" end="16"/>
			<lne id="76" begin="15" end="17"/>
			<lne id="77" begin="15" end="17"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="60" begin="7" end="17"/>
			<lve slot="2" name="58" begin="3" end="17"/>
			<lve slot="0" name="21" begin="0" end="17"/>
			<lve slot="1" name="78" begin="0" end="17"/>
		</localvariabletable>
	</operation>
	<operation name="79">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<push arg="80"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="23"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="49"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="81"/>
			<load arg="23"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="82"/>
			<push arg="83"/>
			<push arg="62"/>
			<new/>
			<pcall arg="63"/>
			<pusht/>
			<pcall arg="64"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="84" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="81" begin="6" end="26"/>
			<lve slot="0" name="21" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="85">
		<context type="7"/>
		<parameters>
			<parameter name="23" type="67"/>
		</parameters>
		<code>
			<load arg="23"/>
			<push arg="81"/>
			<call arg="68"/>
			<store arg="32"/>
			<load arg="23"/>
			<push arg="82"/>
			<call arg="69"/>
			<store arg="70"/>
			<load arg="70"/>
			<pop/>
			<getasm/>
			<get arg="5"/>
			<load arg="70"/>
			<set arg="86"/>
		</code>
		<linenumbertable>
			<lne id="84" begin="8" end="9"/>
			<lne id="87" begin="10" end="10"/>
			<lne id="88" begin="10" end="11"/>
			<lne id="89" begin="12" end="12"/>
			<lne id="90" begin="10" end="13"/>
			<lne id="91" begin="10" end="13"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="82" begin="7" end="13"/>
			<lve slot="2" name="81" begin="3" end="13"/>
			<lve slot="0" name="21" begin="0" end="13"/>
			<lve slot="1" name="78" begin="0" end="13"/>
		</localvariabletable>
	</operation>
</asm>
