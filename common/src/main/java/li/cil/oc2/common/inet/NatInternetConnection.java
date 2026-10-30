/* SPDX-License-Identifier: MIT */

package li.cil.oc2.common.inet;

import li.cil.oc2.common.inet.l2.LinkLocalLayer;

import java.nio.ByteBuffer;

public final class NatInternetConnection extends InternetConnection {
    private final LinkLocalLayer stack;

    NatInternetConnection(final InternetAdapter adapter, final LinkLocalLayer stack) {
        super(adapter);
        this.stack = stack;
    }

    @Override
    protected void onTick() {
        stack.onTick();
    }

    @Override
    protected void sendEthernetFrame(ByteBuffer frame) {
        stack.sendEthernetFrame(frame);
    }

    @Override
    protected boolean receiveEthernetFrame(ByteBuffer frame) {
        return stack.receiveEthernetFrame(frame);
    }

    @Override
    protected void onShutdown() {
        stack.onStop();
    }
}
