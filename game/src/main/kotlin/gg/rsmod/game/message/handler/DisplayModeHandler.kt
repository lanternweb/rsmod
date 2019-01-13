package gg.rsmod.game.message.handler

import gg.rsmod.game.message.MessageHandler
import gg.rsmod.game.message.impl.ChangeDisplayModeMessage
import gg.rsmod.game.model.DISPLAY_MODE_CHANGE_ATTR
import gg.rsmod.game.model.entity.Client

/**
 * @author Tom <rspsmods@gmail.com>
 */
class DisplayModeHandler : MessageHandler<ChangeDisplayModeMessage> {

    override fun handle(client: Client, message: ChangeDisplayModeMessage) {
        client.attr[DISPLAY_MODE_CHANGE_ATTR] = message.mode
        client.world.plugins.executeDisplayModeChange(client)
    }
}