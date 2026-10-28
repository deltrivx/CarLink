package nc;

import i9.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f9062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f9064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f9065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f9066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f9067g;

    public a(String str) {
        l.e(str, "serialName");
        this.f9061a = str;
        this.f9062b = w.f13122a;
        this.f9063c = new ArrayList();
        this.f9064d = new HashSet();
        this.f9065e = new ArrayList();
        this.f9066f = new ArrayList();
        this.f9067g = new ArrayList();
    }

    public static void a(a aVar, String str, e eVar) {
        aVar.getClass();
        l.e(str, "elementName");
        l.e(eVar, "descriptor");
        if (aVar.f9064d.add(str)) {
            aVar.f9063c.add(str);
            aVar.f9065e.add(eVar);
            aVar.f9066f.add(w.f13122a);
            aVar.f9067g.add(false);
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + aVar.f9061a).toString());
    }
}
