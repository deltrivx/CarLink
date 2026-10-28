package a8;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f120c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(boolean z10, f1.b1 b1Var, y8.c cVar, int i7) {
        super(2, cVar);
        this.f118a = i7;
        this.f119b = z10;
        this.f120c = b1Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f118a) {
            case 0:
                return new f0(this.f119b, this.f120c, cVar, 0);
            default:
                return new f0(this.f119b, this.f120c, cVar, 1);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f118a) {
            case 0:
                f0 f0Var = (f0) create(yVar, cVar);
                t8.z zVar = t8.z.f12851a;
                f0Var.invokeSuspend(zVar);
                return zVar;
            default:
                f0 f0Var2 = (f0) create(yVar, cVar);
                t8.z zVar2 = t8.z.f12851a;
                f0Var2.invokeSuspend(zVar2);
                return zVar2;
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f118a;
        t8.z zVar = t8.z.f12851a;
        f1.b1 b1Var = this.f120c;
        boolean z10 = this.f119b;
        switch (i7) {
            case 0:
                t8.a.e(obj);
                PackageManager packageManager = n8.a.b().getPackageManager();
                List<PackageInfo> installedPackages = packageManager.getInstalledPackages(128);
                i9.l.d(installedPackages, "getInstalledPackages(...)");
                if (!z10) {
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.LAUNCHER");
                    List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                    i9.l.d(listQueryIntentActivities, "queryIntentActivities(...)");
                    ArrayList arrayList = new ArrayList(u8.q.a0(listQueryIntentActivities, 10));
                    Iterator<T> it = listQueryIntentActivities.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
                    }
                    Set setM0 = u8.p.M0(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : installedPackages) {
                        if (setM0.contains(((PackageInfo) obj2).packageName)) {
                            arrayList2.add(obj2);
                        }
                    }
                    installedPackages = arrayList2;
                }
                b1Var.setValue(installedPackages);
                break;
            default:
                t8.a.e(obj);
                if (z10 && ((s7.e) b1Var.getValue()).f12589a) {
                    n8.n.c("FLOAT_ICON_SWITCH");
                } else {
                    t8.o oVar = n8.n.f8927a;
                    new Handler(Looper.getMainLooper()).post(new n8.k(0));
                }
                break;
        }
        return zVar;
    }
}
