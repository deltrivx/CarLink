package com.baidu.carlife.sdk.util;

import a9.c;
import a9.e;
import a9.i;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import cc.b0;
import cc.k0;
import cc.y;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.n;
import i9.l;
import java.util.Set;
import jc.d;
import kotlin.Metadata;
import t8.z;
import u3.f;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u000eJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u000eJ\u0015\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/baidu/carlife/sdk/util/BluetoothUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/bluetooth/BluetoothAdapter;", "getAdapter", "(Landroid/content/Context;)Landroid/bluetooth/BluetoothAdapter;", "Landroid/bluetooth/le/BluetoothLeAdvertiser;", "getLeAdvertiser", "(Landroid/content/Context;)Landroid/bluetooth/le/BluetoothLeAdvertiser;", "", "isBluetoothAvailable", "(Landroid/content/Context;)Z", "isBleSupported", "isBleAdvertiserSupported", "", "getBluetoothName", "(Landroid/content/Context;Ly8/c;)Ljava/lang/Object;", "", "Landroid/bluetooth/BluetoothDevice;", "getBondedDevices", "(Landroid/content/Context;)Ljava/util/Set;", "device", "isDeviceConnected", "(Landroid/bluetooth/BluetoothDevice;)Z", "hasBluetoothPermission", "enableBluetooth", "", "state", "getBluetoothStateString", "(I)Ljava/lang/String;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class BluetoothUtils {
    public static final BluetoothUtils INSTANCE = new BluetoothUtils();

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.util.BluetoothUtils$getBluetoothName$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @e(c = "com.baidu.carlife.sdk.util.BluetoothUtils", f = "BluetoothUtils.kt", l = {142}, m = "getBluetoothName")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(y8.c cVar) {
            super(cVar);
        }

        @Override // a9.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BluetoothUtils.this.getBluetoothName(null, this);
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.util.BluetoothUtils$getBluetoothName$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @e(c = "com.baidu.carlife.sdk.util.BluetoothUtils$getBluetoothName$2", f = "BluetoothUtils.kt", l = {146}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcc/y;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lcc/y;)Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass2 extends i implements n {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $sysName;
        int label;

        /* JADX INFO: renamed from: com.baidu.carlife.sdk.util.BluetoothUtils$getBluetoothName$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        @e(c = "com.baidu.carlife.sdk.util.BluetoothUtils$getBluetoothName$2$1", f = "BluetoothUtils.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcc/y;", "", "<anonymous>", "(Lcc/y;)Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        public static final class AnonymousClass1 extends i implements n {
            final /* synthetic */ BluetoothManager $bluetoothManager;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BluetoothManager bluetoothManager, y8.c cVar) {
                super(2, cVar);
                this.$bluetoothManager = bluetoothManager;
            }

            @Override // a9.a
            public final y8.c create(Object obj, y8.c cVar) {
                return new AnonymousClass1(this.$bluetoothManager, cVar);
            }

            @Override // h9.n
            public final Object invoke(y yVar, y8.c cVar) {
                return ((AnonymousClass1) create(yVar, cVar)).invokeSuspend(z.f12851a);
            }

            @Override // a9.a
            public final Object invokeSuspend(Object obj) {
                BluetoothAdapter adapter;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t8.a.e(obj);
                BluetoothManager bluetoothManager = this.$bluetoothManager;
                if (bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null) {
                    return null;
                }
                return adapter.getName();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str, y8.c cVar) {
            super(2, cVar);
            this.$context = context;
            this.$sysName = str;
        }

        @Override // a9.a
        public final y8.c create(Object obj, y8.c cVar) {
            return new AnonymousClass2(this.$context, this.$sysName, cVar);
        }

        @Override // h9.n
        public final Object invoke(y yVar, y8.c cVar) {
            return ((AnonymousClass2) create(yVar, cVar)).invokeSuspend(z.f12851a);
        }

        @Override // a9.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    t8.a.e(obj);
                    Object systemService = this.$context.getSystemService("bluetooth");
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null, null);
                    this.label = 1;
                    obj = b0.B(1000L, anonymousClass1, this);
                    z8.a aVar = z8.a.f15774a;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                String str = (String) obj;
                return str == null ? this.$sysName : str;
            } catch (Exception unused) {
                return this.$sysName;
            }
        }
    }

    private BluetoothUtils() {
    }

    public final boolean enableBluetooth(Context context) {
        BluetoothAdapter adapter;
        l.e(context, "context");
        if (!hasBluetoothPermission(context) || (adapter = getAdapter(context)) == null) {
            return false;
        }
        if (adapter.isEnabled()) {
            return true;
        }
        Logger.INSTANCE.d(Constants.TAG, "【蓝牙工具】请求开启蓝牙...");
        return adapter.enable();
    }

    public final BluetoothAdapter getAdapter(Context context) {
        BluetoothAdapter adapter;
        l.e(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("bluetooth");
        BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
        return (bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null) ? BluetoothAdapter.getDefaultAdapter() : adapter;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getBluetoothName(Context context, y8.c cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String string;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i7 = anonymousClass1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i7 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object objA = anonymousClass1.result;
        int i10 = anonymousClass1.label;
        if (i10 == 0) {
            t8.a.e(objA);
            if (Build.VERSION.SDK_INT >= 25) {
                string = Settings.Global.getString(context.getContentResolver(), "device_name");
            } else {
                string = Build.BRAND + ' ' + Build.MODEL;
            }
            jc.e eVar = k0.f2635a;
            d dVar = d.f7117c;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, string, null);
            anonymousClass1.label = 1;
            objA = b0.A(dVar, anonymousClass2, anonymousClass1);
            z8.a aVar = z8.a.f15774a;
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(objA);
        }
        l.d(objA, "context: Context): Strin…e\n            }\n        }");
        return objA;
    }

    public final String getBluetoothStateString(int state) {
        if (state == 0) {
            return "DISCONNECTED (0)";
        }
        if (state == 1) {
            return "CONNECTING (1)";
        }
        if (state == 2) {
            return "CONNECTED (2)";
        }
        if (state == 3) {
            return "DISCONNECTING (3)";
        }
        switch (state) {
            case 10:
                return "OFF (10)";
            case 11:
                return "TURNING_ON (11)";
            case 12:
                return "ON (12)";
            case 13:
                return "TURNING_OFF (13)";
            default:
                return "UNKNOWN (" + state + ')';
        }
    }

    public final Set<BluetoothDevice> getBondedDevices(Context context) {
        l.e(context, "context");
        boolean zIsBluetoothAvailable = isBluetoothAvailable(context);
        u8.y yVar = u8.y.f13124a;
        if (!zIsBluetoothAvailable) {
            return yVar;
        }
        try {
            BluetoothAdapter adapter = getAdapter(context);
            Set<BluetoothDevice> bondedDevices = adapter != null ? adapter.getBondedDevices() : null;
            return bondedDevices == null ? yVar : bondedDevices;
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "【蓝牙工具】获取配对列表失败: " + e7.getMessage());
            return yVar;
        }
    }

    public final BluetoothLeAdvertiser getLeAdvertiser(Context context) {
        l.e(context, "context");
        BluetoothAdapter adapter = getAdapter(context);
        if (adapter != null) {
            return adapter.getBluetoothLeAdvertiser();
        }
        return null;
    }

    public final boolean hasBluetoothPermission(Context context) {
        l.e(context, "context");
        return Build.VERSION.SDK_INT < 31 || f.a(context, "android.permission.BLUETOOTH_CONNECT") == 0;
    }

    public final boolean isBleAdvertiserSupported(Context context) {
        BluetoothAdapter adapter;
        l.e(context, "context");
        if (!isBleSupported(context) || (adapter = getAdapter(context)) == null) {
            return false;
        }
        if (adapter.isMultipleAdvertisementSupported()) {
            return adapter.getBluetoothLeAdvertiser() != null;
        }
        return adapter.getBluetoothLeAdvertiser() != null;
    }

    public final boolean isBleSupported(Context context) {
        l.e(context, "context");
        if (context.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            return true;
        }
        try {
            BluetoothAdapter adapter = getAdapter(context);
            if (adapter != null && adapter.getBluetoothLeScanner() != null) {
                Logger.INSTANCE.w(Constants.TAG, "【蓝牙工具】系统声明不支持BLE，但检测到 Scanner 可用，判定为支持");
                return true;
            }
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "【蓝牙工具】BLE能力探测失败: " + e7.getMessage());
        }
        Logger.INSTANCE.e(Constants.TAG, "【蓝牙工具】设备确实不支持 BLE");
        return false;
    }

    public final boolean isBluetoothAvailable(Context context) {
        l.e(context, "context");
        BluetoothAdapter adapter = getAdapter(context);
        if (adapter == null) {
            Logger.INSTANCE.e(Constants.TAG, "【蓝牙工具】设备无蓝牙硬件");
            return false;
        }
        if (!hasBluetoothPermission(context)) {
            Logger.INSTANCE.e(Constants.TAG, "【蓝牙工具】缺少蓝牙权限，视为不可用");
            return false;
        }
        if (adapter.isEnabled()) {
            return true;
        }
        try {
            Logger.Companion companion = Logger.INSTANCE;
            companion.w(Constants.TAG, "【蓝牙工具】系统报告 isEnabled=false，尝试行为探测...");
            if (adapter.getBondedDevices() != null) {
                companion.w(Constants.TAG, "【蓝牙工具】探测成功！检测到配对列表引用，蓝牙实际已开启");
                return true;
            }
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "【蓝牙工具】探测失败: " + e7.getMessage());
        }
        return false;
    }

    public final boolean isDeviceConnected(BluetoothDevice device) {
        l.e(device, "device");
        try {
            Object objInvoke = device.getClass().getMethod("isConnected", null).invoke(device, null);
            l.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "【蓝牙工具】反射检查连接状态失败: " + e7.getMessage());
            return false;
        }
    }
}
