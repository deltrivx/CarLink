package ca;

import da.s;
import i9.l;
import java.util.ArrayList;
import jb.m;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f2579b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f2580c = new e();

    @Override // jb.m
    public void a(x9.c cVar) {
        l.e(cVar, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + cVar);
    }

    @Override // jb.m
    public void b(x9.e eVar, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + eVar.getName() + ", unresolved classes " + arrayList);
    }

    public g c(na.c cVar) {
        l.e(cVar, "javaElement");
        return new g((s) cVar);
    }
}
