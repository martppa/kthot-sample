package net.asere.kthot.sample.js.api.fetch

import net.asere.kthot.js.dsl.ksp.annotation.JsApiFunctionModule
import net.asere.kthot.js.dsl.ksp.annotation.JsFunction
import net.asere.kthot.js.dsl.type.promise.JsPromise
import net.asere.kthot.js.dsl.type.string.JsString
import net.asere.kthot.js.dsl.type.string.js
import net.asere.kthot.js.dsl.type.value.JsValue

val FETCH_METHOD_POST = "POST".js
val FETCH_METHOD_PUT = "PUT".js
val FETCH_METHOD_DELETE = "DELETE".js
val FETCH_METHOD_GET = "GET".js
val FETCH_METHOD_OPTION = "OPTION".js
val FETCH_METHOD_PATCH = "PATCH".js

@JsApiFunctionModule(name = "JsFetch")
internal interface _FetchFunctionApiJsDefinition {
    @JsFunction
    fun <T : JsValue> fetch(url: JsString, data: JsFetchData): JsPromise<JsResponse<T>>
}