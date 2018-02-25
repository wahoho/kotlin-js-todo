import kotlinx.html.dom.append
import kotlinx.html.h1
import org.w3c.dom.HTMLElement
import kotlin.browser.document

fun main(args: Array<String>) {
    val root = document.getElementById("root") as? HTMLElement
    root?.append {
        h1 {
            +"Hello world"
        }
    }
}