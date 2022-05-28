package components

import common.SkinClemont
import csstype.*
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img

external interface PersonnalisationProps : Props {
    var skinSelectionne: SkinClemont?
    var onSelectSkin: (SkinClemont) -> Unit
}

val Personnalisation = FC<PersonnalisationProps> {
    div {
        for (skin in SkinClemont.values()) {
            img {
                src = skin.url
                css {
                    width = 100.px
                    height = 100.px
                    marginTop = 20.px
                    marginRight = 10.px
                }
            }
        }
    }
}