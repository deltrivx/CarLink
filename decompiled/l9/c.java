package l9;

import i9.l;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8281b = new b(0);

    @Override // l9.a
    public final Random a() {
        Object obj = this.f8281b.get();
        l.d(obj, "get(...)");
        return (Random) obj;
    }
}
