package com.baidu.carlife.sdk.receiver.transport.direct;

import a2.f;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import androidx.lifecycle.z;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.transport.direct.wifip2p.WifiP2pOperationSequence;
import com.baidu.carlife.sdk.receiver.transport.direct.wifip2p.operations.DiscoverPeersOperation;
import com.baidu.carlife.sdk.receiver.transport.direct.wifip2p.operations.StopPeerDiscoverOperation;
import com.baidu.carlife.sdk.util.Logger;
import com.baidu.carlife.sdk.util.TimerUtils;
import i9.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/direct/WifiDirectDiscoverableTask;", "Landroid/net/wifi/p2p/WifiP2pManager$ActionListener;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "Landroid/net/wifi/p2p/WifiP2pManager;", "wifiP2pManager", "Landroid/net/wifi/p2p/WifiP2pManager$Channel;", "channel", "<init>", "(Lcom/baidu/carlife/sdk/CarLifeContext;Landroid/net/wifi/p2p/WifiP2pManager;Landroid/net/wifi/p2p/WifiP2pManager$Channel;)V", "Lt8/z;", "discoverable", "()V", "stopDiscoverable", "terminate", "onSuccess", "", "error", "onFailure", "(I)V", "Lcom/baidu/carlife/sdk/CarLifeContext;", "Landroid/net/wifi/p2p/WifiP2pManager;", "getWifiP2pManager", "()Landroid/net/wifi/p2p/WifiP2pManager;", "Landroid/net/wifi/p2p/WifiP2pManager$Channel;", "getChannel", "()Landroid/net/wifi/p2p/WifiP2pManager$Channel;", "Lcom/baidu/carlife/sdk/receiver/transport/direct/wifip2p/WifiP2pOperationSequence;", "operationSequence", "Lcom/baidu/carlife/sdk/receiver/transport/direct/wifip2p/WifiP2pOperationSequence;", "Ljava/lang/Runnable;", "mDiscoverPeers", "Ljava/lang/Runnable;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class WifiDirectDiscoverableTask implements WifiP2pManager.ActionListener {
    private final WifiP2pManager.Channel channel;
    private final CarLifeContext context;
    private final Runnable mDiscoverPeers;
    private final WifiP2pOperationSequence operationSequence;
    private final WifiP2pManager wifiP2pManager;

    public WifiDirectDiscoverableTask(CarLifeContext carLifeContext, WifiP2pManager wifiP2pManager, WifiP2pManager.Channel channel) {
        l.e(carLifeContext, "context");
        l.e(wifiP2pManager, "wifiP2pManager");
        l.e(channel, "channel");
        this.context = carLifeContext;
        this.wifiP2pManager = wifiP2pManager;
        this.channel = channel;
        WifiP2pOperationSequence wifiP2pOperationSequence = new WifiP2pOperationSequence(this);
        this.operationSequence = wifiP2pOperationSequence;
        this.mDiscoverPeers = new z(4, this);
        wifiP2pOperationSequence.add(new StopPeerDiscoverOperation(wifiP2pManager, channel));
        wifiP2pOperationSequence.add(new DiscoverPeersOperation(wifiP2pManager, channel));
        wifiP2pManager.removeGroup(channel, new WifiP2pManager.ActionListener() { // from class: com.baidu.carlife.sdk.receiver.transport.direct.WifiDirectDiscoverableTask.1
            @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
            public void onFailure(int reason) {
                Logger.INSTANCE.d(Constants.TAG, "removeGroup onFailure");
            }

            @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
            public void onSuccess() {
                Logger.INSTANCE.d(Constants.TAG, "removeGroup onSuccess");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void discoverable$lambda$1(final WifiDirectDiscoverableTask wifiDirectDiscoverableTask, WifiP2pGroup wifiP2pGroup) {
        if (wifiP2pGroup == null) {
            wifiDirectDiscoverableTask.wifiP2pManager.createGroup(wifiDirectDiscoverableTask.channel, new WifiP2pManager.ActionListener() { // from class: com.baidu.carlife.sdk.receiver.transport.direct.WifiDirectDiscoverableTask$discoverable$1$1
                @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                public void onFailure(int reason) {
                    this.this$0.operationSequence.execute();
                    Logger.INSTANCE.d(Constants.TAG, f.E(reason, "createGroup onFailure, reason="));
                }

                @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                public void onSuccess() {
                    Logger.INSTANCE.d(Constants.TAG, "createGroup onSuccess");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mDiscoverPeers$lambda$0(WifiDirectDiscoverableTask wifiDirectDiscoverableTask) {
        Logger.INSTANCE.d(Constants.TAG, "WifiDirectDiscoverableTask DiscoverPeers");
        wifiDirectDiscoverableTask.operationSequence.execute();
    }

    public final void discoverable() {
        if (((Number) this.context.getConfig(Configs.CONFIG_WIFI_DIRECT_GROUP, 0)).intValue() == 1) {
            this.wifiP2pManager.requestGroupInfo(this.channel, new WifiP2pManager.GroupInfoListener() { // from class: com.baidu.carlife.sdk.receiver.transport.direct.a
                @Override // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
                public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
                    WifiDirectDiscoverableTask.discoverable$lambda$1(this.f2698a, wifiP2pGroup);
                }
            });
        } else {
            this.operationSequence.execute();
        }
    }

    public final WifiP2pManager.Channel getChannel() {
        return this.channel;
    }

    public final WifiP2pManager getWifiP2pManager() {
        return this.wifiP2pManager;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onFailure(int error) {
        Logger.INSTANCE.d(Constants.TAG, "WifiDirectDiscoverableTask onFailure ", Integer.valueOf(error));
        TimerUtils.INSTANCE.schedule(this.mDiscoverPeers, 30000L, 2000L);
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onSuccess() {
        Logger.INSTANCE.d(Constants.TAG, "WifiDirectDiscoverableTask onSuccess");
        TimerUtils.INSTANCE.stop(this.mDiscoverPeers);
    }

    public final void stopDiscoverable() {
        TimerUtils.INSTANCE.stop(this.mDiscoverPeers);
    }

    public final void terminate() {
        stopDiscoverable();
        this.wifiP2pManager.cancelConnect(this.channel, new WifiP2pManager.ActionListener() { // from class: com.baidu.carlife.sdk.receiver.transport.direct.WifiDirectDiscoverableTask.terminate.1
            @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
            public void onFailure(int reason) {
                Logger.INSTANCE.d(Constants.TAG, "cancelConnect onFailure");
            }

            @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
            public void onSuccess() {
                Logger.INSTANCE.d(Constants.TAG, "cancelConnect onSuccess");
            }
        });
        this.wifiP2pManager.removeGroup(this.channel, new WifiP2pManager.ActionListener() { // from class: com.baidu.carlife.sdk.receiver.transport.direct.WifiDirectDiscoverableTask.terminate.2
            @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
            public void onFailure(int reason) {
                Logger.INSTANCE.d(Constants.TAG, "removeGroup onFailure");
            }

            @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
            public void onSuccess() {
                Logger.INSTANCE.d(Constants.TAG, "removeGroup onSuccess");
            }
        });
    }
}
