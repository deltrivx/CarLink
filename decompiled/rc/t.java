package rc;

import java.util.Set;
import pc.a1;
import pc.d1;
import pc.g1;
import pc.j1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f12367a = u8.l.M0(new nc.e[]{d1.f10437b, g1.f10451b, a1.f10424b, j1.f10463b});

    public static final boolean a(nc.e eVar) {
        i9.l.e(eVar, "<this>");
        return eVar.g() && f12367a.contains(eVar);
    }
}
