package com.baidu.carlife.sdk.receiver.transport.direct;

import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pInfo;
import com.baidu.carlife.protobuf.CarlifeWirlessInfoProto;
import com.baidu.carlife.protobuf.CarlifeWirlessIpProto;
import com.baidu.carlife.protobuf.CarlifeWirlessStatusProto;
import com.baidu.carlife.protobuf.CarlifeWirlessTargetProto;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.ConnectionChangeListener;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.communicator.BluetoothCommunicator;
import com.baidu.carlife.sdk.receiver.transport.direct.bluetooth.BluetoothDeviceDiscover;
import com.baidu.carlife.sdk.util.Logger;
import com.google.protobuf.l1;
import com.tencent.bugly.proguard.j0;
import i9.l;
import i9.n;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u0019J\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0016\u0010#\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/direct/InstantConnectionSetup;", "Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover$Callback;", "Lcom/baidu/carlife/sdk/receiver/transport/direct/WifiDirectManager$Callbacks;", "Lcom/baidu/carlife/sdk/ConnectionChangeListener;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "Lcom/baidu/carlife/sdk/receiver/transport/direct/InstantConnectionSetup$Callback;", "callback", "<init>", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lcom/baidu/carlife/sdk/receiver/transport/direct/InstantConnectionSetup$Callback;)V", "Lcom/baidu/carlife/sdk/internal/transport/communicator/BluetoothCommunicator;", "communicator", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "Lt8/z;", "dispatchMessage", "(Lcom/baidu/carlife/sdk/internal/transport/communicator/BluetoothCommunicator;Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "handleWirelessInfoRequest", "(Lcom/baidu/carlife/sdk/internal/transport/communicator/BluetoothCommunicator;)V", "handleTargetInfoRequest", "requestIp", "handleResponseIp", "handleResponseWirlessStatus", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "connect", "()V", "onDeviceConnected", "Landroid/net/wifi/p2p/WifiP2pInfo;", "info", "(Landroid/net/wifi/p2p/WifiP2pInfo;)V", "terminate", "process", "Lcom/baidu/carlife/sdk/CarLifeContext;", "Lcom/baidu/carlife/sdk/receiver/transport/direct/InstantConnectionSetup$Callback;", "Landroid/net/wifi/WifiManager;", "wifiManager", "Landroid/net/wifi/WifiManager;", "Lcom/baidu/carlife/sdk/receiver/transport/direct/WifiDirectManager;", "wifiDirectManager", "Lcom/baidu/carlife/sdk/receiver/transport/direct/WifiDirectManager;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isProcessing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/baidu/carlife/sdk/internal/transport/communicator/BluetoothCommunicator;", "Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover;", "bluetoothDeviceDiscover", "Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover;", "Callback", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class InstantConnectionSetup implements BluetoothDeviceDiscover.Callback, WifiDirectManager.Callbacks, ConnectionChangeListener {
    private final BluetoothDeviceDiscover bluetoothDeviceDiscover;
    private final Callback callback;
    private BluetoothCommunicator communicator;
    private final CarLifeContext context;
    private final AtomicBoolean isProcessing;
    private final WifiDirectManager wifiDirectManager;
    private final WifiManager wifiManager;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/direct/InstantConnectionSetup$Callback;", "", "", "address", "Lt8/z;", "onDeviceConnected", "(Ljava/lang/String;)V", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public interface Callback {
        void onDeviceConnected(String address);
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.receiver.transport.direct.InstantConnectionSetup$handleResponseIp$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt8/z;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass1 extends n implements h9.a {
        final /* synthetic */ BluetoothCommunicator $communicator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BluetoothCommunicator bluetoothCommunicator) {
            super(0);
            this.$communicator = bluetoothCommunicator;
        }

        @Override // h9.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m6invoke();
            return z.f12851a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m6invoke() {
            InstantConnectionSetup.this.requestIp(this.$communicator);
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.receiver.transport.direct.InstantConnectionSetup$onDeviceConnected$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt8/z;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class C00011 extends n implements h9.a {
        final /* synthetic */ BluetoothCommunicator $communicator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00011(BluetoothCommunicator bluetoothCommunicator) {
            super(0);
            this.$communicator = bluetoothCommunicator;
        }

        @Override // h9.a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m7invoke();
            return z.f12851a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m7invoke() throws Throwable {
            InstantConnectionSetup.this.process(this.$communicator);
        }
    }

    public InstantConnectionSetup(CarLifeContext carLifeContext, Callback callback) {
        l.e(carLifeContext, "context");
        l.e(callback, "callback");
        this.context = carLifeContext;
        this.callback = callback;
        Object systemService = carLifeContext.getContext().getSystemService("wifi");
        this.wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
        this.wifiDirectManager = new WifiDirectManager(carLifeContext, this);
        this.isProcessing = new AtomicBoolean(false);
        this.bluetoothDeviceDiscover = new BluetoothDeviceDiscover(carLifeContext, this);
    }

    private final void dispatchMessage(BluetoothCommunicator communicator, CarLifeMessage message) throws Exception {
        switch (message.getServiceType()) {
            case ServiceTypes.MSG_WIRELESS_INFO_REQUEST /* 1048577 */:
                handleWirelessInfoRequest(communicator);
                break;
            case ServiceTypes.MSG_WIRELESS_TARGET_INFO_REQUEST /* 1048580 */:
                handleTargetInfoRequest(communicator);
                break;
            case ServiceTypes.MSG_WIRELESS_RESPONSE_IP /* 1048583 */:
                handleResponseIp(communicator, message);
                break;
            case ServiceTypes.MSG_WIRELESS_MD_STATUS /* 1048584 */:
                handleResponseWirlessStatus(message);
                break;
        }
    }

    private final void handleResponseIp(BluetoothCommunicator communicator, CarLifeMessage message) {
        l1 protoPayload = message.getProtoPayload();
        CarlifeWirlessIpProto.CarlifeWirlessIp carlifeWirlessIp = protoPayload instanceof CarlifeWirlessIpProto.CarlifeWirlessIp ? (CarlifeWirlessIpProto.CarlifeWirlessIp) protoPayload : null;
        if (carlifeWirlessIp != null) {
            String wirlessip = carlifeWirlessIp.getWirlessip();
            l.d(wirlessip, "wirelessIp.wirlessip");
            if (wirlessip.length() > 0) {
                this.context.onConnectionPrompt("已获取手机端IP地址: " + carlifeWirlessIp.getWirlessip());
                Callback callback = this.callback;
                String wirlessip2 = carlifeWirlessIp.getWirlessip();
                l.d(wirlessip2, "wirelessIp.wirlessip");
                callback.onDeviceConnected(wirlessip2);
                return;
            }
        }
        if (this.wifiDirectManager.getIsConnected()) {
            this.context.postDelayed(1000L, new AnonymousClass1(communicator));
        }
    }

    private final void handleResponseWirlessStatus(CarLifeMessage message) {
        l1 protoPayload = message.getProtoPayload();
        l.c(protoPayload, "null cannot be cast to non-null type com.baidu.carlife.protobuf.CarlifeWirlessStatusProto.CarlifeWirlessStatus");
        CarlifeWirlessStatusProto.CarlifeWirlessStatus carlifeWirlessStatus = (CarlifeWirlessStatusProto.CarlifeWirlessStatus) protoPayload;
        if (carlifeWirlessStatus.getStatus() == 2) {
            this.context.onConnectionPrompt("手机端WiFi未打开");
        } else if (carlifeWirlessStatus.getStatus() == 3) {
            this.context.onConnectionPrompt("手机端电量不足");
        }
    }

    private final void handleTargetInfoRequest(BluetoothCommunicator communicator) throws Exception {
        String wifiDirectName = (String) this.context.getConfig(Configs.CONFIG_WIFI_DIRECT_NAME);
        if (wifiDirectName == null || wifiDirectName.length() == 0) {
            wifiDirectName = null;
        }
        if (wifiDirectName == null) {
            wifiDirectName = this.wifiDirectManager.getWifiDirectName();
        }
        if (wifiDirectName == null || wifiDirectName.length() == 0) {
            this.context.onConnectionPrompt("请先在连接设置中填写直连名称");
            return;
        }
        this.context.onConnectionPrompt("发送车机端直连名称: ".concat(wifiDirectName));
        CarLifeMessage carLifeMessageObtain$default = CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, 1, Integer.valueOf(ServiceTypes.MSG_WIRELESS_TARGET_INFO_RESPONSE), 0, 4, null);
        carLifeMessageObtain$default.payload(CarlifeWirlessTargetProto.CarlifeWirlessTarget.newBuilder().setWifiDeviceName(wifiDirectName).setTargetInfo("").m16build());
        communicator.write(carLifeMessageObtain$default);
        if (this.wifiDirectManager.getIsConnected()) {
            requestIp(communicator);
        } else {
            this.wifiDirectManager.discoverable();
        }
    }

    private final void handleWirelessInfoRequest(BluetoothCommunicator communicator) throws Exception {
        this.context.onConnectionPrompt("发送车机端支持的无线连接信息");
        CarLifeMessage carLifeMessageObtain$default = CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, 1, Integer.valueOf(ServiceTypes.MSG_WIRELESS_INFO_RESPONSE), 0, 4, null);
        CarlifeWirlessInfoProto.CarlifeWirlessInfo.Builder builderNewBuilder = CarlifeWirlessInfoProto.CarlifeWirlessInfo.newBuilder();
        WifiManager wifiManager = this.wifiManager;
        int i7 = 0;
        if (wifiManager != null && wifiManager.is5GHzBandSupported()) {
            i7 = 1;
        }
        carLifeMessageObtain$default.payload(builderNewBuilder.setWifiFrequency(i7).setWirlessType(3).m16build());
        communicator.write(carLifeMessageObtain$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestIp(BluetoothCommunicator communicator) {
        try {
            this.context.onConnectionPrompt("正在请求手机端IP地址");
            communicator.write(CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, 1, Integer.valueOf(ServiceTypes.MSG_WIRELESS_REQUEST_IP), 0, 4, null));
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "【WLAN直连】请求手机端IP地址异常: ", e7);
        }
    }

    public final void connect() {
        this.bluetoothDeviceDiscover.startDiscover();
        this.wifiDirectManager.discoverable();
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionAttached(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.a(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionAuthenFailed(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.b(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionDetached(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.c(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionEstablished(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.d(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionPrompt(String str) {
        com.baidu.carlife.sdk.a.e(this, str);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionReattached(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.f(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionVersionNotSupprt(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.g(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionWait() {
        com.baidu.carlife.sdk.a.h(this);
    }

    @Override // com.baidu.carlife.sdk.receiver.transport.direct.WifiDirectManager.Callbacks
    public void onDeviceConnected(WifiP2pInfo info) {
        l.e(info, "info");
        BluetoothCommunicator bluetoothCommunicator = this.communicator;
        if (bluetoothCommunicator != null) {
            requestIp(bluetoothCommunicator);
        }
    }

    @Override // com.baidu.carlife.sdk.receiver.transport.direct.bluetooth.BluetoothDeviceDiscover.Callback
    public void onDeviceConnected(BluetoothCommunicator communicator) {
        l.e(communicator, "communicator");
        new j0(1, new C00011(communicator)).start();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    public final void process(BluetoothCommunicator communicator) throws Throwable {
        CarLifeMessage carLifeMessage;
        l.e(communicator, "communicator");
        if (this.isProcessing.getAndSet(true)) {
            Logger.INSTANCE.d(Constants.TAG, "【WLAN直连】蓝牙Socket重复启动");
            return;
        }
        this.communicator = communicator;
        while (true) {
            CarLifeMessage carLifeMessage2 = null;
            try {
                carLifeMessage = communicator.read();
                try {
                    try {
                        dispatchMessage(communicator, carLifeMessage);
                        if (carLifeMessage != null) {
                            carLifeMessage.recycle();
                        }
                    } catch (Exception e7) {
                        e = e7;
                        Logger.INSTANCE.d(Constants.TAG, "【WLAN直连】蓝牙Socket通信异常: ", e);
                        terminate();
                        connect();
                        if (carLifeMessage != null) {
                            carLifeMessage.recycle();
                        }
                        this.isProcessing.set(false);
                        this.communicator = null;
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    carLifeMessage2 = carLifeMessage;
                    if (carLifeMessage2 != null) {
                        carLifeMessage2.recycle();
                    }
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                carLifeMessage = null;
            } catch (Throwable th2) {
                th = th2;
                if (carLifeMessage2 != null) {
                    carLifeMessage2.recycle();
                }
                throw th;
            }
        }
    }

    public final void terminate() {
        this.bluetoothDeviceDiscover.terminate();
        this.wifiDirectManager.terminate();
    }
}
