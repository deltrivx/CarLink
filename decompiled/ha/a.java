package ha;

import java.util.Collection;
import java.util.LinkedHashSet;
import jb.m;
import za.k;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f6465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f6466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f6467e;

    public a(m mVar, LinkedHashSet linkedHashSet, boolean z10) {
        this.f6465c = mVar;
        this.f6466d = linkedHashSet;
        this.f6467e = z10;
    }

    public static /* synthetic */ void a(int i7) {
        Object[] objArr = new Object[3];
        if (i7 == 1) {
            objArr[0] = "fromSuper";
        } else if (i7 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i7 == 3) {
            objArr[0] = "member";
        } else if (i7 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i7 == 1 || i7 == 2) {
            objArr[2] = "conflict";
        } else if (i7 == 3 || i7 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // za.k
    public final void b(x9.c cVar) {
        if (cVar == null) {
            a(0);
            throw null;
        }
        za.j.r(cVar, new aa.a(9, this));
        this.f6466d.add(cVar);
    }

    @Override // za.k
    public final void d(x9.c cVar, x9.c cVar2) {
        if (cVar2 != null) {
            return;
        }
        a(2);
        throw null;
    }

    @Override // za.k
    public final void p(x9.c cVar, Collection collection) {
        if (cVar == null) {
            a(3);
            throw null;
        }
        if (!this.f6467e || cVar.f() == 2) {
            cVar.m0(collection);
        }
    }
}
