package d8;

import a8.c1;
import android.hardware.SensorManager;
import android.os.Build;
import android.view.View;
import b8.a1;
import b8.j1;
import b8.m1;
import b8.m2;
import b8.n2;
import b8.p1;
import b8.v1;
import cc.y;
import com.baidu.carlife.sdk.util.Logger;
import e8.b0;
import e8.b1;
import e8.d1;
import e8.e0;
import e8.f0;
import e8.f1;
import e8.g1;
import e8.h1;
import e8.w;
import e8.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r2.x1;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t implements fc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3839b;

    public /* synthetic */ t(int i7, Object obj) {
        this.f3838a = i7;
        this.f3839b = obj;
    }

    private final Object a(Object obj, y8.c cVar) {
        z zVar = z.f12851a;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            u8.u.c0(((n2) it.next()).f1625c, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((m2) it2.next()).f1617d);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof b8.s) {
                arrayList3.add(obj2);
            }
        }
        if (!arrayList3.isEmpty()) {
            ((b0) this.f3839b).d();
            return zVar;
        }
        b0 b0Var = (b0) this.f3839b;
        synchronized (b0Var) {
            try {
                if (b0Var.f4489d) {
                    n8.a.b().unregisterReceiver(b0Var);
                    b0Var.f4489d = false;
                }
            } catch (Exception e7) {
                Logger.INSTANCE.d("CarLife_Vehicle", "【蓝牙设备】注销异常: " + e7.getMessage(), e7);
            }
        }
        return zVar;
    }

    private final Object b(Object obj, y8.c cVar) {
        z zVar = z.f12851a;
        f0 f0Var = (f0) this.f3839b;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            u8.u.c0(((n2) it.next()).f1625c, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((m2) it2.next()).f1617d);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof b8.b0) {
                arrayList3.add(obj2);
            }
        }
        f0Var.f4532f = u8.p.E0(arrayList3, new e0(0));
        if (!((f0) this.f3839b).f4532f.isEmpty()) {
            ((f0) this.f3839b).d();
            return zVar;
        }
        f0 f0Var2 = (f0) this.f3839b;
        f0Var2.f4530d = null;
        synchronized (f0Var2) {
            try {
                if (f0Var2.f4533g) {
                    n8.a.b().getContentResolver().unregisterContentObserver(f0Var2);
                    f0Var2.f4533g = false;
                }
            } catch (Exception e7) {
                Logger.INSTANCE.d("CarLife_Vehicle", "【屏幕亮度】注销异常: " + e7.getMessage(), e7);
            }
        }
        return zVar;
    }

    private final Object c(Object obj, y8.c cVar) {
        z zVar = z.f12851a;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            u8.u.c0(((n2) it.next()).f1625c, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((m2) it2.next()).f1617d);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof a1) {
                arrayList3.add(obj2);
            }
        }
        if (!arrayList3.isEmpty()) {
            ((b1) this.f3839b).d();
            return zVar;
        }
        b1 b1Var = (b1) this.f3839b;
        synchronized (b1Var) {
            try {
                if (b1Var.f4494d) {
                    n8.a.b().unregisterReceiver(b1Var);
                    b1Var.f4494d = false;
                }
            } catch (Exception e7) {
                Logger.INSTANCE.d("CarLife_Vehicle", "【媒体按键】注销异常: " + e7.getMessage(), e7);
            }
        }
        return zVar;
    }

    private final Object d(Object obj, y8.c cVar) {
        z zVar = z.f12851a;
        d1 d1Var = (d1) this.f3839b;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            u8.u.c0(((n2) it.next()).f1625c, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((m2) it2.next()).f1617d);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof j1) {
                arrayList3.add(obj2);
            }
        }
        d1Var.f4514f = u8.p.E0(arrayList3, new e0(1));
        if (!((d1) this.f3839b).f4514f.isEmpty()) {
            ((d1) this.f3839b).d();
            return zVar;
        }
        d1 d1Var2 = (d1) this.f3839b;
        d1Var2.f4512d = null;
        synchronized (d1Var2) {
            try {
                if (d1Var2.f4515g) {
                    ((SensorManager) d1Var2.f4510b.getValue()).unregisterListener(d1Var2);
                    d1Var2.f4515g = false;
                }
            } catch (Exception e7) {
                Logger.INSTANCE.d("CarLife_Vehicle", "【光照亮度】注销异常: " + e7.getMessage(), e7);
            }
        }
        return zVar;
    }

    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.List] */
    private final Object e(Object obj, y8.c cVar) {
        z zVar = z.f12851a;
        f1 f1Var = (f1) this.f3839b;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            u8.u.c0(((n2) it.next()).f1625c, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((m2) it2.next()).f1617d);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof m1) {
                arrayList3.add(obj2);
            }
        }
        f1Var.f4538d = arrayList3;
        if (!((f1) this.f3839b).f4538d.isEmpty()) {
            ((f1) this.f3839b).d();
            return zVar;
        }
        f1 f1Var2 = (f1) this.f3839b;
        synchronized (f1Var2) {
            try {
                if (f1Var2.f4539e) {
                    n8.a.b().unregisterReceiver(f1Var2);
                    f1Var2.f4539e = false;
                }
            } catch (Exception e7) {
                Logger.INSTANCE.d("CarLife_Vehicle", "【日出日落】注销异常: " + e7.getMessage(), e7);
            }
        }
        return zVar;
    }

    private final Object f(Object obj, y8.c cVar) {
        z zVar = z.f12851a;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            u8.u.c0(((n2) it.next()).f1625c, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((m2) it2.next()).f1617d);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof p1) {
                arrayList3.add(obj2);
            }
        }
        if (!arrayList3.isEmpty()) {
            ((g1) this.f3839b).d();
            return zVar;
        }
        g1 g1Var = (g1) this.f3839b;
        synchronized (g1Var) {
            try {
                if (g1Var.f4548b) {
                    n8.a.b().unregisterComponentCallbacks(g1Var);
                    g1Var.f4548b = false;
                }
            } catch (Exception e7) {
                Logger.INSTANCE.d("CarLife_Vehicle", "【系统主题】注销异常: " + e7.getMessage(), e7);
            }
        }
        return zVar;
    }

    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.List] */
    private final Object g(Object obj, y8.c cVar) {
        z zVar = z.f12851a;
        h1 h1Var = (h1) this.f3839b;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            u8.u.c0(((n2) it.next()).f1625c, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((m2) it2.next()).f1617d);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof v1) {
                arrayList3.add(obj2);
            }
        }
        h1Var.f4555d = arrayList3;
        if (!((h1) this.f3839b).f4555d.isEmpty()) {
            ((h1) this.f3839b).d();
            return zVar;
        }
        h1 h1Var2 = (h1) this.f3839b;
        synchronized (h1Var2) {
            try {
                if (h1Var2.f4556e) {
                    n8.a.b().unregisterReceiver(h1Var2);
                    h1Var2.f4556e = false;
                }
            } catch (Exception e7) {
                Logger.INSTANCE.d("CarLife_Vehicle", "【指定时间】注销异常: " + e7.getMessage(), e7);
            }
        }
        return zVar;
    }

    public static final void i(Map map, x xVar) {
        int i7 = xVar.f4655b;
        if (((b8.j) map.get(Integer.valueOf(i7))) != null) {
            hc.c cVar = v.f3842a;
            v.a(new b8.j(i7));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        fc.j jVar;
        int i7 = 3;
        switch (this.f3838a) {
            case 0:
                List list = (List) obj;
                Iterator it = v.f3843b.iterator();
                while (true) {
                    y8.c cVar2 = null;
                    if (!it.hasNext()) {
                        v.f3843b.clear();
                        y yVar = (y) this.f3839b;
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            v.f3843b.add(cc.b0.s(yVar, null, new c1((n2) it2.next(), cVar2, 5), 3));
                        }
                        return z.f12851a;
                    }
                    ((cc.a1) it.next()).a(null);
                }
                break;
            case 1:
                z zVar = z.f12851a;
                ArrayList arrayList = new ArrayList();
                Iterator it3 = ((List) obj).iterator();
                while (it3.hasNext()) {
                    u8.u.c0(((n2) it3.next()).f1625c, arrayList);
                }
                ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((m2) it4.next()).f1617d);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (obj2 instanceof b8.d) {
                        arrayList3.add(obj2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    w wVar = (w) this.f3839b;
                    synchronized (wVar) {
                        try {
                            if (wVar.f4645d) {
                                n8.a.b().unregisterReceiver(wVar);
                                wVar.f4645d = false;
                            }
                        } catch (Exception e7) {
                            Logger.INSTANCE.d("CarLife_Vehicle", "【高德广播】注销异常: " + e7.getMessage(), e7);
                        }
                        break;
                    }
                } else {
                    ((w) this.f3839b).e();
                }
                return zVar;
            case 2:
                t8.j jVar2 = (t8.j) obj;
                i9.t tVar = (i9.t) this.f3839b;
                z zVar2 = z.f12851a;
                Map map = (Map) jVar2.f12830a;
                boolean zBooleanValue = ((Boolean) jVar2.f12831b).booleanValue();
                if (!map.isEmpty()) {
                    if (!tVar.f6684a) {
                        i(map, x.f4649d);
                        tVar.f6684a = true;
                    }
                    if (zBooleanValue) {
                        i(map, x.f4650e);
                    } else {
                        i(map, x.f4651f);
                    }
                }
                return zVar2;
            case 3:
                return a(obj, cVar);
            case 4:
                return b(obj, cVar);
            case 5:
                return c(obj, cVar);
            case 6:
                return d(obj, cVar);
            case 7:
                return e(obj, cVar);
            case 8:
                return f(obj, cVar);
            case 9:
                return g(obj, cVar);
            case 10:
                if (cVar instanceof fc.j) {
                    jVar = (fc.j) cVar;
                    int i10 = jVar.f5561c;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        jVar.f5561c = i10 - Integer.MIN_VALUE;
                    } else {
                        jVar = new fc.j(this, cVar);
                    }
                } else {
                    jVar = new fc.j(this, cVar);
                }
                Object obj3 = jVar.f5559a;
                z8.a aVar = z8.a.f15774a;
                int i11 = jVar.f5561c;
                if (i11 == 0) {
                    t8.a.e(obj3);
                    ec.u uVar = (ec.u) this.f3839b;
                    if (obj == null) {
                        obj = gc.c.f6217b;
                    }
                    jVar.f5561c = 1;
                    if (((ec.t) uVar).f4736d.g(obj, jVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj3);
                }
                return z.f12851a;
            case 11:
                ((h9.k) this.f3839b).invoke((m5.k) obj);
                return z.f12851a;
            case 12:
                ((x1) this.f3839b).f11507a.g(((Number) obj).floatValue());
                return z.f12851a;
            case 13:
                if (((s7.e) obj).f12589a) {
                    t8.o oVar = n8.d.f8898a;
                    int iB = n8.d.b(64, "FLOAT_ICON_OFFSET_X");
                    int iB2 = n8.d.b(64, "FLOAT_ICON_OFFSET_Y");
                    t8.o oVar2 = n8.n.f8927a;
                    n8.n.a(8, -2, -2, iB, iB2, "FLOAT_ICON_SWITCH", new n1.c(new z7.i((s7.d) this.f3839b, iB, iB2, i7), 1118267572, true));
                } else {
                    n8.n.b("FLOAT_ICON_SWITCH");
                }
                return z.f12851a;
            case 14:
                u0.k kVar = (u0.k) this.f3839b;
                if (Build.VERSION.SDK_INT >= 34) {
                    kVar.U0().startStylusHandwriting((View) kVar.f12990b);
                }
                return z.f12851a;
            default:
                ((f1.b1) this.f3839b).setValue(((Boolean) obj).booleanValue() ? "运行中" : "未授权");
                return z.f12851a;
        }
    }
}
