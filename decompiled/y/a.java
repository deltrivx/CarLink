package y;

import d0.m;
import f1.s;
import h9.o;
import t8.z;
import y1.h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14847a = new a();

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c cVar = (c) obj;
        s sVar = (s) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= sVar.f(cVar) ? 4 : 2;
        }
        if (sVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            m.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.a.j(r1.m.f11116a, 0.0f, f.f14868l, 1).a(androidx.compose.foundation.layout.c.f820a), f.k), cVar.f14851c, h0.f14898a), sVar, 0);
        } else {
            sVar.Q();
        }
        return z.f12851a;
    }
}
