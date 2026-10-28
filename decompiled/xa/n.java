package xa;

import java.io.Serializable;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends a implements Serializable {
    public static m e(a aVar, a aVar2, int i7, m0 m0Var, Class cls) {
        return new m(aVar, Collections.EMPTY_LIST, aVar2, new l(i7, m0Var, true), cls);
    }

    public static m f(a aVar, Object obj, a aVar2, int i7, m0 m0Var, Class cls) {
        return new m(aVar, obj, aVar2, new l(i7, m0Var, false), cls);
    }
}
