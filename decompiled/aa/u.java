package aa;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends za.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractCollection f437d;

    public /* synthetic */ u(AbstractCollection abstractCollection, int i7) {
        this.f436c = i7;
        this.f437d = abstractCollection;
    }

    public static /* synthetic */ void a(int i7) {
        Object[] objArr = new Object[3];
        if (i7 == 1) {
            objArr[0] = "fromSuper";
        } else if (i7 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i7 == 1 || i7 == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // za.k
    public final void b(x9.c cVar) {
        switch (this.f436c) {
            case 0:
                if (cVar == null) {
                    a(0);
                    throw null;
                }
                za.j.r(cVar, null);
                ((LinkedHashSet) this.f437d).add(cVar);
                return;
            default:
                i9.l.e(cVar, "fakeOverride");
                za.j.r(cVar, null);
                ((ArrayList) this.f437d).add(cVar);
                return;
        }
    }

    @Override // za.k
    public final void d(x9.c cVar, x9.c cVar2) {
        switch (this.f436c) {
            case 0:
                if (cVar2 != null) {
                    return;
                }
                a(2);
                throw null;
            default:
                i9.l.e(cVar2, "fromCurrent");
                if (cVar2 instanceof z) {
                    ((z) cVar2).J0(x9.p.f14734a, cVar);
                    return;
                }
                return;
        }
    }
}
