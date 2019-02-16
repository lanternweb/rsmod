package gg.rsmod.plugins.osrs.content.mechanics.bankbooth

import gg.rsmod.game.model.entity.Player
import gg.rsmod.plugins.osrs.api.InterfaceDestination
import gg.rsmod.plugins.osrs.api.ext.openBank
import gg.rsmod.plugins.osrs.api.ext.openInterface
import gg.rsmod.plugins.osrs.api.ext.player
import gg.rsmod.plugins.osrs.api.ext.setInterfaceUnderlay

on_obj_option(obj = 6943, option = "bank") {
    it.player().openBank()
}

on_obj_option(obj = 6943, option = "collect") {
    open_collect(it.player())
}

fun open_collect(p: Player) {
    p.setInterfaceUnderlay(color = -1, transparency = -1)
    p.openInterface(interfaceId = 402, dest = InterfaceDestination.MAIN_SCREEN)
}