package components

import common.Onglet
import common.SkinClemont
import react.FC
import react.Props
import react.useState

val Contenu = FC<Props> {
    var onglet: Onglet by useState(Onglet.CLEMONT)
    var nbClic = 0
    var skin: SkinClemont by useState(SkinClemont.DEFAUT)

    Menu {
        ongletSelectionne = onglet
        onSelectOnglet = {ong -> onglet = ong}
    }

    when(onglet) {
        Onglet.CLEMONT -> Clemont {
            nbClicProp = nbClic
            skinProp = skin
        }
        Onglet.PERSONNALISATION -> Personnalisation {
            skinSelectionne = skin
            onSelectSkin = {sk -> skin = sk}
        }
    }
}