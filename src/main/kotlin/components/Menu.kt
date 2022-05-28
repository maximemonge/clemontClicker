package components

import common.Onglet
import csstype.px
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.useState

external interface MenuProps : Props {
    var ongletProp: Onglet
}

val Menu = FC<MenuProps> { props ->
    var onglet by useState(props.ongletProp)
    div {
        button {
            onClick = {
                onglet = Onglet.CLEMONT
            }
            css {
                marginRight = 20.px
            }
            +"Clémont"
        }
        button {
            onClick = {
                onglet = Onglet.PERSONNALISATION
            }
            +"Personnalisation"
        }
    }
}