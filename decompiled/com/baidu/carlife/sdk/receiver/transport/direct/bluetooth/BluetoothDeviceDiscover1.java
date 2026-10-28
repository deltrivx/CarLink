package com.baidu.carlife.sdk.receiver.transport.direct.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.communicator.BluetoothCommunicator;
import com.baidu.carlife.sdk.internal.transport.communicator.Communicator;
import com.baidu.carlife.sdk.util.BluetoothUtils;
import com.baidu.carlife.sdk.util.Logger;
import i9.g;
import i9.l;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002'(B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover1;", "Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator$Callbacks;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover1$Callback;", "callback1", "<init>", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover1$Callback;)V", "Lt8/z;", "performScan", "()V", "Landroid/bluetooth/BluetoothDevice;", "device", "Landroid/bluetooth/BluetoothSocket;", "connect", "(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothSocket;", "socket", "", "readIpFromSocket", "(Landroid/bluetooth/BluetoothSocket;)Ljava/lang/String;", "startScan", "stopScan", "", "channel", "onTerminated", "(I)V", "Lcom/baidu/carlife/sdk/CarLifeContext;", "Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover1$Callback;", "Lcom/baidu/carlife/sdk/internal/transport/communicator/BluetoothCommunicator;", "connectedCommunicator", "Lcom/baidu/carlife/sdk/internal/transport/communicator/BluetoothCommunicator;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isScanning", "Ljava/util/concurrent/atomic/AtomicBoolean;", "connectingSocket", "Landroid/bluetooth/BluetoothSocket;", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "Callback", "ScanCallback", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class BluetoothDeviceDiscover1 implements Communicator.Callbacks {
    private final Callback callback1;
    private BluetoothCommunicator connectedCommunicator;
    private volatile BluetoothSocket connectingSocket;
    private final CarLifeContext context;
    private final ExecutorService executor;
    private final AtomicBoolean isScanning;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover1$Callback;", "", "Lcom/baidu/carlife/sdk/internal/transport/communicator/BluetoothCommunicator;", "communicator", "Lt8/z;", "onDeviceConnected1", "(Lcom/baidu/carlife/sdk/internal/transport/communicator/BluetoothCommunicator;)V", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public interface Callback {
        void onDeviceConnected1(BluetoothCommunicator communicator);
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover1$ScanCallback;", "", "", "phoneIp", "Lt8/z;", "onFound", "(Ljava/lang/String;)V", "onFinished", "()V", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public interface ScanCallback {
        void onFinished();

        void onFound(String phoneIp);
    }

    public BluetoothDeviceDiscover1(CarLifeContext carLifeContext, Callback callback) {
        l.e(carLifeContext, "context");
        this.context = carLifeContext;
        this.callback1 = callback;
        this.isScanning = new AtomicBoolean(false);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        l.d(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this.executor = executorServiceNewSingleThreadExecutor;
    }

    public /* synthetic */ BluetoothDeviceDiscover1(CarLifeContext carLifeContext, Callback callback, int i7, g gVar) {
        this(carLifeContext, (i7 & 2) != 0 ? null : callback);
    }

    private final BluetoothSocket connect(BluetoothDevice device) throws IOException {
        BluetoothSocket bluetoothSocketCreateRfcommSocketToServiceRecord = device.createRfcommSocketToServiceRecord(UUID.fromString(Constants.BLUETOOTH_COMMUNICATE_UUID));
        synchronized (this) {
            if (!this.isScanning.get()) {
                throw new IOException("Scan stopped before connect");
            }
            this.connectingSocket = bluetoothSocketCreateRfcommSocketToServiceRecord;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void performScan() {
        Logger.Companion companion = Logger.INSTANCE;
        int i7 = 1;
        companion.d(Constants.TAG, "【蓝牙扫描】开始新一轮扫描");
        BluetoothUtils bluetoothUtils = BluetoothUtils.INSTANCE;
        if (bluetoothUtils.enableBluetooth(this.context.getContext())) {
            Set<BluetoothDevice> bondedDevices = bluetoothUtils.getBondedDevices(this.context.getContext());
            if (bondedDevices.isEmpty()) {
                companion.d(Constants.TAG, "【蓝牙扫描】无配对设备");
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : bondedDevices) {
                    if (BluetoothUtils.INSTANCE.isDeviceConnected((BluetoothDevice) obj)) {
                        arrayList.add(obj);
                    }
                }
                boolean zIsEmpty = arrayList.isEmpty();
                Collection<BluetoothDevice> collection = arrayList;
                if (zIsEmpty) {
                    collection = bondedDevices;
                }
                for (BluetoothDevice bluetoothDevice : collection) {
                    if (!this.isScanning.get()) {
                        Logger.INSTANCE.d(Constants.TAG, "【蓝牙扫描】已停止，退出循环");
                        break;
                    }
                    try {
                        BluetoothSocket bluetoothSocketConnect = connect(bluetoothDevice);
                        Logger.INSTANCE.d(Constants.TAG, "【蓝牙扫描】连接成功: " + bluetoothDevice.getName());
                        BluetoothCommunicator bluetoothCommunicator = new BluetoothCommunicator(bluetoothSocketConnect, this);
                        this.connectedCommunicator = bluetoothCommunicator;
                        Callback callback = this.callback1;
                        if (callback == null) {
                            break;
                        }
                        callback.onDeviceConnected1(bluetoothCommunicator);
                        break;
                    } catch (IOException e7) {
                        if (!this.isScanning.get()) {
                            Logger.INSTANCE.w(Constants.TAG, "【蓝牙扫描】连接被中断 (" + bluetoothDevice.getName() + ')');
                            break;
                        }
                        Logger.INSTANCE.e(Constants.TAG, "【蓝牙扫描】连接失败 (" + bluetoothDevice.getName() + "): " + e7.getMessage());
                    }
                }
            }
        } else {
            companion.e(Constants.TAG, "【蓝牙扫描】蓝牙未开启，扫描结束");
        }
        this.isScanning.set(false);
        this.connectingSocket = null;
        Logger.Companion companion2 = Logger.INSTANCE;
        companion2.d(Constants.TAG, "【蓝牙扫描】扫描流程结束");
        if (this.isScanning.compareAndSet(false, true)) {
            companion2.d(Constants.TAG, "【蓝牙扫描】未连接成功，3秒后重试");
            this.executor.execute(new a(this, i7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performScan$lambda$3(BluetoothDeviceDiscover1 bluetoothDeviceDiscover1) {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException unused) {
        }
        bluetoothDeviceDiscover1.performScan();
    }

    private final String readIpFromSocket(BluetoothSocket socket) {
        try {
            InputStream inputStream = socket.getInputStream();
            l.d(inputStream, "socket.inputStream");
            byte[] bArr = new byte[1024];
            int i7 = inputStream.read(bArr);
            return i7 > 0 ? new String(bArr, 0, i7, zb.a.f15804a) : "";
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "【蓝牙扫描】读取IP失败: " + e7.getMessage());
            return "";
        }
    }

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator.Callbacks
    public void onTerminated(int channel) {
        this.connectedCommunicator = null;
    }

    public final void startScan() {
        stopScan();
        this.isScanning.set(true);
        this.executor.execute(new a(this, 0));
    }

    public final void stopScan() {
        if (this.isScanning.compareAndSet(true, false)) {
            Logger.INSTANCE.d(Constants.TAG, "【蓝牙扫描】收到停止指令，正在中断...");
            try {
                BluetoothSocket bluetoothSocket = this.connectingSocket;
                if (bluetoothSocket != null) {
                    bluetoothSocket.close();
                }
            } catch (Exception e7) {
                Logger.INSTANCE.e(Constants.TAG, "【蓝牙扫描】关闭Socket异常: " + e7.getMessage());
            }
            this.connectingSocket = null;
            BluetoothCommunicator bluetoothCommunicator = this.connectedCommunicator;
            if (bluetoothCommunicator != null) {
                bluetoothCommunicator.terminate();
            }
            this.connectedCommunicator = null;
        }
    }
}
