package com.baidu.carlife.sdk.receiver.transport.hotspot;

import android.content.Context;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.ProtocolTransport;
import com.baidu.carlife.sdk.receiver.transport.wirless.WirlessConnector;
import com.baidu.carlife.sdk.util.Logger;
import i9.l;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import zb.i;
import zb.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0002*+B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\b\u0018\u00010\u001eR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/hotspot/HotspotProtocolTransport;", "Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "carLifeContext", "Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport$ConnectionListener;", "connectionListener", "<init>", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lcom/baidu/carlife/sdk/internal/transport/ProtocolTransport$ConnectionListener;)V", "Lt8/z;", "connect", "()V", "ready", "listen", "terminate", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "write", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "read", "()Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRunning", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "receiveBuf", "[B", "Ljava/net/DatagramSocket;", "socket", "Ljava/net/DatagramSocket;", "Lcom/baidu/carlife/sdk/receiver/transport/hotspot/HotspotProtocolTransport$WifiConnectThread;", "wifiConnectThread", "Lcom/baidu/carlife/sdk/receiver/transport/hotspot/HotspotProtocolTransport$WifiConnectThread;", "Lcom/baidu/carlife/sdk/receiver/transport/wirless/WirlessConnector;", "wirlessConnector", "Lcom/baidu/carlife/sdk/receiver/transport/wirless/WirlessConnector;", "Lzb/i;", "ipv4Regex", "Lzb/i;", "", "isConnecting", "()Z", "Companion", "WifiConnectThread", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class HotspotProtocolTransport extends ProtocolTransport {
    private static final int BROADCAST_WIFI_PORT = 7999;
    private static final int RECEIVE_BUFFER_SIZE = 1024;
    private static final int SCAN_RETRY_DELAY_MS = 1000;
    private final CarLifeContext carLifeContext;
    private final i ipv4Regex;
    private final AtomicBoolean isRunning;
    private byte[] receiveBuf;
    private DatagramSocket socket;
    private WifiConnectThread wifiConnectThread;
    private final WirlessConnector wirlessConnector;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0006J\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/hotspot/HotspotProtocolTransport$WifiConnectThread;", "Ljava/lang/Thread;", "<init>", "(Lcom/baidu/carlife/sdk/receiver/transport/hotspot/HotspotProtocolTransport;)V", "Lt8/z;", "handleUdpListening", "()V", "handleManualIpScan", "handleBluetoothScan", "", "msg", "showPrompt", "(Ljava/lang/String;)V", "run", "stopConnect", "lastPrompt", "Ljava/lang/String;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public final class WifiConnectThread extends Thread {
        private String lastPrompt;

        public WifiConnectThread() {
            super("WifiConnectThread");
        }

        private final void handleBluetoothScan() throws InterruptedException {
            showPrompt("正在请求蓝牙Socket连接");
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            BluetoothDeviceDiscover bluetoothDeviceDiscover = BluetoothDeviceDiscover.INSTANCE;
            Context context = HotspotProtocolTransport.this.getContext().getContext();
            final HotspotProtocolTransport hotspotProtocolTransport = HotspotProtocolTransport.this;
            bluetoothDeviceDiscover.startScan(context, new BluetoothDeviceDiscover.ScanCallback() { // from class: com.baidu.carlife.sdk.receiver.transport.hotspot.HotspotProtocolTransport$WifiConnectThread$handleBluetoothScan$1
                @Override // com.baidu.carlife.sdk.receiver.transport.hotspot.BluetoothDeviceDiscover.ScanCallback
                public void onFinished() {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        countDownLatch.countDown();
                    }
                }

                @Override // com.baidu.carlife.sdk.receiver.transport.hotspot.BluetoothDeviceDiscover.ScanCallback
                public void onFound(String phoneIp) {
                    l.e(phoneIp, "phoneIp");
                    if (hotspotProtocolTransport.ipv4Regex.a(phoneIp)) {
                        this.showPrompt("收到蓝牙Socket消息: ".concat(phoneIp));
                        try {
                            if (hotspotProtocolTransport.wirlessConnector.startConnect(phoneIp)) {
                                hotspotProtocolTransport.onConnectionAttached();
                                BluetoothDeviceDiscover.INSTANCE.stopScan();
                            }
                        } catch (Exception unused) {
                            this.showPrompt("连接失败");
                        }
                    } else {
                        this.showPrompt("收到蓝牙Socket消息: IP地址不合法");
                    }
                    if (atomicBoolean.compareAndSet(false, true)) {
                        countDownLatch.countDown();
                    }
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                BluetoothDeviceDiscover.INSTANCE.stopScan();
                Thread.currentThread().interrupt();
            }
            if (HotspotProtocolTransport.this.isConnecting() || !HotspotProtocolTransport.this.isRunning.get()) {
                return;
            }
            Thread.sleep(1000L);
        }

        private final void handleManualIpScan() throws InterruptedException {
            String str = (String) HotspotProtocolTransport.this.getContext().getConfig(Configs.CONFIG_TARGET_IP_ADDRESS, "");
            if (str.length() == 0) {
                showPrompt("请先设置IP地址");
                Thread.sleep(10000L);
                return;
            }
            if (!HotspotProtocolTransport.this.ipv4Regex.a(str)) {
                showPrompt("IP地址不合法: ".concat(str));
                Thread.sleep(10000L);
                return;
            }
            showPrompt("正在扫描网段 " + j.Q0(str, str) + ".(1-254)");
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            HotspotLanScanner hotspotLanScanner = HotspotLanScanner.INSTANCE;
            final HotspotProtocolTransport hotspotProtocolTransport = HotspotProtocolTransport.this;
            hotspotLanScanner.startScan(str, new HotspotLanScanner.ScanCallback() { // from class: com.baidu.carlife.sdk.receiver.transport.hotspot.HotspotProtocolTransport$WifiConnectThread$handleManualIpScan$1
                @Override // com.baidu.carlife.sdk.receiver.transport.hotspot.HotspotLanScanner.ScanCallback
                public void onFinished() {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        countDownLatch.countDown();
                    }
                }

                @Override // com.baidu.carlife.sdk.receiver.transport.hotspot.HotspotLanScanner.ScanCallback
                public void onFound(String ip) {
                    l.e(ip, "ip");
                    this.this$0.showPrompt("扫描到IP: ".concat(ip));
                    try {
                        if (hotspotProtocolTransport.wirlessConnector.startConnect(ip)) {
                            hotspotProtocolTransport.onConnectionAttached();
                            HotspotLanScanner.INSTANCE.stopScan();
                        }
                    } catch (Exception unused) {
                        this.this$0.showPrompt("连接失败");
                    }
                    if (atomicBoolean.compareAndSet(false, true)) {
                        countDownLatch.countDown();
                    }
                }
            });
            countDownLatch.await();
            if (HotspotProtocolTransport.this.isConnecting() || !HotspotProtocolTransport.this.isRunning.get()) {
                return;
            }
            Thread.sleep(1000L);
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001f  */
        private final void handleUdpListening() throws InterruptedException, IOException {
            if (HotspotProtocolTransport.this.socket != null) {
                DatagramSocket datagramSocket = HotspotProtocolTransport.this.socket;
                l.b(datagramSocket);
                if (datagramSocket.isClosed()) {
                    showPrompt("UDP广播监听中");
                    try {
                        HotspotProtocolTransport.this.socket = new DatagramSocket(HotspotProtocolTransport.BROADCAST_WIFI_PORT);
                    } catch (Exception e7) {
                        Logger.INSTANCE.e(Constants.TAG, "Create Socket Failed: " + e7.getMessage());
                        Thread.sleep(1000L);
                        return;
                    }
                }
            } else {
                showPrompt("UDP广播监听中");
                HotspotProtocolTransport.this.socket = new DatagramSocket(HotspotProtocolTransport.BROADCAST_WIFI_PORT);
            }
            DatagramPacket datagramPacket = new DatagramPacket(HotspotProtocolTransport.this.receiveBuf, HotspotProtocolTransport.this.receiveBuf.length);
            try {
                DatagramSocket datagramSocket2 = HotspotProtocolTransport.this.socket;
                if (datagramSocket2 != null) {
                    datagramSocket2.receive(datagramPacket);
                }
                if (HotspotProtocolTransport.this.isConnecting() || !HotspotProtocolTransport.this.isRunning.get()) {
                    return;
                }
                InetAddress address = datagramPacket.getAddress();
                String hostAddress = address != null ? address.getHostAddress() : null;
                if (hostAddress != null && hostAddress.length() != 0) {
                    showPrompt("收到UDP广播: " + hostAddress);
                    Logger.INSTANCE.d(Constants.TAG, "收到 UDP 广播: " + hostAddress);
                    try {
                        if (HotspotProtocolTransport.this.wirlessConnector.startConnect(hostAddress)) {
                            HotspotProtocolTransport.this.onConnectionAttached();
                        }
                    } catch (Exception unused) {
                        showPrompt("连接失败");
                    }
                }
            } catch (SocketException e10) {
                if (HotspotProtocolTransport.this.isRunning.get()) {
                    Logger.INSTANCE.w(Constants.TAG, "Socket exception: " + e10.getMessage());
                    HotspotProtocolTransport.this.socket = null;
                }
            } catch (SocketTimeoutException unused2) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void showPrompt(String msg) {
            if (l.a(this.lastPrompt, msg)) {
                return;
            }
            HotspotProtocolTransport.this.carLifeContext.onConnectionPrompt(msg);
            this.lastPrompt = msg;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (HotspotProtocolTransport.this.isRunning.get() && !isInterrupted()) {
                try {
                    if (HotspotProtocolTransport.this.isConnecting()) {
                        stopConnect();
                        return;
                    }
                    int iIntValue = ((Number) HotspotProtocolTransport.this.getContext().getConfig(Configs.CONFIG_TARGET_IP_GET, 0)).intValue();
                    if (iIntValue != 1) {
                        HotspotLanScanner.INSTANCE.stopScan();
                    }
                    if (iIntValue != 2) {
                        BluetoothDeviceDiscover.INSTANCE.stopScan();
                    }
                    if (iIntValue == 1) {
                        handleManualIpScan();
                    } else if (iIntValue != 2) {
                        handleUdpListening();
                    } else {
                        handleBluetoothScan();
                    }
                } catch (Exception e7) {
                    Logger.INSTANCE.e(Constants.TAG, "Loop Error: " + e7.getMessage());
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        public final void stopConnect() {
            HotspotProtocolTransport.this.isRunning.set(false);
            HotspotLanScanner.INSTANCE.stopScan();
            BluetoothDeviceDiscover.INSTANCE.stopScan();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotspotProtocolTransport(CarLifeContext carLifeContext, ProtocolTransport.ConnectionListener connectionListener) {
        super(carLifeContext, connectionListener);
        l.e(carLifeContext, "carLifeContext");
        this.carLifeContext = carLifeContext;
        this.isRunning = new AtomicBoolean(false);
        this.receiveBuf = new byte[1024];
        this.wirlessConnector = new WirlessConnector();
        this.ipv4Regex = new i("^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isConnecting() {
        return this.carLifeContext.getConnectionState() != 0;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public void connect() {
        Logger.INSTANCE.d(Constants.TAG, "WirlessProtocolTransport connect listener");
        this.isRunning.set(true);
        if (this.wifiConnectThread == null) {
            WifiConnectThread wifiConnectThread = new WifiConnectThread();
            wifiConnectThread.start();
            this.wifiConnectThread = wifiConnectThread;
        }
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public void listen() {
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public CarLifeMessage read() {
        return this.wirlessConnector.read();
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public void ready() {
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public void terminate() {
        Logger.INSTANCE.d(Constants.TAG, "WirlessProtocolTransport terminate");
        this.isRunning.set(false);
        this.wirlessConnector.terminate();
        BluetoothDeviceDiscover.INSTANCE.stopScan();
        HotspotLanScanner.INSTANCE.stopScan();
        WifiConnectThread wifiConnectThread = this.wifiConnectThread;
        if (wifiConnectThread != null && wifiConnectThread != null) {
            wifiConnectThread.stopConnect();
        }
        this.wifiConnectThread = null;
        try {
            try {
                DatagramSocket datagramSocket = this.socket;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
            } catch (Exception e7) {
                Logger.INSTANCE.e(Constants.TAG, "Socket close error: " + e7.getMessage());
            }
            this.socket = null;
            onConnectionDetached();
        } catch (Throwable th) {
            this.socket = null;
            throw th;
        }
    }

    @Override // com.baidu.carlife.sdk.internal.transport.ProtocolTransport
    public void write(CarLifeMessage message) throws IOException {
        l.e(message, "message");
        this.wirlessConnector.write(message);
    }
}
