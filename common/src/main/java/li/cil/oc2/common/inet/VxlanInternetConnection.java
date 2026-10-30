/* SPDX-License-Identifier: MIT */

package li.cil.oc2.common.inet;

import java.nio.ByteBuffer;

public final class VxlanInternetConnection extends InternetConnection {
    VxlanInternetConnection(final InternetAdapter adapter) {
        super(adapter);
    }

    @Override
    protected void onTick() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onTick'");
    }

    @Override
    protected void sendEthernetFrame(ByteBuffer frame) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendEthernetFrame'");
    }

    @Override
    protected boolean receiveEthernetFrame(ByteBuffer frame) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receiveEthernetFrame'");
    }

    @Override
    protected void onShutdown() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onShutdown'");
    }
}
