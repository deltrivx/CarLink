package e8;

import a8.x1;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import b8.g2;
import b8.h2;
import b8.j1;
import com.baidu.carlife.sdk.util.Logger;
import f1.w1;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements h2, SensorEventListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j1 f4512d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4515g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f4509a = g2.f1593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t8.o f4510b = t8.a.d(new b3.i0(8));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t8.o f4511c = t8.a.d(new a5.e(3, this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fc.h0 f4513e = fc.y.b(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f4514f = u8.w.f13122a;

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        n8.c.d(new a8.c1(this, null, 11));
    }

    @Override // b8.h2
    public final String b() {
        return "光照亮度";
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(1599153741);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.h(this) ? 2048 : 1024);
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = new f1.h1(90);
                sVar.h0(objK);
            }
            f1.h1 h1Var = (f1.h1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = f1.b.s(Boolean.TRUE);
                sVar.h0(objC);
            }
            f1.b1 b1Var = (f1.b1) objC;
            sVar.p(false);
            l8.n.a(z10, null, 0L, false, 0, null, n1.h.e(829202182, new a8.o(aVar, 15), sVar), null, n1.h.e(-1366026684, new x1(kVar, this, b1Var, h1Var, 7), sVar), n1.h.e(-1844559690, new c1(z10, this, h1Var, b1Var, 1), sVar), sVar, (i10 & 14) | 817889280, 382);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.i(this, z10, aVar, kVar, i7, 22);
        }
    }

    public final synchronized void d() {
        try {
            if (((Sensor) this.f4511c.getValue()) != null && !this.f4515g) {
                ((SensorManager) this.f4510b.getValue()).registerListener(this, (Sensor) this.f4511c.getValue(), 3);
                this.f4515g = true;
            }
        } catch (Exception e7) {
            Logger.INSTANCE.d("CarLife_Vehicle", "【光照亮度】注册异常: " + e7.getMessage());
        }
    }

    @Override // b8.h2
    public final String getName() {
        return "Sensor";
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f4509a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        Object next;
        Object objPrevious;
        if (sensorEvent == null || (fArr = sensorEvent.values) == null) {
            return;
        }
        j1 j1Var = null;
        Float fValueOf = fArr.length > 0 ? Float.valueOf(fArr[0]) : null;
        if (fValueOf != null) {
            int iFloatValue = (int) fValueOf.floatValue();
            Integer numValueOf = Integer.valueOf(iFloatValue);
            fc.h0 h0Var = this.f4513e;
            h0Var.getClass();
            h0Var.j(null, numValueOf);
            Iterator it = this.f4514f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (iFloatValue >= ((j1) next).f1603c);
            j1 j1Var2 = (j1) next;
            if (j1Var2 != null) {
                j1Var = new j1(j1Var2.f1603c, true);
            } else {
                List list = this.f4514f;
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (iFloatValue <= ((j1) objPrevious).f1603c);
                j1 j1Var3 = (j1) objPrevious;
                if (j1Var3 != null) {
                    j1Var = new j1(j1Var3.f1603c, false);
                }
            }
            if (j1Var == null || j1Var.equals(this.f4512d)) {
                return;
            }
            d8.v.a(j1Var);
            this.f4512d = j1Var;
        }
    }
}
