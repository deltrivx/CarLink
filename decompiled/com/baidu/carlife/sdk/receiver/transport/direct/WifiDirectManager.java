package com.baidu.carlife.sdk.receiver.transport.direct;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import android.os.Looper;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.Logger;
import i9.l;
import java.util.Collection;
import kotlin.Metadata;
import u3.f;
import u8.p;
import zb.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\nJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\nJ\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R$\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R(\u0010'\u001a\u0004\u0018\u00010&2\b\u0010\"\u001a\u0004\u0018\u00010&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010$¨\u0006-"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/direct/WifiDirectManager;", "Landroid/content/BroadcastReceiver;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "Lcom/baidu/carlife/sdk/receiver/transport/direct/WifiDirectManager$Callbacks;", "callbacks", "<init>", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lcom/baidu/carlife/sdk/receiver/transport/direct/WifiDirectManager$Callbacks;)V", "Lt8/z;", "register", "()V", "unregister", "Landroid/content/Context;", "", "isLocationPermissionGranted", "(Landroid/content/Context;)Z", "discoverable", "terminate", "context1", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lcom/baidu/carlife/sdk/CarLifeContext;", "Lcom/baidu/carlife/sdk/receiver/transport/direct/WifiDirectManager$Callbacks;", "Landroid/net/wifi/p2p/WifiP2pManager;", "wifiP2pManager", "Landroid/net/wifi/p2p/WifiP2pManager;", "Landroid/net/wifi/p2p/WifiP2pManager$Channel;", "channel", "Landroid/net/wifi/p2p/WifiP2pManager$Channel;", "Lcom/baidu/carlife/sdk/receiver/transport/direct/WifiDirectDiscoverableTask;", "discoverableTask", "Lcom/baidu/carlife/sdk/receiver/transport/direct/WifiDirectDiscoverableTask;", "<set-?>", "isConnected", "Z", "()Z", "", "wifiDirectName", "Ljava/lang/String;", "getWifiDirectName", "()Ljava/lang/String;", "isRegistered", "Callbacks", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class WifiDirectManager extends BroadcastReceiver {
    private final Callbacks callbacks;
    private WifiP2pManager.Channel channel;
    private final CarLifeContext context;
    private WifiDirectDiscoverableTask discoverableTask;
    private boolean isConnected;
    private boolean isRegistered;
    private String wifiDirectName;
    private final WifiP2pManager wifiP2pManager;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/direct/WifiDirectManager$Callbacks;", "", "Landroid/net/wifi/p2p/WifiP2pInfo;", "info", "Lt8/z;", "onDeviceConnected", "(Landroid/net/wifi/p2p/WifiP2pInfo;)V", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public interface Callbacks {

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
        public static final class DefaultImpls {
            @Deprecated
            public static void onDeviceConnected(Callbacks callbacks, WifiP2pInfo wifiP2pInfo) {
                l.e(wifiP2pInfo, "info");
                e.a(callbacks, wifiP2pInfo);
            }
        }

        void onDeviceConnected(WifiP2pInfo info);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.baidu.carlife.sdk.receiver.transport.direct.b] */
    public WifiDirectManager(CarLifeContext carLifeContext, Callbacks callbacks) {
        l.e(carLifeContext, "context");
        l.e(callbacks, "callbacks");
        this.context = carLifeContext;
        this.callbacks = callbacks;
        Object systemService = carLifeContext.getApplicationContext().getSystemService("wifip2p");
        WifiP2pManager wifiP2pManager = systemService instanceof WifiP2pManager ? (WifiP2pManager) systemService : null;
        this.wifiP2pManager = wifiP2pManager;
        if (!isLocationPermissionGranted(carLifeContext.getApplicationContext())) {
            carLifeContext.onConnectionPrompt("后台位置权限未授权");
            return;
        }
        if (wifiP2pManager == null) {
            carLifeContext.onConnectionPrompt("该设备不支持WLAN直连");
            return;
        }
        WifiP2pManager.Channel channelInitialize = wifiP2pManager.initialize(carLifeContext.getApplicationContext(), Looper.getMainLooper(), new WifiP2pManager.ChannelListener() { // from class: com.baidu.carlife.sdk.receiver.transport.direct.WifiDirectManager.1
            @Override // android.net.wifi.p2p.WifiP2pManager.ChannelListener
            public void onChannelDisconnected() {
                WifiDirectManager wifiDirectManager = WifiDirectManager.this;
                WifiP2pManager.Channel channelInitialize2 = wifiDirectManager.wifiP2pManager.initialize(WifiDirectManager.this.context.getApplicationContext(), Looper.getMainLooper(), this);
                l.d(channelInitialize2, "wifiP2pManager.initializ…                        )");
                wifiDirectManager.channel = channelInitialize2;
            }
        });
        l.d(channelInitialize, "wifiP2pManager.initializ…     }\n                })");
        this.channel = channelInitialize;
        this.discoverableTask = new WifiDirectDiscoverableTask(carLifeContext, wifiP2pManager, channelInitialize);
        register();
        if (Build.VERSION.SDK_INT >= 29) {
            WifiP2pManager.Channel channel = this.channel;
            if (channel != null) {
                wifiP2pManager.requestDeviceInfo(channel, new WifiP2pManager.DeviceInfoListener() { // from class: com.baidu.carlife.sdk.receiver.transport.direct.b
                    @Override // android.net.wifi.p2p.WifiP2pManager.DeviceInfoListener
                    public final void onDeviceInfoAvailable(WifiP2pDevice wifiP2pDevice) {
                        WifiDirectManager._init_$lambda$0(this.f2699a, wifiP2pDevice);
                    }
                });
            } else {
                l.j("channel");
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(WifiDirectManager wifiDirectManager, WifiP2pDevice wifiP2pDevice) {
        String str = wifiP2pDevice != null ? wifiP2pDevice.deviceName : null;
        Logger.INSTANCE.d(Constants.TAG, ob.a.q("本机设备名: ", str));
        wifiDirectManager.wifiDirectName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void discoverable$lambda$2(WifiDirectManager wifiDirectManager, WifiP2pInfo wifiP2pInfo) {
        Logger.INSTANCE.d(Constants.TAG, "requestConnectionInfo ", wifiP2pInfo);
        if (wifiP2pInfo != null && wifiP2pInfo.groupFormed) {
            wifiDirectManager.isConnected = true;
            return;
        }
        WifiDirectDiscoverableTask wifiDirectDiscoverableTask = wifiDirectManager.discoverableTask;
        if (wifiDirectDiscoverableTask != null) {
            wifiDirectDiscoverableTask.discoverable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceive$lambda$8(WifiDirectManager wifiDirectManager, WifiP2pInfo wifiP2pInfo, WifiP2pGroup wifiP2pGroup) {
        String str;
        String strConcat;
        String strConcat2;
        if (wifiP2pGroup != null) {
            String str2 = "";
            if (wifiP2pGroup.isGroupOwner()) {
                Collection<WifiP2pDevice> clientList = wifiP2pGroup.getClientList();
                l.d(clientList, "group.clientList");
                WifiP2pDevice wifiP2pDevice = (WifiP2pDevice) p.l0(clientList);
                if (wifiP2pDevice != null) {
                    CarLifeContext carLifeContext = wifiDirectManager.context;
                    String str3 = wifiP2pDevice.deviceName;
                    if (str3 != null) {
                        str = j.B0(str3) ? null : str3;
                        if (str != null && (strConcat2 = ": ".concat(str)) != null) {
                            str2 = strConcat2;
                        }
                    }
                    carLifeContext.onConnectionPrompt("WLAN已连接".concat(str2));
                }
            } else {
                CarLifeContext carLifeContext2 = wifiDirectManager.context;
                String str4 = wifiP2pGroup.getOwner().deviceName;
                if (str4 != null) {
                    str = j.B0(str4) ? null : str4;
                    if (str != null && (strConcat = ": ".concat(str)) != null) {
                        str2 = strConcat;
                    }
                }
                carLifeContext2.onConnectionPrompt("WLAN已连接".concat(str2));
            }
            wifiDirectManager.callbacks.onDeviceConnected(wifiP2pInfo);
        }
    }

    public final void discoverable() {
        register();
        WifiP2pManager wifiP2pManager = this.wifiP2pManager;
        if (wifiP2pManager != null) {
            WifiP2pManager.Channel channel = this.channel;
            if (channel != null) {
                wifiP2pManager.requestConnectionInfo(channel, new WifiP2pManager.ConnectionInfoListener() { // from class: com.baidu.carlife.sdk.receiver.transport.direct.c
                    @Override // android.net.wifi.p2p.WifiP2pManager.ConnectionInfoListener
                    public final void onConnectionInfoAvailable(WifiP2pInfo wifiP2pInfo) {
                        WifiDirectManager.discoverable$lambda$2(this.f2702a, wifiP2pInfo);
                    }
                });
            } else {
                l.j("channel");
                throw null;
            }
        }
    }

    public final String getWifiDirectName() {
        return this.wifiDirectName;
    }

    /* JADX INFO: renamed from: isConnected, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    public final boolean isLocationPermissionGranted(Context context) {
        l.e(context, "context");
        return ((f.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) || (f.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0)) && (Build.VERSION.SDK_INT < 29 || f.a(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context1, Intent intent) {
        WifiDirectDiscoverableTask wifiDirectDiscoverableTask;
        l.e(context1, "context1");
        l.e(intent, "intent");
        Logger.Companion companion = Logger.INSTANCE;
        companion.d(Constants.TAG, "onReceive intent.action: ", intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -1772632330:
                    if (action.equals("android.net.wifi.p2p.CONNECTION_STATE_CHANGE")) {
                        final WifiP2pInfo wifiP2pInfo = Build.VERSION.SDK_INT >= 33 ? (WifiP2pInfo) intent.getParcelableExtra("wifiP2pInfo", WifiP2pInfo.class) : (WifiP2pInfo) intent.getParcelableExtra("wifiP2pInfo");
                        companion.d(Constants.TAG, "CONNECTION_STATE_CHANGE info: " + wifiP2pInfo);
                        if (wifiP2pInfo == null || !wifiP2pInfo.groupFormed) {
                            this.isConnected = false;
                            if (this.context.getConnectionType() == 9 && (wifiDirectDiscoverableTask = this.discoverableTask) != null) {
                                wifiDirectDiscoverableTask.discoverable();
                            }
                        } else {
                            this.isConnected = true;
                            WifiP2pManager wifiP2pManager = this.wifiP2pManager;
                            if (wifiP2pManager != null) {
                                WifiP2pManager.Channel channel = this.channel;
                                if (channel == null) {
                                    l.j("channel");
                                    throw null;
                                }
                                wifiP2pManager.requestGroupInfo(channel, new WifiP2pManager.GroupInfoListener() { // from class: com.baidu.carlife.sdk.receiver.transport.direct.d
                                    @Override // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
                                    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
                                        WifiDirectManager.onReceive$lambda$8(this.f2703a, wifiP2pInfo, wifiP2pGroup);
                                    }
                                });
                            }
                        }
                        companion.d(Constants.TAG, "CONNECTION_STATE_CHANGE ", Boolean.valueOf(this.isConnected));
                        return;
                    }
                    return;
                case -1566767901:
                    if (action.equals("android.net.wifi.p2p.THIS_DEVICE_CHANGED")) {
                        WifiP2pDevice wifiP2pDevice = Build.VERSION.SDK_INT >= 33 ? (WifiP2pDevice) intent.getParcelableExtra("wifiP2pDevice", WifiP2pDevice.class) : (WifiP2pDevice) intent.getParcelableExtra("wifiP2pDevice");
                        if (wifiP2pDevice != null) {
                            companion.d(Constants.TAG, "设备名称: " + wifiP2pDevice.deviceName);
                            String str = wifiP2pDevice.deviceName;
                            if (str != null) {
                                this.wifiDirectName = str;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case -1394739139:
                    action.equals("android.net.wifi.p2p.PEERS_CHANGED");
                    return;
                case 1695662461:
                    if (action.equals("android.net.wifi.p2p.STATE_CHANGED") && intent.getIntExtra("wifi_p2p_state", 1) != 2) {
                        this.isConnected = false;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final synchronized void register() {
        try {
            if (!this.isRegistered) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
                intentFilter.addAction("android.net.wifi.p2p.PEERS_CHANGED");
                intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
                intentFilter.addAction("android.net.wifi.p2p.THIS_DEVICE_CHANGED");
                f.g(this.context.getApplicationContext(), this, intentFilter);
                this.isRegistered = true;
            }
        } catch (Exception e7) {
            Logger.INSTANCE.d(Constants.TAG, "【WLAN直连】广播注册异常: " + e7.getMessage());
        }
    }

    public final void terminate() {
        Logger.INSTANCE.d(Constants.TAG, "WifiP2pManager terminate");
        WifiDirectDiscoverableTask wifiDirectDiscoverableTask = this.discoverableTask;
        if (wifiDirectDiscoverableTask != null) {
            wifiDirectDiscoverableTask.terminate();
        }
        unregister();
    }

    public final synchronized void unregister() {
        try {
            if (this.isRegistered) {
                this.context.getApplicationContext().unregisterReceiver(this);
                this.isRegistered = false;
            }
        } catch (Exception e7) {
            Logger.INSTANCE.d(Constants.TAG, "【WLAN直连】广播注销异常: " + e7.getMessage(), e7);
        }
    }
}
