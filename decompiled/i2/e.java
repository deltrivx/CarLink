package i2;

import android.view.KeyEvent;
import h9.k;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends o implements d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f6610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k f6611p;

    @Override // i2.d
    public final boolean j(KeyEvent keyEvent) {
        k kVar = this.f6611p;
        if (kVar != null) {
            return ((Boolean) kVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // i2.d
    public final boolean w(KeyEvent keyEvent) {
        k kVar = this.f6610o;
        if (kVar != null) {
            return ((Boolean) kVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
