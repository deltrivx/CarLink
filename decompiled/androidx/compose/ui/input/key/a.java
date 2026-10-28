package androidx.compose.ui.input.key;

import h9.k;
import r1.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final p a(p pVar, k kVar) {
        return pVar.a(new KeyInputElement(kVar, null));
    }

    public static final p b(p pVar, k kVar) {
        return pVar.a(new KeyInputElement(null, kVar));
    }
}
