package components

import common.Onglet
import csstype.px
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div

external interface MenuProps : Props {
    var ongletSelectionne: Onglet?
    var onSelectOnglet: (Onglet) -> Unit
}

val Menu = FC<MenuProps> { props ->
    div {
        button {
            onClick = {
                props.onSelectOnglet(Onglet.CLEMONT)
            }
            css {
                marginRight = 20.px
            }
            +"Clémont"
        }
        button {
            onClick = {
                props.onSelectOnglet(Onglet.PERSONNALISATION)
            }
            +"Personnalisation"
        }
    }
}