package com.baidu.carlife.sdk.receiver.transport.direct.wifip2p;

import android.net.wifi.p2p.WifiP2pManager;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/direct/wifip2p/WifiP2pOperation;", "", "Landroid/net/wifi/p2p/WifiP2pManager$ActionListener;", "listener", "Lt8/z;", "execute", "(Landroid/net/wifi/p2p/WifiP2pManager$ActionListener;)V", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public interface WifiP2pOperation {
    void execute(WifiP2pManager.ActionListener listener);
}
