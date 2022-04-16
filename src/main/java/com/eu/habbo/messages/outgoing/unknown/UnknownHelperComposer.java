package com.eu.habbo.messages.outgoing.unknown;

import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;
import com.eu.habbo.messages.outgoing.Outgoing;

public class UnknownHelperComposer extends MessageComposer {
    @Override
    protected ServerMessage composeInternal() {
        this.response.init(Outgoing.CallForHelpPendingCallsDeletedMessageComposer);
        //Empty body
        return this.response;
    }
}