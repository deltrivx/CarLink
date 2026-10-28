package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {
    public static void a(Object obj, Object obj2) {
        g1 g1Var = (g1) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (g1Var.isEmpty()) {
            return;
        }
        Iterator it = g1Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static g1 b(Object obj, Object obj2) {
        g1 g1VarC = (g1) obj;
        g1 g1Var = (g1) obj2;
        if (!g1Var.isEmpty()) {
            if (!g1VarC.f2751a) {
                g1VarC = g1VarC.c();
            }
            g1VarC.b();
            if (!g1Var.isEmpty()) {
                g1VarC.putAll(g1Var);
            }
        }
        return g1VarC;
    }
}
