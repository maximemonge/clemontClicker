package components

import common.Onglet
import react.FC
import react.Props

val Contenu = FC<Props> {
    val onglet: Onglet = Onglet.CLEMONT
    val nbClic = 0

    Menu {ongletProp = onglet}

    when(onglet) {
        Onglet.CLEMONT -> Clemont {nbClicProp = nbClic}
        Onglet.PERSONNALISATION -> Personnalisation()
        else -> {
            console.error("Onglet non trouvé")
        }
    }
}