package com.baidu.carlife.sdk.receiver.transport.direct.bluetooth;

import androidx.lifecycle.z;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.Logger;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothDeviceDiscover$discoverRunnable$1", "Ljava/lang/Runnable;", "Lt8/z;", "run", "()V", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class BluetoothDeviceDiscover$discoverRunnable$1 implements Runnable {
    final /* synthetic */ BluetoothDeviceDiscover this$0;

    public BluetoothDeviceDiscover$discoverRunnable$1(BluetoothDeviceDiscover bluetoothDeviceDiscover) {
        this.this$0 = bluetoothDeviceDiscover;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$0(BluetoothDeviceDiscover bluetoothDeviceDiscover) {
        try {
            bluetoothDeviceDiscover.discoverDevice();
        } finally {
            bluetoothDeviceDiscover.isDiscoveringTaskRunning.set(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.this$0.context.getHandler().removeCallbacks(this);
        if (!this.this$0.isReady) {
            Logger.INSTANCE.d(Constants.TAG, "【蓝牙连接】模块未就绪，停止扫描");
            return;
        }
        if (this.this$0.isDiscoveringTaskRunning.get()) {
            Logger.INSTANCE.w(Constants.TAG, "【蓝牙连接】上一个连接任务尚未结束，本次忽略");
            return;
        }
        try {
            this.this$0.isDiscoveringTaskRunning.set(true);
            this.this$0.context.io().execute(new z(5, this.this$0));
        } catch (RejectedExecutionException e7) {
            this.this$0.isDiscoveringTaskRunning.set(false);
            Logger.INSTANCE.e(Constants.TAG, "【蓝牙连接】线程池已满，任务被拒绝: " + e7.getMessage());
            if (this.this$0.isReady) {
                this.this$0.context.getHandler().postDelayed(this, 5000L);
            }
        } catch (Exception e10) {
            this.this$0.isDiscoveringTaskRunning.set(false);
            Logger.INSTANCE.e(Constants.TAG, "【蓝牙连接】提交任务失败: " + e10.getMessage());
        }
    }
}
