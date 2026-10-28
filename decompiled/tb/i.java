package tb;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wa.e f12907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zb.i f12908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f12909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h9.k f12910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e[] f12911e;

    public /* synthetic */ i(Collection collection, e[] eVarArr) {
        this(collection, eVarArr, h.f12899d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Collection collection, e[] eVarArr, h9.k kVar) {
        this(null, null, collection, kVar, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        i9.l.e(collection, "nameList");
    }

    public i(wa.e eVar, zb.i iVar, Collection collection, h9.k kVar, e... eVarArr) {
        this.f12907a = eVar;
        this.f12908b = iVar;
        this.f12909c = collection;
        this.f12910d = kVar;
        this.f12911e = eVarArr;
    }

    public /* synthetic */ i(wa.e eVar, e[] eVarArr) {
        this(eVar, eVarArr, h.f12897b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(wa.e eVar, e[] eVarArr, h9.k kVar) {
        this(eVar, null, null, kVar, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        i9.l.e(eVar, "name");
    }
}
