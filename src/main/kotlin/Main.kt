import components.Clemont
import kotlinx.browser.document
import react.create
import react.dom.render

fun main() {
    var defaultValue: Int = 0
    val body = document.createElement("div")
    document.body!!.appendChild(body)

    val clemont = Clemont.create {
        nbClic = defaultValue
    }
    render(clemont, body)
}