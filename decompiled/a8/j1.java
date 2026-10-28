package a8;

import android.app.Activity;
import android.view.View;
import b8.m2;
import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.receiver.CarLife;
import f1.h2;
import f1.l2;
import java.util.List;
import java.util.NoSuchElementException;
import z.g2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j1 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f153d;

    public /* synthetic */ j1(f1.s sVar, g1.a aVar, h2 h2Var, f1.a1 a1Var) {
        this.f150a = 4;
        this.f151b = sVar;
        this.f152c = aVar;
        this.f153d = h2Var;
    }

    public /* synthetic */ j1(h9.k kVar, e2 e2Var, f1.b1 b1Var, f1.b1 b1Var2) {
        this.f150a = 1;
        this.f153d = kVar;
        this.f151b = b1Var;
        this.f152c = b1Var2;
    }

    public /* synthetic */ j1(h9.k kVar, e8.d1 d1Var, f1.b1 b1Var, f1.h1 h1Var) {
        this.f150a = 2;
        this.f152c = kVar;
        this.f151b = b1Var;
        this.f153d = h1Var;
    }

    public /* synthetic */ j1(Object obj, Object obj2, f1.b1 b1Var, int i7) {
        this.f150a = i7;
        this.f152c = obj;
        this.f153d = obj2;
        this.f151b = b1Var;
    }

    public /* synthetic */ j1(Object obj, Object obj2, Object obj3, int i7) {
        this.f150a = i7;
        this.f151b = obj;
        this.f152c = obj2;
        this.f153d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    @Override // h9.a
    public final Object invoke() {
        fc.h0 h0Var;
        Object value;
        o7.u uVar;
        int i7 = this.f150a;
        t8.z zVar = t8.z.f12851a;
        Object obj = this.f153d;
        Object obj2 = this.f152c;
        Object obj3 = this.f151b;
        switch (i7) {
            case 0:
                f1.b1 b1Var = (f1.b1) obj3;
                f1.b1 b1Var2 = (f1.b1) obj2;
                f1.b1 b1Var3 = (f1.b1) obj;
                if (((String) b1Var.getValue()).length() == 0) {
                    hc.c cVar = n8.c.f8897a;
                    n8.c.j(0, "名称不能为空");
                } else if (((String) b1Var2.getValue()).length() < 8) {
                    hc.c cVar2 = n8.c.f8897a;
                    n8.c.j(0, "密码不能少于8位");
                } else if (((Boolean) b1Var3.getValue()).booleanValue()) {
                    t8.o oVar = n8.o.f8930a;
                    n8.o.d((String) b1Var.getValue(), (String) b1Var2.getValue());
                } else {
                    n8.o.a();
                }
                return zVar;
            case 1:
                h9.k kVar = (h9.k) obj;
                f1.b1 b1Var4 = (f1.b1) obj3;
                f1.b1 b1Var5 = (f1.b1) obj2;
                if (((String) b1Var4.getValue()).length() == 0) {
                    hc.c cVar3 = n8.c.f8897a;
                    n8.c.j(0, "名称不能为空");
                } else if (((String) b1Var5.getValue()).length() <= 0 || ((String) b1Var5.getValue()).length() >= 8) {
                    kVar.invoke(new m2("WifiConnect", "WiFi连接", ob.a.q("连接WiFi: ", (String) b1Var4.getValue()), new b8.y1((String) b1Var4.getValue(), (String) b1Var5.getValue())));
                } else {
                    hc.c cVar4 = n8.c.f8897a;
                    n8.c.j(0, "密码不能少于8位");
                }
                return zVar;
            case 2:
                h9.k kVar2 = (h9.k) obj2;
                f1.b1 b1Var6 = (f1.b1) obj3;
                f1.h1 h1Var = (f1.h1) obj;
                String str = ((Boolean) b1Var6.getValue()).booleanValue() ? "小于" : "大于";
                kVar2.invoke(new m2("Sensor", "光照亮度", "环境光亮度" + str + h1Var.f() + "lux时", new b8.j1(h1Var.f(), ((Boolean) b1Var6.getValue()).booleanValue())));
                return zVar;
            case 3:
                f0.u uVar2 = (f0.u) obj2;
                f0.g gVar = (f0.g) ((f1.f0) obj3).getValue();
                return new f0.j(uVar2, gVar, (f0.c) obj, new g7.l((n9.d) uVar2.f4856e.f4843f.getValue(), gVar));
            case 4:
                f1.s sVar = (f1.s) obj3;
                g1.a aVar = (g1.a) obj2;
                h2 h2Var = (h2) obj;
                g1.b bVar = sVar.M;
                g1.a aVar2 = bVar.f5764b;
                try {
                    bVar.f5764b = aVar;
                    h2 h2Var2 = sVar.G;
                    int[] iArr = sVar.f5119o;
                    s.w wVar = sVar.f5126v;
                    sVar.f5119o = null;
                    sVar.f5126v = null;
                    try {
                        sVar.G = h2Var;
                        boolean z10 = bVar.f5767e;
                        try {
                            bVar.f5767e = false;
                            throw null;
                        } catch (Throwable th) {
                            bVar.f5767e = z10;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        sVar.G = h2Var2;
                        sVar.f5119o = iArr;
                        sVar.f5126v = wVar;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    bVar.f5764b = aVar2;
                    throw th3;
                }
            case 5:
                f1.a aVar3 = (f1.a) obj3;
                l2 l2Var = (l2) obj2;
                g1.k0 k0Var = (g1.k0) obj;
                if (aVar3 != null) {
                    l2Var.a(l2Var.c(aVar3) - l2Var.f5036t);
                }
                List listS = n3.n.S(l2Var, null, l2Var.f5036t, null);
                q1.b bVar2 = (q1.b) u8.p.t0(listS);
                Integer num = bVar2 != null ? bVar2.f10578a : null;
                List listU = k0Var.U(num);
                if (num != null && !listU.isEmpty()) {
                    q1.b bVar3 = (q1.b) u8.p.k0(listU);
                    List listH0 = u8.p.h0(listU);
                    bVar3.getClass();
                    listU = u8.p.x0(listH0, n3.l.I(new q1.b(null, num)));
                }
                return u8.p.x0(listU, listS);
            case 6:
                i0.e eVar = (i0.e) obj3;
                x1.c cVarA0 = i0.e.A0(eVar, (q2.h1) obj2, (k2.d) obj);
                if (cVarA0 == null) {
                    return null;
                }
                z.f fVar = eVar.f6580o;
                if (n3.m.a(fVar.f15365v, 0L)) {
                    c0.b.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return cVarA0.i(fVar.E0(cVarA0, fVar.f15365v) ^ (-9223372034707292160L));
            case 7:
                f1.b1 b1Var7 = (f1.b1) obj3;
                o7.g gVar2 = o7.g.f9489a;
                b1Var7.setValue("");
                ((h9.n) obj2).invoke((String) b1Var7.getValue(), Boolean.FALSE);
                ((h9.a) obj).invoke();
                return zVar;
            case 8:
                o7.w wVar2 = (o7.w) obj3;
                Activity activity = (Activity) obj2;
                o7.u uVar3 = (o7.u) obj;
                int i10 = wVar2.f9545b;
                if (i10 == 9) {
                    t8.o oVar2 = w7.g.f14171a;
                    if (w7.g.a(activity, "直连相关", uVar3.f9533n)) {
                        t8.o oVar3 = n8.d.f8898a;
                        n8.d.f(i10, Configs.FEATURE_CONFIG_CONNECT_TYPE);
                        fc.h0 h0Var2 = o7.u.f9519o;
                        h0Var = o7.u.f9519o;
                        do {
                            value = h0Var.getValue();
                            uVar = (o7.u) value;
                            i9.l.e(uVar, "$this$update");
                        } while (!h0Var.f(value, o7.u.a(uVar, null, null, wVar2.f9545b, null, 0, null, 0, null, null, null, 65527)));
                        CarLife.receiver().setConnectType(i10);
                    }
                } else {
                    t8.o oVar4 = n8.d.f8898a;
                    n8.d.f(i10, Configs.FEATURE_CONFIG_CONNECT_TYPE);
                    fc.h0 h0Var3 = o7.u.f9519o;
                    h0Var = o7.u.f9519o;
                    do {
                        value = h0Var.getValue();
                        uVar = (o7.u) value;
                        i9.l.e(uVar, "$this$update");
                    } while (!h0Var.f(value, o7.u.a(uVar, null, null, wVar2.f9545b, null, 0, null, 0, null, null, null, 65527)));
                    CarLife.receiver().setConnectType(i10);
                }
                return zVar;
            case 9:
                ((View) obj2).playSoundEffect(0);
                ((f1.b1) obj3).setValue((v7.f) obj);
                return zVar;
            default:
                z.f fVar2 = (z.f) obj3;
                g2 g2Var = (g2) obj2;
                z.c cVar5 = (z.c) obj;
                h0.k kVar3 = fVar2.f15361r;
                while (true) {
                    h1.e eVar2 = kVar3.f6332a;
                    int i11 = eVar2.f6423c;
                    if (i11 != 0) {
                        if (i11 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        x1.c cVar6 = (x1.c) ((z.e) eVar2.f6421a[i11 - 1]).f15347a.invoke();
                        if (cVar6 == null ? true : fVar2.C0(cVar6, fVar2.f15365v)) {
                            h1.e eVar3 = kVar3.f6332a;
                            ((z.e) eVar3.l(eVar3.f6423c - 1)).f15348b.resumeWith(zVar);
                        }
                    }
                }
                if (fVar2.f15363t) {
                    x1.c cVarB0 = fVar2.B0();
                    if (cVarB0 != null && fVar2.C0(cVarB0, fVar2.f15365v)) {
                        fVar2.f15363t = false;
                    }
                }
                g2Var.f15394e = z.f.A0(fVar2, cVar5);
                return zVar;
        }
    }
}
