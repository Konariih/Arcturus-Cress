package com.eu.habbo.messages.outgoing.guilds;

import com.eu.habbo.habbohotel.guilds.Guild;
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;
import com.eu.habbo.messages.outgoing.Outgoing;

public class GuildCreatedMessageComposer extends MessageComposer {
    private final Guild guild;

    public GuildCreatedMessageComposer(Guild guild) {
        this.guild = guild;
    }

    @Override
    protected ServerMessage composeInternal() {
        this.response.init(Outgoing.GuildCreatedMessageComposer);
        this.response.appendInt(this.guild.getRoomId());
        this.response.appendInt(this.guild.getId());
        return this.response;
    }
}