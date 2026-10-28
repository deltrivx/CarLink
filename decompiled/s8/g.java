package s8;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends HashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f12621a;

    public g(j jVar) {
        this.f12621a = jVar;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        this.f12621a.f12634f.put(str == null ? str : str.toLowerCase(), str2);
        return (String) super.put(str, str2);
    }
}
