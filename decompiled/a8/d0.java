package a8;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(String str, boolean z10, f1.b1 b1Var, y8.c cVar) {
        super(2, cVar);
        this.f104a = str;
        this.f105b = z10;
        this.f106c = b1Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        return new d0(this.f104a, this.f105b, this.f106c, cVar);
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) create((cc.y) obj, (y8.c) obj2);
        t8.z zVar = t8.z.f12851a;
        d0Var.invokeSuspend(zVar);
        return zVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        f1.b1 b1Var = this.f106c;
        u8.w wVar = u8.w.f13122a;
        t8.a.e(obj);
        try {
            PackageInfo packageInfo = n8.a.b().getPackageManager().getPackageInfo(this.f104a, 1);
            int i7 = 0;
            if (this.f105b) {
                ActivityInfo[] activityInfoArr = packageInfo.activities;
                if (activityInfoArr != null) {
                    arrayList = new ArrayList(activityInfoArr.length);
                    int length = activityInfoArr.length;
                    while (i7 < length) {
                        arrayList.add(activityInfoArr[i7].name);
                        i7++;
                    }
                } else {
                    arrayList = wVar;
                }
            } else {
                ActivityInfo[] activityInfoArr2 = packageInfo.activities;
                if (activityInfoArr2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int length2 = activityInfoArr2.length;
                    while (i7 < length2) {
                        ActivityInfo activityInfo = activityInfoArr2[i7];
                        if (activityInfo.exported) {
                            arrayList2.add(activityInfo);
                        }
                        i7++;
                    }
                    ArrayList arrayList3 = new ArrayList(u8.q.a0(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((ActivityInfo) it.next()).name);
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = wVar;
                }
            }
            b1Var.setValue(arrayList);
        } catch (Exception unused) {
            b1Var.setValue(wVar);
        }
        return t8.z.f12851a;
    }
}
