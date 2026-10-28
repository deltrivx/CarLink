package com.baidu.carlife.sdk.receiver.transport.direct.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import u3.f;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007*\u0001(\u0018\u00002\u00020\u00012\u00020\u0002:\u0001-B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover;", "Landroid/content/BroadcastReceiver;", "Lcom/baidu/carlife/sdk/internal/transport/communicator/Communicator$Callbacks;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover$Callback;", "callback", "<init>", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover$Callback;)V", "Lt8/z;", "discoverDevice", "()V", "Landroid/bluetooth/BluetoothDevice;", "device", "Landroid/bluetooth/BluetoothSocket;", "connect", "(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothSocket;", "startDiscover", "terminate", "", "channel", "onTerminated", "(I)V", "Landroid/content/Context;", "context1", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lcom/baidu/carlife/sdk/CarLifeContext;", "Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover$Callback;", "Lcom/baidu/carlife/sdk/internal/transport/communicator/BluetoothCommunicator;", "connectedCommunicator", "Lcom/baidu/carlife/sdk/internal/transport/communicator/BluetoothCommunicator;", "", "isReady", "Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDiscoveringTaskRunning", "Ljava/util/concurrent/atomic/AtomicBoolean;", "com/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover$discoverRunnable$1", "discoverRunnable", "Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover$discoverRunnable$1;", "isConnecting", "()Z", "Callback", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class BluetoothDeviceDiscover extends BroadcastReceiver implements Communicator.Callbacks {
    private final Callback callback;
    private BluetoothCommunicator connectedCommunicator;
    private final CarLifeContext context;
    private final BluetoothDeviceDiscover$discoverRunnable$1 discoverRunnable;
    private final AtomicBoolean isDiscoveringTaskRunning;
    private boolean isReady;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover$Callback;", "", "Lcom/baidu/carlife/sdk/internal/transport/communicator/BluetoothCommunicator;", "communicator", "Lt8/z;", "onDeviceConnected", "(Lcom/baidu/carlife/sdk/internal/transport/communicator/BluetoothCommunicator;)V", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public interface Callback {
        void onDeviceConnected(BluetoothCommunicator communicator);
    }

    public BluetoothDeviceDiscover(CarLifeContext carLifeContext, Callback callback) {
        l.e(carLifeContext, "context");
        this.context = carLifeContext;
        this.callback = callback;
        this.isDiscoveringTaskRunning = new AtomicBoolean(false);
        this.discoverRunnable = new BluetoothDeviceDiscover$discoverRunnable$1(this);
    }

    public /* synthetic */ BluetoothDeviceDiscover(CarLifeContext carLifeContext, Callback callback, int i7, g gVar) {
        this(carLifeContext, (i7 & 2) != 0 ? null : callback);
    }

    private final BluetoothSocket connect(BluetoothDevice device) throws IOException {
        BluetoothSocket bluetoothSocketCreateRfcommSocketToServiceRecord = device.createRfcommSocketToServiceRecord(UUID.fromString(Constants.BLUETOOTH_COMMUNICATE_UUID));
        try {
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
    public final void discoverDevice() {
        BluetoothUtils bluetoothUtils = BluetoothUtils.INSTANCE;
        if (!bluetoothUtils.enableBluetooth(this.context.getContext())) {
            Logger.INSTANCE.e(Constants.TAG, "【连接广播】蓝牙未开启");
            this.context.onConnectionPrompt("蓝牙未开启");
            return;
        }
        try {
            Set<BluetoothDevice> bondedDevices = bluetoothUtils.getBondedDevices(this.context.getContext());
            if (bondedDevices.isEmpty()) {
                this.context.onConnectionPrompt("未获取到蓝牙配对记录");
                return;
            }
            Collection<BluetoothDevice> arrayList = new ArrayList();
            for (Object obj : bondedDevices) {
                if (BluetoothUtils.INSTANCE.isDeviceConnected((BluetoothDevice) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = bondedDevices;
            }
            BluetoothSocket bluetoothSocketConnect = null;
            for (BluetoothDevice bluetoothDevice : arrayList) {
                try {
                    bluetoothSocketConnect = connect(bluetoothDevice);
                    Logger.INSTANCE.d(Constants.TAG, "【蓝牙连接】连接成功: " + bluetoothDevice.getName());
                    break;
                } catch (IOException unused) {
                }
            }
            if (bluetoothSocketConnect == null) {
                if (bondedDevices.isEmpty() || !this.isReady) {
                    return;
                }
                this.context.getHandler().postDelayed(this.discoverRunnable, 5000L);
                return;
            }
            Logger.INSTANCE.d(Constants.TAG, "【蓝牙连接】Socket建立完成，回调上层");
            BluetoothCommunicator bluetoothCommunicator = new BluetoothCommunicator(bluetoothSocketConnect, this);
            this.connectedCommunicator = bluetoothCommunicator;
            Callback callback = this.callback;
            if (callback != null) {
                callback.onDeviceConnected(bluetoothCommunicator);
            }
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "【蓝牙连接】discoverDevice 异常: " + e7.getMessage(), e7);
        }
    }

    private final boolean isConnecting() {
        return this.context.getConnectionState() != 0;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context1, Intent intent) {
        l.e(context1, "context1");
        l.e(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1530327060) {
                if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED") && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) == 12 && this.isReady) {
                    this.context.getHandler().removeCallbacks(this.discoverRunnable);
                    this.context.getHandler().postDelayed(this.discoverRunnable, 1000L);
                    return;
                }
                return;
            }
            if (iHashCode == 1123270207 && action.equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED") && intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0) == 2 && this.connectedCommunicator == null) {
                this.context.getHandler().removeCallbacks(this.discoverRunnable);
                this.context.getHandler().post(this.discoverRunnable);
            }
        }
    }

    @Override // com.baidu.carlife.sdk.internal.transport.communicator.Communicator.Callbacks
    public void onTerminated(int channel) {
        this.connectedCommunicator = null;
        this.isDiscoveringTaskRunning.set(false);
        try {
            this.context.getContext().unregisterReceiver(this);
        } catch (Exception unused) {
        }
        this.context.getHandler().removeCallbacks(this.discoverRunnable);
    }

    public final void startDiscover() {
        this.isReady = true;
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
            f.g(this.context.getContext(), this, intentFilter);
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "【蓝牙连接】广播注册失败: " + e7.getMessage());
        }
        this.context.onConnectionPrompt("正在请求蓝牙Socket连接");
        this.context.getHandler().post(this.discoverRunnable);
    }

    public final void terminate() {
        Logger.INSTANCE.d(Constants.TAG, "【蓝牙连接】终止运行");
        this.isReady = false;
        BluetoothCommunicator bluetoothCommunicator = this.connectedCommunicator;
        if (bluetoothCommunicator != null) {
            bluetoothCommunicator.terminate();
        }
        this.connectedCommunicator = null;
        this.isDiscoveringTaskRunning.set(false);
        try {
            this.context.getContext().unregisterReceiver(this);
        } catch (Exception unused) {
        }
        this.context.getHandler().removeCallbacks(this.discoverRunnable);
    }
}
