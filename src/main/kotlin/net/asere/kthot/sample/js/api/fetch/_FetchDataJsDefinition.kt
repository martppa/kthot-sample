package net.asere.kthot.sample.js.api.fetch

import net.asere.kthot.js.dsl.ksp.annotation.JsClass
import net.asere.kthot.js.dsl.ksp.annotation.JsProperty
import net.asere.kthot.js.dsl.ksp.processor.js.JavaScriptClass
import net.asere.kthot.js.dsl.type.obj.JsObjectRef
import net.asere.kthot.js.dsl.type.string.JsStringRef

@JsClass(name = "JsFetchData")
internal class _FetchDataJsDefinition : JavaScriptClass()  {
    @JsProperty
    lateinit var method: JsStringRef
    @JsProperty
    lateinit var body: JsObjectRef
    @JsProperty
    lateinit var headers: JsObjectRef
}