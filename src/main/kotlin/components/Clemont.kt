package components

import csstype.*
import emotion.react.css
import org.w3c.files.FileReader
import react.FC
import react.Props
import react.dom.html.ImgLoading
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.useState


external interface ClemontProps : Props {
    var nbClicProp: Int
}

val Clemont = FC<ClemontProps> { props ->
    var nbClic by useState(props.nbClicProp)
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
