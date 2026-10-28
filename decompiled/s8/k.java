package s8;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f12639a;

    public k(String str, IOException iOException) {
        super(str, iOException);
        this.f12639a = i.f12625f;
    }

    public k(i iVar, String str) {
        super(str);
        this.f12639a = iVar;
    }

    public final i a() {
        return this.f12639a;
    }
}
