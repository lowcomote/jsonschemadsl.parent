<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="JsonSchema2EcoreUtils"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="self"/>
		<constant value="isTypeObject"/>
		<constant value="MMM!ObjectSchema;"/>
		<constant value="Sequence"/>
		<constant value="#native"/>
		<constant value="0"/>
		<constant value="keywordDefinition"/>
		<constant value="1"/>
		<constant value="TypeSchemaDefinition"/>
		<constant value="MM"/>
		<constant value="J.oclIsTypeOf(J):J"/>
		<constant value="B.not():B"/>
		<constant value="20"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="typeAnyOf1"/>
		<constant value="J.oclIsUndefined():J"/>
		<constant value="J.not():J"/>
		<constant value="31"/>
		<constant value="EnumLiteral"/>
		<constant value="&quot;object&quot;"/>
		<constant value="name"/>
		<constant value="J.=(J):J"/>
		<constant value="B.or(B):B"/>
		<constant value="4:2-4:6"/>
		<constant value="4:2-4:24"/>
		<constant value="4:44-4:51"/>
		<constant value="4:64-4:87"/>
		<constant value="4:44-4:88"/>
		<constant value="4:2-4:89"/>
		<constant value="5:26-5:33"/>
		<constant value="5:26-5:44"/>
		<constant value="5:26-5:61"/>
		<constant value="5:22-5:61"/>
		<constant value="4:2-5:62"/>
		<constant value="6:22-6:29"/>
		<constant value="6:22-6:40"/>
		<constant value="6:43-6:56"/>
		<constant value="6:22-6:56"/>
		<constant value="4:2-6:57"/>
		<constant value="keyword"/>
	</cp>
	<operation name="1">
		<context type="2"/>
		<parameters>
		</parameters>
		<code>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="3" begin="0" end="-1"/>
		</localvariabletable>
	</operation>
	<operation name="4">
		<context type="5"/>
		<parameters>
		</parameters>
		<code>
			<pushf/>
			<push arg="6"/>
			<push arg="7"/>
			<new/>
			<push arg="6"/>
			<push arg="7"/>
			<new/>
			<load arg="8"/>
			<get arg="9"/>
			<iterate/>
			<store arg="10"/>
			<load arg="10"/>
			<push arg="11"/>
			<push arg="12"/>
			<findme/>
			<call arg="13"/>
			<call arg="14"/>
			<if arg="15"/>
			<load arg="10"/>
			<call arg="16"/>
			<enditerate/>
			<iterate/>
			<store arg="10"/>
			<load arg="10"/>
			<get arg="17"/>
			<call arg="18"/>
			<call arg="19"/>
			<call arg="14"/>
			<if arg="20"/>
			<load arg="10"/>
			<call arg="16"/>
			<enditerate/>
			<iterate/>
			<store arg="10"/>
			<load arg="10"/>
			<get arg="17"/>
			<push arg="21"/>
			<push arg="7"/>
			<new/>
			<dup/>
			<push arg="22"/>
			<set arg="23"/>
			<call arg="24"/>
			<call arg="25"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="26" begin="7" end="7"/>
			<lne id="27" begin="7" end="8"/>
			<lne id="28" begin="11" end="11"/>
			<lne id="29" begin="12" end="14"/>
			<lne id="30" begin="11" end="15"/>
			<lne id="31" begin="4" end="20"/>
			<lne id="32" begin="23" end="23"/>
			<lne id="33" begin="23" end="24"/>
			<lne id="34" begin="23" end="25"/>
			<lne id="35" begin="23" end="26"/>
			<lne id="36" begin="1" end="31"/>
			<lne id="37" begin="34" end="34"/>
			<lne id="38" begin="34" end="35"/>
			<lne id="39" begin="36" end="41"/>
			<lne id="40" begin="34" end="42"/>
			<lne id="41" begin="0" end="44"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="42" begin="10" end="19"/>
			<lve slot="1" name="42" begin="22" end="30"/>
			<lve slot="1" name="42" begin="33" end="43"/>
			<lve slot="0" name="3" begin="0" end="44"/>
		</localvariabletable>
	</operation>
</asm>
