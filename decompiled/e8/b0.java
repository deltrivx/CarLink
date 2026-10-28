package e8;

import a8.x1;
import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import b8.g2;
import b8.h2;
import com.baidu.carlife.sdk.util.BluetoothUtils;
import com.baidu.carlife.sdk.util.Logger;
import f1.w1;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends BroadcastReceiver implements h2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4485e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4486a = "BTDevice";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4487b = "蓝牙设备";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f4488c = g2.f1593a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4489d;

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        n8.c.d(new a8.c1(this, null, 8));
    }

    @Override // b8.h2
    public final String b() {
        return this.f4487b;
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(121046669);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.h(this) ? 2048 : 1024);
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            Set<BluetoothDevice> bondedDevices = BluetoothUtils.INSTANCE.getBondedDevices(n8.a.b());
            sVar.W(1849434622);
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s("");
                sVar.h0(objK);
            }
            f1.b1 b1Var = (f1.b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = new f1.h1(1);
                sVar.h0(objC);
            }
            f1.h1 h1Var = (f1.h1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == w0Var) {
                objC2 = f1.b.s(Boolean.FALSE);
                sVar.h0(objC2);
            }
            f1.b1 b1Var2 = (f1.b1) objC2;
            sVar.p(false);
            Activity activity = (Activity) sVar.j(d.c.f3530a);
            int i11 = 7;
            List listJ = n3.l.J(x6.a.f(), x6.a.e(), x6.a.d(), x6.a.b(), x6.a.c(), x6.a.a(), x6.a.g());
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new a8.n(aVar, 14);
                sVar.h0(objK2);
            }
            sVar.p(false);
            l8.n.a(z10, (h9.a) objK2, 0L, false, 0, n1.h.e(-402217305, new a8.y(i11, listJ), sVar), n1.h.e(-117081402, new a8.o(aVar, 9), sVar), null, n1.h.e(453190404, new x1(kVar, this, b1Var, h1Var, 3), sVar), n1.h.e(127845494, new a0(b1Var, activity, listJ, bondedDevices, b1Var2, h1Var, 1), sVar), sVar, (i10 & 14) | 819462144, 316);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.i(this, z10, aVar, kVar, i7, 14);
        }
    }

    public final synchronized void d() {
        try {
            if (!this.f4489d) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
                intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                u3.f.g(n8.a.b(), this, intentFilter);
                this.f4489d = true;
            }
        } catch (Exception e7) {
            Logger.INSTANCE.d("CarLife_Vehicle", "【蓝牙设备】注册异常: " + e7.getMessage());
        }
    }

    @Override // b8.h2
    public final String getName() {
        return this.f4486a;
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f4488c;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String name;
        String name2;
        i9.l.e(context, "context");
        i9.l.e(intent, "intent");
        BluetoothDevice bluetoothDevice = Build.VERSION.SDK_INT >= 33 ? (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class) : (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -301431627) {
                if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                    if (bluetoothDevice != null && (name = bluetoothDevice.getName()) != null) {
                        hc.c cVar = d8.v.f3842a;
                        d8.v.a(new b8.s(1, name));
                    }
                    Logger.INSTANCE.d("CarLife_Vehicle", ob.a.q("【蓝牙设备】已连接: ", bluetoothDevice != null ? bluetoothDevice.getName() : null));
                    return;
                }
                return;
            }
            if (iHashCode == 1821585647 && action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                if (bluetoothDevice != null && (name2 = bluetoothDevice.getName()) != null) {
                    hc.c cVar2 = d8.v.f3842a;
                    d8.v.a(new b8.s(0, name2));
                }
                Logger.INSTANCE.d("CarLife_Vehicle", ob.a.q("【蓝牙设备】已断开: ", bluetoothDevice != null ? bluetoothDevice.getName() : null));
            }
        }
    }
}
