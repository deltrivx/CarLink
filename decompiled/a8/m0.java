package a8;

import android.app.Activity;
import b8.h2;
import b8.m2;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f176e;

    public /* synthetic */ m0(Activity activity, List list, Collection collection, f1.b1 b1Var, int i7) {
        this.f172a = i7;
        this.f176e = activity;
        this.f174c = list;
        this.f175d = collection;
        this.f173b = b1Var;
    }

    public /* synthetic */ m0(h9.k kVar, h2 h2Var, f1.b1 b1Var, f1.h1 h1Var, int i7) {
        this.f172a = i7;
        this.f176e = kVar;
        this.f174c = h2Var;
        this.f173b = b1Var;
        this.f175d = h1Var;
    }

    public /* synthetic */ m0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f172a = i7;
        this.f176e = obj;
        this.f173b = obj2;
        this.f174c = obj3;
        this.f175d = obj4;
    }

    public /* synthetic */ m0(t8.j jVar, h9.k kVar, f1.b1 b1Var, f1.b1 b1Var2) {
        this.f172a = 7;
        this.f176e = jVar;
        this.f175d = kVar;
        this.f173b = b1Var;
        this.f174c = b1Var2;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // h9.a
    public final Object invoke() {
        int i7 = this.f172a;
        t8.z zVar = t8.z.f12851a;
        ?? r8 = this.f175d;
        Object obj = this.f174c;
        Object obj2 = this.f173b;
        Object obj3 = this.f176e;
        switch (i7) {
            case 0:
                h9.n nVar = (h9.n) obj3;
                f1.b1 b1Var = (f1.b1) obj;
                f1.b1 b1Var2 = (f1.b1) r8;
                if (((File[]) ((f1.b1) obj2).getValue()).length != 0) {
                    x0.f(b1Var2, true);
                } else {
                    nVar.invoke((String) b1Var.getValue(), Boolean.TRUE);
                }
                break;
            case 1:
                f1.b1 b1Var3 = (f1.b1) obj2;
                f1.b1 b1Var4 = (f1.b1) obj;
                f1.b1 b1Var5 = (f1.b1) r8;
                b1Var3.setValue(((n8.q) obj3).i());
                if (((File[]) b1Var3.getValue()).length == 0) {
                    b1Var4.setValue(Boolean.FALSE);
                    b1Var5.setValue("");
                }
                break;
            case 2:
                f1.b1 b1Var6 = (f1.b1) obj2;
                if (w7.g.a((Activity) obj3, "WiFi相关", (List) obj)) {
                    if (!r8.isEmpty()) {
                        b1Var6.setValue(Boolean.TRUE);
                    } else {
                        hc.c cVar = n8.c.f8897a;
                        n8.c.j(0, "未获取到WiFi列表, 请手动填写");
                    }
                }
                break;
            case 3:
                h9.k kVar = (h9.k) obj3;
                e8.b0 b0Var = (e8.b0) obj;
                f1.b1 b1Var7 = (f1.b1) obj2;
                f1.h1 h1Var = (f1.h1) r8;
                int i10 = e8.b0.f4485e;
                if (((String) b1Var7.getValue()).length() != 0) {
                    kVar.invoke(new m2(b0Var.f4486a, b0Var.f4487b, a2.f.G("当", (String) b1Var7.getValue(), h1Var.f() == 1 ? "连接后" : "断开后"), new b8.s(h1Var.f(), (String) b1Var7.getValue())));
                } else {
                    hc.c cVar2 = n8.c.f8897a;
                    n8.c.j(0, "蓝牙名称不能为空");
                }
                break;
            case 4:
                Set set = (Set) r8;
                f1.b1 b1Var8 = (f1.b1) obj2;
                if (w7.g.a((Activity) obj3, "蓝牙相关", (List) obj)) {
                    if (!set.isEmpty()) {
                        int i11 = e8.b0.f4485e;
                        b1Var8.setValue(Boolean.TRUE);
                    } else {
                        hc.c cVar3 = n8.c.f8897a;
                        n8.c.j(0, "未获取到蓝牙列表, 请手动填写");
                    }
                }
                break;
            case 5:
                h9.k kVar2 = (h9.k) obj3;
                e8.f0 f0Var = (e8.f0) obj;
                f1.b1 b1Var9 = (f1.b1) obj2;
                f1.h1 h1Var2 = (f1.h1) r8;
                String str = f0Var.f4527a;
                String str2 = f0Var.f4528b;
                String str3 = ((Boolean) b1Var9.getValue()).booleanValue() ? "小于" : "大于";
                kVar2.invoke(new m2(str, str2, "屏幕亮度" + str3 + h1Var2.f() + "nit时", new b8.b0(h1Var2.f(), ((Boolean) b1Var9.getValue()).booleanValue())));
                break;
            case 6:
                h9.k kVar3 = (h9.k) obj3;
                e8.b1 b1Var10 = (e8.b1) obj;
                f1.b1 b1Var11 = (f1.b1) obj2;
                f1.h1 h1Var3 = (f1.h1) r8;
                int i12 = e8.b1.f4490e;
                if (zb.q.p0((String) b1Var11.getValue()) != null) {
                    String str4 = b1Var10.f4491a;
                    String str5 = b1Var10.f4492b;
                    int iF = h1Var3.f();
                    b8.a.f1559c.getClass();
                    kVar3.invoke(new m2(str4, str5, ob.a.B(kb.d.k(iF), (String) b1Var11.getValue()), new b8.a1(Integer.parseInt((String) b1Var11.getValue()), h1Var3.f())));
                } else {
                    hc.c cVar4 = n8.c.f8897a;
                    n8.c.j(0, "按键映射必须为数字");
                }
                break;
            case 7:
                t8.j jVar = (t8.j) obj3;
                f1.b1 b1Var12 = (f1.b1) obj2;
                b1Var12.setValue((String) jVar.f12831b);
                t8.o oVar = n8.d.f8898a;
                n8.d.h((String) jVar.f12830a);
                ((h9.k) r8).invoke((String) b1Var12.getValue());
                ((f1.b1) obj).setValue(Boolean.FALSE);
                break;
            default:
                cc.b0.s((cc.y) obj3, null, new b1.f((r2.e1) obj2, (String) obj, (String) r8, (y8.c) null, 12), 3);
                break;
        }
        return zVar;
    }
}
