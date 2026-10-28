package pb;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import nb.k0;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f10387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f10388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10389c;

    public j(k kVar, String... strArr) {
        i9.l.e(kVar, "kind");
        i9.l.e(strArr, "formatParams");
        this.f10387a = kVar;
        this.f10388b = strArr;
        String str = kVar.f10413a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f10389c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // nb.k0
    public final u9.i k() {
        return (u9.e) u9.e.f13134f.getValue();
    }

    @Override // nb.k0
    public final x9.h l() {
        l.f10415a.getClass();
        return l.f10417c;
    }

    @Override // nb.k0
    public final Collection m() {
        return w.f13122a;
    }

    @Override // nb.k0
    public final List n() {
        return w.f13122a;
    }

    @Override // nb.k0
    public final boolean o() {
        return false;
    }

    public final String toString() {
        return this.f10389c;
    }
}
