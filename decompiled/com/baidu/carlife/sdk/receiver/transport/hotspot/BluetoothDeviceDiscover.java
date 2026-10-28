package com.baidu.carlife.sdk.receiver.transport.hotspot;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import c.n;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.BluetoothUtils;
import com.baidu.carlife.sdk.util.Logger;
import i9.l;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0003R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/hotspot/BluetoothDeviceDiscover;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/baidu/carlife/sdk/receiver/transport/hotspot/BluetoothDeviceDiscover$ScanCallback;", "callback", "Lt8/z;", "performScan", "(Landroid/content/Context;Lcom/baidu/carlife/sdk/receiver/transport/hotspot/BluetoothDeviceDiscover$ScanCallback;)V", "Landroid/bluetooth/BluetoothDevice;", "device", "Landroid/bluetooth/BluetoothSocket;", "connect", "(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothSocket;", "socket", "", "readIpFromSocket", "(Landroid/bluetooth/BluetoothSocket;)Ljava/lang/String;", "startScan", "stopScan", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isScanning", "Ljava/util/concurrent/atomic/AtomicBoolean;", "connectingSocket", "Landroid/bluetooth/BluetoothSocket;", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "ScanCallback", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class BluetoothDeviceDiscover {
    private static volatile BluetoothSocket connectingSocket;
    private static final ExecutorService executor;
    public static final BluetoothDeviceDiscover INSTANCE = new BluetoothDeviceDiscover();
    private static final AtomicBoolean isScanning = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/hotspot/BluetoothDeviceDiscover$ScanCallback;", "", "", "phoneIp", "Lt8/z;", "onFound", "(Ljava/lang/String;)V", "onFinished", "()V", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public interface ScanCallback {
        void onFinished();

        void onFound(String phoneIp);
    }

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        l.d(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        executor = executorServiceNewSingleThreadExecutor;
    }

    private BluetoothDeviceDiscover() {
    }

    private final BluetoothSocket connect(BluetoothDevice device) throws IOException {
        BluetoothSocket bluetoothSocketCreateRfcommSocketToServiceRecord = device.createRfcommSocketToServiceRecord(UUID.fromString("f3a2c7b1-9d4e-4c8a-8b6f-2e7d9c5a1b42"));
        synchronized (this) {
            if (!isScanning.get()) {
                throw new IOException("Scan stopped before connect");
            }
            connectingSocket = bluetoothSocketCreateRfcommSocketToServiceRecord;
        }
        try {
            Logger.INSTANCE.d(Constants.TAG, "【蓝牙扫描】正在连接: " + device.getName() + " ...");
            bluetoothSocketCreateRfcommSocketToServiceRecord.connect();
            return bluetoothSocketCreateRfcommSocketToServiceRecord;
        } catch (IOException e7) {
            try {
                bluetoothSocketCreateRfcommSocketToServiceRecord.close();
            } catch (Exception unused) {
            }
            throw e7;
        }
    }

    private final void performScan(Context context, ScanCallback callback) {
        BluetoothSocket bluetoothSocketConnect;
        Logger.Companion companion = Logger.INSTANCE;
        companion.d(Constants.TAG, "【蓝牙扫描】开始新一轮扫描");
        BluetoothUtils bluetoothUtils = BluetoothUtils.INSTANCE;
        if (!bluetoothUtils.enableBluetooth(context)) {
            companion.e(Constants.TAG, "【蓝牙扫描】蓝牙未开启，扫描结束");
            callback.onFinished();
            isScanning.set(false);
            return;
        }
        Set<BluetoothDevice> bondedDevices = bluetoothUtils.getBondedDevices(context);
        if (bondedDevices.isEmpty()) {
            companion.d(Constants.TAG, "【蓝牙扫描】无配对设备");
            callback.onFinished();
            isScanning.set(false);
            return;
        }
        Set<BluetoothDevice> arrayList = new ArrayList();
        for (Object obj : bondedDevices) {
            if (BluetoothUtils.INSTANCE.isDeviceConnected((BluetoothDevice) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = bondedDevices;
        }
        Iterator it = arrayList.iterator();
        try {
            while (true) {
                if (it.hasNext()) {
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) it.next();
                    if (isScanning.get()) {
                        try {
                            bluetoothSocketConnect = connect(bluetoothDevice);
                            Logger.INSTANCE.d(Constants.TAG, "【蓝牙扫描】连接成功: " + bluetoothDevice.getName());
                            String ipFromSocket = readIpFromSocket(bluetoothSocketConnect);
                            if (ipFromSocket.length() <= 0) {
                                break;
                            }
                            callback.onFound(ipFromSocket);
                            break;
                        } catch (IOException e7) {
                            if (isScanning.get()) {
                                Logger.INSTANCE.e(Constants.TAG, "【蓝牙扫描】连接失败 (" + bluetoothDevice.getName() + "): " + e7.getMessage());
                            } else {
                                Logger.INSTANCE.w(Constants.TAG, "【蓝牙扫描】连接被中断 (" + bluetoothDevice.getName() + ')');
                            }
                        }
                    } else {
                        Logger.INSTANCE.d(Constants.TAG, "【蓝牙扫描】已停止，退出循环");
                    }
                }
                isScanning.set(false);
                connectingSocket = null;
                Logger.INSTANCE.d(Constants.TAG, "【蓝牙扫描】扫描流程结束");
                callback.onFinished();
            }
            bluetoothSocketConnect.close();
        } catch (Exception unused) {
        }
        isScanning.set(false);
        connectingSocket = null;
        Logger.INSTANCE.d(Constants.TAG, "【蓝牙扫描】扫描流程结束");
        callback.onFinished();
    }

    private final String readIpFromSocket(BluetoothSocket socket) {
        try {
            InputStream inputStream = socket.getInputStream();
            l.d(inputStream, "socket.inputStream");
            byte[] bArr = new byte[1024];
            int i7 = inputStream.read(bArr);
            return i7 > 0 ? new String(bArr, 0, i7, a.f15804a) : "";
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "【蓝牙扫描】读取IP失败: " + e7.getMessage());
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startScan$lambda$0(Context context, ScanCallback scanCallback) {
        INSTANCE.performScan(context, scanCallback);
    }

    public final void startScan(Context context, ScanCallback callback) {
        l.e(context, "context");
        l.e(callback, "callback");
        stopScan();
        isScanning.set(true);
        executor.execute(new n(1, context, callback));
    }

    public final void stopScan() {
        if (isScanning.compareAndSet(true, false)) {
            Logger.INSTANCE.d(Constants.TAG, "【蓝牙扫描】收到停止指令，正在中断...");
            try {
                BluetoothSocket bluetoothSocket = connectingSocket;
                if (bluetoothSocket != null) {
                    bluetoothSocket.close();
                }
            } catch (Exception e7) {
                Logger.INSTANCE.e(Constants.TAG, "【蓝牙扫描】关闭Socket异常: " + e7.getMessage());
            }
            connectingSocket = null;
        }
    }
}
