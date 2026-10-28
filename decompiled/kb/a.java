package kb;

import i9.l;
import xa.g;
import xa.m;
import zb.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ib.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f7495m;

    static {
        g gVar = new g();
        sa.b.a(gVar);
        m mVar = sa.b.f12701a;
        l.d(mVar, "packageFqName");
        m mVar2 = sa.b.f12703c;
        l.d(mVar2, "constructorAnnotation");
        m mVar3 = sa.b.f12702b;
        l.d(mVar3, "classAnnotation");
        m mVar4 = sa.b.f12704d;
        l.d(mVar4, "functionAnnotation");
        m mVar5 = sa.b.f12705e;
        l.d(mVar5, "propertyAnnotation");
        m mVar6 = sa.b.f12706f;
        l.d(mVar6, "propertyGetterAnnotation");
        m mVar7 = sa.b.f12707g;
        l.d(mVar7, "propertySetterAnnotation");
        m mVar8 = sa.b.f12709i;
        l.d(mVar8, "enumEntryAnnotation");
        m mVar9 = sa.b.f12708h;
        l.d(mVar9, "compileTimeValue");
        m mVar10 = sa.b.f12710j;
        l.d(mVar10, "parameterAnnotation");
        m mVar11 = sa.b.k;
        l.d(mVar11, "typeAnnotation");
        m mVar12 = sa.b.f12711l;
        l.d(mVar12, "typeParameterAnnotation");
        f7495m = new a(gVar, mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12);
    }

    public static String a(wa.c cVar) {
        String strB;
        l.e(cVar, "fqName");
        StringBuilder sb2 = new StringBuilder();
        wa.d dVar = cVar.f14240a;
        sb2.append(q.m0(dVar.f14243a, '.', '/'));
        sb2.append('/');
        if (dVar.c()) {
            strB = "default-package";
        } else {
            strB = dVar.f().b();
            l.d(strB, "asString(...)");
        }
        sb2.append(strB.concat(".kotlin_builtins"));
        return sb2.toString();
    }
}
