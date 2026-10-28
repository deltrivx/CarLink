package x9;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f14755b;

    public z(ArrayList arrayList) {
        this.f14754a = arrayList;
        this.f14755b = u8.b0.Z0(arrayList);
    }

    @Override // x9.s0
    public final boolean a(wa.e eVar) {
        return this.f14755b.containsKey(eVar);
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f14754a + ')';
    }
}
