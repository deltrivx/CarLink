package t9;

import ga.y;
import java.util.LinkedHashSet;
import java.util.List;
import n3.l;
import wa.b;
import wa.c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f12852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f12853b;

    static {
        List<c> listJ = l.J(y.f6126a, y.f6133h, y.f6134i, y.f6128c, y.f6129d, y.f6131f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (c cVar : listJ) {
            i9.l.e(cVar, "topLevelFqName");
            linkedHashSet.add(new b(cVar.b(), cVar.f14240a.f()));
        }
        f12852a = linkedHashSet;
        c cVar2 = y.f6132g;
        i9.l.d(cVar2, "REPEATABLE_ANNOTATION");
        f12853b = new b(cVar2.b(), cVar2.f14240a.f());
    }
}
