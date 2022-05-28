package components

import common.SkinClemont
import csstype.*
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.useState


external interface ClemontProps : Props {
    var nbClicProp: Int
    var skinProp: SkinClemont
}

val Clemont = FC<ClemontProps> { props ->
    var nbClic: Int by useState(props.nbClicProp)
    var skin: SkinClemont by useState(props.skinProp)
    div {
        css {
            width = 100.pct
            textAlign = TextAlign.center
        }
        div {
            css {
                marginBottom = 20.px
            }
            +"Clémont : $nbClic"
        }
        img {
            src = skin.url
            css {
                width = 250.px
                height = 250.px
                borderRadius = 50.pct
                transform = rotate(nbClic.deg)
            }
            onClick = {
                nbClic++
            }
        }
    }
}
