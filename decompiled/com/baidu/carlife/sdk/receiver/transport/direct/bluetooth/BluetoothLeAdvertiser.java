package com.baidu.carlife.sdk.receiver.transport.direct.bluetooth;

import a9.e;
import a9.i;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.content.Context;
import android.os.ParcelUuid;
import cc.b0;
import cc.k0;
import cc.q1;
import cc.y;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.BluetoothUtils;
import com.baidu.carlife.sdk.util.Logger;
import h9.n;
import i9.g;
import i9.l;
import java.util.Arrays;
import java.util.UUID;
import jc.d;
import kotlin.Metadata;
import n3.u;
import n4.h;
import t8.z;
import y8.c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothLeAdvertiser;", "", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothLeAdvertiser$Callback;", "callback", "<init>", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothLeAdvertiser$Callback;)V", "Lt8/z;", "startAdvertising", "()V", "stopAdvertising", "Lcom/baidu/carlife/sdk/CarLifeContext;", "Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothLeAdvertiser$Callback;", "Lcc/y;", "scope", "Lcc/y;", "getScope", "()Lcc/y;", "Landroid/bluetooth/le/AdvertiseCallback;", "advertiseCallback", "Landroid/bluetooth/le/AdvertiseCallback;", "", "isAdvertising", "Z", "Landroid/bluetooth/le/BluetoothLeAdvertiser;", "getBluetoothLeAdvertiser", "()Landroid/bluetooth/le/BluetoothLeAdvertiser;", "bluetoothLeAdvertiser", "Companion", "Callback", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class BluetoothLeAdvertiser {
    private AdvertiseCallback advertiseCallback;
    private final Callback callback;
    private final CarLifeContext context;
    private volatile boolean isAdvertising;
    private final y scope;
    private static final UUID BLUETOOTH_LE_UUID = UUID.fromString("c62857aa-6ca1-4ac4-8842-3ca71aef6765");

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/transport/direct/bluetooth/BluetoothLeAdvertiser$Callback;", "", "Lt8/z;", "isAdvertising", "()V", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public interface Callback {
        void isAdvertising();
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.receiver.transport.direct.bluetooth.BluetoothLeAdvertiser$startAdvertising$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @e(c = "com.baidu.carlife.sdk.receiver.transport.direct.bluetooth.BluetoothLeAdvertiser$startAdvertising$1", f = "BluetoothLeAdvertiser.kt", l = {95}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcc/y;", "Lt8/z;", "<anonymous>", "(Lcc/y;)V"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass1 extends i implements n {
        Object L$0;
        Object L$1;
        int label;

        public AnonymousClass1(c cVar) {
            super(2, cVar);
        }

        @Override // a9.a
        public final c create(Object obj, c cVar) {
            return BluetoothLeAdvertiser.this.new AnonymousClass1(cVar);
        }

        @Override // h9.n
        public final Object invoke(y yVar, c cVar) {
            return ((AnonymousClass1) create(yVar, cVar)).invokeSuspend(z.f12851a);
        }

        @Override // a9.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AdvertiseSettings advertiseSettingsBuild;
            AdvertiseData advertiseDataBuild;
            int i7 = this.label;
            if (i7 == 0) {
                t8.a.e(obj);
                if (BluetoothLeAdvertiser.this.advertiseCallback != null) {
                    Logger.INSTANCE.w(Constants.TAG, "【连接广播】检测到遗留的 Callback，正在强制停止旧广播...");
                    BluetoothLeAdvertiser.this.stopAdvertising();
                }
                advertiseSettingsBuild = new AdvertiseSettings.Builder().setAdvertiseMode(2).setTxPowerLevel(3).setConnectable(false).setTimeout(0).build();
                advertiseDataBuild = new AdvertiseData.Builder().setIncludeTxPowerLevel(true).addServiceUuid(new ParcelUuid(BluetoothLeAdvertiser.BLUETOOTH_LE_UUID)).build();
                BluetoothUtils bluetoothUtils = BluetoothUtils.INSTANCE;
                Context context = BluetoothLeAdvertiser.this.context.getContext();
                this.L$0 = advertiseSettingsBuild;
                this.L$1 = advertiseDataBuild;
                this.label = 1;
                obj = bluetoothUtils.getBluetoothName(context, this);
                z8.a aVar = z8.a.f15774a;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                advertiseDataBuild = (AdvertiseData) this.L$1;
                advertiseSettingsBuild = (AdvertiseSettings) this.L$0;
                t8.a.e(obj);
            }
            byte[] bytes = ((String) obj).getBytes(zb.a.f15804a);
            l.d(bytes, "getBytes(...)");
            AdvertiseData.Builder builder = new AdvertiseData.Builder();
            ParcelUuid parcelUuid = new ParcelUuid(BluetoothLeAdvertiser.BLUETOOTH_LE_UUID);
            int iMin = Math.min(bytes.length, 16);
            h.u(iMin, bytes.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bytes, 0, iMin);
            l.d(bArrCopyOfRange, "copyOfRange(...)");
            AdvertiseData advertiseDataBuild2 = builder.addServiceData(parcelUuid, bArrCopyOfRange).build();
            final BluetoothLeAdvertiser bluetoothLeAdvertiser = BluetoothLeAdvertiser.this;
            AdvertiseCallback advertiseCallback = new AdvertiseCallback() { // from class: com.baidu.carlife.sdk.receiver.transport.direct.bluetooth.BluetoothLeAdvertiser$startAdvertising$1$newCallback$1
                @Override // android.bluetooth.le.AdvertiseCallback
                public void onStartFailure(int errorCode) {
                    String str;
                    super.onStartFailure(errorCode);
                    bluetoothLeAdvertiser.isAdvertising = false;
                    bluetoothLeAdvertiser.advertiseCallback = null;
                    if (errorCode == 1) {
                        str = "数据包过大(Data too large)";
                    } else if (errorCode == 2) {
                        str = "广播实例过多(Too many advertisers)";
                    } else if (errorCode == 3) {
                        str = "已启动(Already started)";
                    } else if (errorCode == 4) {
                        str = "内部错误(Internal error)";
                    } else if (errorCode != 5) {
                        str = "未知错误(" + errorCode + ')';
                    } else {
                        str = "不支持(Unsupported)";
                    }
                    BluetoothLeAdvertiser.Callback callback = bluetoothLeAdvertiser.callback;
                    if (callback != null) {
                        callback.isAdvertising();
                    }
                    Logger.INSTANCE.e(Constants.TAG, ob.a.q("【连接广播】广播启动失败: ", str));
                }

                @Override // android.bluetooth.le.AdvertiseCallback
                public void onStartSuccess(AdvertiseSettings settingsInEffect) {
                    super.onStartSuccess(settingsInEffect);
                    bluetoothLeAdvertiser.isAdvertising = true;
                    bluetoothLeAdvertiser.context.onConnectionPrompt("连接广播已启动");
                    BluetoothLeAdvertiser.Callback callback = bluetoothLeAdvertiser.callback;
                    if (callback != null) {
                        callback.isAdvertising();
                    }
                    Logger.INSTANCE.d(Constants.TAG, "【连接广播】连接广播已启动: Obj=" + hashCode());
                }
            };
            try {
                Logger.INSTANCE.d(Constants.TAG, "【连接广播】开始请求 startAdvertising...");
                BluetoothLeAdvertiser.this.advertiseCallback = advertiseCallback;
                android.bluetooth.le.BluetoothLeAdvertiser bluetoothLeAdvertiser2 = BluetoothLeAdvertiser.this.getBluetoothLeAdvertiser();
                if (bluetoothLeAdvertiser2 != null) {
                    bluetoothLeAdvertiser2.startAdvertising(advertiseSettingsBuild, advertiseDataBuild, advertiseDataBuild2, advertiseCallback);
                }
            } catch (SecurityException e7) {
                Logger.INSTANCE.e(Constants.TAG, "【连接广播】启动异常(权限不足): " + e7.getMessage());
                BluetoothLeAdvertiser.this.advertiseCallback = null;
            } catch (Exception e10) {
                Logger.INSTANCE.e(Constants.TAG, "【连接广播】启动异常(其他): " + e10.getMessage(), e10);
                BluetoothLeAdvertiser.this.advertiseCallback = null;
            }
            return z.f12851a;
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.receiver.transport.direct.bluetooth.BluetoothLeAdvertiser$stopAdvertising$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @e(c = "com.baidu.carlife.sdk.receiver.transport.direct.bluetooth.BluetoothLeAdvertiser$stopAdvertising$1", f = "BluetoothLeAdvertiser.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcc/y;", "Lt8/z;", "<anonymous>", "(Lcc/y;)V"}, k = 3, mv = {1, 6, 0})
    public static final class C00031 extends i implements n {
        final /* synthetic */ AdvertiseCallback $callback;
        int label;
        final /* synthetic */ BluetoothLeAdvertiser this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00031(AdvertiseCallback advertiseCallback, BluetoothLeAdvertiser bluetoothLeAdvertiser, c cVar) {
            super(2, cVar);
            this.$callback = advertiseCallback;
            this.this$0 = bluetoothLeAdvertiser;
        }

        @Override // a9.a
        public final c create(Object obj, c cVar) {
            return new C00031(this.$callback, this.this$0, cVar);
        }

        @Override // h9.n
        public final Object invoke(y yVar, c cVar) {
            return ((C00031) create(yVar, cVar)).invokeSuspend(z.f12851a);
        }

        @Override // a9.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj);
            try {
                try {
                    Logger.Companion companion = Logger.INSTANCE;
                    companion.d(Constants.TAG, "【连接广播】执行 stopAdvertising: Obj=" + this.$callback.hashCode());
                    android.bluetooth.le.BluetoothLeAdvertiser bluetoothLeAdvertiser = this.this$0.getBluetoothLeAdvertiser();
                    if (bluetoothLeAdvertiser != null) {
                        bluetoothLeAdvertiser.stopAdvertising(this.$callback);
                    }
                    this.this$0.advertiseCallback = null;
                    this.this$0.isAdvertising = false;
                    companion.d(Constants.TAG, "【连接广播】广播已清理完毕");
                } catch (Exception e7) {
                    Logger.Companion companion2 = Logger.INSTANCE;
                    companion2.e(Constants.TAG, "【连接广播】停止广播异常: " + e7.getMessage());
                    this.this$0.advertiseCallback = null;
                    this.this$0.isAdvertising = false;
                    companion2.d(Constants.TAG, "【连接广播】广播已清理完毕");
                }
                return z.f12851a;
            } catch (Throwable th) {
                this.this$0.advertiseCallback = null;
                this.this$0.isAdvertising = false;
                Logger.INSTANCE.d(Constants.TAG, "【连接广播】广播已清理完毕");
                throw th;
            }
        }
    }

    public BluetoothLeAdvertiser(CarLifeContext carLifeContext, Callback callback) {
        l.e(carLifeContext, "context");
        this.context = carLifeContext;
        this.callback = callback;
        jc.e eVar = k0.f2635a;
        d dVar = d.f7117c;
        q1 q1VarB = b0.b();
        dVar.getClass();
        this.scope = b0.a(u.G(dVar, q1VarB));
    }

    public /* synthetic */ BluetoothLeAdvertiser(CarLifeContext carLifeContext, Callback callback, int i7, g gVar) {
        this(carLifeContext, (i7 & 2) != 0 ? null : callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.bluetooth.le.BluetoothLeAdvertiser getBluetoothLeAdvertiser() {
        return BluetoothUtils.INSTANCE.getLeAdvertiser(this.context.getContext());
    }

    public final y getScope() {
        return this.scope;
    }

    public final void startAdvertising() {
        if (((Number) this.context.getConfig(Configs.CONFIG_WIFI_DIRECT_BLE, 1)).intValue() == 0) {
            Logger.INSTANCE.e(Constants.TAG, "【连接广播】蓝牙广播未开启");
            Callback callback = this.callback;
            if (callback != null) {
                callback.isAdvertising();
                return;
            }
            return;
        }
        BluetoothUtils bluetoothUtils = BluetoothUtils.INSTANCE;
        if (!bluetoothUtils.hasBluetoothPermission(this.context.getContext())) {
            Logger.INSTANCE.e(Constants.TAG, "【连接广播】蓝牙广播权限未授权");
            this.context.onConnectionPrompt("蓝牙广播权限未授权");
            return;
        }
        if (!bluetoothUtils.enableBluetooth(this.context.getContext())) {
            Logger.INSTANCE.e(Constants.TAG, "【连接广播】蓝牙未开启");
            this.context.onConnectionPrompt("蓝牙未开启");
        } else {
            if (bluetoothUtils.isBleAdvertiserSupported(this.context.getContext())) {
                b0.s(this.scope, null, new AnonymousClass1(null), 3);
                return;
            }
            Logger.INSTANCE.e(Constants.TAG, "【连接广播】该设备不支持BLE广播");
            this.context.onConnectionPrompt("该设备不支持BLE广播");
            Callback callback2 = this.callback;
            if (callback2 != null) {
                callback2.isAdvertising();
            }
        }
    }

    public final void stopAdvertising() {
        if (!BluetoothUtils.INSTANCE.hasBluetoothPermission(this.context.getContext())) {
            Logger.INSTANCE.e(Constants.TAG, "【连接广播】停止失败：缺少权限");
            return;
        }
        AdvertiseCallback advertiseCallback = this.advertiseCallback;
        if (advertiseCallback != null) {
            b0.s(this.scope, null, new C00031(advertiseCallback, this, null), 3);
        } else {
            Logger.INSTANCE.d(Constants.TAG, "【连接广播】当前无正在进行的广播，无需停止");
            this.isAdvertising = false;
        }
    }
}
