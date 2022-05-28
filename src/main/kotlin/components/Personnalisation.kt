package components

import csstype.*
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.useState

val Personnalisation = FC<Props> {
    div {
        img {
            src = "https://avatars.githubusercontent.com/u/23107133?v=4"
            css {
                width = 50.px
                height = 50.px
            }
        }
    }
}