package a8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj, Object obj2, f1.b1 b1Var, y8.c cVar, int i7) {
        super(2, cVar);
        this.f110a = i7;
        this.f111b = obj;
        this.f112c = obj2;
        this.f113d = b1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj, Object obj2, y8.c cVar, int i7) {
        super(2, cVar);
        this.f110a = i7;
        this.f112c = obj;
        this.f113d = obj2;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f110a) {
            case 0:
                e0 e0Var = new e0((Context) this.f112c, (String) this.f113d, cVar, 0);
                e0Var.f111b = obj;
                return e0Var;
            case 1:
                e0 e0Var2 = new e0((k2.z) this.f112c, (l0.b1) this.f113d, cVar, 1);
                e0Var2.f111b = obj;
                return e0Var2;
            case 2:
                return new e0((h9.k) this.f111b, (h9.a) this.f112c, (f1.b1) this.f113d, cVar, 2);
            case 3:
                return new e0((h9.k) this.f111b, (f1.h1) this.f112c, (f1.h1) this.f113d, cVar, 3);
            case 4:
                return new e0((h9.k) this.f111b, (t8.j) this.f112c, (f1.h1) this.f113d, cVar, 4);
            default:
                return new e0((f1.b1) this.f111b, (f1.b1) this.f112c, (f1.h1) this.f113d, cVar, 5);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) throws PackageManager.NameNotFoundException {
        switch (this.f110a) {
            case 0:
                e0 e0Var = (e0) create((f1.s1) obj, (y8.c) obj2);
                t8.z zVar = t8.z.f12851a;
                e0Var.invokeSuspend(zVar);
                return zVar;
            case 1:
                return ((e0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 2:
                e0 e0Var2 = (e0) create((cc.y) obj, (y8.c) obj2);
                t8.z zVar2 = t8.z.f12851a;
                e0Var2.invokeSuspend(zVar2);
                return zVar2;
            case 3:
                e0 e0Var3 = (e0) create((cc.y) obj, (y8.c) obj2);
                t8.z zVar3 = t8.z.f12851a;
                e0Var3.invokeSuspend(zVar3);
                return zVar3;
            case 4:
                e0 e0Var4 = (e0) create((cc.y) obj, (y8.c) obj2);
                t8.z zVar4 = t8.z.f12851a;
                e0Var4.invokeSuspend(zVar4);
                return zVar4;
            default:
                e0 e0Var5 = (e0) create((cc.y) obj, (y8.c) obj2);
                t8.z zVar5 = t8.z.f12851a;
                e0Var5.invokeSuspend(zVar5);
                return zVar5;
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) throws PackageManager.NameNotFoundException {
        int i7 = this.f110a;
        int i10 = 2;
        y8.c cVar = null;
        t8.z zVar = t8.z.f12851a;
        Object obj2 = this.f113d;
        Object obj3 = this.f112c;
        switch (i7) {
            case 0:
                t8.a.e(obj);
                f1.s1 s1Var = (f1.s1) this.f111b;
                PackageManager packageManager = ((Context) obj3).getPackageManager();
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo((String) obj2, 0);
                i9.l.d(applicationInfo, "getApplicationInfo(...)");
                String string = packageManager.getApplicationLabel(applicationInfo).toString();
                Drawable applicationIcon = packageManager.getApplicationIcon(applicationInfo);
                i9.l.d(applicationIcon, "getApplicationIcon(...)");
                s1Var.setValue(new t8.j(string, applicationIcon));
                return zVar;
            case 1:
                t8.a.e(obj);
                cc.y yVar = (cc.y) this.f111b;
                k2.z zVar2 = (k2.z) obj3;
                l0.b1 b1Var = (l0.b1) obj2;
                cc.b0.s(yVar, null, new l0.c0(zVar2, b1Var, cVar, 1), 1);
                return cc.b0.s(yVar, null, new l0.c0(zVar2, b1Var, cVar, i10), 1);
            case 2:
                t8.a.e(obj);
                f1.b1 b1Var2 = (f1.b1) obj2;
                if (((String) b1Var2.getValue()).length() > 0) {
                    ((h9.k) this.f111b).invoke((String) b1Var2.getValue());
                    ((h9.a) obj3).invoke();
                }
                return zVar;
            case 3:
                t8.a.e(obj);
                h9.k kVar = (h9.k) this.f111b;
                if (kVar != null) {
                    kVar.invoke(zb.j.F0(2, String.valueOf(((f1.h1) obj3).f())) + ":" + zb.j.F0(2, String.valueOf(((f1.h1) obj2).f())));
                }
                return zVar;
            case 4:
                t8.a.e(obj);
                f1.h1 h1Var = (f1.h1) obj2;
                ((h9.k) this.f111b).invoke(new Integer(h1Var.f()));
                t8.o oVar = n8.d.f8898a;
                n8.d.f(h1Var.f(), (String) ((t8.j) obj3).f12830a);
                return zVar;
            default:
                t8.a.e(obj);
                if (((Boolean) ((f1.b1) this.f111b).getValue()).booleanValue()) {
                    t8.o oVar2 = k7.n.f7374a;
                    cc.b0.s(k7.n.f7378e, null, new k7.i(((f1.h1) obj2).f(), null, ((Boolean) ((f1.b1) obj3).getValue()).booleanValue()), 3);
                }
                return zVar;
        }
    }
}
