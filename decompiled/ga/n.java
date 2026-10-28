package ga;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f6098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f6099b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f6100c;

    static {
        a aVar = a.VALUE_PARAMETER;
        List listJ = n3.l.J(a.FIELD, a.METHOD_RETURN_TYPE, aVar, a.TYPE_PARAMETER_BOUNDS, a.TYPE_USE);
        List listI = n3.l.I(aVar);
        wa.c cVar = z.f6142a;
        oa.h hVar = oa.h.f9593c;
        Map mapW0 = u8.b0.W0(new t8.j(cVar, new m(new oa.i(hVar), listJ, false)), new t8.j(z.f6143b, new m(new oa.i(hVar), listJ, false)), new t8.j(z.f6144c, new m(new oa.i(oa.h.f9591a), listJ)));
        f6098a = mapW0;
        Map mapW1 = u8.b0.W0(new t8.j(z.f6149h, new m(new oa.i(hVar), listI)), new t8.j(z.f6150i, new m(new oa.i(oa.h.f9592b), listI)));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapW0);
        linkedHashMap.putAll(mapW1);
        f6100c = linkedHashMap;
    }
}
