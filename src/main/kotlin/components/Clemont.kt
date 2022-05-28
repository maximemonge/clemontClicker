package components

import csstype.*
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.useState


external interface ClemontProps : Props {
    var nbClic: Int
}

val Clemont = FC<ClemontProps> { props ->
    var nbClic by useState(props.nbClic)
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
            id = "cc-clemont-img"
            src = "https://avatars.githubusercontent.com/u/23107133?v=4"
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
