import components.Contenu
import kotlinx.browser.document
import react.create
import react.dom.client.createRoot

fun main() {
    val contenu = document.createElement("div")
    document.body!!.appendChild(contenu)
    createRoot(contenu).render(Contenu.create{})
}