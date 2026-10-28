package com.baidu.carlife.sdk.receiver.transport.direct.wifip2p.operations;

import android.net.wifi.p2p.WifiP2pManager;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.transport.direct.wifip2p.WifiP2pOperation;
import i9.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/direct/wifip2p/operations/DiscoverPeersOperation;", "Lcom/baidu/carlife/sdk/receiver/transport/direct/wifip2p/WifiP2pOperation;", "Landroid/net/wifi/p2p/WifiP2pManager;", "wifiP2pManager", "Landroid/net/wifi/p2p/WifiP2pManager$Channel;", "channel", "<init>", "(Landroid/net/wifi/p2p/WifiP2pManager;Landroid/net/wifi/p2p/WifiP2pManager$Channel;)V", "Landroid/net/wifi/p2p/WifiP2pManager$ActionListener;", "listener", "Lt8/z;", "execute", "(Landroid/net/wifi/p2p/WifiP2pManager$ActionListener;)V", "Landroid/net/wifi/p2p/WifiP2pManager;", "Landroid/net/wifi/p2p/WifiP2pManager$Channel;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class DiscoverPeersOperation implements WifiP2pOperation {
    private final WifiP2pManager.Channel channel;
    private final WifiP2pManager wifiP2pManager;

    public DiscoverPeersOperation(WifiP2pManager wifiP2pManager, WifiP2pManager.Channel channel) {
        l.e(wifiP2pManager, "wifiP2pManager");
        l.e(channel, "channel");
        this.wifiP2pManager = wifiP2pManager;
        this.channel = channel;
    }

    @Override // com.baidu.carlife.sdk.receiver.transport.direct.wifip2p.WifiP2pOperation
    public void execute(WifiP2pManager.ActionListener listener) {
        l.e(listener, "listener");
        this.wifiP2pManager.discoverPeers(this.channel, listener);
    }
}
