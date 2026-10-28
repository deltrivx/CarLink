package xa;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f14823a;

    public q(String str) {
        super(str);
        this.f14823a = null;
    }

    public static q a() {
        return new q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
